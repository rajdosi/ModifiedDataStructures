/**
 * @author wazza
 * 
 */
package com.rajdosi.ds.Pair;

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

	/**
	 * Checks whether the pair with the given right and left values are present
	 * in the pair or not
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public boolean containsPair(L left, R right) {
		return (this.left == left && this.right == right);
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

	/**
	 * Puts the value of right and left in the pair
	 * 
	 * @param left
	 * @param right
	 */
	public void put(L left, R right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * Puts the value of pair object according to the right and left mentioned
	 * in the pair
	 * 
	 * @param entry
	 */
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
