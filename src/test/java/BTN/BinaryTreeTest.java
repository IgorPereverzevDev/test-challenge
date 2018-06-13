package BTN;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    private BinaryTree.BTN nodeOne;
    private BinaryTree.BTN nodeTwo;

    @Test
    public void identicalTreesSuccess() {
        BinaryTree tree = new BinaryTree();

        nodeOne = new BinaryTree.BTN(1);
        nodeOne.left = new BinaryTree.BTN(2);
        nodeOne.right = new BinaryTree.BTN(3);
        nodeOne.left.left = new BinaryTree.BTN(4);
        nodeOne.left.right = new BinaryTree.BTN(5);

        nodeTwo = new BinaryTree.BTN(1);
        nodeTwo.left = new BinaryTree.BTN(2);
        nodeTwo.right = new BinaryTree.BTN(3);
        nodeTwo.left.left = new BinaryTree.BTN(4);
        nodeTwo.left.right = new BinaryTree.BTN(5);

        assertTrue(tree.identicalTrees(nodeOne, nodeTwo));

    }

    @Test
    public void identicalTreesFail() {
        BinaryTree tree = new BinaryTree();

        nodeOne = new BinaryTree.BTN(1);
        nodeOne.left = new BinaryTree.BTN(2);
        nodeOne.right = new BinaryTree.BTN(3);
        nodeOne.left.left = new BinaryTree.BTN(4);
        nodeOne.left.right = new BinaryTree.BTN(5);

        nodeTwo = new BinaryTree.BTN(1);
        nodeTwo.left = new BinaryTree.BTN(2);
        nodeTwo.right = new BinaryTree.BTN(3);
        nodeTwo.left.left = new BinaryTree.BTN(4);
        nodeTwo.left.right = new BinaryTree.BTN(5);
        nodeTwo.left.right = new BinaryTree.BTN(6);

        assertFalse(tree.identicalTrees(nodeOne, nodeTwo));
    }


    @Test
    public void identicalTreesWhenNodesNull() {
        BinaryTree tree = new BinaryTree();
        assertTrue(tree.identicalTrees(null, null));
    }
}