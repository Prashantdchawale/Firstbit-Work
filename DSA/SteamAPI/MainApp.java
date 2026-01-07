package com.phoenix.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainApp {

	public static void main(String[] args) {

		List<Student> allStudents = new ArrayList();
		allStudents.add(new Student(1, "Soham", 80, "M"));
		allStudents.add(new Student(2, "Soham", 85, "M"));
		allStudents.add(new Student(3, "Geeta", 90, "F"));
		allStudents.add(new Student(4, "Priyanka", 95, "F"));

		// Iteration
		// forEach()
		// allStudents.stream().forEach(ref->System.out.println(ref.getStudName()));

		// Filtering
		// allStudents.stream().filter(merimarzi->merimarzi.getMarks()>90).forEach(ref->System.out.println(ref.getStudName()));

		// pipeline
		/*
		 * double avgMarks=allStudents.stream().filter(ref->ref.getGender().equals("M"))
		 * .mapToDouble(ref->ref.getMarks()).average().getAsDouble();
		 * System.out.println(avgMarks);
		 */
		HashMap<String, List<Student>> byName = (HashMap<String, List<Student>>) allStudents.stream()
				.collect(Collectors.groupingBy(Student::getStudName));

		HashMap<String, List<Student>> filteredData = new HashMap();

		List<Student> temp = new ArrayList();

		for (Student p : allStudents) {
			String name = p.getStudName();
			temp.add(p);

			Set<String> keys = filteredData.keySet();
			for (String key : keys) {
				if (name.equals(key)) {
					List<Student> intermediate = filteredData.get(key);
					intermediate.add(p);
					filteredData.put(key, intermediate);
				}
			}

			filteredData.put(name, temp);
		}

		/*
		 * for (String k : byName.keySet()) { System.out.println(byName.get(k).size());
		 * System.out.println(byName.get(k).get(0).getName()); }
		 */

		for (String ref : byName.keySet()) {
			System.out.println("The name " + ref + " occurs " + byName.get(ref).size());
		}

	}

}
