import java.util.HashMap;
import java.util.Vector;


public class ShortestTimeOnline{

	static //VM��Դռ�����
	double VM[][] = {{6.25,5.21,5.25},{12.5,10.42,10.5},{6.25,1.18,2.19},{25,4.86,5.25},{100,42.1,21},{50,15.63,10.5},{12.5,23.75,5.31},{25,47.5,10.5}};	
	public static void MaxUtil(int JobNumber){
		int ServerNumber=1000;
		int ServerAll=0;
		int LastTime=0;
		int CMU_P=0;
		//double CMU_ALL=0;
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
			int T_now=job[i].getArrive_Time();
System.out.println("T_now:"+T_now);
			int vn=job[i].getVn();//���������С��Ŀ		
			
			for(int j=0;j<OnDo_Job.size();j++){
				int temp=(int) OnDo_Job.get(j);
				if(job[temp].getFinish_Time()<=T_now){
					Done_Job.add(temp);
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
						Done_Job.removeElement(min_Job);
System.out.println("Finish::"+job[min_Job].getFinish_Time());
						for(int z=0;z<ServerNumber;z++){
							if(ServerJob.get(z).contains(min_Job)){
								P= (0.8622 * 2.66*2.66*2.66 *UtilizationServer[z]+ 18.905)*32;
								Energy+=(job[min_Job].getFinish_Time()-ServerStartTime[z])*P;
								CMU+=(job[min_Job].getFinish_Time()-ServerStartTime[z]);
								CMU_P+=(job[min_Job].getFinish_Time()-LastTime)*ServerNumberNow*(0.8622 * 2.66*2.66*2.66 + 18.905)*32;
								ServerStartTime[z]=job[min_Job].getFinish_Time();
								LastTime=job[min_Job].getFinish_Time();
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
						P= (0.8622 * 2.66*2.66*2.66 + 18.905)*32;
						E_MAX=CMU*P;
System.out.println("E::"+Energy);
System.out.println("ServerNumberNow::"+ServerNumberNow);
ServerAll+=ServerNumberNow;
System.out.println("CMU*P_MAX::"+E_MAX);
System.out.println("CMU_P:"+(E_MAX-Energy)/1000);
System.out.println();

					}
				}
					
			}
			
			int[] flag=new int[ServerNumber];
				for(int p=0;p<ServerNumber;p++){
					flag[p]=0;
				}
			while(vn>0){
				double[][] f=new double[JobNumber+1][ServerNumber];//�жϺ���
				int minServer=0;
				double min=100000.0;
				
				for(int y=0;y<ServerNumber;y++){
					if(ActualUtilizationServer[y][0]<100||ActualUtilizationServer[y][1]<100||ActualUtilizationServer[y][2]<100){//������ʹ�õķ�����
if(ActualUtilizationServer[y][0]>=VM[job[i].getVMtype()-1][0]&&ActualUtilizationServer[y][1]>=VM[job[i].getVMtype()-1][1]&&ActualUtilizationServer[y][2]>=VM[job[i].getVMtype()-1][2]){
							

							if(job[i].getFinish_Time()<=ServerFinishTime[y]){
								f[i][y]=0;

							}
							else if(job[i].getFinish_Time()>ServerFinishTime[y]){
								f[i][y]=ServerFinishTime[y]-job[i].getArrive_Time();
								//f[i][y]=((job[i].getUtilization()+UtilizationServer[y])*(ServerFinishTime[y]-job[i].getArrive_Time())+(job[i].getFinish_Time()-ServerFinishTime[y])*job[i].getUtilization())/job[i].getT();

							}
						}
						else
							continue;
					}
					else if(ActualUtilizationServer[y][0]==100&&ActualUtilizationServer[y][1]==100&&ActualUtilizationServer[y][2]==100){//ȫ�µķ�����
					
						f[i][y]=job[i].getFinish_Time()-job[i].getArrive_Time();
					}
					else if(ActualUtilizationServer[y][0]<=0||ActualUtilizationServer[y][1]<=0||ActualUtilizationServer[y][2]<=0)
					{	
					
						break;
					}
					if(f[i][y]<min){
						min=f[i][y];
						minServer=y;
					}
				}
				
				if(ActualUtilizationServer[minServer][0]==100&&ActualUtilizationServer[minServer][1]==100&&ActualUtilizationServer[minServer][2]==100){
					ServerNumberNow++;
//System.out.println("ServerNumberNow::"+ServerNumberNow);
//System.out.println("T_now:"+T_now);
					flag[minServer]=1;
					ServerFinishTime[minServer]=job[i].getFinish_Time();
					ServerStartTime[minServer]=job[i].getArrive_Time();
				}
				else if(ActualUtilizationServer[minServer][0]<100||ActualUtilizationServer[minServer][1]<100||ActualUtilizationServer[minServer][2]<100){
					if(flag[minServer]==0){
						P= (0.8622 * 2.66*2.66*2.66 *UtilizationServer[minServer]+ 18.905)*32;
						Energy+=(job[i].getArrive_Time()-ServerStartTime[minServer])*P;
						CMU+=(job[i].getArrive_Time()-ServerStartTime[minServer]);
						flag[minServer]=1;
						CMU_P+=(job[i].getArrive_Time()-LastTime)*ServerNumberNow*(0.8622 * 2.66*2.66*2.66 + 18.905)*32;
						LastTime=job[i].getArrive_Time();
						ServerStartTime[minServer]=job[i].getArrive_Time();
					}

					if(job[i].getFinish_Time()>ServerFinishTime[minServer]){
						ServerFinishTime[minServer]=job[i].getFinish_Time();

					}
				}
				UtilizationServer[minServer]+=job[i].getUtilization();
				
				ActualUtilizationServer[minServer][0]-=VM[job[i].getVMtype()-1][0];
				ActualUtilizationServer[minServer][1]-=VM[job[i].getVMtype()-1][1];
				ActualUtilizationServer[minServer][2]-=VM[job[i].getVMtype()-1][2];

				ServerJob.get(minServer).add(i);//����ҵi���뵽ServerJob��
				vn--;

			}
			P= (0.8622 * 2.66*2.66*2.66 + 18.905)*32;
			E_MAX=CMU*P;
System.out.println("E::"+Energy);
System.out.println("CMU*P_MAX::"+E_MAX);
System.out.println("ServerNumberNow::"+ServerNumberNow);
ServerAll+=ServerNumberNow;
System.out.println("CMU_P:"+(E_MAX-Energy)/1000);
		}
		Energy=Energy/1000;
System.out.println("bbb"+Energy);
System.out.println("ServerAll:"+ServerAll);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxUtil(101);
	}

}
