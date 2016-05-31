package com.ashish.collection.properties;

import java.util.*;
import java.io.*;

public class Test {
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("C:/Ashish/Reference/WorkSpace/AshWorkSpace/Collections/src/com/ashish/collection/properties/db.properties");
		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}
}