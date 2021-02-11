package day13;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionAddExample{  
	public static void main(String[] args) {  
		//passing string values  
		List<Integer> set = new ArrayList<Integer>();  
		//add String values in this collection  
		set.add(40);   
		set.add(null);  
		set.add(0);  
		set.add(12);  
		System.out.print("The elements in Collection : " );  
		System.out.println(set);  
	}  
}  