package day13;

import java.util.ArrayList;

public class NewArrayList {

	public static void main(String[] args) {

		ArrayList<String> javabatch = new ArrayList<String>();
		javabatch.add("aarati");
		javabatch.add("deepa");
		javabatch.add("sarita");
		javabatch.add("abhay");

		System.out.println("javabatch" + javabatch);

		ArrayList<String> softskill = new ArrayList<String>();

		softskill.add("anjali");
		softskill.add("nikhil");
		softskill.add("deepa");
		softskill.add("aarati");

		System.out.println("softskill" + softskill);

		softskill.removeAll(javabatch);

		System.out.println("after removing" + softskill);

	}}