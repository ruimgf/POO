package lab7;

public class NumericCircularLinkedList<T extends Number> extends CircularLinkedList<T> {

	
	double average(){
		NodeCLL <T> aux;
		double sum=0;
		double n=0;
		aux = base;
		
		while(true){
			sum += aux.element.doubleValue();
			aux = aux.next;
			
			if(aux == base){
				return sum/n;
			}
		}
	}
}
