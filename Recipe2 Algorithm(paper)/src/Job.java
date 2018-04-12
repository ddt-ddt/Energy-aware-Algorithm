
public class Job {
	private int VM[][] = {{10,11,15},{20,11,15},{20,22,15},{30,11,15},{30,22,30},{30,33,30},{40,22,15},{40,33,30}};
	private int VMtype;//虚拟机类型
	private int tm;//Map作业时间
	private int tr;//Reduce作业时间
	private int mNum;//Map作业数量
	private int rNum;//Reduce作业数量
	private int mSlot;//Map槽数目
	private int rSlot;//Reduce槽数目
	private int vn;//用户要求的最小VM数目
	private double T;
	
	public void setVn(int vn) {
		this.vn = vn;
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
		return T;
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
			//T=(double) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=160.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=190.0;
		}
		else if(i==3){
			VMtype=8;
			tm=49;
			tr=28;
			mNum=270;
			rNum=19;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=19;
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=210.0;
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
			T=1130.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1630.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1120.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1020.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=870.0;
		}
		else if(i==9){
			VMtype=8;
			tm=25;
			tr=50;
			mNum=280;
			rNum=24;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=24;
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=460.0;
		}
		else if(i==10){
			VMtype=7;
			tm=34;
			tr=50;
			mNum=180;
			rNum=18;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=18;
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=380.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=740.0;
		}
		else if(i==12){
			VMtype=6;
			tm=42;
			tr=23;
			mNum=250;
			rNum=25;
			mSlot=VM[VMtype-1][0]/5;
			rSlot=1;
			vn=25;
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=620.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=530.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=500.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=660.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1750.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1350.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=810.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1340.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1490.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=290.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=430.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=250.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=990.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1440.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=950.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1070.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1440.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1090.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=330.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=710.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1610.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1110.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=790.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1440.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=490.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=810.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=790.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1370.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1660.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1280.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=720.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=610.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1020.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=380.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=670.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=650.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=920.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=570.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=830.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1410.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=710.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=630.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1090.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=810.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1390.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=690.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=610.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1510.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1250.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=550.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1490.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=600.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=400.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1000.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=900.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=390.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=900.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=880.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1390.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1730.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1300.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1410.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=500.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=870.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=610.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1690.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=490.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=740.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=550.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1300.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=200.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=590.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1530.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1610.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1060.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=910.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1560.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1330.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1500.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=480.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1480.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=690.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1500.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1200.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=680.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1140.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1400.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1740.0;
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
			//T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			T=1090.0;
		}
	}
		
	
}
