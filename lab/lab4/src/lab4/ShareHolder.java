package lab4;

public class ShareHolder {
	protected String name ;
	protected float money;
	Share[] myShares;
	int cursor;
	
	public ShareHolder(String name, float money){
		this.name = name;
		this.money = money;
		myShares = new Share[100];
		for(int i=0;i<myShares.length;i++){
			myShares[i] = null;			
		}
	}
	
	void credit(float ammout){
		money = money +  ammout;
	}
	void debit(float ammout){
		money = money +  ammout;
	}
	
	void addShare(Share s){
		for(int i=0; i< myShares.length;i++){
			if(myShares[i]==null){
				myShares[i] = s;
				break;
			}
		}
		
	}
	
	void removeShare(Share s){
		for(int i=0; i< myShares.length;i++){
			if(myShares[i]==s){
				myShares[i] = null;
				break;
			}
		}
	}
	
	
	
}
