package Arrays;

import java.util.ArrayList;

public class BuildAnArray {
	public static void main(String[] args) {
	Array obj=new Array(4);
	ArrayList<Integer> list=new ArrayList<>();
	list.add(2);
	list.add(22);
	list.add(222);
	list.remove(2);
	int i=list.lastIndexOf(22);
	System.out.println(i);
	System.out.println(list);
	obj.insert(2);
	obj.insert(22);
	obj.insert(4);
	obj.insert(44);
	obj.insert(5);
	obj.insert(55);
	
	obj.remove(1);
	System.out.printf("%d",3).println();
//	System.out.println(obj.indexof(55));
	
//	obj.print();

	}}

