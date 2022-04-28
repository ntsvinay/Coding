package collectionClasses;

import java.util.HashMap;
import java.util.Map;

public class CustomObInHashMap {

	public static void main(String[] args) {

		Map<Emp, String> empMap = new HashMap<>();

		Emp emp = new Emp("vinay", "kumar");
		Emp emp1 = new Emp("vinay", "kumar");

		empMap.put(emp, "2");
		empMap.put(emp1, "1");

		empMap.put(new Emp("vinay1", "kumar"), "3");
		empMap.put(new Emp("vinay1", "kumar"), "4");

		System.out.println(empMap.get(emp) + "," + empMap.get(emp1) + "," + empMap.size());

	}

}

final class Emp {
	private final String name;
	private final String lSecond;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lSecond == null) ? 0 : lSecond.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (lSecond == null) {
			if (other.lSecond != null)
				return false;
		} else if (!lSecond.equals(other.lSecond))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	Emp(String name, String ls) {
		this.name = name;
		this.lSecond = ls;

	}

	public String getName() {
		return name;
	}

	public String getlSecond() {
		return lSecond;
	}
}
