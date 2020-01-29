package com.Biswajit.Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {

		//stringbuffer and string builder is mutable objects
		String name ="Biswa";
		name= name+"kalyan";
		name= name+"rath";
		
		StringBuilder sb= new StringBuilder();
		
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("IBM");
		sbuffer.append("Corporatiopn");
		//string buffer =synchronized methods; string builder is not synchronized(concurrency with threads
		System.out.println(sbuffer);
		
		sb.append("Biswa");
		System.out.println(sb);
		sb.append("Kalyan");
		System.out.println(sb);
		sb.append("Rath");
		System.out.println(sb);
	}

}
