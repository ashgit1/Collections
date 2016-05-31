package com.collection.naturalordering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class OrderingApp {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		SortedSet<String> set = new TreeSet<String>();
		
		// addding elemnts into the list, set
		addElements(list);
		addElements(set);
		
		// display the elements of list, set
		Collections.sort(list);       // sort the particular collection item...
		System.out.println("List:");
		showElements(list);
		System.out.println("----------------------------------");
		System.out.println("Set:");
		showElements(set);
	}

	private static void addElements(Collection<String> col){
		col.add("Tanya");
		col.add("Ashish");
		col.add("Priyanka");
		col.add("Bablu");
	}
	
	private static void showElements(Collection<String> col){
		for(String value : col){
			System.out.println(value);
		}
	}
}
