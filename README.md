# TrinaryTrees
Project to demonstrate the working of trinary trees

Implementation of insert and delete in a tri-nary tree. A tri-nary tree is much like a binary
tree but with three child nodes for each parent instead of two -- with the left node being values 
less than the parent, the right node values greater than the parent, and the middle nodes values 
equal to the parent.

###Functionality:###
<br/>
1. Insert a node
<br/>
2. Delete a node
<br/>
3. Find minimum node
<br/>
4. Convert tree to String (conversion by implementing in-order tree traversal)
<br/>
5. Empty check on tree
<br/>

Steps for insertion:
1. Traverse the tree to find appropriate location to insert and insert the new value. 
<br/>
Traversal rules:
Go to left subtree if data at current location is greater than insertion value.
<br/>
Go to right subtree if data at current location is lesser than insertion value.
<br/>
Go to middle subtree if data at current location is equal to insertion value.
<br/>
During traversal if you reach a point where the next point of traversal is null, insert new value.

Steps for deletion:
Key Points of observations:
The middle subtree of a given node is always a chain without any left/right branches(subtrees). Why? Because insertion logic will move to left or right subtree of parent node of the chain.
<br/>
<br/>
Once you observe the above, deletion is much straight forward and is analogous to deletion in a binary search tree.
Steps:
1.Traverse until you find the key to delete.
<br/>
2.If the node having key has both left and right subtrees, replace with minimum node value in right subtree.Delete replacing node(minimum node) in right subtree.
By symmetry you can also so the same with maximum of left sub tree.
<br/>
3.If there is only one of the left/right subtree, replace current node with next node in the left/right subtree.
<br/>

Testing is very important and you must test all cases of deletions to ensure working.

<br/><br/>
###Future/Limitations:###
Implement auto-balancing. Worst case time complexities arise when the search trees form a single linked list(tree without branches). Auto balancing will reduce the time complexity of worst case.

<br/>


