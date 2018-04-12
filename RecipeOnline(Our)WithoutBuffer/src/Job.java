
public class Job {
	private int VM[][] = {{15,10,5},{10,5,5},{25,5,5},{5,25,10},{10,15,15},{5,5,20},{5,20,10},{5,10,25}};
	private int VMtype;//虚拟机类型
	private int tm;//Map作业时间
	private int tr;//Reduce作业时间
	private int mNum;//Map作业数量
	private int rNum;//Reduce作业数量
	private int mSlot;//Map槽数目
	private int rSlot;//Reduce槽数目
	private int vn;//用户要求的最小VM数目
	private double T;
	private int Arrive_Time;//作业到达时间
	private int Finish_Time;//作业完成时间
	private double utilization;//虚拟机的资源占用率
	
	public double getUtilization() {
		return utilization;
	}
	public int getArrive_Time() {
		return Arrive_Time;
	}
	public int getFinish_Time() {
		return Finish_Time;
	}
	public int getVMtype() {
		return VMtype;
	}
	public int getTm() {
		return tm;
	}
	public int getTr() {
		return tr;
	}
	public int getmNum() {
		return mNum;
	}
	public int getrNum() {
		return rNum;
	}
	public int getmSlot() {
		return mSlot;
	}
	public int getrSlot() {
		return rSlot;
	}
	public int getVn() {
		return vn;
	}
	public double getT(){
		return T*10;
	}
	
	public Job(int i){
		if(i==1){
			VMtype=2;
			tm=24;
			tr=31;
			mNum=300;
			rNum=20;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=20;
			T=(double) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=100;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==2){
			VMtype=3;
			tm=33;
			tr=23;
			mNum=280;
			rNum=28;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=28;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=200;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==3){
			VMtype=8;
			tm=29;
			tr=28;
			mNum=170;
			rNum=19;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=19;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=301;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==4){
			VMtype=1;
			tm=40;
			tr=43;
			mNum=260;
			rNum=23;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=23;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=408;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==5){
			VMtype=4;
			tm=33;
			tr=45;
			mNum=250;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=502;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==6){
			VMtype=5;
			tm=33;
			tr=40;
			mNum=180;
			rNum=17;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=17;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=630;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==7){
			VMtype=6;
			tm=49;
			tr=21;
			mNum=230;
			rNum=13;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=13;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=710;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==8){
			VMtype=3;
			tm=32;
			tr=47;
			mNum=240;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=855;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==9){
			VMtype=8;
			tm=25;
			tr=50;
			mNum=240;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=921;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==10){
			VMtype=7;
			tm=24;
			tr=50;
			mNum=180;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=1020;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		
		else if(i==11){
			VMtype=5;
			tm=24;
			tr=42;
			mNum=250;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=1120;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==12){
			VMtype=6;
			tm=32;
			tr=23;
			mNum=250;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=1270;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==13){
			VMtype=1;
			tm=21;
			tr=28;
			mNum=230;
			rNum=12;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=12;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=1376;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==14){
			VMtype=8;
			tm=30;
			tr=23;
			mNum=230;
			rNum=23;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=23;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=1480;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==15){
			VMtype=4;
			tm=23;
			tr=45;
			mNum=260;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=1585;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==16){
			VMtype=7;
			tm=23;
			tr=50;
			mNum=170;
			rNum=17;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=17;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=1690;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;

		}
		else if(i==17){
			VMtype=6;
			tm=50;
			tr=21;
			mNum=160;
			rNum=13;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=13;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=1795;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==18){
			VMtype=3;
			tm=22;
			tr=37;
			mNum=220;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=1800;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==19){
			VMtype=8;
			tm=22;
			tr=42;
			mNum=240;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=1904;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==20){
			VMtype=7;
			tm=24;
			tr=34;
			mNum=180;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=2010;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==21){
			Arrive_Time=1000000;
			Finish_Time=11000000;
		}
		else if(i==21){
			VMtype=2;
			tm=34;
			tr=22;
			mNum=200;
			rNum=20;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=20;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=2116;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==22){
			VMtype=3;
			tm=22;
			tr=43;
			mNum=290;
			rNum=28;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=28;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=2220;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==23){
			VMtype=8;
			tm=21;
			tr=38;
			mNum=190;
			rNum=19;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=19;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=2326;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==24){
			VMtype=1;
			tm=20;
			tr=23;
			mNum=260;
			rNum=23;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=23;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=2430;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==25){
			VMtype=4;
			tm=33;
			tr=25;
			mNum=270;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=2535;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==26){
			VMtype=5;
			tm=33;
			tr=21;
			mNum=190;
			rNum=17;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=17;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=2640;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==27){
			VMtype=6;
			tm=22;
			tr=31;
			mNum=160;
			rNum=13;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=13;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=2746;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==28){
			VMtype=3;
			tm=22;
			tr=37;
			mNum=220;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=2852;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==29){
			VMtype=8;
			tm=22;
			tr=42;
			mNum=250;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=2958;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==30){
			VMtype=7;
			tm=34;
			tr=34;
			mNum=190;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=3065;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		
		else if(i==31){
			VMtype=5;
			tm=24;
			tr=42;
			mNum=260;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=3170;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==32){
			VMtype=6;
			tm=32;
			tr=23;
			mNum=270;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=3275;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==33){
			VMtype=1;
			tm=21;
			tr=38;
			mNum=160;
			rNum=12;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=12;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=3381;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==34){
			VMtype=8;
			tm=20;
			tr=33;
			mNum=230;
			rNum=23;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=23;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=3489;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==35){
			VMtype=4;
			tm=33;
			tr=25;
			mNum=260;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=3595;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==36){
			VMtype=7;
			tm=23;
			tr=30;
			mNum=170;
			rNum=17;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=17;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=3601;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==37){
			VMtype=6;
			tm=22;
			tr=41;
			mNum=160;
			rNum=13;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=13;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=3708;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==38){
			VMtype=3;
			tm=22;
			tr=37;
			mNum=260;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=3812;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==39){
			VMtype=8;
			tm=22;
			tr=32;
			mNum=260;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=3918;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==40){
			VMtype=7;
			tm=24;
			tr=34;
			mNum=190;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=4022;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		
		else if(i==41){
			VMtype=2;
			tm=34;
			tr=22;
			mNum=210;
			rNum=20;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=20;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=4127;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==42){
			VMtype=3;
			tm=22;
			tr=33;
			mNum=300;
			rNum=28;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=28;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=4231;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==43){
			VMtype=8;
			tm=31;
			tr=48;
			mNum=190;
			rNum=19;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=19;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=4336;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==44){
			VMtype=1;
			tm=20;
			tr=33;
			mNum=230;
			rNum=23;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=23;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=4440;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==45){
			VMtype=4;
			tm=23;
			tr=45;
			mNum=270;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=4546;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==46){
			VMtype=5;
			tm=23;
			tr=30;
			mNum=170;
			rNum=17;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=17;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=4652;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==47){
			VMtype=6;
			tm=22;
			tr=31;
			mNum=130;
			rNum=13;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=13;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=4758;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==48){
			VMtype=3;
			tm=22;
			tr=27;
			mNum=220;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=4865;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==49){
			VMtype=8;
			tm=22;
			tr=42;
			mNum=260;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=4970;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==50){
			VMtype=7;
			tm=24;
			tr=34;
			mNum=180;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=5075;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		
		else if(i==51){
			VMtype=5;
			tm=24;
			tr=42;
			mNum=240;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=5180;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==52){
			VMtype=6;
			tm=22;
			tr=23;
			mNum=250;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=5286;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==53){
			VMtype=1;
			tm=31;
			tr=28;
			mNum=160;
			rNum=12;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=12;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=5390;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==54){
			VMtype=8;
			tm=20;
			tr=43;
			mNum=260;
			rNum=23;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=23;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=5495;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==55){
			VMtype=4;
			tm=43;
			tr=25;
			mNum=260;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=5501;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==56){
			VMtype=7;
			tm=23;
			tr=40;
			mNum=170;
			rNum=17;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=17;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=5608;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==57){
			VMtype=6;
			tm=22;
			tr=41;
			mNum=130;
			rNum=13;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=13;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=5712;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==58){
			VMtype=3;
			tm=22;
			tr=47;
			mNum=220;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=5820;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==59){
			VMtype=8;
			tm=22;
			tr=42;
			mNum=250;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=5925;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==60){
			VMtype=7;
			tm=34;
			tr=44;
			mNum=180;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=6030;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		
		else if(i==61){
			VMtype=2;
			tm=34;
			tr=22;
			mNum=210;
			rNum=20;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=20;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=6135;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==62){
			VMtype=3;
			tm=22;
			tr=23;
			mNum=280;
			rNum=28;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=28;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=6240;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==63){
			VMtype=8;
			tm=31;
			tr=28;
			mNum=190;
			rNum=19;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=19;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=6345;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==64){
			VMtype=1;
			tm=30;
			tr=43;
			mNum=260;
			rNum=23;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=23;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=6450;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==65){
			VMtype=4;
			tm=23;
			tr=35;
			mNum=260;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=6555;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==66){
			VMtype=5;
			tm=33;
			tr=20;
			mNum=170;
			rNum=17;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=17;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=6660;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==67){
			VMtype=6;
			tm=32;
			tr=21;
			mNum=160;
			rNum=13;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=13;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=6765;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==68){
			VMtype=3;
			tm=22;
			tr=37;
			mNum=260;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=6870;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==69){
			VMtype=8;
			tm=32;
			tr=42;
			mNum=260;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=6975;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==70){
			VMtype=7;
			tm=34;
			tr=24;
			mNum=180;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=7080;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		
		else if(i==71){
			VMtype=5;
			tm=24;
			tr=42;
			mNum=220;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=7185;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==72){
			VMtype=6;
			tm=32;
			tr=23;
			mNum=260;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=7292;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==73){
			VMtype=1;
			tm=31;
			tr=28;
			mNum=160;
			rNum=12;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=12;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=7396;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==74){
			VMtype=8;
			tm=30;
			tr=43;
			mNum=260;
			rNum=23;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=23;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=7401;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==75){
			VMtype=4;
			tm=33;
			tr=25;
			mNum=260;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=7506;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==76){
			VMtype=7;
			tm=23;
			tr=40;
			mNum=170;
			rNum=17;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=17;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=7610;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==77){
			VMtype=6;
			tm=22;
			tr=31;
			mNum=160;
			rNum=13;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=13;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=7715;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==78){
			VMtype=3;
			tm=22;
			tr=37;
			mNum=220;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=7821;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==79){
			VMtype=8;
			tm=22;
			tr=42;
			mNum=260;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=7926;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==80){
			VMtype=7;
			tm=34;
			tr=24;
			mNum=180;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=8031;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		
		else if(i==81){
			VMtype=2;
			tm=34;
			tr=22;
			mNum=210;
			rNum=20;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=20;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=8136;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==82){
			VMtype=3;
			tm=22;
			tr=33;
			mNum=280;
			rNum=28;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=28;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=8241;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==83){
			VMtype=8;
			tm=21;
			tr=48;
			mNum=190;
			rNum=19;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=19;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=8347;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==84){
			VMtype=1;
			tm=20;
			tr=33;
			mNum=260;
			rNum=23;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=23;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=8451;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==85){
			VMtype=4;
			tm=33;
			tr=25;
			mNum=260;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=8556;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==86){
			VMtype=5;
			tm=43;
			tr=30;
			mNum=170;
			rNum=17;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=17;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=8660;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==87){
			VMtype=6;
			tm=22;
			tr=31;
			mNum=160;
			rNum=13;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=13;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=8765;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==88){
			VMtype=3;
			tm=22;
			tr=27;
			mNum=260;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=8870;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==89){
			VMtype=8;
			tm=22;
			tr=32;
			mNum=240;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=8975;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==90){
			VMtype=7;
			tm=24;
			tr=34;
			mNum=180;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=9080;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		
		else if(i==91){
			VMtype=5;
			tm=24;
			tr=42;
			mNum=260;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=9186;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==92){
			VMtype=6;
			tm=22;
			tr=23;
			mNum=250;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=9290;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==93){
			VMtype=1;
			tm=21;
			tr=38;
			mNum=160;
			rNum=12;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=12;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=9395;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==94){
			VMtype=8;
			tm=20;
			tr=23;
			mNum=260;
			rNum=23;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=23;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=9401;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==95){
			VMtype=4;
			tm=33;
			tr=25;
			mNum=260;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=9507;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==96){
			VMtype=7;
			tm=23;
			tr=30;
			mNum=170;
			rNum=17;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=17;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=9612;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==97){
			VMtype=6;
			tm=32;
			tr=21;
			mNum=160;
			rNum=13;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=13;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=9716;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==98){
			VMtype=3;
			tm=22;
			tr=37;
			mNum=220;
			rNum=22;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=22;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=9821;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==99){
			VMtype=8;
			tm=22;
			tr=42;
			mNum=260;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=9925;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		else if(i==100){
			VMtype=7;
			tm=24;
			tr=34;
			mNum=180;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			Arrive_Time=10030;
			Finish_Time=Arrive_Time+(int)T*10;
			utilization = ((double)VM[VMtype-1][0])/100;
		}
		
		
	}
		
	
}
