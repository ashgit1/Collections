package com.ashish.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Simple {
	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Tanya", 23));
		al.add(new Student(106, "Ashish", 27));
		al.add(new Student(105, "Ashu", 27));

		System.out.println("Sorting by Name...");

		Collections.sort(al, new NameComparator());
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al, new AgeComparator());
		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}