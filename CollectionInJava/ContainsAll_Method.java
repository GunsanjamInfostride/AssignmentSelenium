package CollectionInJava;

import java.util.ArrayList;

public class ContainsAll_Method 
{
	ArrayList<Integer> al= new ArrayList<Integer>();
	ArrayList<Integer> bl= new ArrayList<Integer>();
	public void All_Data() 
	{
		al.add(12);
		al.add(29);
		al.add(41);
		System.out.println("ArrayList1 :" +al);
		
		bl.add(12);
		bl.add(29);
		bl.add(41);
		bl.add(56);
		System.out.println("ArrayList2 :" +bl);
		
		boolean result = al.containsAll(bl);
		System.out.println("ArrayList1 contains all the elements of ArrayList2 :"+result);
		
		boolean proof = bl.containsAll(al);
		System.out.println("ArrayList2 contains all the elements of ArrayList1 :"+proof);
	}
	public static void main(String [] args) {
		ContainsAll_Method pw = new ContainsAll_Method();
		pw.All_Data();
	}
}
