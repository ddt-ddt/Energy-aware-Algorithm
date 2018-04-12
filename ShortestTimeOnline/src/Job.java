//new


public class Job {
	private double VM[][] = {{6.25,5.21,5.25},{12.5,10.42,10.5},{6.25,1.18,2.19},{25,4.86,5.25},{100,42.1,21},{50,15.63,10.5},{12.5,23.75,5.31},{25,47.5,10.5}};
	private int VMtype;//虚拟机类型
	private int vn;//用户要求的最小VM数目
	private int T;
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

	public int getVn() {
		return vn;
	}
	public double getT(){
		return T;
	}
	
	public Job(int i){
		if(i==1){
			   VMtype=6;
			   vn=30;
			   T=22;
			   Arrive_Time=5;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==2){
			   VMtype=3;
			   vn=39;
			   T=82;
			   Arrive_Time=10;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==3){
			   VMtype=4;
			   vn=71;
			   T=18;
			   Arrive_Time=15;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==4){
			   VMtype=5;
			   vn=93;
			   T=11;
			   Arrive_Time=20;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==5){
			   VMtype=7;
			   vn=46;
			   T=53;
			   Arrive_Time=25;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==6){
			   VMtype=1;
			   vn=112;
			   T=1;
			   Arrive_Time=30;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==7){
			   VMtype=7;
			   vn=116;
			   T=55;
			   Arrive_Time=35;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==8){
			   VMtype=8;
			   vn=58;
			   T=56;
			   Arrive_Time=40;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==9){
			   VMtype=7;
			   vn=108;
			   T=2;
			   Arrive_Time=45;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==10){
			   VMtype=6;
			   vn=16;
			   T=96;
			   Arrive_Time=50;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==11){
			   VMtype=3;
			   vn=57;
			   T=55;
			   Arrive_Time=55;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==12){
			   VMtype=7;
			   vn=45;
			   T=57;
			   Arrive_Time=60;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==13){
			   VMtype=6;
			   vn=122;
			   T=94;
			   Arrive_Time=65;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==14){
			   VMtype=2;
			   vn=34;
			   T=24;
			   Arrive_Time=70;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==15){
			   VMtype=4;
			   vn=104;
			   T=43;
			   Arrive_Time=75;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==16){
			   VMtype=1;
			   vn=44;
			   T=27;
			   Arrive_Time=80;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==17){
			   VMtype=8;
			   vn=108;
			   T=87;
			   Arrive_Time=85;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==18){
			   VMtype=6;
			   vn=59;
			   T=7;
			   Arrive_Time=90;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==19){
			   VMtype=1;
			   vn=101;
			   T=49;
			   Arrive_Time=95;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==20){
			   VMtype=2;
			   vn=77;
			   T=53;
			   Arrive_Time=100;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==21){
			   VMtype=6;
			   vn=76;
			   T=60;
			   Arrive_Time=105;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==22){
			   VMtype=3;
			   vn=10;
			   T=92;
			   Arrive_Time=110;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==23){
			   VMtype=1;
			   vn=54;
			   T=18;
			   Arrive_Time=115;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==24){
			   VMtype=2;
			   vn=56;
			   T=42;
			   Arrive_Time=120;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==25){
			   VMtype=5;
			   vn=120;
			   T=83;
			   Arrive_Time=125;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==26){
			   VMtype=3;
			   vn=39;
			   T=14;
			   Arrive_Time=130;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==27){
			   VMtype=4;
			   vn=103;
			   T=20;
			   Arrive_Time=135;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==28){
			   VMtype=2;
			   vn=103;
			   T=40;
			   Arrive_Time=140;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==29){
			   VMtype=8;
			   vn=92;
			   T=70;
			   Arrive_Time=145;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==30){
			   VMtype=7;
			   vn=105;
			   T=82;
			   Arrive_Time=150;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==31){
			   VMtype=4;
			   vn=33;
			   T=63;
			   Arrive_Time=155;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==32){
			   VMtype=4;
			   vn=98;
			   T=86;
			   Arrive_Time=160;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==33){
			   VMtype=1;
			   vn=13;
			   T=71;
			   Arrive_Time=165;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==34){
			   VMtype=6;
			   vn=21;
			   T=27;
			   Arrive_Time=170;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==35){
			   VMtype=8;
			   vn=36;
			   T=67;
			   Arrive_Time=175;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==36){
			   VMtype=6;
			   vn=85;
			   T=44;
			   Arrive_Time=180;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==37){
			   VMtype=8;
			   vn=81;
			   T=40;
			   Arrive_Time=185;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==38){
			   VMtype=3;
			   vn=46;
			   T=61;
			   Arrive_Time=190;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==39){
			   VMtype=6;
			   vn=85;
			   T=15;
			   Arrive_Time=195;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==40){
			   VMtype=8;
			   vn=50;
			   T=69;
			   Arrive_Time=200;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==41){
			   VMtype=6;
			   vn=67;
			   T=54;
			   Arrive_Time=205;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==42){
			   VMtype=5;
			   vn=48;
			   T=89;
			   Arrive_Time=210;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==43){
			   VMtype=6;
			   vn=103;
			   T=74;
			   Arrive_Time=215;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==44){
			   VMtype=1;
			   vn=9;
			   T=9;
			   Arrive_Time=220;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==45){
			   VMtype=4;
			   vn=99;
			   T=98;
			   Arrive_Time=225;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==46){
			   VMtype=4;
			   vn=100;
			   T=78;
			   Arrive_Time=230;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==47){
			   VMtype=2;
			   vn=43;
			   T=57;
			   Arrive_Time=235;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==48){
			   VMtype=1;
			   vn=16;
			   T=59;
			   Arrive_Time=240;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==49){
			   VMtype=1;
			   vn=23;
			   T=33;
			   Arrive_Time=245;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==50){
			   VMtype=7;
			   vn=88;
			   T=66;
			   Arrive_Time=250;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==51){
			   VMtype=8;
			   vn=53;
			   T=57;
			   Arrive_Time=255;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==52){
			   VMtype=2;
			   vn=93;
			   T=9;
			   Arrive_Time=260;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==53){
			   VMtype=2;
			   vn=53;
			   T=84;
			   Arrive_Time=265;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==54){
			   VMtype=6;
			   vn=105;
			   T=49;
			   Arrive_Time=270;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==55){
			   VMtype=6;
			   vn=107;
			   T=42;
			   Arrive_Time=275;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==56){
			   VMtype=1;
			   vn=88;
			   T=84;
			   Arrive_Time=280;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==57){
			   VMtype=1;
			   vn=20;
			   T=31;
			   Arrive_Time=285;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==58){
			   VMtype=3;
			   vn=83;
			   T=3;
			   Arrive_Time=290;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==59){
			   VMtype=7;
			   vn=118;
			   T=19;
			   Arrive_Time=295;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==60){
			   VMtype=1;
			   vn=10;
			   T=22;
			   Arrive_Time=300;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==61){
			   VMtype=3;
			   vn=32;
			   T=64;
			   Arrive_Time=305;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==62){
			   VMtype=6;
			   vn=98;
			   T=89;
			   Arrive_Time=310;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==63){
			   VMtype=1;
			   vn=51;
			   T=1;
			   Arrive_Time=315;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==64){
			   VMtype=1;
			   vn=14;
			   T=26;
			   Arrive_Time=320;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==65){
			   VMtype=2;
			   vn=68;
			   T=56;
			   Arrive_Time=325;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==66){
			   VMtype=5;
			   vn=72;
			   T=27;
			   Arrive_Time=330;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==67){
			   VMtype=7;
			   vn=29;
			   T=91;
			   Arrive_Time=335;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==68){
			   VMtype=2;
			   vn=121;
			   T=84;
			   Arrive_Time=340;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==69){
			   VMtype=2;
			   vn=45;
			   T=45;
			   Arrive_Time=345;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==70){
			   VMtype=6;
			   vn=125;
			   T=14;
			   Arrive_Time=350;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==71){
			   VMtype=8;
			   vn=15;
			   T=60;
			   Arrive_Time=355;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==72){
			   VMtype=7;
			   vn=123;
			   T=71;
			   Arrive_Time=360;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==73){
			   VMtype=8;
			   vn=37;
			   T=49;
			   Arrive_Time=365;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==74){
			   VMtype=6;
			   vn=73;
			   T=93;
			   Arrive_Time=370;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==75){
			   VMtype=4;
			   vn=54;
			   T=2;
			   Arrive_Time=375;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==76){
			   VMtype=8;
			   vn=14;
			   T=36;
			   Arrive_Time=380;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==77){
			   VMtype=1;
			   vn=55;
			   T=2;
			   Arrive_Time=385;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==78){
			   VMtype=5;
			   vn=95;
			   T=64;
			   Arrive_Time=390;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==79){
			   VMtype=8;
			   vn=24;
			   T=93;
			   Arrive_Time=395;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==80){
			   VMtype=4;
			   vn=40;
			   T=94;
			   Arrive_Time=400;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==81){
			   VMtype=5;
			   vn=95;
			   T=96;
			   Arrive_Time=405;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==82){
			   VMtype=2;
			   vn=19;
			   T=1;
			   Arrive_Time=410;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==83){
			   VMtype=3;
			   vn=56;
			   T=96;
			   Arrive_Time=415;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==84){
			   VMtype=8;
			   vn=76;
			   T=8;
			   Arrive_Time=420;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==85){
			   VMtype=1;
			   vn=98;
			   T=49;
			   Arrive_Time=425;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==86){
			   VMtype=7;
			   vn=88;
			   T=87;
			   Arrive_Time=430;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==87){
			   VMtype=8;
			   vn=49;
			   T=100;
			   Arrive_Time=435;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==88){
			   VMtype=7;
			   vn=45;
			   T=24;
			   Arrive_Time=440;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==89){
			   VMtype=1;
			   vn=78;
			   T=87;
			   Arrive_Time=445;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==90){
			   VMtype=7;
			   vn=14;
			   T=73;
			   Arrive_Time=450;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==91){
			   VMtype=3;
			   vn=38;
			   T=38;
			   Arrive_Time=455;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==92){
			   VMtype=3;
			   vn=64;
			   T=28;
			   Arrive_Time=460;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==93){
			   VMtype=6;
			   vn=62;
			   T=50;
			   Arrive_Time=465;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==94){
			   VMtype=5;
			   vn=19;
			   T=26;
			   Arrive_Time=470;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==95){
			   VMtype=7;
			   vn=74;
			   T=39;
			   Arrive_Time=475;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==96){
			   VMtype=1;
			   vn=38;
			   T=70;
			   Arrive_Time=480;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==97){
			   VMtype=8;
			   vn=8;
			   T=72;
			   Arrive_Time=485;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==98){
			   VMtype=8;
			   vn=105;
			   T=21;
			   Arrive_Time=490;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==99){
			   VMtype=2;
			   vn=17;
			   T=81;
			   Arrive_Time=495;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==100){
			   VMtype=5;
			   vn=35;
			   T=71;
			   Arrive_Time=500;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}

			else if(i==101){
				Arrive_Time=1000000;
				Finish_Time=11000000;
			}
		
		
			
	}
		
	
}
