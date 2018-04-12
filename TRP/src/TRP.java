import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Vector;

//Do the TRP and FS in this class

public class TRP {
	static DcConfiguration conf=new DcConfiguration();
	static //VM资源占用情况
	double VM[][] = conf.getVM();
	
	public static ArrayList GenerateTightRecipes1(int VMTYPE){
		ArrayList<Vector> RecipeList1=new ArrayList<Vector>();
		ArrayList<Vector> TempRecipe=new ArrayList<Vector>();
		
		Vector<Double> NewRecipe=new Vector<Double>();
		for(int i=0;i<VMTYPE;i++){
			NewRecipe.add(0.0);
		}
		RecipeList1.add(NewRecipe);

		for(int i=0;i<VMTYPE;i++){

			for(int j=0;j<RecipeList1.size();j++){
				Vector<Double> TempR=new Vector<Double>();
				double temp=(double) RecipeList1.get(j).get(i)+1;
				NewRecipe= RecipeList1.get(j);
				TempR=(Vector<Double>) NewRecipe.clone();
				TempR.set(i,temp);

				int flag=0;
				while(flag==0){
					
					int utilization1=0;//CPU utilization
					int utilization2=0;//Mem utilization
					int utilization3=0;//Sto utilization
					for(int k=0;k<VMTYPE;k++){
						utilization1+=TempR.get(k)*VM[k][0];
						utilization2+=TempR.get(k)*VM[k][1];
						utilization3+=TempR.get(k)*VM[k][2];
						
					}
					if(utilization1>=100||utilization2>=100||utilization3>=100){
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

			int[] selfDensity=new int[VMTYPE];
			for(int j=0;j<VMTYPE;j++){
				Vector<Double> tempRecipe=new Vector<Double>();
				tempRecipe=RecipeList1.get(i);
				
				Vector<Integer> signRecipe=new Vector<Integer>();
				for(int z=0;z<VMTYPE;z++){
					signRecipe.add(0);
				}
				
				for(int k=0;k<tempRecipe.size();k++){
					if(tempRecipe.get(k)>0){
						signRecipe.set(k,1);
						selfDensity[j]+=1;
					}
					
				}
			}
			RecipeList1.get(i).add(selfDensity[VMTYPE-1]);
		}
		Collections.sort(RecipeList1, new SortMaxToMin());
		
		for(int j=0;j<RecipeList1.size();j++){
			RecipeList1.get(j).remove(VMTYPE);
			double utilization1=0.0;
			Vector<Double> Recipe=new Vector<Double>();
			Recipe = RecipeList1.get(j);
			for(int i=0;i<VMTYPE;i++){	
				utilization1+=Recipe.get(i)*VM[i][0];
			}
			utilization1=utilization1/100;
			Recipe.add(utilization1);
		}
		
		Collections.sort(RecipeList1, new SortByUtilization());
	
		RecipeList1.remove(RecipeList1.size()-1);
		
		for(int i=0;i<RecipeList1.size();i++){
			RecipeList1.get(i).remove(VMTYPE);
		}
		
		try{
			File file=new File("D://Recipe1111.txt");
			BufferedWriter bf=new BufferedWriter(new FileWriter(file));
			for(int i=0;i<RecipeList1.size();i++){
				bf.write(RecipeList1.get(i).toString());
				bf.newLine();
			}
			bf.close();
		}catch(IOException e){};
		
		
		return RecipeList1;
	}
	
	public static ArrayList GenerateTightRecipes2(int VMTYPE,ArrayList RecipeList1){
		ArrayList<Vector> RecipeList2=new ArrayList<Vector>();
		
		for(int i=0;i<VMTYPE;i++){
			Vector<Double> tempRecipe=new Vector<Double>();
			for(int j=0;j<VMTYPE;j++){
				tempRecipe.add((double) 0);
			}
			double max=0;
			for(int j=0;j<3;j++){
				if(max<VM[i][j])
					max=VM[i][j];
			}
			double n = Math.floor(100/max);
			tempRecipe.set(i, n);
			if(!RecipeList2.contains(tempRecipe)){
				RecipeList2.add(tempRecipe);
			}
		}

		for(int i=0;i<RecipeList1.size();i++){
			
			Vector<Double> tempRecipe=new Vector<Double>();
			tempRecipe=(Vector<Double>) RecipeList1.get(i);
			
			int flag=0;
			int value1=0;				
			int value2=0;				
			int value3=0;

			for(int j=0;j<VMTYPE;j++){
				value1+=(int) (tempRecipe.get(j)*VM[j][0]);
				value2+=(int) (tempRecipe.get(j)*VM[j][1]);
				value3+=(int) (tempRecipe.get(j)*VM[j][2]);
			}
			
			for(int k=0;k<VMTYPE;k++){	
				if(value1+VM[k][0]<=100&&value2+VM[k][1]<=100&&value3+VM[k][2]<=100){
					flag=-1;
					break;
				}
			}
			
			if(flag==0){
				if(!RecipeList2.contains(tempRecipe)){
					RecipeList2.add(tempRecipe);
				}	
			}
		}
		//System.out.println(RecipeList2.size());
		
		for(int i=0;i<RecipeList2.size();i++){
			int[] selfDensity=new int[VMTYPE];
			for(int j=0;j<VMTYPE;j++){
				Vector<Double> tempRecipe=new Vector<Double>();
				tempRecipe=RecipeList2.get(i);
				
				Vector<Integer> signRecipe=new Vector<Integer>();
				for(int z=0;z<VMTYPE;z++){
					signRecipe.add(0);
				}
				
				for(int k=0;k<tempRecipe.size();k++){
					if(tempRecipe.get(k)>0){
						signRecipe.set(k,1);
						selfDensity[j]+=1;
					}
					
				}
			}
			RecipeList2.get(i).add(selfDensity[VMTYPE-1]);
		}
		
		for(int j=0;j<RecipeList2.size();j++){
			//RecipeList2.get(j).remove(VMTYPE);
			double utilization1=0.0;
			Vector<Double> Recipe=new Vector<Double>();
			Recipe = RecipeList2.get(j);
			for(int i=0;i<VMTYPE;i++){	
				utilization1+=Recipe.get(i)*VM[i][0];
			}
			utilization1=utilization1/100;
			Recipe.add(utilization1);
		}
		Collections.sort(RecipeList2, new SortTypeUtilization());
		
		
		for(int j=0;j<RecipeList2.size();j++){
			RecipeList2.get(j).remove(VMTYPE);
			RecipeList2.get(j).remove(VMTYPE);
		}
		
		try{
			File file=new File("D://Recipe2222.txt");
			BufferedWriter bf=new BufferedWriter(new FileWriter(file));
			for(int i=0;i<RecipeList2.size();i++){
				bf.write(RecipeList2.get(i).toString());
				bf.newLine();
			}
			bf.close();
		}catch(IOException e){};

		return RecipeList2;
	}

	public static HashMap Bin(int JobNumber,int T){
		JobConfiguration job[]=new JobConfiguration[JobNumber+1];
		int max_T=0;
		for(int i=1;i<=JobNumber;i++){
			job[i]=new JobConfiguration(i);
			if(job[i].getT()>max_T)
				max_T=(int) job[i].getT();
		}
		
		int BinNum=(int) Math.ceil((double)max_T/T);
		HashMap<Integer,Vector> bin =new HashMap<Integer, Vector>();
		for(int i=0;i<BinNum;i++)
		{
			Vector v = new Vector();
			bin.put(i,v);
		}
		
		int i=1;
		while(i<=JobNumber){
//System.out.println(i+":"+job[i].getT());
			int tempBinNumber = 0;			
			tempBinNumber=(int) Math.floor(job[i].getT()/T);
			bin.get(tempBinNumber).add(i);

			i++;
		}
System.out.println("bin:"+bin);
		return bin;
		
	}
	
	public static boolean JudgeVMPool(int[] VMPool){
		  boolean temp = false;
		    for(int i = 0 ; i < VMPool.length; i++)
		    {
		    	if(VMPool[i] > 0)
		    	{
		    		temp = true;
		    		break;
		    	}
		    }
		    return temp;
	}
	
	public static double TRPFS(ArrayList RecipeList1,ArrayList RecipeList2,HashMap Bin,int JobNumber,int VMTYPE) throws IOException{		
		JobConfiguration job[]=new JobConfiguration[JobNumber+1];
		for(int i=1;i<=JobNumber;i++){
			job[i]=new JobConfiguration(i);
		}
		
		File file=new File("D://RecipeAccipte.txt");
		BufferedWriter bf=new BufferedWriter(new FileWriter(file));
		
		int count=0;
		
		int ServerNumber=0;
		double Energy_All=0.0;
		int CMU=0;
		double C1=conf.getC1();
		double C2=conf.getC2();
		double CPU_CORE=conf.getCPU_CORE();
		
		for(int z=0;z<Bin.size();z++){
			
			Vector tempVector=new Vector();
			tempVector=(Vector) Bin.get(z);
			
			int VMPool[]=new int[VMTYPE];
			for(int i=0;i<VMTYPE;i++){
				VMPool[i]=0;
			}
			
			for(int i=0;i<tempVector.size();i++){
				JobConfiguration tempJob=job[(int) tempVector.get(i)];
				VMPool[tempJob.getVMtype()-1]+=tempJob.getVn();
			}
			
			ArrayList<Vector> RecipeAccipte=new ArrayList<Vector>();
			
			for(int i=0;i<tempVector.size();i++){
				int VMRequire=job[(int) tempVector.get(i)].getVn();
				int VMRequireTemp=job[(int) tempVector.get(i)].getVn();
				Vector<Double> tempRecipe = new Vector<Double>();
				
				for(int m=0;m<VMTYPE;m++){

					Vector<Double> temptempRecipe = new Vector<Double>();
					temptempRecipe=(Vector<Double>) RecipeList2.get(m);
					if(temptempRecipe.get(job[(int) tempVector.get(i)].getVMtype()-1)!=0){
						tempRecipe=(Vector<Double>) RecipeList2.get(m);
					}
				}
				while(VMRequireTemp>=tempRecipe.get(job[(int) tempVector.get(i)].getVMtype()-1)){
					VMRequireTemp-=tempRecipe.get(job[(int) tempVector.get(i)].getVMtype()-1);
					RecipeAccipte.add((Vector<Double>)tempRecipe.clone());
					
				}
				VMPool[job[(int) tempVector.get(i)].getVMtype()-1]-=(VMRequire-VMRequireTemp);
			}
		  
		    
			while(JudgeVMPool(VMPool)){				
				for(int j=0;j<RecipeList1.size();j++){
					int flag=0;
					Vector<Double> tempRecipe=new Vector<Double>();
					tempRecipe=(Vector<Double>) RecipeList1.get(j);
					for(int k=0;k<VMTYPE;k++){
						if(tempRecipe.get(k)>VMPool[k]){
							flag=-1;
							break;
						}
					}
					if(flag==0){
						for(int k=0;k<VMTYPE;k++){
							VMPool[k]=(int) (VMPool[k]-tempRecipe.get(k));
						}
						RecipeAccipte.add(tempRecipe);
						break;
					}
				}
			}
			
			ServerNumber+=RecipeAccipte.size();
			
			try{
				
				for(int i=0;i<RecipeAccipte.size();i++){
					bf.write(RecipeAccipte.get(i).toString());
					bf.newLine();
				}
			
			}catch(IOException e){};
			
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
			
			double Energy=0.0;
			double P=0.0;
			for(int i=0;i<RecipeAccipte.size();i++){
				double max=0;
				double s=conf.getAvailable_s()[0];
				double[] available_s=conf.getAvailable_s();
				
				for(int j=0;j<ServerJob.get(i).size();j++){
					if(max<job[(int) ServerJob.get(i).get(j)].getT()){
						max=job[(int) ServerJob.get(i).get(j)].getT();
					}
				}
				
				double utilization=0.0;
				for(int k=0;k<VMTYPE;k++){
					utilization+=Double.parseDouble(RecipeAccipte.get(i).get(k).toString())*VM[k][0];
				}
				utilization=utilization/100;
	
System.out.println("Recipe::"+RecipeAccipte.get(i));
				if(ServerJob.get(i).size()==1){
					count++;
					double a=0;
					a=job[(int) ServerJob.get(i).get(0)].getT()/job[(int) ServerJob.get(i).get(0)].getD();
					double temp1=a*s;
					double temp2=Math.pow(C2/(C1*2*utilization),1/3.0);
					double Max_temp=0;
					if(temp1>=temp2){
						Max_temp=temp1;
					}
					else
						Max_temp=temp2;
					
					for(int o=available_s.length-1;o>1;o--){
						if(Max_temp>available_s[o]&&Max_temp<=available_s[o-1]){
							s=available_s[o-1];
							max=max*(available_s[0]/s);
							break;
						}
						if(Max_temp<=available_s[available_s.length-1]){
							s=available_s[available_s.length-1];
							max=max*(available_s[0]/s);
							break;
						}
					}

System.out.println("CPU frequency:"+s);
				}	
				else{
System.out.println("CPU frequency:"+available_s[0]);
				}
				System.out.println();
				CMU+=max;
				P= (C1 * s*s*s *utilization+ C2)*CPU_CORE;
				Energy+=max*P;
			}
			Energy=Energy/3600000;
			Energy_All+=Energy;	
		}
		//System.out.println("Energy:"+Energy_All);
		//System.out.println("count:"+count);
		//System.out.println("ServerNumber:"+ServerNumber);
		bf.close();
		return 0;
		
	}
	
	
	public static void BDTRP() throws IOException{
		int VMTYPE=conf.getVMTYPE();
		ArrayList<Vector> RecipeList1=new ArrayList<Vector>();
		ArrayList<Vector> RecipeList2=new ArrayList<Vector>();
		RecipeList1=GenerateTightRecipes1(VMTYPE);
		RecipeList2=GenerateTightRecipes2(VMTYPE,RecipeList1);
		HashMap<Integer,Vector> bin =new HashMap<Integer, Vector>();
		bin=Bin(conf.getJobNumber(),conf.getT());
		TRPFS(RecipeList1,RecipeList2,bin,conf.getJobNumber(),VMTYPE);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("TRPFS");
		BDTRP();
		
	}

}

class SortByUtilization implements Comparator{//rank utilization from max to min
	
	static DcConfiguration conf=new DcConfiguration();
	int VMTYPE=conf.getVMTYPE();

    public int compare(Object o1,Object o2) {
    	Vector e1=(Vector) o1;
    	Vector e2=(Vector) o2;
    	double a1=(double) e1.get(VMTYPE);
    	double a2=(double) e2.get(VMTYPE);
     	if(a1<a2)
    		return 1;
    	else if(a1==a2)
    		return 0;
    	else
    		return -1;
     }
}

class SortMaxToMin implements Comparator{//rank from max to min
	
	static DcConfiguration conf=new DcConfiguration();
	int VMTYPE=conf.getVMTYPE();

    public int compare(Object o1,Object o2) {
    	Vector e1=(Vector) o1;
    	Vector e2=(Vector) o2;
    	int a1=(int) e1.get(VMTYPE);
    	int a2=(int) e2.get(VMTYPE);
    	
     	if(a1<a2)
    		return 1;
    	else if(a1==a2)
    		return 0;
    	else
    		return -1;
     }

}

class SortTypeUtilization implements Comparator{//rank from min to max
	static DcConfiguration conf=new DcConfiguration();
	int VMTYPE=conf.getVMTYPE();

    public int compare(Object o1,Object o2) {
    	Vector e1=(Vector) o1;
    	Vector e2=(Vector) o2;
    	int a1=(int) e1.get(VMTYPE);
    	int a2=(int) e2.get(VMTYPE);
    	double b1=(double) e1.get(VMTYPE+1);
    	double b2=(double) e2.get(VMTYPE+1);
    	
     	if(a1>a2)
    		return 1;
    	else if(a1==a2){
    		if(b1<b2)
    			return 1;
    		else if(b1==b2)
    			return 0;
    		else
    			return -1;
    	}
    	else
    		return -1;
     }

}

