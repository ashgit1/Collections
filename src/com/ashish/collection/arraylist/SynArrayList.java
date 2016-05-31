package com.ashish.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Resource2 {

	List<String> list = Collections.synchronizedList(new ArrayList<String>());

	public void addItem() {
		list.add("Ashish");
		list.add("Sachin");
		list.add("Tanya");
	}

	public void removeItem() {
		list.remove(1);
	}

	public void displayList() {
		synchronized (list) {
			for (String item : list) {
				System.out.println(item);
			}
			System.out.println("------------------------");
		}
	}
}

class ListThread3 extends Thread {

	Resource2 resource2;

	public ListThread3(Resource2 res) {
		this.resource2 = res;
	}

	public void run() {
		resource2.addItem();
		resource2.displayList();
	}
}

class ListThread4 extends Thread {

	Resource2 resource2;

	public ListThread4(Resource2 res) {
		this.resource2 = res;
	}

	public void run() {
		resource2.removeItem();
		resource2.displayList();
	}
}

public class SynArrayList {

	public static void main(String[] args) {
		Resource2 res = new Resource2();
		ListThread3 lt3 = new ListThread3(res);
		ListThread4 lt4 = new ListThread4(res);
		lt3.start();
		lt4.start();
	}

}

/*Output:
Ashish
Tanya
------------------------
Ashish
------------------------
*/