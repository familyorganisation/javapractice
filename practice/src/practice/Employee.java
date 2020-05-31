package practice;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}



	public static void main(String args[]) {
		List<Employee> list = new ArrayList<>();
		Employee empl = new Employee();
		empl.id = 31;		
		list.add(empl);
		empl.id = 30;		
		list.add(empl);
		empl.id = 35;		
		list.add(empl);
		empl.id = 21;		
		list.add(empl);
		empl.id = 27;		
		list.add(empl);
		empl.id = 45;		
		list.add(empl);
		empl.id = 39;		
		list.add(empl);
		empl.id = 20;		
		list.add(empl);
		
		list.stream().filter(empl1 -> empl1.id >30).forEach(empl1 -> {System.out.println(empl1.id);});
	}
	
}
