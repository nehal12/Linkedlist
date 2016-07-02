package linkedlist;
import java.util.Scanner;
public class main {
	public static void main(String args[]){
		node first = null;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String s[] = str.split(" ");
			for(int i=0;i<s.length;i++) {
				if(first==null) {
				first = addnode( first,Integer.parseInt(s[i]));
			}
				else if(first!=null){
					first = addnode()
					
				}
			}
	}
	public static  node addnode(node first,int num) {
		node temp = new node(num,null);
		temp.next = first;
		return temp;
	}
}
