package com.trees;

/**
 * This class represents a Trinary tree node. It has data, a left child, right
 * child and middle node.
 * 
 * @author aethena
 *
 */
public class TrinaryNode {
	private Integer data;
	private TrinaryNode left;
	private TrinaryNode middle;
	private TrinaryNode right;

	/**
	 * Constructor to create a trinary node with data
	 * @param data
	 */
	public TrinaryNode(Integer data) {
		this.data = data;
	}


	/**
	 * @return the data
	 */
	public Integer getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Integer data) {
		this.data = data;
	}

	/**
	 * @return the left
	 */
	public TrinaryNode getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(TrinaryNode left) {
		this.left = left;
	}

	/**
	 * @return the middle
	 */
	public TrinaryNode getMiddle() {
		return middle;
	}

	/**
	 * @param middle
	 *            the middle to set
	 */
	public void setMiddle(TrinaryNode middle) {
		this.middle = middle;
	}

	/**
	 * @return the right
	 */
	public TrinaryNode getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(TrinaryNode right) {
		this.right = right;
	}


}
