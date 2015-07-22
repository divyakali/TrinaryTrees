package com.trees;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrinaryTreeTest {
	TrinaryNode head = null;
	TrinaryTree tree = null;

	@Before
	public void setUp() {
		tree = new TrinaryTree();
		initialize(tree, 5, 4, 9, 5, 7, 2);
		head = tree.getHead();

	}

	@After
	public void tearDown() {
		head = null;
		tree = null;
	}

	@Test
	public void testTreetoString() {
		String result = TrinaryTree.convertToString(head);
		Assert.assertTrue(result.equals("2 4 5 5 7 9"));
	}

	@Test
	public void testInsert() {
		tree.insertNode(2);
		String result = TrinaryTree.convertToString(head);
		Assert.assertTrue(result.equals("2 2 4 5 5 7 9"));
		tree.insertNode(3);
		result = TrinaryTree.convertToString(head);
		Assert.assertTrue(result.equals("2 2 3 4 5 5 7 9"));
	}

	/**
	 * @param tree
	 * @param values set of values to generate the tree
	 *            to be initialized
	 */
	private void initialize(TrinaryTree tree, Integer... values) {
		for (int value : values)
			tree.insertNode(value);
	}


}
