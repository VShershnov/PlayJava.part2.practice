package part2.practice.linkedList;

public class MyLinkedList<T> {
	
	private Node<T> head = null;
	
	public void add(T data){
		if (data!=null){
			head = new Node<T>(data,head);
		}
	}
	
	public String toString(){
		String res = "";
		Node<T> temp = head;
		while(temp !=null){
			res+=temp.getData();
			temp=temp.getNext();
		}
		return res;
	}
	
	public T pop(){
		if (head == null)
			return null;
		T temp = head.getData();
		head = head.getNext();
		return temp;
	}
	
	class Node<T>{
		private T data;
		private Node next;
		Node(T data, Node next){
			this.data = data;
			this.next = next;
		}
		Node(T data){
			this.data = data;
			this.next = null;
		}
		
		public T getData(){
			return data;
		}
		public Node getNext(){
			return next;
		}
	}

}
