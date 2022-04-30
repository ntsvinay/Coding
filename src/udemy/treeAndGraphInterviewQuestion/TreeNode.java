package udemy.treeAndGraphInterviewQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
	public int size = 0;

	public TreeNode(int d) {
		data = d;
		size = 1;
	}

	public static TreeNode createMinimalBST(int[] array) {
		// TODO
		TreeNode newNode = new TreeNode(array[0]);
		for (int i = 1; i < array.length - 1; i++) {

			newNode.left = newNode.insert(newNode, array[i]);
			newNode.right = newNode.insert(newNode, array[i]);

		}
		newNode.print();
		return newNode;
	}

	public TreeNode insert(TreeNode node, int arr) {
		if (node == null) {
			TreeNode newNode = new TreeNode(arr);
			return newNode;

		} else if (node.data > arr) {
			node.left = insert(node.left, arr);
			size++;
		} else {
			node.right = insert(node.right, arr);
			size++;
		}
		return node;

	}

	public void print() {
		Queue<TreeNode> qu = new LinkedList<TreeNode>();
		qu.add(parent);
		while (!qu.isEmpty()) {
			TreeNode crtNode = qu.remove();
			System.out.println(crtNode.data + " ");
			if (crtNode.left != null) {
				qu.add(crtNode.left);
			} else if (crtNode.right != null) {
				qu.add(crtNode.right);
			}

		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 4, 6, 3, 5, 8, 9 };
		TreeNode.createMinimalBST(arr);
	}

}
