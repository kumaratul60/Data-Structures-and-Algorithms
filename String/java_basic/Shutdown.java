package String.java_basic;

import java.util.Scanner;

public class Shutdown {
	public static void main(String[] args) throws Exception {
		Runtime runtime = Runtime.getRuntime();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
   System.out.print("Enter No. of Seconds after which You want your Computer to Shutdown :");
  // long a=Long.parseLong(br.readLine());
   long a=Long.parseLong(sc.nextLine());

   
   Process prs = runtime.exec("shutdown -s -t " +a);
	
   System.exit(0);
		
	}

}
