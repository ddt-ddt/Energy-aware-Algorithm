import java.util.HashMap;
import java.util.Vector;


public class BestFitOnline{

	static //VM��Դռ�����
	double VM[][] = {{6.25,5.21,5.25},{12.5,10.42,10.5},{6.25,1.18,2.19},{25,4.86,5.25},{100,42.1,21},{50,15.63,10.5},{12.5,23.75,5.31},{25,47.5,10.5}};	
	public static void MaxUtil(int JobNumber){
		int ServerNumber=1000;
		int LastTime=0;
		int CMU_P=0;
		
		Job job[]=new Job[JobNumber+1];//��ʼ����ҵ
		double P=0.0;
		int ServerNumberNow=0;
		for(int i=1;i<=JobNumber;i++){
			job[i]=new Job(i);
		}
		HashMap<Integer,Vector> ServerJob =new HashMap<Integer, Vector>();//���ڴ洢��������ҵkey-value
		for(int i=0;i<ServerNumber;i++)
		{
			Vector v = new Vector();
			ServerJob.put(i,v);
		}
		
		double[] UtilizationServer=new double[ServerNumber];//ÿ����������CPU��Դ������
		double[][] ActualUtilizationServer = new double[ServerNumber][3];//ÿ������������Դ������
		for(int i=0;i<ServerNumber;i++){
			ActualUtilizationServer[i][0]=100;
			ActualUtilizationServer[i][1]=100;
			ActualUtilizationServer[i][2]=100;
		}
		
		int[] ServerStartTime=new int[ServerNumber];//ÿ���������Ŀ�ʼʱ��
		int[] ServerFinishTime=new int[ServerNumber];//��¼�������Ľ���ʱ��
		
		for(int i=0;i<ServerNumber;i++){
			ServerFinishTime[i]=0;
			ServerStartTime[i]=1000000;
		}
		double Energy=0.0;
		int CMU=0;
		double E_MAX=0.0;
		
		Vector OnDo_Job = new Vector();
		Vector Done_Job = new Vector();
		
		for(int i=1;i<=JobNumber;i++){
System.out.println();
System.out.println("Job::"+i);
			OnDo_Job.add(i);
//System.out.println("OnDo_Job:"+OnDo_Job);
			int T_now=job[i].getArrive_Time();
System.out.println("T_now:"+T_now);
			int vn=job[i].getVn();//���������С��Ŀ		
			
			for(int j=0;j<OnDo_Job.size();j++){
				int temp=(int) OnDo_Job.get(j);
//System.out.println("j::"+j);
//System.out.println("JobNumber:"+temp);
//System.out.println("T_now:"+T_now);
				if(job[temp].getFinish_Time()<=T_now){
					Done_Job.add(temp);
//System.out.println("Done_Job:"+Done_Job);
					
//System.out.println("OnDo_Job222222222:"+OnDo_Job);
				}
			}
			while(Done_Job.size()>0){
				int min_FinishTime=10000;
				int min_Job=0;
				for(int j=0;j<Done_Job.size();j++){
					int temp=(int) Done_Job.get(j);
					if(job[temp].getFinish_Time()<=min_FinishTime){
						min_FinishTime=job[temp].getFinish_Time();
						min_Job=temp;
					}	
				}
				OnDo_Job.removeElement(min_Job);
				
				if(min_Job!=0){
					if(job[min_Job].getFinish_Time()<=T_now){//��ʾ����ҵ���
//System.out.println();
System.out.println("FinishTime::"+job[min_Job].getFinish_Time());
						Done_Job.removeElement(min_Job);
//System.out.println("Done_Job333333333:"+Done_Job);
//System.out.println("OnDo_Job333333333:"+OnDo_Job);
						for(int z=0;z<ServerNumber;z++){
//System.out.println(ServerJob);
//System.out.println(z);
							if(ServerJob.get(z).contains(min_Job)){
								P= (0.8622 * 2.66*2.66*2.66 *UtilizationServer[z]+ 18.905)*32;
								Energy+=(job[min_Job].getFinish_Time()-ServerStartTime[z])*P;
								CMU+=(job[min_Job].getFinish_Time()-ServerStartTime[z]);
	
								ServerStartTime[z]=job[min_Job].getFinish_Time();
	
//System.out.println("33333::::::"+ServerFinishTime[z]+";;;;"+ServerStartTime[z]);
							}
							while(ServerJob.get(z).contains(min_Job)){//�жϸ���ҵ�Ƿ����j�����ҵ
		//System.out.println("@@@@11111ServerJob:"+ServerJob);					
													
								UtilizationServer[z]-=job[min_Job].getUtilization();
								ActualUtilizationServer[z][0]+=VM[job[min_Job].getVMtype()-1][0];
								ActualUtilizationServer[z][1]+=VM[job[min_Job].getVMtype()-1][1];
								ActualUtilizationServer[z][2]+=VM[job[min_Job].getVMtype()-1][2];
								ServerJob.get(z).removeElement(min_Job);
		//System.out.println("@@@@22222ServerJob:"+ServerJob);											
													
								if(ActualUtilizationServer[z][0]==100&&ActualUtilizationServer[z][1]==100&&ActualUtilizationServer[z][2]==100){//�÷������ϵ���ҵȫ�����
	
									ServerNumberNow--;
//System.out.println("ServerNumberNow::"+ServerNumberNow);
//System.out.println(ServerFinishTime[z]+";;;;"+ServerStartTime[z]);
	
									ServerStartTime[z]=0;
									ServerFinishTime[z]=0;
									ServerJob.get(z).clear();
								}
							}							
						}		
					}
				}
				P= (0.8622 * 2.66*2.66*2.66 + 18.905)*32;
				E_MAX=CMU*P;
System.out.println("E::"+Energy);
System.out.println("ServerNumberNow::"+ServerNumberNow);
System.out.println("CMU*P_MAX::"+E_MAX);
System.out.println("CMU_P:"+(E_MAX-Energy)/1000);
System.out.println();
					
			}
			
			int[] flag=new int[ServerNumber];
				for(int p=0;p<ServerNumber;p++){
					flag[p]=0;
				}
			while(vn>0){
				double[][] f=new double[JobNumber+1][ServerNumber];//�жϺ���
				int maxServer=0;
				double max=0.0;
				
				for(int y=0;y<ServerNumber;y++){
					if(ActualUtilizationServer[y][0]<100||ActualUtilizationServer[y][1]<100||ActualUtilizationServer[y][2]<100){//������ʹ�õķ�����
						if(ActualUtilizationServer[y][0]>=VM[job[i].getVMtype()-1][0]&&ActualUtilizationServer[y][1]>=VM[job[i].getVMtype()-1][1]&&ActualUtilizationServer[y][2]>=VM[job[i].getVMtype()-1][2]){
							f[i][y]=UtilizationServer[y]+job[i].getUtilization();		
							
						}
						else
							continue;
					}
					else if(ActualUtilizationServer[y][0]==100&&ActualUtilizationServer[y][1]==100&&ActualUtilizationServer[y][2]==100){//ȫ�µķ�����
					
						f[i][y]=job[i].getUtilization();
					}
					else if(ActualUtilizationServer[y][0]<=0||ActualUtilizationServer[y][1]<=0||ActualUtilizationServer[y][2]<=0)
					{	
					
						break;
					}
					if(f[i][y]>max){
						max=f[i][y];
						maxServer=y;
					}
				}
				
				if(ActualUtilizationServer[maxServer][0]==100&&ActualUtilizationServer[maxServer][1]==100&&ActualUtilizationServer[maxServer][2]==100){
					ServerNumberNow++;
					flag[maxServer]=1;
					ServerFinishTime[maxServer]=job[i].getFinish_Time();
					ServerStartTime[maxServer]=job[i].getArrive_Time();
				}
				else if(ActualUtilizationServer[maxServer][0]<100||ActualUtilizationServer[maxServer][1]<100||ActualUtilizationServer[maxServer][2]<100){
					if(flag[maxServer]==0){
						P= (0.8622 * 2.66*2.66*2.66 *UtilizationServer[maxServer]+ 18.905)*32;
						Energy+=(job[i].getArrive_Time()-ServerStartTime[maxServer])*P;
						CMU+=(job[i].getArrive_Time()-ServerStartTime[maxServer]);
						flag[maxServer]=1;
						CMU_P+=(job[i].getArrive_Time()-LastTime)*ServerNumberNow*(0.8622 * 2.66*2.66*2.66 + 18.905)*32;
						LastTime=job[i].getArrive_Time();
						ServerStartTime[maxServer]=job[i].getArrive_Time();
//System.out.println("4444444:::::"+ServerFinishTime[maxServer]+";;;;"+ServerStartTime[maxServer]);
					}

					if(job[i].getFinish_Time()>ServerFinishTime[maxServer]){
						ServerFinishTime[maxServer]=job[i].getFinish_Time();

					}
				}
				UtilizationServer[maxServer]+=job[i].getUtilization();
				
				ActualUtilizationServer[maxServer][0]-=VM[job[i].getVMtype()-1][0];
				ActualUtilizationServer[maxServer][1]-=VM[job[i].getVMtype()-1][1];
				ActualUtilizationServer[maxServer][2]-=VM[job[i].getVMtype()-1][2];

				ServerJob.get(maxServer).add(i);//����ҵi���뵽ServerJob��
				vn--;
			}
			P= (0.8622 * 2.66*2.66*2.66 + 18.905)*32;
			E_MAX=CMU*P;
System.out.println("E::"+Energy);
System.out.println("CMU*P_MAX::"+E_MAX);
System.out.println("ServerNumberNow::"+ServerNumberNow);
System.out.println("CMU_P:"+(E_MAX-Energy)/1000);
		}
		Energy=Energy/1000;
System.out.println("bbb"+Energy);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxUtil(101);
	}

}
