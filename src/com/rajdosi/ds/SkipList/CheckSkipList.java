package com.rajdosi.ds.SkipList;

public class CheckSkipList {

	/**
	 * @param a
	 */
	public static void main(String a[]) {
		SkipList<Integer> skipList = new SkipList<>();
		skipList.insert(3);
		skipList.insert(6);
		skipList.insert(2);
		skipList.insert(5);
		skipList.insert(1);
		System.out.println("Max Level : " + skipList.getMaxLevel()
				+ "\tSize : " + skipList.getSize());

		System.out.println("");
		skipList.normalDisplay();

		System.out.println("");
		System.out.println("");
		skipList.SkipListDisplay();
	}
}
