package CollectionInJava;

import java.util.ArrayList;

public class Array_Contains 
{
	ArrayList<Integer> al= new ArrayList<Integer>();
	public void Contain_Data() 
	{
		al.add(10);
		al.add(25);
		al.add(40);
		al.add(30);
		
		//let us print all the elements present in the list
		for(Integer number : al) 
		{
			System.out.println("Number :" + number);
		}
		boolean check = al.contains(23);
		
		if(check == true) {
			System.out.println("The list contains the element 23");
		}
		else {
			System.out.println("The list doesn't contain the element 23");
		}
		
		boolean find = al.contains(40);
		
		if(find == true) {
			System.out.println("The list contain the element 40");
		}
		else
		{
			System.out.println("The list doen't contain the element 40");
		}
	}
public static void main(String [] args) {
	Array_Contains ss = new Array_Contains();
	ss.Contain_Data();
}
}
