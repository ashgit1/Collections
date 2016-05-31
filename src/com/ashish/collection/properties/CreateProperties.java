package com.ashish.collection.properties;

import java.util.*;  
import java.io.*;  

public class CreateProperties {

	public static void main(String[] args) throws Exception {

		Properties p=new Properties();  
		p.setProperty("name","Ashishkumar Gupta");  
		p.setProperty("email","adoreashish@gmail.com");
		p.setProperty("age","26");
		p.store(new FileWriter("C:/Ashish/Reference/WorkSpace/AshWorkSpace/Collections/" +
				"src/com/ashish/collection/properties/info.properties"),"Javatpoint Properties Example");  
	}

}
