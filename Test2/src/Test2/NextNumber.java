package Test2;

import java.util.Scanner;


public class NextNumber {
	
	
	public static Node<Integer> reverseLL(Node<Integer> head){
		if(head==null || head.next==null)
			return head;
		Node<Integer> rev=reverseLL(head.next);
		head.next.next=head;
		head.next=null;
		return rev;
	}
	
	public static Node<Integer> nextNumber(Node<Integer> head){
		
			if(head==null)
				return head;
			Node<Integer> rev=reverseLL(head);
			if(rev.data<9) {
				++rev.data;
			}
			else {
				Node<Integer> temp=rev;
				Node<Integer> prev=null;
				int carry=0;
				while(temp!=null) {
					carry=(temp.data+1)/10;
					int sum=(temp.data+1)%10;
					temp.data=sum;
					prev=temp;
					temp=temp.next;
				}
				if(carry==1) {
					prev.next=new Node<Integer>(1);
				}
				
			}
			return reverseLL(rev);
			
			
	}
	public static Node<Integer> takeInput()
	{
	
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null, tail=null;
		while(data!=-1)
		{
			Node<Integer> n1=new Node<>(data);
			if(head==null)
			{
				head=n1;
				tail=n1;
			}
			else
			{
				tail.next=n1;
				tail=tail.next;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static void printLinkedList(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Node<Integer> head=takeInput();
		head=nextNumber(head);
		printLinkedList(head);

	}

}
