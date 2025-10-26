package sixPlusYrExp.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		System.out.println("all elements- "+al);
		// Normal sorting ascending sorting
		
		List<Integer> sortedList=al.stream().sorted().collect(Collectors.toList());
		System.out.println("Normal sorting ascending sorting : "+sortedList);
		
		//Customized sorting descending sorting using comparator method compare(i1,i2)
		//Comparator --> compare(obj1,obj2)
		// return -ve if obj1 has to come before obj2
		// return +ve if obj1 has to come after obj2
		// return 0 if obj1 & obj2 are equal
		List<Integer> descSorting=al.stream().sorted((i1,i2)-> ((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
		System.out.println("Customized sorting descending sorting : "+descSorting);
		
		List<Integer> ascSorting=al.stream().sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Used Comparator and compareTo() method print ascending : "+ascSorting);
		
		
		// just add '-' minus before -i1.compareTo(i2) to reverse its functionality to print in descending order
		List<Integer> descSorting1=al.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Used Comparator and compareTo() method print descending : "+descSorting1);
		
		// just interchange position on i1 and i2 i2.compareTo(i1) to reverse its functionality to print in descending order
		List<Integer> descSorting2=al.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Used Comparator and compareTo() method print descending : "+descSorting2);

		
		ArrayList<String> alString= new ArrayList<>();
		alString.add("sam");
		alString.add("Aish");
		alString.add("Bhalu");
		alString.add("laalu");
		alString.add("Modi");
		alString.add("Chaman");
		
		System.out.println("all elements- "+alString);
		
		List<String> ascSortingString=alString.stream().sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Used Comparator and compareTo() method print ascending : "+ascSortingString);
		
		
		// just add '-' minus before -i1.compareTo(i2) to reverse its functionality to print in descending order
		List<String> descSortingString1=alString.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Used Comparator and compareTo() method print descending : "+descSortingString1);
		
		// just interchange position on i1 and i2 i2.compareTo(i1) to reverse its functionality to print in descending order
		List<String> descSortingString2=alString.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Used Comparator and compareTo() method print descending : "+descSortingString2);

		
	}

}