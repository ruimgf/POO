package lab7;

public class CircularLinkedList<T> {
	NodeCLL <T> base;
	
	public CircularLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	void add (T t){
		if(base==null){
			base = new NodeCLL<T>();
			base.next = base;
			base.element = t;
		}else{
			NodeCLL <T> aux = new NodeCLL<T>();
			aux.next = base.next;
			base.next = aux;
			aux.element = t;
		}
	}
	
	void remove(T t){
		NodeCLL <T> aux;
		NodeCLL <T> aux2;
		aux = base.next;
		aux2 = base;
		while(aux != t){
			if(aux2 == base){
				return;
			}
			aux = aux.next;
			aux2 = aux2.next;
		}
		aux2.next = aux.next;		
	}
	
	void printList(){
		NodeCLL <T> aux;
		
		aux = base;
		
		while(true){
			aux = aux.next;
			System.out.println(aux.element);
			if(aux == base){
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		
		CircularLinkedList<String> list = new CircularLinkedList<String>();
		
		list.add("ola");
		list.add("como vais");
		list.add("como vais");
		list.printList();
		list.remove("ola");
		list.printList();
	}
}
