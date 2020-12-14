package singleLinkedList;

public class SingleLinkedList {
	Node head;
	
	static class Node{
		Object data;
		Node next;
		
		Node(Object data){
			this.data=data;
			this.next=null;
		}
	}
	
	//print the linked list list
	public void printList() {
		Node headElement=this.head;
		while(headElement != null) {
			System.out.println("Current Node Data"+headElement.data);
			headElement=headElement.next;
		}
	}
	
	//insert insert the linked list
	public SingleLinkedList insert(SingleLinkedList input,Object data) {
		
		Node insertNode=new Node(data);
		
		//if list is empty
		if(input.head ==null) {
			input.head=insertNode;
			return input;
		}else {
		
			Node lastNode = input.head;
			
			//if list is not empty
			while(lastNode.next != null) {
				lastNode=lastNode.next;
			}
			
			lastNode.next=insertNode;
				
		}
		return input;
		
	}
	
	public static void main(String args[]) {
		SingleLinkedList list=new SingleLinkedList();
		
		
		/**Creating three nodes**/
		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		
		//setting head element as first node
		list.head=node1;
		//setting next element
		list.head.next=node2;
		//setting third element
		node2.next=node3;
		
		//print the list
		list.printList();
		
		list.insert(list, 4);
	}
}
