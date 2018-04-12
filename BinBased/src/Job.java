
public class Job {
	private int VMtype;//虚拟机类型
	private int vn;//用户要求的最小VM数目
	private double T;
	
	public void setVn(int vn) {
		this.vn = vn;
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
			   VMtype=4;
			   vn=95;
			   T=4;
			}
			else if(i==2){
			   VMtype=2;
			   vn=45;
			   T=96;
			}
			else if(i==3){
			   VMtype=4;
			   vn=116;
			   T=28;
			}
			else if(i==4){
			   VMtype=6;
			   vn=116;
			   T=65;
			}
			else if(i==5){
			   VMtype=3;
			   vn=30;
			   T=31;
			}
			else if(i==6){
			   VMtype=1;
			   vn=78;
			   T=32;
			}
			else if(i==7){
			   VMtype=8;
			   vn=99;
			   T=79;
			}
			else if(i==8){
			   VMtype=3;
			   vn=16;
			   T=72;
			}
			else if(i==9){
			   VMtype=5;
			   vn=42;
			   T=96;
			}
			else if(i==10){
			   VMtype=2;
			   vn=74;
			   T=48;
			}
			else if(i==11){
			   VMtype=7;
			   vn=78;
			   T=70;
			}
			else if(i==12){
			   VMtype=2;
			   vn=90;
			   T=9;
			}
			else if(i==13){
			   VMtype=7;
			   vn=53;
			   T=93;
			}
			else if(i==14){
			   VMtype=8;
			   vn=16;
			   T=19;
			}
			else if(i==15){
			   VMtype=4;
			   vn=8;
			   T=64;
			}
			else if(i==16){
			   VMtype=2;
			   vn=42;
			   T=68;
			}
			else if(i==17){
			   VMtype=1;
			   vn=62;
			   T=24;
			}
			else if(i==18){
			   VMtype=5;
			   vn=76;
			   T=56;
			}
			else if(i==19){
			   VMtype=1;
			   vn=44;
			   T=51;
			}
			else if(i==20){
			   VMtype=2;
			   vn=47;
			   T=87;
			}
			else if(i==21){
			   VMtype=7;
			   vn=55;
			   T=59;
			}
			else if(i==22){
			   VMtype=1;
			   vn=115;
			   T=70;
			}
			else if(i==23){
			   VMtype=2;
			   vn=122;
			   T=24;
			}
			else if(i==24){
			   VMtype=7;
			   vn=87;
			   T=34;
			}
			else if(i==25){
			   VMtype=1;
			   vn=61;
			   T=81;
			}
			else if(i==26){
			   VMtype=2;
			   vn=89;
			   T=63;
			}
			else if(i==27){
			   VMtype=4;
			   vn=75;
			   T=11;
			}
			else if(i==28){
			   VMtype=2;
			   vn=9;
			   T=23;
			}
			else if(i==29){
			   VMtype=3;
			   vn=123;
			   T=58;
			}
			else if(i==30){
			   VMtype=4;
			   vn=115;
			   T=85;
			}
			else if(i==31){
			   VMtype=4;
			   vn=126;
			   T=2;
			}
			else if(i==32){
			   VMtype=2;
			   vn=123;
			   T=79;
			}
			else if(i==33){
			   VMtype=2;
			   vn=47;
			   T=65;
			}
			else if(i==34){
			   VMtype=4;
			   vn=40;
			   T=4;
			}
			else if(i==35){
			   VMtype=1;
			   vn=118;
			   T=7;
			}
			else if(i==36){
			   VMtype=2;
			   vn=116;
			   T=57;
			}
			else if(i==37){
			   VMtype=3;
			   vn=71;
			   T=48;
			}
			else if(i==38){
			   VMtype=6;
			   vn=33;
			   T=11;
			}
			else if(i==39){
			   VMtype=6;
			   vn=15;
			   T=39;
			}
			else if(i==40){
			   VMtype=5;
			   vn=38;
			   T=59;
			}
			else if(i==41){
			   VMtype=6;
			   vn=50;
			   T=10;
			}
			else if(i==42){
			   VMtype=7;
			   vn=60;
			   T=82;
			}
			else if(i==43){
			   VMtype=1;
			   vn=115;
			   T=10;
			}
			else if(i==44){
			   VMtype=5;
			   vn=127;
			   T=76;
			}
			else if(i==45){
			   VMtype=4;
			   vn=80;
			   T=10;
			}
			else if(i==46){
			   VMtype=6;
			   vn=81;
			   T=71;
			}
			else if(i==47){
			   VMtype=3;
			   vn=55;
			   T=4;
			}
			else if(i==48){
			   VMtype=1;
			   vn=70;
			   T=51;
			}
			else if(i==49){
			   VMtype=2;
			   vn=49;
			   T=39;
			}
			else if(i==50){
			   VMtype=3;
			   vn=78;
			   T=95;
			}
			else if(i==51){
			   VMtype=2;
			   vn=41;
			   T=2;
			}
			else if(i==52){
			   VMtype=5;
			   vn=53;
			   T=39;
			}
			else if(i==53){
			   VMtype=1;
			   vn=32;
			   T=11;
			}
			else if(i==54){
			   VMtype=5;
			   vn=98;
			   T=20;
			}
			else if(i==55){
			   VMtype=2;
			   vn=30;
			   T=32;
			}
			else if(i==56){
			   VMtype=4;
			   vn=29;
			   T=74;
			}
			else if(i==57){
			   VMtype=2;
			   vn=55;
			   T=51;
			}
			else if(i==58){
			   VMtype=2;
			   vn=37;
			   T=48;
			}
			else if(i==59){
			   VMtype=3;
			   vn=116;
			   T=4;
			}
			else if(i==60){
			   VMtype=7;
			   vn=22;
			   T=68;
			}
			else if(i==61){
			   VMtype=2;
			   vn=26;
			   T=9;
			}
			else if(i==62){
			   VMtype=3;
			   vn=11;
			   T=67;
			}
			else if(i==63){
			   VMtype=4;
			   vn=62;
			   T=54;
			}
			else if(i==64){
			   VMtype=2;
			   vn=42;
			   T=33;
			}
			else if(i==65){
			   VMtype=2;
			   vn=76;
			   T=72;
			}
			else if(i==66){
			   VMtype=5;
			   vn=41;
			   T=94;
			}
			else if(i==67){
			   VMtype=8;
			   vn=99;
			   T=61;
			}
			else if(i==68){
			   VMtype=5;
			   vn=82;
			   T=34;
			}
			else if(i==69){
			   VMtype=8;
			   vn=33;
			   T=23;
			}
			else if(i==70){
			   VMtype=5;
			   vn=64;
			   T=36;
			}
			else if(i==71){
			   VMtype=6;
			   vn=43;
			   T=17;
			}
			else if(i==72){
			   VMtype=7;
			   vn=45;
			   T=69;
			}
			else if(i==73){
			   VMtype=3;
			   vn=43;
			   T=33;
			}
			else if(i==74){
			   VMtype=3;
			   vn=33;
			   T=85;
			}
			else if(i==75){
			   VMtype=4;
			   vn=63;
			   T=57;
			}
			else if(i==76){
			   VMtype=7;
			   vn=70;
			   T=96;
			}
			else if(i==77){
			   VMtype=4;
			   vn=13;
			   T=25;
			}
			else if(i==78){
			   VMtype=1;
			   vn=117;
			   T=76;
			}
			else if(i==79){
			   VMtype=6;
			   vn=26;
			   T=16;
			}
			else if(i==80){
			   VMtype=8;
			   vn=126;
			   T=28;
			}
			else if(i==81){
			   VMtype=2;
			   vn=111;
			   T=81;
			}
			else if(i==82){
			   VMtype=5;
			   vn=50;
			   T=61;
			}
			else if(i==83){
			   VMtype=8;
			   vn=113;
			   T=14;
			}
			else if(i==84){
			   VMtype=7;
			   vn=121;
			   T=35;
			}
			else if(i==85){
			   VMtype=5;
			   vn=105;
			   T=98;
			}
			else if(i==86){
			   VMtype=2;
			   vn=62;
			   T=9;
			}
			else if(i==87){
			   VMtype=4;
			   vn=74;
			   T=71;
			}
			else if(i==88){
			   VMtype=6;
			   vn=55;
			   T=63;
			}
			else if(i==89){
			   VMtype=7;
			   vn=11;
			   T=40;
			}
			else if(i==90){
			   VMtype=2;
			   vn=46;
			   T=31;
			}
			else if(i==91){
			   VMtype=4;
			   vn=31;
			   T=24;
			}
			else if(i==92){
			   VMtype=4;
			   vn=18;
			   T=62;
			}
			else if(i==93){
			   VMtype=3;
			   vn=113;
			   T=31;
			}
			else if(i==94){
			   VMtype=3;
			   vn=86;
			   T=89;
			}
			else if(i==95){
			   VMtype=6;
			   vn=50;
			   T=58;
			}
			else if(i==96){
			   VMtype=8;
			   vn=29;
			   T=83;
			}
			else if(i==97){
			   VMtype=5;
			   vn=82;
			   T=35;
			}
			else if(i==98){
			   VMtype=1;
			   vn=90;
			   T=81;
			}
			else if(i==99){
			   VMtype=2;
			   vn=94;
			   T=51;
			}
			else if(i==100){
			   VMtype=6;
			   vn=62;
			   T=82;
			}

	}
		
	
}
