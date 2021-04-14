package String.java_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class URL {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter URl :");
		String S = br.readLine();
		URL url = new URL();
		System.out.println("protocal is :"+url.getProtocol(S));
		System.out.println("host no is :"+url.gethost());
		System.out.println("port no is :"+url.getport());
		System.out.println("path is :"+url.getpath());
		System.out.println(url);
	
  }

	private String getpath() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getport() {
		// TODO Auto-generated method stub
		return null;
	}

	private String gethost() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getProtocol(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}
