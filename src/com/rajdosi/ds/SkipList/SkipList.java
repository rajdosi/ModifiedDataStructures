package com.rajdosi.ds.SkipList;

import static java.lang.Math.random;

/**
 * @author wazza
 */

public class SkipList<E extends Comparable<E>> {

	/**
	 * Primary element of a SkipList is a head node which determines where to
	 * start from
	 */
	private SkipNode<E> head;
	private Integer size = 0;
	private Integer maxLevel = 0;
	private Boolean isEmpty = false;
	private static final Double probability = 0.5;

	/**
	 * Constructor making the lowest null to start a new SkipList
	 */
	public SkipList() {
		head = new SkipNode<E>(null, 0);
		size = 0;
		maxLevel = 0;
		isEmpty = false;
	}

	/**
	 * Starting search from head to get the element we want in O(log n)
	 * (probably)
	 * 
	 * @param element
	 * @return
	 */
	public SkipNode<E> search(E element) {
		return head.search(element);
	}

	/**
	 * To insert an element in the SkipList we initially move the head pointer
	 * to appropriate maximum probabilistic rise and finally start inserting the
	 * elements in the SkipList from the top List
	 * 
	 * @param element
	 */
	public void insert(E element) {
		isEmpty = true;
		size++;
		int level = 0;
		while (random() > probability) {
			level++;
		}
		while (level > maxLevel) {
			SkipNode<E> newHead = new SkipNode<E>(null, head.getLevel() + 1);
			head.setUp(newHead);
			newHead.setDown(head);
			head = newHead;
			maxLevel++;
		}

		head.insert(element, level, null);
	}

	/**
	 * This just prints the SkipList normally (for easy debug purposes)
	 */
	public void normalDisplay() {
		Integer l = maxLevel;
		SkipNode<E> tempHead = head;
		while (l != 0) {
			for (SkipNode<E> temp = tempHead; temp != null; temp.goRight()) {
				System.out.println("-->" + temp.getElement());
			}
			l--;
			tempHead = tempHead.goDown();
		}
	}

	/**
	 * This prints the SkipList in the way it actually appears to one's eye but
	 * upside down
	 */
	public void SkipListDisplay() {
		Integer l = maxLevel;
		SkipNode<E> tempHead = head;
		while (l != 0) {
			SkipNode<E> previousHead = head.goUp();
		}
	}

	/**
	 * This method displays the maxLevel of the SkipList.
	 * 
	 * @return
	 */
	public Integer getMaxLevel() {
		return maxLevel;
	}

	/**
	 * This method displays the number of elements in bottom most list of
	 * SkipList
	 * 
	 * @return
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * This method displays whether the SkipList is empty or not
	 * 
	 * @return
	 */
	public Boolean isEmpty() {
		return isEmpty;
	}
}
