package CollectionInJava;

import java.util.ArrayList;

public class ArrayList_Demo 
{
	ArrayList<Integer> al= new ArrayList<Integer>();
	ArrayList<Integer> bl= new ArrayList<Integer>();
	public void Insert_Data() 
	{
		al.add(12);
		al.add(29);
		al.add(41);
		System.out.println(al);
		//System.out.println(al.get(1));
		bl.add(23);
		bl.add(34);
		bl.add(43);
		bl.add(56);
		al.addAll(bl);
		al.clear();
		System.out.println(al);
		//System.out.println(al.size());
		//al.remove(5);
		//System.out.println(al);
		//System.out.println(al.size());
	}
	public static void main(String [] args)
	{
		ArrayList_Demo jp= new ArrayList_Demo();
		jp.Insert_Data();
	}
}
