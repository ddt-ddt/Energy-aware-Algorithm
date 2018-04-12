import java.util.HashMap;
import java.util.Vector;
//import java.lang.*;

public class RecipeOnline {
	
	static //VM��Դռ�����
	int VM[][] = {{15,10,5},{10,5,5},{25,5,5},{5,25,10},{10,15,15},{5,5,20},{5,20,10},{5,10,25}};
	public static double PlaceVMs(int JobNumber){
		int ServerNumber=1000;//��������Ŀ
		int CMU=0;
		double P=0.0;
		Job job[]=new Job[JobNumber+1];
		int VMPool[]=new int[8];//�������Դ��
		for(int i=0;i<8;i++){
			VMPool[i]=0;
		}
		int max_finish_time=0;
		for(int i=1;i<=JobNumber;i++){
			job[i]=new Job(i);
//System.out.println("Arrive_Time:"+job[i].getArrive_Time());
//System.out.println("Finish_Time:"+job[i].getFinish_Time());
//System.out.println("Time:"+i+":::"+job[i].getT());
			if(job[i].getFinish_Time()>max_finish_time){
				max_finish_time=job[i].getFinish_Time();
			}
		}
		
		HashMap<Integer,Vector> ServerJob =new HashMap<Integer, Vector>();//���ڴ洢��������ҵkey-value
		for(int i=0;i<ServerNumber;i++)
		{
			Vector v = new Vector();
			ServerJob.put(i,v);
		}
		int[] ServerStartTime=new int[ServerNumber];//��¼�������Ŀ�ʼʱ��
		int[] ServerFinishTime=new int[ServerNumber];//��¼�������Ľ���ʱ��
		for(int i=0;i<ServerNumber;i++){
			ServerFinishTime[i]=0;
			ServerStartTime[i]=1000000;
		}
		double[] coexist_rate=new double[JobNumber+1];//�����
		double coexist_rate_all=0.0;
		int[][] ServerReasource=new int[ServerNumber][3];//��¼����������Դʣ��0-cpu��1-mem��2-sto
		for(int i=0;i<ServerNumber;i++){
			for(int j=0;j<3;j++)
				ServerReasource[i][j]=100;
		}
		double[] MaxUtilization=new double[ServerNumber];//��¼ÿ���������������Դ������
		double[] UtilizationServer=new double[ServerNumber];//ÿ������������Դ������
		int[] singleElement=new int[JobNumber+1];//��¼ÿ����ҵ�����Ԫ��
		for(int i=1;i<JobNumber+1;i++){
			singleElement[i]=0;
		}
		double Energy=0.0;
		for(int i=1;i<=JobNumber;i++){//��ҵ�±��1��ʼ
//System.out.println("NewJob:"+i);
			int T_now=job[i].getArrive_Time();//����ʱ��
			int vn=job[i].getVn();//���������С��Ŀ
			for(int j=1;j<i;j++){//�ж��Ƿ�����ҵ���
				if(job[j].getFinish_Time()<=T_now){//��ʾ����ҵ���
					for(int z=0;z<ServerNumber;z++){//����������
						while(ServerJob.get(z).contains(j)){//�жϸ���ҵ�Ƿ����j�����ҵ
//System.out.println("######ServerJob:"+ServerJob);
							ServerReasource[z][0]+=VM[job[j].getVMtype()-1][0];
							ServerReasource[z][1]+=VM[job[j].getVMtype()-1][1];
							ServerReasource[z][2]+=VM[job[j].getVMtype()-1][2];
							ServerJob.get(z).removeElement(j);
//System.out.println("22222ServerJob:"+ServerJob);
//System.out.println(ServerFinishTime[6]+";;;;"+ServerStartTime[6]);
							if(ServerReasource[z][0]==100&&ServerReasource[z][1]==100&&ServerReasource[z][2]==100){//�÷������ϵ���ҵȫ�����
//System.out.println("33333Server:"+z);
//System.out.println("bbbbbbbbbbbbbbbbbb:"+ServerJob);
//System.out.println("Utilization:"+MaxUtilization[z]);
								Energy+=((ServerFinishTime[z]-ServerStartTime[z])-(1-MaxUtilization[z])*276)*200*((0.4*MaxUtilization[z])+0.6);
//System.out.println(200*(0.4*MaxUtilization[z]+0.6));
								P+=200*(0.4*MaxUtilization[z]+0.6);
								P=P/2;
								CMU+=(ServerFinishTime[z]-ServerStartTime[z]);
//System.out.println(ServerFinishTime[z]+";;;;"+ServerStartTime[z]);
//System.out.println("T_now:"+T_now);
//System.out.println("job:"+j);
//System.out.println("33333Server:"+z);
System.out.println("CMU:"+CMU);
								ServerStartTime[z]=0;
								ServerFinishTime[z]=0;
								MaxUtilization[z]=0;
								UtilizationServer[z]=0;
								ServerJob.get(z).clear();
//System.out.println("AAAAAAAAAAAAAAAAAAA"+Energy);
							}
						}
					}		
				}
			}
			
			while(vn>0){
				for(int y=0;y<ServerNumber;y++){//����������
					int mainReasource=0;
					
					for(int z=0;z<3;z++){
						if(mainReasource<VM[job[i].getVMtype()-1][z]){
							mainReasource=VM[job[i].getVMtype()-1][z];
						}
					}
					int count=0;
					count=(int) Math.floor(100/mainReasource);
					if(vn>=count){
						if(ServerReasource[y][0]==100&&ServerReasource[y][1]==100&&ServerReasource[y][2]==100){
							for(int z=0;z<count;z++){
								ServerJob.get(y).add(i);//����ҵi���뵽ServerJob��
//System.out.println("11111ServerJob:"+ServerJob);
//System.out.println();

							}
							ServerReasource[y][0]-=count*VM[job[i].getVMtype()-1][0];
							ServerReasource[y][1]-=count*VM[job[i].getVMtype()-1][1];
							ServerReasource[y][2]-=count*VM[job[i].getVMtype()-1][2];
//System.out.println(ServerReasource[y][0]);
//System.out.println(job[i].getVMtype());
//System.out.println("1:"+vn);
//System.out.println("2:"+job[i].getVn());
							if(ServerStartTime[y]>job[i].getArrive_Time()){
								ServerStartTime[y]=job[i].getArrive_Time();
							}
							if(ServerFinishTime[y]<job[i].getFinish_Time()){
								ServerFinishTime[y]=job[i].getFinish_Time();
							}
							vn-=count;
							UtilizationServer[y]=(double)(100-ServerReasource[y][0])/100;
						}
					}
					else{//vn<count
						int flag=0;
						for(int z=0;z<=y;z++){
//System.out.println("ServerReasource:::"+ServerReasource[z][0]+";;;"+ServerReasource[z][1]+";;;"+ServerReasource[z][2]);
//System.out.println("JobReasource::"+VM[job[i].getVMtype()-1][0]+";;;"+VM[job[i].getVMtype()-1][1]+";;;"+VM[job[i].getVMtype()-1][2]);
							if(ServerReasource[z][0]!=100&&ServerReasource[z][1]!=100&&ServerReasource[z][2]!=100&&ServerReasource[z][0]>=VM[job[i].getVMtype()-1][0]&&ServerReasource[z][1]>=VM[job[i].getVMtype()-1][1]&&ServerReasource[z][2]>=VM[job[i].getVMtype()-1][2]&&vn>0){
								flag=1;
							}	
							while(flag==1&&ServerReasource[z][0]>=VM[job[i].getVMtype()-1][0]&&ServerReasource[z][1]>=VM[job[i].getVMtype()-1][1]&&ServerReasource[z][2]>=VM[job[i].getVMtype()-1][2]&&vn>0){	
								ServerJob.get(z).add(i);//����ҵi���뵽ServerJob��
//System.out.println("333333ServerJob:"+ServerJob);
//System.out.println();
	
								ServerReasource[z][0]-=VM[job[i].getVMtype()-1][0];
								ServerReasource[z][1]-=VM[job[i].getVMtype()-1][1];
								ServerReasource[z][2]-=VM[job[i].getVMtype()-1][2];
								vn--;
								singleElement[i]++;
								UtilizationServer[z]=(double)(100-ServerReasource[z][0])/100;
								if(ServerStartTime[z]>job[i].getArrive_Time()){
									ServerStartTime[z]=job[i].getArrive_Time();
								}
								if(ServerFinishTime[z]<job[i].getFinish_Time()){
									ServerFinishTime[z]=job[i].getFinish_Time();
								}
							}
							UtilizationServer[z]=(double)(100-ServerReasource[z][0])/100;
						}
						while(flag==0&&ServerReasource[y][0]>VM[job[i].getVMtype()-1][0]&&ServerReasource[y][1]>VM[job[i].getVMtype()-1][1]&&ServerReasource[y][2]>VM[job[i].getVMtype()-1][2]&&vn>0) {
							//if(ServerReasource[y][0]==100&&ServerReasource[y][1]==100&&ServerReasource[y][2]==100)
							ServerJob.get(y).add(i);//����ҵi���뵽ServerJob��
//System.out.println("333333ServerJob:"+ServerJob);
//System.out.println();

							ServerReasource[y][0]-=VM[job[i].getVMtype()-1][0];
							ServerReasource[y][1]-=VM[job[i].getVMtype()-1][1];
							ServerReasource[y][2]-=VM[job[i].getVMtype()-1][2];
							vn--;
							singleElement[i]++;
							UtilizationServer[y]=(double)(100-ServerReasource[y][0])/100;
							if(ServerStartTime[y]>job[i].getArrive_Time()){
								ServerStartTime[y]=job[i].getArrive_Time();
							}
							if(ServerFinishTime[y]<job[i].getFinish_Time()){
								ServerFinishTime[y]=job[i].getFinish_Time();
							}
							UtilizationServer[y]=(double)(100-ServerReasource[y][0])/100;
						}
						
						/*for(int z=0;z<vn;z++){
							ServerJob.get(y).add(i);//����ҵi���뵽ServerJob��
System.out.println("2222ServerJob:"+ServerJob);
System.out.println();

						}
						ServerReasource[y][0]-=vn*VM[job[i].getVMtype()-1][0];
						ServerReasource[y][1]-=vn*VM[job[i].getVMtype()-1][1];
						ServerReasource[y][2]-=vn*VM[job[i].getVMtype()-1][2];
						singleElement[i]+=vn;
						*/
//System.out.println(ServerReasource[y][0]);
//System.out.println(job[i].getVMtype());
//System.out.println("1:"+vn);
//System.out.println("2:"+job[i].getVn());
//System.out.println("3:"+coexist_rate[i]);
						
						
						
					}
					
//System.out.println("UtilizationServer"+y+":"+UtilizationServer[y]);
					
					
					
					if(vn<=0)
						break;
					
					if(UtilizationServer[y]>MaxUtilization[y]){
						MaxUtilization[y]=UtilizationServer[y];
//System.out.println("MaxUtilization"+y+":"+MaxUtilization[y]);
					}

				}
//System.out.println("singleElement:"+singleElement[i]);
//System.out.println(i+":"+job[i].getVn());
				coexist_rate[i]=(double)(singleElement[i])/job[i].getVn();
					
			}
			coexist_rate_all+=coexist_rate[i];
//System.out.println("coexist_rate:::"+coexist_rate[i]);
//System.out.println("coexist_rate_all:::::"+coexist_rate_all);
			
//System.out.println("3:"+coexist_rate[i]);
			
		}
		//System.out.println("coexist_rate111:"+coexist_rate_all);
		coexist_rate_all=coexist_rate_all/JobNumber;		
		Energy=Energy/3600000;
System.out.println("P:"+P);
System.out.println("coexist_rate:"+coexist_rate_all);
System.out.println(Energy);
		
System.out.println("max_finish_time:"+max_finish_time);

		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlaceVMs(21);
		
		System.exit(0);

	}

}

