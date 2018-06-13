package BTN;

import lombok.Getter;
import lombok.Setter;

class BinaryTree {

    @Getter
    @Setter
    static class BTN {
        int val;
        BTN left;
        BTN right;
        BTN(int val) {
            this.val = val;
            left = right = null;
        }
    }

    boolean identicalTrees(BTN rootOne, BTN rootTwo) {
        if (rootOne == rootTwo) {
            return true;
        }
        if (rootOne == null || rootTwo == null) {
            return false;
        }
        return (rootOne.val == rootTwo.val &&
                identicalTrees(rootOne.left, rootTwo.left) &&
                identicalTrees(rootOne.right, rootTwo.right));
    }
}
