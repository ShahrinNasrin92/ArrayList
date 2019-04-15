package LinkList;

import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		LinkedList<String> linklist = new LinkedList<String>();
		linklist.add("Ana");
		linklist.add("Joyee");
		linklist.addFirst("Daud");
		linklist.addLast("Kam");
		linklist.add(2, "Abc");
		// linklist.replaceAll(operator);
		System.out.println(linklist);
		System.out.println(linklist.subList(1, 4));
		linklist.subList(1, 3).clear();
		System.out.println(linklist);
		
	}
	/*
	 * public void removefrom(int from,int to,LinkedList<String> linklist) {
	 * //List<String> link=linklist.subList(2,4); System.out.println(link);
	 * 
	 * }
	 */
}