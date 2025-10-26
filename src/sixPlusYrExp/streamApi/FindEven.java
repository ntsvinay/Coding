package sixPlusYrExp.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEven {

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
		// here we use filter
		
		List<Integer> evenAl = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println("Even elements : "+evenAl);
		
		// now add 5 to each number
		// here we use map
		
		List<Integer> addAl = al.stream().map(i->i+5).collect(Collectors.toList());
		
		System.out.println("Updated elements : "+addAl);
		
		// number greater than 30 or pass students
		
		List<Integer> passAl = al.stream().filter(i->i>30).collect(Collectors.toList());
		
		System.out.println("Pass Student marks - "+passAl);
		System.out.println("Number of pass Students : "+passAl.size());
		
		// find count of pass students using stream
		
		long count=al.stream().filter(i->i>30).count();
		System.out.println("count of pass students direct by stream : "+count);

	}

}