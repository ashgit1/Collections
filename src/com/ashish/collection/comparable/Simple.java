package com.ashish.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Simple {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 23));
		al.add(new Student(105, "Jai", 21));

		// Collection's sort method which sort List types...
		Collections.sort(al);

		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
