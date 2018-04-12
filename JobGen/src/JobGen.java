import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class JobGen {
	
	public static void JobGen(int JobNumber){
		for(int i=1;i<=JobNumber;i++){
			System.out.println("else if(i=="+i+"){");
			int VMtype=new Random().nextInt(8)+1;
			System.out.println("   VMtype="+VMtype+";");
			int vn=new Random().nextInt(112)+16;//虚拟机数目[16,128]
			System.out.println("   vn="+vn+";");
			int T=new Random().nextInt(100)+1;
			System.out.println("   T="+T+";");
			int Arrive_Time=i*5;
			System.out.println("   Arrive_Time="+Arrive_Time+";");
			System.out.println("   utilization = ((double)VM[VMtype-1][0])/100;");
			System.out.println("   Finish_Time=Arrive_Time+(int)T;");
			System.out.println("}");
			
			
		}
		
		try{
			File file=new File("D://Job.txt");
			BufferedWriter bf=new BufferedWriter(new FileWriter(file));
			for(int i=1;i<=JobNumber;i++){
				bf.write("else if(i=="+i+"){");
				bf.newLine();
				int VMtype=new Random().nextInt(8)+1;
				bf.write("   VMtype="+VMtype+";");
				bf.newLine();
				int vn=(int) (100*Math.random()+100);//虚拟机数目[100,200]
				bf.write("   vn="+vn+";");
				bf.newLine();
				int T=new Random().nextInt(100)+1;
				bf.write("   T="+T+";");
				bf.newLine();
				int Arrive_Time=i*5;
				bf.write("   Arrive_Time="+Arrive_Time+";");
				bf.newLine();
				bf.write("   utilization = ((double)VM[VMtype-1][0])/100;");
				bf.newLine();
				bf.write("   Finish_Time=Arrive_Time+(int)T;");
				bf.newLine();
				bf.write("}");
				bf.newLine();
			}
			bf.close();
		}catch(IOException e){};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobGen(100);
		
	}

}
