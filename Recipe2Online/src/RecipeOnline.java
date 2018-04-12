import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Vector;

public class RecipeOnline {
	
	static //VM资源占用情况
	double VM[][] = {{6.25,5.21,5.25},{12.5,10.42,10.5},{6.25,1.18,2.19},{25,4.86,5.25},{100,42.1,21},{50,15.63,10.5},{12.5,23.75,5.31},{25,47.5,10.5}};	public static ArrayList GenerateTightRecipes1(){
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
		//System.out.println(RecipeList1.size());
		
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
		
		/*for(int i=0;i<RecipeList1.size();i++){
System.out.println(RecipeList1.get(i));
		}
		*/
		for(int i=0;i<RecipeList1.size();i++){
			RecipeList1.get(i).remove(8);
		}
		RecipeList1.remove(RecipeList1.size()-1);
		return RecipeList1;
	}	
	
	
	public static ArrayList OnlinePlace(int JobNumber){
		Job job[]=new Job[JobNumber+1];
		ArrayList<Job> JobList1=new ArrayList<Job>();//到达时刻在0~40的时刻
		ArrayList<Job> JobList2=new ArrayList<Job>();//到达时刻在40~80的时刻
		ArrayList<Job> JobList3=new ArrayList<Job>();//到达时刻在80~120的时刻
		ArrayList<Job> JobList4=new ArrayList<Job>();//到达时刻在120~160的时刻
		ArrayList<Job> JobList5=new ArrayList<Job>();//到达时刻在160~200的时刻
		ArrayList<Job> JobList6=new ArrayList<Job>();//到达时刻在200~240的时刻
		ArrayList<Job> JobList7=new ArrayList<Job>();//到达时刻在240~280的时刻
		ArrayList<Job> JobList8=new ArrayList<Job>();//到达时刻在280~320的时刻
		ArrayList<Job> JobList9=new ArrayList<Job>();//到达时刻在320~360的时刻
		ArrayList<Job> JobList10=new ArrayList<Job>();//到达时刻在360~400的时刻
		ArrayList<Job> JobList11=new ArrayList<Job>();//到达时刻在400~440的时刻
		
		
		for(int i=1;i<=JobNumber;i++){
			job[i]=new Job(i);
			if(0<=job[i].getArrive_Time()&&job[i].getArrive_Time()<=1000){
				JobList1.add(job[i]);
			}
			else if(1000<job[i].getArrive_Time()&&job[i].getArrive_Time()<=2000){
				JobList2.add(job[i]);
			}
			else if(2000<job[i].getArrive_Time()&&job[i].getArrive_Time()<=3000){
				JobList3.add(job[i]);
			}
			else if(3000<job[i].getArrive_Time()&&job[i].getArrive_Time()<=4000){
				JobList4.add(job[i]);
			}
			else if(4000<job[i].getArrive_Time()&&job[i].getArrive_Time()<=5000){
				JobList5.add(job[i]);
			}
			else if(5000<job[i].getArrive_Time()&&job[i].getArrive_Time()<=6000){
				JobList6.add(job[i]);
			}
			else if(6000<job[i].getArrive_Time()&&job[i].getArrive_Time()<=7000){
				JobList7.add(job[i]);
			}
			else if(7000<job[i].getArrive_Time()&&job[i].getArrive_Time()<=8000){
				JobList8.add(job[i]);
			}
			else if(8000<job[i].getArrive_Time()&&job[i].getArrive_Time()<=9000){
				JobList9.add(job[i]);
			}
			else if(9000<job[i].getArrive_Time()&&job[i].getArrive_Time()<=10000){
				JobList10.add(job[i]);
			}
			else if(10000<job[i].getArrive_Time()&&job[i].getArrive_Time()<=11000){
				JobList11.add(job[i]);
			}
		}
		
		ArrayList<ArrayList> JobList=new ArrayList<ArrayList>();//总的作业列表
		JobList.add(JobList1);
		JobList.add(JobList2);
		JobList.add(JobList3);
		JobList.add(JobList4);
		JobList.add(JobList5);
		JobList.add(JobList6);
		JobList.add(JobList7);
		JobList.add(JobList8);
		JobList.add(JobList9);
		JobList.add(JobList10);
		JobList.add(JobList11);

		return JobList;
		
	}
	
	public static double PlaceVMs(ArrayList RecipeList1,ArrayList JobList){
		
		double Energy_All=0.0;
		double P=0.0;//记录瞬时功率
		for(int z=0;z<JobList.size();z++){
			ArrayList<Job> tempList=new ArrayList<Job>();//临时作业列表
			tempList=(ArrayList<Job>) JobList.get(z);
System.out.println();
System.out.println(tempList.size());
			int JobNumber=tempList.size();
			int VMPool[]=new int[8];//虚拟机资源池
			for(int i=0;i<8;i++){
				VMPool[i]=0;
			}
			for(int i=0;i<JobNumber;i++){
				Job tempJob=tempList.get(i);
				VMPool[tempJob.getVMtype()-1]+=tempJob.getVn();
System.out.println("Job:"+i+":::"+tempList.get(i).getArrive_Time());
			}
	
			int Start_Time=0;//记录开始时刻
			for(int i=0;i<JobNumber;i++){//作业下标从1开始
				Start_Time=tempList.get(JobNumber-1).getArrive_Time();//开始时刻为该组最后一个到达的作业时刻
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
			
			for(int i=0;i<JobNumber;i++){
				int type=tempList.get(i).getVMtype()-1;
				int vn=tempList.get(i).getVn();
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
			
			/*for(int i=0;i<RecipeAccipte.size();i++){
	System.out.println(RecipeAccipte.get(i));
			}*/
System.out.println("ServerNumber:"+RecipeAccipte.size());
System.out.println("*******"+ServerJob);
			
			double Energy=0.0;//记录能耗
			int T_now=0;//记录现在时刻
			for(int i=0;i<RecipeAccipte.size();i++){
				double max=0;//用于存储时间
				
				for(int j=0;j<ServerJob.get(i).size();j++){
					if(max<tempList.get((int) ServerJob.get(i).get(j)).getT()){
						max=tempList.get((int) ServerJob.get(i).get(j)).getT();
					}
				}
				double utilization=0.0;
				for(int k=0;k<8;k++){
					utilization+=Double.parseDouble(RecipeAccipte.get(i).get(k).toString())*VM[k][0];
				}
				utilization=utilization/100;
				int tempT=(int) (Start_Time+max);
				if(tempT>T_now){
					T_now=tempT;
				}
	//System.out.println("time"+i+":"+max);
				Energy+=(max-(1-utilization)*276)*200*(0.4*utilization+0.6);
	//System.out.println("@@@"+P);
	//System.out.println("$$$"+200*(0.4*utilization+0.6));
				P+=200*(0.4*utilization+0.6);
				P=P/2;
	//System.out.println("^^^"+P);
			}
			
			Energy=Energy/1000;
	System.out.println(P);
	System.out.println(T_now+" Energy :"+Energy);
			Energy_All+=Energy;
	System.out.println("!!!!!!!!!!"+Energy_All);
		}

		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vector> RecipeList1=new ArrayList<Vector>();
		RecipeList1=GenerateTightRecipes1();
		ArrayList<ArrayList> JobList=new ArrayList<ArrayList>();
		JobList=OnlinePlace(100);
		PlaceVMs(RecipeList1,JobList);
		
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

