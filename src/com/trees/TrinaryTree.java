package com.trees;


/**
 * A tri-nary tree is much like a binary tree but with three child nodes for
 * each parent instead of two -- with the left node being value less than the
 * parent, the right node values greater than the parent, and the middle nodes
 * values equal to the parent. It supports operations like insert a node ,
 * delete a node and pretty print.
 * 
 * @author aethena
 *
 */
public class TrinaryTree {

	private TrinaryNode head;

	/**
	 * Insert a new value into the Trinary Tree. If the value is less that
	 * current nodes data move left, if it is equal move down else move right.
	 * Insert the element once you reach a vacant spot
	 * 
	 * @param data
	 * @return
	 */
	public void insertNode(int data) {
		TrinaryNode current = head;
		// Base case : If tree is empty then head node is the new value
		if (isEmpty()) {
			head = new TrinaryNode(data);
		} else { // Navigate the tree to find appropriate vacant spot
			do {
				// if data at current node is greater than data, then insertion
				// should happen in left subtree
				if (current.getData() > data) {
					if (current.getLeft() == null) {
						current.setLeft(new TrinaryNode(data));
						break;
					} else {
						current = current.getLeft();
					}
				}
				// if data at current node is lesser than data, then insertion
				// should happen in right subtree
				else if (current.getData() < data) {
					if (current.getRight() == null) {
						current.setRight(new TrinaryNode(data));
						break;
					} else {
						current = current.getRight();
					}
				} else {// when data at current node is equal data to insert
					if (current.getMiddle() == null) {// when node has no middle
														// child
						current.setMiddle(new TrinaryNode(data));
						break;
					} else {
						// when node has a middle sub tree
						current = current.getMiddle();
					}
				}

			} while (true);
		}

	}

	/**
	 * Delete node by searching for value from current node
	 * 
	 * @param value
	 * @param current
	 * @return
	 */
	public TrinaryNode deleteNode(int value, TrinaryNode current) {
		// base case
		if (current == null)
			throw new IllegalArgumentException("Unable to find value");
		// find value to delete in the left subtree if current node's data is
		// greater than value
		if (current.getData() > value) {
			current.setLeft(deleteNode(value, current.getLeft()));
		}
		// find value to delete in the right subtree if current node's data is
		// lesser than value
		else if (current.getData() < value) {
			current.setRight(deleteNode(value, current.getRight()));
		}
		// find value to delete in the middle subtree if current node's data is
		// equal to value
		else {
			// if there is a middle subtree find value to delete at the end of
			// middle tree
			if (current.getMiddle() != null) {
				current.setMiddle(deleteNode(value, current.getMiddle()));
			} else if (current.getMiddle() == null) {
				// replace current node with max node of right tree
				if (current.getRight() != null) {
					TrinaryNode temp = findMinNode(current.getRight());
					current.setData(temp.getData());
					current.setRight(deleteNode(temp.getData(),
							current.getRight()));
				}
				// if there is no right subtree replace current node with its
				// left child
				else {
					current = current.getLeft();
				}
			}
		}
		return current;
	}

	/**
	 * delete Node by searching from head
	 * 
	 * @param value
	 * @return
	 */
	public TrinaryNode delete(int value) {
		head = deleteNode(value, head);
		return head;
	}

	/**
	 * Check if tree is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	/**
	 * Static method to convert tree to String Does a simple in-order traversal
	 * 
	 * @param head
	 * @return
	 */
	public static String convertToString(TrinaryNode head) {
		String result = "";
		TrinaryNode currentNode = head;
		if (head == null) {
			return "";
		} else {
			// get data
			result = Integer.toString(currentNode.getData());
			// While the current node has any remaining subtree, recursively
			// call this method to print the tree
			if (currentNode.getLeft() != null
					|| currentNode.getMiddle() != null
					|| currentNode.getRight() != null) {
				// print left subtree
				if (currentNode.getLeft() != null) {
					if (!convertToString(currentNode.getLeft()).equals(""))
						result = convertToString(currentNode.getLeft()) + " "
								+ result;

				}
				// print middle subtree
				if (currentNode.getMiddle() != null) {
					if (!convertToString(currentNode.getMiddle()).equals(""))
						result += " "
								+ convertToString(currentNode.getMiddle());
				}
				// print right subtree
				if (currentNode.getRight() != null) {
					if (!convertToString(currentNode.getRight()).equals(""))
						result += " " + convertToString(currentNode.getRight());
				}
			}

			return result;
		}
	}


	/**
	 * Used to retrieve min value in a tree
	 * 
	 * @param node
	 * @return
	 */
	public TrinaryNode findMinNode(TrinaryNode node) {
		while (node.getLeft() != null)
			node = node.getLeft();

		return node;
	}

	/**
	 * @return the head
	 */
	public TrinaryNode getHead() {
		return head;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	public void setHead(TrinaryNode head) {
		this.head = head;
	}

	public static void main(String[] args) {

	}

}
