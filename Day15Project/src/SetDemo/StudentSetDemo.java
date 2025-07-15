package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student>set = new HashSet<Student>();
		set.add(new Student (101,"priya",45.09));
		set.add(new Student (102,"priyanka",87.09));
		set.add(new Student (103,"aachal",56.09));
		set.add(new Student (104,"akansha",45.564));
		set.add(new Student (105,"rucha",78.879));
		set.add(new Student (101,"priya",45.09));
		
		System.out.println(set);
	}

}
