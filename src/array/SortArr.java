package array;

import java.util.ArrayList;
import java.util.List;

public class SortArr {
	public static void main(String[] args) {
		new SortArr().printFlowerName();
		// [2,0,1,0,2,0,1,0,0]
		int[] intArr = { 2, 0, 1, 0, 2, 0, 1, 0, 0 };
		for (int i = 1; i < intArr.length; i++) {
			if (intArr[i] < intArr[i - 1]) {
				int temp = intArr[i];
				intArr[i] = intArr[i - 1];
				intArr[i - 1] = temp;
				i = 0;

			}

		}
		for (int a : intArr) {
			System.out.println(a);
		}
	}

	public void printFlowerName() {
		List<String> flowwerList = new ArrayList<>();
		flowwerList.add("flower A");
		flowwerList.add("flower B");

		// ()->
		flowwerList.forEach(name -> System.out.println(name));

		for (String name : flowwerList) {
			System.out.println(name);
		}
	}

}
