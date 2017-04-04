package lab4;

public class Share {
	ShareHolder name;
	int quantity;
	Corporation mycorporation;
	public Share(ShareHolder name, Corporation corporation_l, int number){
		
		this.name = name;
		mycorporation = corporation_l;
		quantity = number;
		
	}
	
}
