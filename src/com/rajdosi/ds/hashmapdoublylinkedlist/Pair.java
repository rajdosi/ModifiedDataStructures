/**
 * @author wazza
 * 
 */
package com.rajdosi.ds.hashmapdoublylinkedlist;

import java.security.KeyStore.Entry;
import java.util.Iterator;

public class Pair<L, R> {

	private L left;
	private R right;
	private int size;

	/**
	 * default constructor
	 */
	public Pair() {

	}

	/**
	 * Constructor taking Left object and Right object as parameters
	 * 
	 * @param left
	 * @param right
	 */
	public Pair(L left, R right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * Constructor taking Pair object as a parameter
	 * 
	 * @param entry
	 */
	public Pair(Pair<? extends L, ? extends R> entry) {
		this.left = entry.getLeft();
		this.right = entry.getRight();
	}

	/**
	 * Returns the size of the pairList.
	 * 
	 * @return size
	 */
	public int size() {
		return size;
	}

	/**
	 * Returns whether the pairList is empty or not.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (size == 0);
	}

	public boolean containsPair(L left, R right) {

		return false;
	}

	/**
	 * Returns the left element of the pair
	 * 
	 * @param element1
	 * @return
	 */
	public L getLeft() {
		return left;
	}

	/**
	 * Returns the right element of the pair
	 * 
	 * @param element2
	 * @return
	 */
	public R getRight() {
		return right;
	}

	public void put(L left, R right) {
		this.left = left;
		this.right = right;
	}

	public void put(Pair<? extends L, ? extends R> entry) {
		this.left = entry.getLeft();
		this.right = entry.getRight();
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		} else if (!(object instanceof Pair)) {
			return false;
		} else {
			Pair<?, ?> objectPair = (Pair<?, ?>) object;
			return (left == null ? objectPair.getLeft() == null : left
					.equals(objectPair.getLeft()) && right == null ? objectPair
					.getRight() == null : right.equals(objectPair.getRight()));
		}
	}
}
