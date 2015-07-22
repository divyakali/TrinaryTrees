package com.trees;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for ternary tree class
 * 
 * @author aethena
 *
 */
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

	@Test
	public void testDelete() {
		tree.delete(5);
		String result = TrinaryTree.convertToString(head);
		Assert.assertTrue(result.equals("2 4 5 7 9"));
		tree.delete(7);
		result = TrinaryTree.convertToString(head);
		Assert.assertTrue(result.equals("2 4 5 9"));
	}

	@Test
	public void testfindMinNode() {
		TrinaryNode actual = tree.findMinNode(head);
		Assert.assertEquals("Min mode not matching expected value", 2,
				actual.getData());
	}

	@Test
	public void testIsEmpty() {
		Assert.assertFalse("Tree not supposed to be empty", tree.isEmpty());
		tree = new TrinaryTree();
		Assert.assertTrue("Tree supposed to be empty", tree.isEmpty());
	}

	/**
	 * @param tree
	 * @param values
	 *            set of values to generate the tree to be initialized
	 */
	private void initialize(TrinaryTree tree, Integer... values) {
		for (int value : values)
			tree.insertNode(value);
	}

}
