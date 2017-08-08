import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// Created TreeSet
		TreeSet<Student> std = new TreeSet<Student>();
		// Creating student
		Student std1 = new Student("Neha", 2001, "chemistry");
		Student std2 = new Student("Sonam", 3003, "physics");
		Student std3 = new Student("Dipika", 4002, "biology");
		// Populating the list
		std.add(std1);
		std.add(std2);
		std.add(std3);
		// Creating iterator to iterate
		Iterator iterator = std.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
