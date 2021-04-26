/*
 * List.java
 * 
 * Requires: Node.java
 * 
 * WIP. Singly linked list
 * We will implement:
 * isEmpty()   : boolean
 * printList() : void
 * append(int data) : void [add to the end of the list]
 * remove(int data) : boolean [remove data from the list]
 * insert(int data, int location) : insert data after (could
 * 		also be before if needed) a location/element
 * 		in the list
 * 
 * Try to implement the first two or three
 * before our next lesson!
 * 
 */

/*
 * Node (element) class: building block of ADTs,
 * specifically for linked (list) implementations
 */
 
class Node
{
	int  data;
	Node next; // (self-reference)
	
	public Node(int d)	// constructor <- allows you to create
	{					// a node AND initialise its data at
		data = d;		// the same time (with one line of code).
		next = null;	// like: Node n = new Node(5);
	}
	
	public boolean hasNext()
	{
		if(next == null)
			return false;
		else
			return true;
			
		// OR // return next != null;
	}

/*
	public String toString()
	{
		return "" + data;
	}
*/

}

public class LinkedList
{
	Node start;		// beginning/head/access point of the L. List
	
	public boolean isEmpty()
	{	return start == null;
	}
	
	public void append(int data)
	{	Node newNode = new Node(data);
		if( isEmpty() )
		{	start = newNode;
			return;
		}
		Node temp = start;
		// while( temp.next != null ) // also, ...
		while( temp.hasNext() )
		{	temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void printList()
	{	
		if( isEmpty() )
		{	System.out.println("List is empty");
			return;
		}
		Node temp = start;
		System.out.print("Start -> ");
		while(temp != null)
		{	System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(); //" <- End");
	}
	
	public void remove(int element)
	{
		if( isEmpty() == true )
		{	System.out.println("ERROR - List is empty.");
			return;
		}
		if( element == start.data )
		{	start = start.next;
			return;
		}
		Node temp1 = start;
		Node temp2 = start.next;
		while(temp2 != null)
		{	if(temp2.data == element)
			{	temp1.next = temp2.next;
				return; // removing this does something!
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
	}
	
	public static void main (String[] args){
		LinkedList a = new LinkedList();

		do{
			int x = IBIO.inputInt("Enter a value: ");
			if(x==0){
				break;
			}
			a.append(x);
			a.printList();
		}while(a.isEmpty()==false);
	}

}

