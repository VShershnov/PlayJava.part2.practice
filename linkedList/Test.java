package part2.practice.linkedList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		for (int i=0;i<10;i++)
			myList.add(i);
		System.out.println(myList);
		myList.add(10);
		System.out.println(myList);
		System.out.println(myList.pop());
		System.out.println(myList);
	}

}
