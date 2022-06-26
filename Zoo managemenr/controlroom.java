package zoopack;
import java.util.*;
import java.lang.*;
import java.io.*;



class Employee {
	int idno;
	String name, address;


	public Employee(int idno, String name,
				String address)
	{
		this.idno = idno;
		this.name = name;
		this.address = address;
	}


	public String toString()
	{
		return this.idno + " "
			+ this.name + " "
			+ this.address;
	}
}

class Sortbyroll implements Comparator<Employee> {

	public int compare(Employee a, Employee b)
	{
		return a.idno - b.idno;
	}
}


class Main {
	public static void main(String[] args)
	{
		Employee[] arr = { new Employee(111, "bbbb", "Chennai"),
						new Employee(131, "aaaa", "Banglore"),
						new Employee(121, "cccc", "jaipur") };

		System.out.println("Unsorted");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		Arrays.sort(arr, 1, 2, new Sortbyroll());

		System.out.println("\nSorted by idno");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
