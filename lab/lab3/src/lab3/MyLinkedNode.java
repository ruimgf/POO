package lab3;

public class MyLinkedNode {
	int value;
	MyLinkedNode next;
	
	public MyLinkedNode(int newvalue){
		value = newvalue;
		next = null;
	}

	@Override
	public String toString() {
		return "MyLinkedNode [value=" + value + "]";
	}
	
	
	
	
}
