import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Vector;
//import java.lang.*;

public class Recipe {
	
	static //VM资源占用情况
	int VM[][] = {{10,11,15},{20,11,15},{20,22,15},{30,11,15},{30,22,30},{30,33,30},{40,22,15},{40,33,30}};
	//int VM[][] = {{1,1,300},{2,1,200},{1,2,200}};
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
		
		for(int j=0;j<RecipeList1.size();j++){
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
			File file=new File("D://file.txt");
			BufferedWriter bf=new BufferedWriter(new FileWriter(file));
			for(int i=0;i<RecipeList1.size();i++){
				bf.write(RecipeList1.get(i).toString());
				bf.newLine();
			}
			bf.close();
		}catch(IOException e){};
			
		
		return RecipeList1;
	}
	
	
	public static double PlaceVMs(ArrayList RecipeList1,int JobNumber){
		int ServerNumber=0;
		int CMU=0;
		
		Job job[]=new Job[JobNumber+1];
		int VMPool[]=new int[8];//虚拟机资源池
		for(int i=0;i<8;i++){
			VMPool[i]=0;
		}
		for(int i=1;i<=JobNumber;i++){
			job[i]=new Job(i);
			VMPool[job[i].getVMtype()-1]+=job[i].getVn();
		}
		for(int i=0;i<8;i++){
System.out.println(i+":"+VMPool[i]);
		}
		
		ArrayList<Vector> RecipeAccipte=new ArrayList<Vector>();//用于存放采纳的配方
		
		while(VMPool[0]>0||VMPool[1]>0||VMPool[2]>0||VMPool[3]>0||VMPool[4]>0||VMPool[5]>0||VMPool[6]>0||VMPool[7]>0){				
			for(int j=0;j<RecipeList1.size();j++){
				int flag=0;
				Vector<Double> tempRecipe=new Vector<Double>();
				tempRecipe=(Vector<Double>) RecipeList1.get(j);
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
		try{
			File file=new File("D://file1.txt");
			BufferedWriter bf=new BufferedWriter(new FileWriter(file));
			for(int i=0;i<RecipeAccipte.size();i++){
				bf.write(RecipeAccipte.get(i).toString());
				bf.newLine();
			}
			bf.close();
		}catch(IOException e){};
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
		
		for(int i=1;i<=JobNumber;i++){
			int type=job[i].getVMtype()-1;
			int vn=job[i].getVn();
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
						ServerJob.get(j).add(i);
						break;
					}
					if(tmp<vn){
						a.setElementAt(0.0, type);
						vn = (int) (vn - tmp);
						ServerJob.get(j).add(i);
						continue;
					}
				}
			}
		}
		
System.out.println("ServerJob:::"+ServerJob);

for(int i=0;i<RecipeAccipte.size();i++){
System.out.println(i+":"+RecipeAccipte.get(i));
}

		double[] coexist_element=new double[JobNumber+1];
		for(int i=0;i<RecipeAccipte.size();i++){//遍历每个server
			if(ServerJob.get(i).size()>1){
				for(int j=0;j<ServerJob.get(i).size();j++){//遍历每个作业
					int job_number=(int) ServerJob.get(i).get(j);
					int type=job[job_number].getVMtype()-1;
					coexist_element[job_number]+= Double.parseDouble(RecipeAccipte.get(i).get(type).toString());
				}
			}
		}
		double coexist_rate=0.0;
		for(int i=1;i<JobNumber+1;i++){
			coexist_rate+=coexist_element[i]/job[i].getVn();
		}
		coexist_rate=coexist_rate/JobNumber;
		
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
//System.out.println("time"+i+":"+max);
			CMU+=max;
			P= (0.8622 * 2.13*2.13*2.13 *utilization+ 18.905)*4;
			Energy+=max*P;
			//Energy+=(max+(1-utilization)*276)*200*((0.4*utilization)+0.6);
		}
		Energy=Energy/3600000;
System.out.println("coexist_rate:"+coexist_rate);
System.out.println(Energy);
System.out.println("ServerNumber:"+ServerNumber);
System.out.println("CMU:"+CMU);
		
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vector> RecipeList1=new ArrayList<Vector>();
		RecipeList1=GenerateTightRecipes1();
		PlaceVMs(RecipeList1,100);
		
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
    	int b1=(int) e1.get(9);//neightDensity
    	int b2=(int) e2.get(9);
    	int c1=(int) e1.get(10);//weight
    	int c2=(int) e1.get(10);
    	
     	if(a1<a2)
    		return 1;
    	else if(a1==a2){
    		if(b1<b2)
    			return 1;
    		else if(b1==b2){
    			if(c1<c2)
    				return 1;
    			else if(c1==c2)
    				return 0;
    			else
    				return -1;
    		}
    		else
    			return -1;
    	}
    	else
    		return -1;
		//return 0;
     }

}

