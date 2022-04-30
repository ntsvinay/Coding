package udemy.treeAndGraphInterviewQuestion;

import java.util.*;

public class ValidateBST {

	public static boolean checkBST(TreeNode node) {
		Queue<TreeNode> qu = new LinkedList<TreeNode>();
		qu.add(node);
		while (!qu.isEmpty()) {
			TreeNode crt = qu.remove();
			if (crt.data < crt.left.data) {
				return false;
			} else if (crt.data > crt.right.data) {
				return false;
			} else {
				if (crt.left != null) {
					qu.add(crt.left);
				}
				if (crt.right != null) {
					qu.add(crt.right);
				}
			}

		}
		return true;
	}

}