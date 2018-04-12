//Set the Job in this class
//We should set: 1. the VM type of this job
//				 2. the time of Map task
//				 3. the time of Reduce task
//				 4. the number of Map task
//				 5. the number of Reduce task
//				 6. the requirement of VM number
//				 7. the lease time of virtual cluster 
//				 8. the configuration of Map slot in virtual cluster
//				 9. the configuration of Reduce slot in virtual cluster


public class JobConfiguration {
	private int VMtype;
	private int tm;//Map time
	private int tr;//Reduce time
	private int mNum;//Map number
	private int rNum;//Reduce number
	private int mSlot;//Map slot
	private int rSlot;//Reduce slot
	private int vn;//Require VM number
	private double T;
	private int D;//the lease time of virtual cluster
	
	public int getD() {
		return D;
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
	
	public JobConfiguration(int i){
		if(i==1){
			VMtype=1;
			tm=30;
			tr=2400;
			mNum=160;
			rNum=2;
			mSlot=2;
			rSlot=1;
			vn=7;
			T=(double) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			D=2000;
		}
		else if(i==2){
			VMtype=2;
			tm=90;
			tr=901;
			mNum=50;
			rNum=1;
			mSlot=4;
			rSlot=1;
			vn=7;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			D=2000;
		}
		else if(i==3){
			VMtype=3;
			tm=39;
			tr=384;
			mNum=102;
			rNum=1;
			mSlot=2;
			rSlot=1;
			vn=3;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			D=2000;
		}
		else if(i==4){
			VMtype=4;
			tm=60;
			tr=2463;
			mNum=458;
			rNum=1;
			mSlot=4;
			rSlot=1;
			vn=6;
			T=(int) (tm*Math.ceil(mNum/(mSlot*vn))+tr*Math.ceil(rNum/(rSlot*vn)));
			D=2000;
		}
	}

}
