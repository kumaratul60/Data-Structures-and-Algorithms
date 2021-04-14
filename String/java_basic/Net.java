package String.java_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.net.InetAddress;
//import java.io.*;
import java.net.*;

public class Net {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter site name :");
		String S = br.readLine();
		//String S = "Liberian.com";
		InetAddress s = InetAddress.getByName(S);
		System.out.println("Ip Address : "+s);
		
		
		
	}

}
