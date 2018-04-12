
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
			   VMtype=1;
			   vn=182;
			   T=72;
			   Arrive_Time=5;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==2){
			   VMtype=7;
			   vn=164;
			   T=38;
			   Arrive_Time=10;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==3){
			   VMtype=6;
			   vn=102;
			   T=19;
			   Arrive_Time=15;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==4){
			   VMtype=4;
			   vn=140;
			   T=55;
			   Arrive_Time=20;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==5){
			   VMtype=3;
			   vn=107;
			   T=27;
			   Arrive_Time=25;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==6){
			   VMtype=2;
			   vn=151;
			   T=27;
			   Arrive_Time=30;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==7){
			   VMtype=8;
			   vn=165;
			   T=36;
			   Arrive_Time=35;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==8){
			   VMtype=3;
			   vn=100;
			   T=43;
			   Arrive_Time=40;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==9){
			   VMtype=8;
			   vn=116;
			   T=40;
			   Arrive_Time=45;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==10){
			   VMtype=6;
			   vn=197;
			   T=30;
			   Arrive_Time=50;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			
			else if(i==11){
			   VMtype=7;
			   vn=119;
			   T=18;
			   Arrive_Time=55;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==12){
			   VMtype=4;
			   vn=133;
			   T=71;
			   Arrive_Time=60;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==13){
			   VMtype=2;
			   vn=141;
			   T=71;
			   Arrive_Time=65;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==14){
			   VMtype=5;
			   vn=159;
			   T=3;
			   Arrive_Time=70;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==15){
			   VMtype=2;
			   vn=148;
			   T=76;
			   Arrive_Time=75;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==16){
			   VMtype=8;
			   vn=135;
			   T=14;
			   Arrive_Time=80;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==17){
			   VMtype=7;
			   vn=149;
			   T=21;
			   Arrive_Time=85;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==18){
			   VMtype=7;
			   vn=156;
			   T=67;
			   Arrive_Time=90;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==19){
			   VMtype=5;
			   vn=180;
			   T=43;
			   Arrive_Time=95;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==20){
			   VMtype=4;
			   vn=101;
			   T=23;
			   Arrive_Time=100;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==21){
			   VMtype=1;
			   vn=100;
			   T=29;
			   Arrive_Time=105;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==22){
			   VMtype=6;
			   vn=146;
			   T=18;
			   Arrive_Time=110;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==23){
			   VMtype=3;
			   vn=175;
			   T=67;
			   Arrive_Time=115;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==24){
			   VMtype=7;
			   vn=124;
			   T=39;
			   Arrive_Time=120;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==25){
			   VMtype=7;
			   vn=143;
			   T=85;
			   Arrive_Time=125;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==26){
			   VMtype=5;
			   vn=168;
			   T=65;
			   Arrive_Time=130;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==27){
			   VMtype=3;
			   vn=195;
			   T=19;
			   Arrive_Time=135;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==28){
			   VMtype=1;
			   vn=181;
			   T=41;
			   Arrive_Time=140;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==29){
			   VMtype=6;
			   vn=159;
			   T=82;
			   Arrive_Time=145;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==30){
			   VMtype=2;
			   vn=119;
			   T=87;
			   Arrive_Time=150;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==31){
			   VMtype=3;
			   vn=179;
			   T=69;
			   Arrive_Time=155;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==32){
			   VMtype=4;
			   vn=152;
			   T=61;
			   Arrive_Time=160;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==33){
			   VMtype=6;
			   vn=168;
			   T=42;
			   Arrive_Time=165;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==34){
			   VMtype=4;
			   vn=123;
			   T=56;
			   Arrive_Time=170;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==35){
			   VMtype=3;
			   vn=113;
			   T=63;
			   Arrive_Time=175;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==36){
			   VMtype=3;
			   vn=170;
			   T=94;
			   Arrive_Time=180;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==37){
			   VMtype=2;
			   vn=109;
			   T=61;
			   Arrive_Time=185;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==38){
			   VMtype=7;
			   vn=136;
			   T=72;
			   Arrive_Time=190;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==39){
			   VMtype=7;
			   vn=164;
			   T=75;
			   Arrive_Time=195;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==40){
			   VMtype=5;
			   vn=128;
			   T=80;
			   Arrive_Time=200;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==41){
			   VMtype=3;
			   vn=150;
			   T=78;
			   Arrive_Time=205;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==42){
			   VMtype=4;
			   vn=165;
			   T=11;
			   Arrive_Time=210;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==43){
			   VMtype=5;
			   vn=193;
			   T=44;
			   Arrive_Time=215;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==44){
			   VMtype=8;
			   vn=127;
			   T=78;
			   Arrive_Time=220;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==45){
			   VMtype=5;
			   vn=178;
			   T=41;
			   Arrive_Time=225;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==46){
			   VMtype=2;
			   vn=171;
			   T=4;
			   Arrive_Time=230;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==47){
			   VMtype=8;
			   vn=114;
			   T=54;
			   Arrive_Time=235;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==48){
			   VMtype=4;
			   vn=136;
			   T=23;
			   Arrive_Time=240;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==49){
			   VMtype=7;
			   vn=151;
			   T=73;
			   Arrive_Time=245;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==50){
			   VMtype=8;
			   vn=119;
			   T=93;
			   Arrive_Time=250;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==51){
			   VMtype=2;
			   vn=194;
			   T=5;
			   Arrive_Time=255;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==52){
			   VMtype=8;
			   vn=109;
			   T=41;
			   Arrive_Time=260;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==53){
			   VMtype=1;
			   vn=156;
			   T=31;
			   Arrive_Time=265;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==54){
			   VMtype=6;
			   vn=136;
			   T=77;
			   Arrive_Time=270;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==55){
			   VMtype=7;
			   vn=142;
			   T=59;
			   Arrive_Time=275;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==56){
			   VMtype=7;
			   vn=103;
			   T=55;
			   Arrive_Time=280;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==57){
			   VMtype=1;
			   vn=146;
			   T=48;
			   Arrive_Time=285;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==58){
			   VMtype=4;
			   vn=178;
			   T=83;
			   Arrive_Time=290;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==59){
			   VMtype=7;
			   vn=126;
			   T=81;
			   Arrive_Time=295;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==60){
			   VMtype=4;
			   vn=195;
			   T=33;
			   Arrive_Time=300;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==61){
			   VMtype=2;
			   vn=156;
			   T=18;
			   Arrive_Time=305;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==62){
			   VMtype=2;
			   vn=136;
			   T=93;
			   Arrive_Time=310;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==63){
			   VMtype=4;
			   vn=179;
			   T=20;
			   Arrive_Time=315;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==64){
			   VMtype=1;
			   vn=182;
			   T=66;
			   Arrive_Time=320;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==65){
			   VMtype=6;
			   vn=115;
			   T=63;
			   Arrive_Time=325;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==66){
			   VMtype=7;
			   vn=170;
			   T=63;
			   Arrive_Time=330;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==67){
			   VMtype=1;
			   vn=165;
			   T=30;
			   Arrive_Time=335;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==68){
			   VMtype=2;
			   vn=148;
			   T=36;
			   Arrive_Time=340;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==69){
			   VMtype=2;
			   vn=188;
			   T=93;
			   Arrive_Time=345;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==70){
			   VMtype=2;
			   vn=142;
			   T=13;
			   Arrive_Time=350;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==71){
			   VMtype=7;
			   vn=151;
			   T=12;
			   Arrive_Time=355;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==72){
			   VMtype=8;
			   vn=199;
			   T=98;
			   Arrive_Time=360;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==73){
			   VMtype=6;
			   vn=169;
			   T=86;
			   Arrive_Time=365;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==74){
			   VMtype=4;
			   vn=176;
			   T=60;
			   Arrive_Time=370;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==75){
			   VMtype=5;
			   vn=123;
			   T=39;
			   Arrive_Time=375;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==76){
			   VMtype=8;
			   vn=116;
			   T=61;
			   Arrive_Time=380;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==77){
			   VMtype=7;
			   vn=135;
			   T=74;
			   Arrive_Time=385;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==78){
			   VMtype=1;
			   vn=121;
			   T=37;
			   Arrive_Time=390;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==79){
			   VMtype=4;
			   vn=142;
			   T=54;
			   Arrive_Time=395;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==80){
			   VMtype=5;
			   vn=187;
			   T=77;
			   Arrive_Time=400;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==81){
			   VMtype=8;
			   vn=178;
			   T=37;
			   Arrive_Time=405;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==82){
			   VMtype=8;
			   vn=169;
			   T=40;
			   Arrive_Time=410;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==83){
			   VMtype=5;
			   vn=134;
			   T=88;
			   Arrive_Time=415;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==84){
			   VMtype=7;
			   vn=184;
			   T=89;
			   Arrive_Time=420;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==85){
			   VMtype=1;
			   vn=147;
			   T=41;
			   Arrive_Time=425;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==86){
			   VMtype=2;
			   vn=142;
			   T=61;
			   Arrive_Time=430;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==87){
			   VMtype=8;
			   vn=108;
			   T=10;
			   Arrive_Time=435;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==88){
			   VMtype=3;
			   vn=107;
			   T=68;
			   Arrive_Time=440;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==89){
			   VMtype=6;
			   vn=169;
			   T=78;
			   Arrive_Time=445;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==90){
			   VMtype=5;
			   vn=194;
			   T=67;
			   Arrive_Time=450;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==91){
			   VMtype=7;
			   vn=195;
			   T=35;
			   Arrive_Time=455;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==92){
			   VMtype=4;
			   vn=108;
			   T=97;
			   Arrive_Time=460;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==93){
			   VMtype=7;
			   vn=192;
			   T=48;
			   Arrive_Time=465;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==94){
			   VMtype=5;
			   vn=156;
			   T=42;
			   Arrive_Time=470;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==95){
			   VMtype=3;
			   vn=193;
			   T=55;
			   Arrive_Time=475;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==96){
			   VMtype=5;
			   vn=147;
			   T=26;
			   Arrive_Time=480;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==97){
			   VMtype=2;
			   vn=103;
			   T=82;
			   Arrive_Time=485;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==98){
			   VMtype=7;
			   vn=115;
			   T=85;
			   Arrive_Time=490;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==99){
			   VMtype=1;
			   vn=160;
			   T=29;
			   Arrive_Time=495;
			   utilization = ((double)VM[VMtype-1][0])/100;
			   Finish_Time=Arrive_Time+(int)T;
			}
			else if(i==100){
			   VMtype=7;
			   vn=111;
			   T=22;
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
