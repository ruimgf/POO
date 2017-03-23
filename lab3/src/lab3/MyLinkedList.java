package lab3;

public class MyLinkedList {
	MyLinkedNode begin;
	MyLinkedNode end;
	
	public MyLinkedList(){
		begin = null;
		end = null;
	}
	
	public void add(int value){
		if(begin == null){
			begin = new MyLinkedNode(value);
			begin.next = null;
			end = begin;
		}else{
			end.next = new MyLinkedNode(value);
			end = end.next;
		}
	}
	
	public void remove(){
		if(begin == null){
			return;
		}else{
			begin = begin.next;
		}
	}

	@Override
	public String toString() {
		String str = "";
		MyLinkedNode aux = begin;
		while(aux != null){
			str += aux.toString();
			str += '\n';
			aux=aux.next;
		}
		return "MyLinkedList []" + str;
	}
	
	public static void main(String[] args){
		MyLinkedList list = new MyLinkedList();
		
		for(int i = 0;i < 20;i++){
			list.add(i);
		}
		System.out.println("ola");
		System.out.println(list);
		list.remove();
		System.out.println(list);
	}
	
	
	
}

