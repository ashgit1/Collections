package com.ashish.collection.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;  
		Student s2=(Student)o2; 
		
		return s1.name.compareTo(s2.name);  
	}

}

/**
 * This class provides comparison logic based on the name. In such case, we are using the compareTo() 
 * method of String class, which internally provides the comparison logic.
 */