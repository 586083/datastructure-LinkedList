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
	
	
	//find middle element
	public Object printMiddle(SingleLinkedList input) {
		Node slowPtr=this.head;
		Node fastPtr=this.head;
		if(this.head != null) {
			while(fastPtr != null && fastPtr.next != null) {
				fastPtr=fastPtr.next.next;
				slowPtr=slowPtr.next;
			}
		}
		System.out.println("Middle element data"+slowPtr.data);
		return slowPtr;
	
	}
	
	
	public static void main(String args[]) {
		SingleLinkedList list=new SingleLinkedList();
		
		
		/**Creating three nodes**/
		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		Node node6=new Node(6);
		Node node7=new Node(7);
		Node node8=new Node(8);
		Node node9=new Node(9);
		Node node10=new Node(10);
		
		//setting head element as first node
		list.head=node1;
		//setting next element
		list.head.next=node2;
		//setting third element and next element
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		node8.next=node9;
		node9.next=node10;
		
		//print the list
		list.printList();
		//insert element in last
		//list.insert(list, 11);
		//find middle element
		list.printMiddle(list);
		
	}
}
