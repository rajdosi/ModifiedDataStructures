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
	private Integer maxLevel = 1;
	private Boolean isEmpty = true;
	private static final Double probability = 0.5;

	/**
	 * Constructor making the lowest null to start a new SkipList
	 */
	public SkipList() {
		head = new SkipNode<E>(null, 0);
		size = 0;
		maxLevel = 1;
		isEmpty = true;
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
		if (element == null)
			throw new UnsupportedOperationException(
					"null cant be added as an element because the first element of the Skip List is null");
		isEmpty = false;
		int level = 0;
		while (random() > probability) {
			level++;
		}
		size++;

		while (head.getLevel() < level) {
			maxLevel++;
			SkipNode<E> newHead = new SkipNode<E>(null, head.getLevel() + 1);
			head.setUp(newHead);
			newHead.setDown(head);
			head = newHead;
		}
		head.insert(element, level, null);
	}

	/**
	 * 
	 */
	public void delete(E element) {
		if (element == null)
			throw new UnsupportedOperationException(
					"null marks the beginning of every link list so it can't be deleted");
		head.delete(element);
	}

	/**
	 * This just prints the SkipList normally (for easy debug purposes)
	 */
	public void normalDisplay() {
		System.out.println("Normal Display : ");
		Integer l = maxLevel;
		SkipNode<E> tempHead = head;
		while (tempHead != null) {
			for (SkipNode<E> temp = tempHead; temp != null; temp = temp
					.goRight()) {
				System.out.print("-->" + temp.getElement());
			}
			System.out.println("");
			tempHead = tempHead.goDown();
			l--;
		}
	}

	/**
	 * This prints the SkipList in the way it actually appears to one's eye but
	 * the display is upside down
	 */
	public void SkipListDisplay() {
		System.out.println("Skip List Display : ");
		SkipNode<E> tempHead = head;
		while (tempHead.getLevel() != 0) {
			tempHead = tempHead.goDown();
		}

		for (SkipNode<E> tempNode = tempHead; tempNode != null; tempNode = tempNode
				.goRight()) {
			System.out.print("-->" + tempNode.getElement());
		}
		SkipNode<E> secondaryHead = tempHead.goUp();
		while (secondaryHead != null) {
			System.out.println("");
			SkipNode<E> tempSecondaryHead = secondaryHead;
			for (SkipNode<E> tempNode = tempHead; tempNode != null; tempNode = tempNode
					.goRight()) {
				if (tempSecondaryHead.getElement() == tempNode.getElement()) {
					System.out.print("-->" + tempSecondaryHead.getElement());
					if (tempSecondaryHead.goRight() == null)
						break;
					tempSecondaryHead = tempSecondaryHead.goRight();
				} else
					System.out.print("----");
			}
			if (secondaryHead.goUp() == null)
				break;
			secondaryHead = secondaryHead.goUp();
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
