package proj;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductList arr = new ProductList("prodList.dat");
		boolean end=false;
		while(!end){
			System.out.println("Would you like to add an item? (1)");
			System.out.println("Would you like to remove an item? (2)");
			System.out.println("Would you like to see the inventory? (3)");
			int t = sc.nextInt();
		switch(t){
			case 1: 
				System.out.println("enter product name: ");
				String q = sc.next();
				System.out.println("enter product expiration Date(YYYY-MM-DD): ");
				String w = sc.next();
				System.out.println("enter product quantity: ");
				int e = sc.nextInt();
				System.out.println("enter product Value (After tax): ");
				int r = sc.nextInt();
				Product p1 = new Product(q, w, e, r);
				arr.add(p1);
				System.out.println("Succesfully added item: "+p1);
				break;
			case 2: //moved the logic for removing to remove function in ProductList
				System.out.println("What item would you like to remove? ");
				String rem = sc.next();
				arr.remove(rem);
				break;
			case 3:
				System.out.println(arr);
				break;		
		}
		System.out.println("Would you like to perform another action? (Y/N) ");
		String yesNo = sc.next();
		if(yesNo.equalsIgnoreCase("y"))
		{}
		else
			end=true;
		}
		sc.close();
		arr.exit("prodList.dat");
		
	}

}
