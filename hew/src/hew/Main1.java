package hew;

import java.util.*;
public class Main1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		int task;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("\nSelect your option\n 1.Add\n 2.Delete\n 3.Display\n 4.Exit\n");
			task=s.nextInt();
			switch(task) {
			case 1: System.out.println("Enter the movie name to add\n");
			String m=s.next();
			list.add(m);
			System.out.println(m+" added to the movies list");
			break;
			case 2: System.out.println("Enter the movie name to delete\n");
			String n=s.next();
			if(list.contains(n)) {
				list.remove(n);
				System.out.println(n+ " is removed from the movies list");
			}
			else {
				System.out.println(n+ " is not present in the movies list");
			}
			break;
			case 3: System.out.println("The list of movies is as follows\n"); 
			for(String ls:list) {
				System.out.println(ls);
			}
			break;
			case 4: System.out.println("Exiting the program");
			break;
			default : System.out.println("Enter the correct option");
			}
		}
		while(task!=4);
	 
		}
	}

	