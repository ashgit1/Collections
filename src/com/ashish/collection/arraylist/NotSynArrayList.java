package com.ashish.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

class Resource {

	List<String> list = new ArrayList<String>();

	public void addItem() {
		list.add("Ashish");
		list.add("Sachin");
		list.add("Tanya");
	}

	public void removeItem() {
		list.remove(1);
	}

	public void displayList() {
			for (String item : list) {
				System.out.println(item);
			}
			System.out.println("------------------------");
	}
}

class ListThread1 extends Thread{
	
	Resource resource;
	
	public ListThread1(Resource res) {
		this.resource = res;
	}
	public void run(){
		resource.addItem();
		resource.displayList();
	}
}

class ListThread2 extends Thread{
	
	Resource resource;
	
	public ListThread2(Resource res) {
		this.resource = res;
	}
	public void run(){
		resource.removeItem();
		resource.displayList();
	}
}

public class NotSynArrayList {

	public static void main(String[] args) {
		Resource resource = new Resource();
		ListThread1 lt = new ListThread1(resource);
		lt.start();
		ListThread2 lt2 = new ListThread2(resource);
		lt2.start();
	}

}

/*Output:
Ashish
------------------------
Ashish
*/
