package ciic4020.list.test;

import ciic4020.list.ArrayListFactory;
import ciic4020.list.List;
import ciic4020.list.ListFactory;

public class ListTest {

	public static void main(String[] args) {
		ListFactory<String> factory = new ArrayListFactory<String>();
		List<String> theList = factory.newInstance();
		
		System.out.println("Testing Add");
		theList.add("Ron");
		theList.add("Jil");
		theList.add("Ned");
		printList(theList);
		
		theList.add(1, "Li");
		System.out.println("First element: " + theList.first());
		theList.add(2, "Apu");
		theList.add(theList.size(), "Xi");
		System.out.println("Last element: " + theList.last());

		printList(theList);
		
		theList.add("Ron");
		theList.add(theList.size(),"Ron");
		System.out.println("Before removing Ron");
		
		printList(theList);
		theList.removeAll("Ron");
		System.out.println("After removing all instances of Ron");
		printList(theList);
		
		theList.add(1, "Amy");
		theList.add("Amy");
		theList.add("Moe");
		System.out.println("Before removing Amy");
		printList(theList);
		theList.remove("Amy");
		System.out.println("After removing Amy");
		printList(theList);
		
		System.out.println("Is Apu in the list: " + theList.contains("Apu"));
		theList.remove(1);
		System.out.println("Is Apu in the list: " + theList.contains("Apu"));

		theList.add(1, "Apu");
		theList.add("Apu");
		System.out.println("First index of Apu in the list: " + theList.firstIndex("Apu"));
		System.out.println("Last index of Apu in the list: " + theList.lastIndex("Apu"));
		printList(theList);
		
		System.out.println("Value of element at position 2: " + theList.get(2));
		theList.set(2, "Cal");
		System.out.println("Value of element at position 2 after set: " + theList.get(2));
		printList(theList);
		
		
	//Exercise 1 Tester
		System.out.println("");
		System.out.println("EXERCISE 1: TOTAL COUNT");
		List<String>[] totalCountArray = new List<String>[3];
		
		List<String> totalCountTester = factory.newInstance();
		totalCountTester.add("Apu");
		totalCountTester.add("Amy");
		totalCountTester.add("Moe");
		totalCountArray[0] = totalCountTester;
		
		List<String> totalCountTester2 = factory.newInstance();
		totalCountTester2.add("Apu");
		totalCountTester2.add("Apu");
		totalCountTester2.add("Joe");
		totalCountArray[1] = totalCountTester;

		List<String> totalCountTester3 = factory.newInstance();
		totalCountTester2.add("Moe");
		totalCountTester2.add("Amy");
		totalCountTester2.add("Joe");
		totalCountArray[2] = totalCountTester;

		System.out.println("Expected:Total Count of Apu is 3");
		System.out.println("Output: Total Count of Apu is " + totalCount("Apu", totalCountArray));
	//END Exercise 1 Tester
		
	} //END MAIN 

	private static void printList(List<String> theList) {
		System.out.println("List size: " + theList.size());
		for (String s : theList)
			System.out.println(s);;
	}
	
	//Exercise 1
		public static int totalCount(String s, List<String>[] array) //array of lists, each of type List<String>
		{
			//finds total number of copies of string s 
			//in all the lists in the array
			int totalCount = 0;
			for(int i=0; i < array.length; i++)
			{
				if(array[i].equals(s))
					totalCount++;
			}
			
			return totalCount; //dummy 
		}	
}