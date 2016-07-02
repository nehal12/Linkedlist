package linkedlist;

public class linklist {
	node head=null;
	node h;
	node last=null;
	
	void add(int number)
	{
		if(head==null){
			h = new node(number);
			head= h;
			last = h;
		}
		else{
			node temp  = new node(number);
			last.next = temp;
			last = last.next;
			
		
		}
	}
	void print(){
		System.out.println(head.next);
	
	}
}
