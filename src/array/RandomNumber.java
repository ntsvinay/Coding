package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumber {

	public static void main(String[] args) {

		int[] a = { 4, 5, 8, 1, 3, 9, 2, 6 };

		List<User> customObjList = new ArrayList<>();
		customObjList.add(new User("vinay", 100));
		customObjList.add(new User("sohel", 1));
		customObjList.add(new User("abhi", 19));
		customObjList.add(new User("ak", 20));
		customObjList.add(new User("ajay", 1001));

		List<Integer> intList = Arrays.stream(a).boxed().collect(Collectors.toList());

		// Stream.of(a).parallel().filter(i ->i%2 !=0).collect(Collectors.toList());
		List<Integer> priList = intList.stream().filter(i -> i % i != 0).collect(Collectors.toList());
		System.out.print(intList.stream().sorted().collect(Collectors.toList()));
		System.out.println(priList);
		for (User userObj : customObjList.stream().sorted(Comparator.comparing(User::getName))
				.collect(Collectors.toList())) {
			System.out.println(userObj.getName() + "---" + userObj.getMarks());

		}

	}
}

class User {
	private String name;
	private int marks;

	public String getName() {
		return name;
	}

	public User(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}