package com.rajdosi.ds.SkipList;

public class CheckSkipList {

	/**
	 * @param a
	 */
	public static void main(String a[]) {
		SkipList<Integer> skipList = new SkipList<>();
		skipList.insert(3);
		skipList.normalDisplay();
		System.out.println("");
		skipList.insert(6);
		skipList.normalDisplay();
		System.out.println("");
		skipList.insert(2);
		skipList.normalDisplay();
		System.out.println("");
		skipList.insert(5);
		skipList.normalDisplay();
		System.out.println("");
		skipList.insert(1);
		skipList.normalDisplay();
		System.out.println("");
		System.out.println("Max Level : " + skipList.getMaxLevel()
				+ "\tSize : " + skipList.getSize());

		System.out.println(skipList.search(5));
	}
}
