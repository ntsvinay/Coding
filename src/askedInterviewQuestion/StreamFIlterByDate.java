package askedInterviewQuestion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFIlterByDate {
	public static void main(String[] args) {
		Predicate<Emp> dPre = Emp -> Emp.getjDate().getYear() == 2020;

		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp("VINAY_1", LocalDate.of(2016, 9, 23)));
		empList.add(new Emp("VINAY_2", LocalDate.of(2012, 9, 23)));
		empList.add(new Emp("VINAY_3", LocalDate.of(2012, 9, 23)));
		empList.add(new Emp("VINAY_4", LocalDate.of(2020, 9, 23)));

		List<String> emp = empList.stream().filter(dPre).map(em -> em.getName()).collect(Collectors.toList());
		for (String string : emp) {
			System.out.println(string);
		}

	}

}

class Emp {
	private String name;
	private LocalDate jDate;

	Emp(String name, LocalDate jDate) {
		this.jDate = jDate;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getjDate() {
		return jDate;
	}

	public void setjDate(LocalDate jDate) {
		this.jDate = jDate;
	}
}
