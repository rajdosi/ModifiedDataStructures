package com.rajdosi.ds.SkipList;

import java.util.NoSuchElementException;

/**
 * @author wazza
 */
public class SkipNode<E extends Comparable<E>> {

	/**
	 * Basic composition of a SkipNode
	 */
	private E element;
	private SkipNode<E> up, down, right, left;
	private Integer level;

	/**
	 * Constructor that initializes the element and the level to which it
	 * belongs
	 * 
	 * @param element
	 * @param level
	 */
	public SkipNode(E element, int level) {
		this.element = element;
		this.level = level;
	}

	public SkipNode<E> search(E element) {
		if (right != null) {
			Integer compare = right.getElement().compareTo(element);
			if (compare.equals(0)) {
				return right;
			} else if (compare < 0) {
				return right.search(element);
			} else if (compare > 0) {
				return down.search(element);
			} else {
				throw new NoSuchElementException();
			}
		} else if (down != null) {
			return down.search(element);
		} else {
			throw new NoSuchElementException();
		}
	}

	public void insert(E element, Integer level, SkipNode<E> node) {
		if (level > this.level
				&& (right == null || right.getElement().compareTo(element) > 0)) {
			SkipNode<E> newNode = new SkipNode<E>(element, this.level);
			if (left != null) {
				newNode.setRight(right);
				right.setLeft(newNode);
			}
			left.setRight(newNode);
			newNode.setLeft(left);

			if (node != null) {
				newNode.setUp(node);
				node.setDown(newNode);
			}

			if (down != null) {
				down.insert(element, level, newNode);
			}
		} else if (right != null && right.getElement().compareTo(element) < 0) {
			right.insert(element, level, node);
		} else if (right != null && right.getElement().compareTo(element) == 0) {
			throw new IllegalArgumentException(
					"The element is already present in the Skip List and cannot be added once more");
		} else if (down != null) {
			down.insert(element, level, node);
		}

	}

	// Setters and Getters
	public E getElement() {
		return element;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer l) {
		level = l;
	}

	public void setUp(SkipNode<E> node) {
		up = node;
	}

	public void setDown(SkipNode<E> node) {
		down = node;
	}

	public void setLeft(SkipNode<E> node) {
		left = node;
	}

	public void setRight(SkipNode<E> node) {
		right = node;
	}

	public SkipNode<E> goUp() {
		return up;
	}

	public SkipNode<E> goDown() {
		return down;
	}

	public SkipNode<E> goLeft() {
		return left;
	}

	public SkipNode<E> goRight() {
		return right;
	}
}
