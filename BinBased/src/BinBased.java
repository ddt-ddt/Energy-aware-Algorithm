import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Vector;
//import java.lang.*;

public class BinBased {
	
	static //VM资源占用情况
	double VM[][] = {{6.25,5.21,5.25},{12.5,10.42,10.5},{6.25,1.18,2.19},{25,4.86,5.25},{100,42.1,21},{50,15.63,10.5},{12.5,23.75,5.31},{25,47.5,10.5}};
	public static ArrayList GenerateTightRecipes1(){
		ArrayList<Vector> RecipeList1=new ArrayList<Vector>();//所有配方列表
		ArrayList<Vector> RecipeList2=new ArrayList<Vector>();//只有满负载的配方列表
		ArrayList<Vector> TempRecipe=new ArrayList<Vector>();
		
		Vector<Double> NewRecipe=new Vector<Double>();
		for(int i=0;i<8;i++){
			NewRecipe.add(0.0);
		}
		RecipeList1.add(NewRecipe);

		for(int i=0;i<8;i++){//遍历虚拟机的类型

			for(int j=0;j<RecipeList1.size();j++){
				Vector<Double> TempR=new Vector<Double>();
				double temp=(double) RecipeList1.get(j).get(i)+1;
				NewRecipe= RecipeList1.get(j);
				TempR=(Vector<Double>) NewRecipe.clone();
				TempR.set(i,temp);

				int flag=0;
				while(flag==0){
					
					int utilization1=0;//CPU资源利用率
					int utilization2=0;//Mem资源利用率
					int utilization3=0;//Sto资源利用率
					for(int k=0;k<8;k++){
						utilization1+=TempR.get(k)*VM[k][0];
						utilization2+=TempR.get(k)*VM[k][1];
						utilization3+=TempR.get(k)*VM[k][2];
						
					}
					if(utilization1>100||utilization2>100||utilization3>100){//资源利用率必须小于1
							flag=-1;
							break;
					}
					if(!TempRecipe.contains(TempR)){
						TempRecipe.add(TempR);
					}
					
					Vector<Double> TempR1=new Vector<Double>();
					TempR1=(Vector<Double>) TempR.clone();
					double temp1=(double) TempR.get(i)+1;
					TempR1.set(i,temp1);		
					
					TempR=TempR1;
				}
			}
			RecipeList1.addAll(TempRecipe);
			TempRecipe.clear();

		}
		
		for(int i=0;i<RecipeList1.size();i++){

			int[] selfDensity=new int[8];
			for(int j=0;j<8;j++){
				Vector<Double> tempRecipe=new Vector<Double>();
				tempRecipe=RecipeList1.get(i);
//System.out.println("2222222222"+tempRecipe);
				
				Vector<Integer> signRecipe=new Vector<Integer>();
				for(int z=0;z<8;z++){
					signRecipe.add(0);
				}
				
				for(int k=0;k<tempRecipe.size();k++){
					if(tempRecipe.get(k)>0){
						signRecipe.set(k,1);
						selfDensity[j]+=1;
					}
					
				}
			}
			RecipeList1.get(i).add(selfDensity[7]);
//System.out.println("33333333333333333"+RecipeList1.get(i));
		}
//System.out.println("aaaa"+RecipeList1.get(1));
		Collections.sort(RecipeList1, new SortBySelfNightWeight());
		
		for(int j=0;j<RecipeList1.size();j++){
			RecipeList1.get(j).remove(8);
			double utilization1=0.0;//CPU资源利用率
			Vector<Double> Recipe=new Vector<Double>();
			Recipe = RecipeList1.get(j);
			for(int i=0;i<8;i++){	
				utilization1+=Recipe.get(i)*VM[i][0];
			}
			utilization1=utilization1/100;
			Recipe.add(utilization1);
		}
		
		Collections.sort(RecipeList1, new SortByUtilization());
		
		for(int i=0;i<RecipeList1.size();i++){
			RecipeList1.get(i).remove(8);
		}
		RecipeList1.remove(RecipeList1.size()-1);
		
		
		
		try{
			File file=new File("D://Recipe1.txt");
			BufferedWriter bf=new BufferedWriter(new FileWriter(file));
			for(int i=0;i<RecipeList1.size();i++){
				bf.write(RecipeList1.get(i).toString());
				bf.newLine();
			}
			bf.close();
		}catch(IOException e){};
		
		return RecipeList1;
	}
	
	public static HashMap OnlinePlace(int JobNumber,int T){
		Job job[]=new Job[JobNumber+1];
		int BinNum=(int) Math.ceil((double)100/T);
		HashMap<Integer,Vector> bin =new HashMap<Integer, Vector>();
		for(int i=0;i<BinNum;i++)
		{
			Vector v = new Vector();
			bin.put(i,v);
		}
		
		int i=1;
		while(i<=JobNumber){
			job[i]=new Job(i);
//System.out.println(i+":"+job[i].getT());
			int tempBinNumber = 5;
			if(job[i].getT()==100){
//System.out.println("aaaaa");
				tempBinNumber=(int) Math.floor((job[i].getT()-1)/T);
			}
			else if (job[i].getT()<100){
				tempBinNumber=(int) Math.floor(job[i].getT()/T);
			}
//System.out.println("tempBinNumber:"+tempBinNumber);
//System.out.println("jobTime:"+job[i].getT());
//System.out.println(bin.get(tempBinNumber));
			bin.get(tempBinNumber).add(i);

			i++;
		}
System.out.println("bin:"+bin.size());
		return bin;
		
	}
	
	public static double PlaceVMs(ArrayList RecipeList1,HashMap Bin,int JobNumber){
		Job job[]=new Job[JobNumber+1];
		for(int i=1;i<=JobNumber;i++){
			job[i]=new Job(i);
		}
		int ServerNumber=0;
		double Energy_All=0.0;
		int CMU=0;
		
		for(int z=0;z<Bin.size();z++){
			Vector tempVector=new Vector();
			tempVector=(Vector) Bin.get(z);
			
			int VMPool[]=new int[8];//虚拟机资源池
			for(int i=0;i<8;i++){
				VMPool[i]=0;
			}
			
			for(int i=0;i<tempVector.size();i++){
				Job tempJob=job[(int) tempVector.get(i)];
				VMPool[tempJob.getVMtype()-1]+=tempJob.getVn();
//System.out.println("JobList"+(z+1)+":"+tempJob.getT());
			}
			for(int k=0;k<8;k++){
System.out.println("VMPOOl::"+VMPool[k]);
			}
			
			ArrayList<Vector> RecipeAccipte=new ArrayList<Vector>();//用于存放采纳的配方
			
			while(VMPool[0]>0||VMPool[1]>0||VMPool[2]>0||VMPool[3]>0||VMPool[4]>0||VMPool[5]>0||VMPool[6]>0||VMPool[7]>0){				
				for(int j=0;j<RecipeList1.size();j++){
					int flag=0;
					Vector<Double> tempRecipe=new Vector<Double>();
					tempRecipe=(Vector<Double>) RecipeList1.get(j);
//System.out.println("aaaaaaaa"+tempRecipe);
//System.out.println("jjjjjj::"+j);
					for(int k=0;k<8;k++){
						if(tempRecipe.get(k)>VMPool[k]){
							flag=-1;
							break;
						}
					}
					if(flag==0){
	//System.out.println("aaaa"+tempRecipe);
						for(int k=0;k<8;k++){
							VMPool[k]=(int) (VMPool[k]-tempRecipe.get(k));
	//System.out.println(k+"!!!!!:"+VMPool[k]);
						}
						RecipeAccipte.add(tempRecipe);
						break;
					}
				}
			}
			
			for(int i=0;i<RecipeAccipte.size();i++){
	//System.out.println(RecipeAccipte.get(i));
			}
			ServerNumber+=RecipeAccipte.size();
			
			ArrayList<Vector> RecipeRemain=new ArrayList<Vector>();
			for(Vector v:RecipeAccipte)
			{
				RecipeRemain.add((Vector)v.clone());
			}
			HashMap<Integer,Vector> ServerJob =new HashMap<Integer, Vector>();//用于存储服务器作业key-value
			for(int i=0;i<RecipeRemain.size();i++)
			{
				Vector v = new Vector();
				ServerJob.put(i,v);
			}
			
			for(int i=0;i<tempVector.size();i++){
				int type=job[(int) tempVector.get(i)].getVMtype()-1;
				int vn=job[(int) tempVector.get(i)].getVn();
				for(int j=0;j<RecipeRemain.size();j++){
					Vector a = RecipeRemain.get(j);		
					double tmp = Double.parseDouble(a.get(type).toString());
					if(vn == 0){
						break;
					}
					if(tmp<=0){
	
						continue;
					}
					if(tmp>0){
						if(tmp>=vn){
							a.setElementAt((double)tmp-vn, type);
							vn = 0;
							ServerJob.get(j).add((int) tempVector.get(i));
							break;
						}
						if(tmp<vn){
							a.setElementAt(0.0, type);
							vn = (int) (vn - tmp);
							ServerJob.get(j).add((int) tempVector.get(i));
							continue;
						}
					}
				}
			}
			
			System.out.println("ServerJob:::"+ServerJob);

			
			try{
				File file=new File("D://RecipeAccipe.txt");
				BufferedWriter bf=new BufferedWriter(new FileWriter(file));
				for(int i=0;i<RecipeAccipte.size();i++){
					bf.write(RecipeAccipte.get(i).toString());
					bf.newLine();
				}
				bf.close();
			}catch(IOException e){};
			
			double Energy=0.0;
			double P=0.0;
			for(int i=0;i<RecipeAccipte.size();i++){
				double max=0;//用于存储时间
				
				for(int j=0;j<ServerJob.get(i).size();j++){
					if(max<job[(int) ServerJob.get(i).get(j)].getT()){
						max=job[(int) ServerJob.get(i).get(j)].getT();
					}
				}
				double utilization=0.0;
				for(int k=0;k<8;k++){
					utilization+=Double.parseDouble(RecipeAccipte.get(i).get(k).toString())*VM[k][0];
				}
				utilization=utilization/100;
	System.out.println("utilization:"+utilization);
	System.out.println("time"+i+":"+max);
				CMU+=max;
				//utilization=1;
				P= (0.8622 * 2.66*2.66*2.66 *utilization+ 18.905)*32;
				Energy+=max*P;
				//Energy+=(max+(1-utilization)*276)*200*((0.4*utilization)+0.6);
			}
			Energy=Energy/1000;
	//System.out.println(Energy);
			Energy_All+=Energy;
	System.out.println("ServerNumber:"+ServerNumber);
	System.out.println("CMU:"+CMU);
	System.out.println("!!!!!!!!!!"+Energy_All);
		}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vector> RecipeList1=new ArrayList<Vector>();
		RecipeList1=GenerateTightRecipes1();
		HashMap<Integer,Vector> bin =new HashMap<Integer, Vector>();
		bin=OnlinePlace(100,5);
		PlaceVMs(RecipeList1,bin,100);
		System.exit(0);
	}

}

class SortByUtilization implements Comparator{

    public int compare(Object o1,Object o2) {
    	Vector e1=(Vector) o1;
    	Vector e2=(Vector) o2;
    	double a1=(double) e1.get(8);
    	double a2=(double) e2.get(8);
     	if(a1<a2)
    		return 1;
    	else if(a1==a2)
    		return 0;
    	else
    		return -1;
		//return 0;
     }
}

class SortBySelfNightWeight implements Comparator{

    public int compare(Object o1,Object o2) {
    	Vector e1=(Vector) o1;
    	Vector e2=(Vector) o2;
    	int a1=(int) e1.get(8);//selfDensity
    	int a2=(int) e2.get(8);
    	
     	if(a1<a2)
    		return 1;
    	else if(a1==a2)
    		return 0;
    	else
    		return -1;
		//return 0;
     }

}


