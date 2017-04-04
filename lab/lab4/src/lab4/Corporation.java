package lab4;

public class Corporation extends ShareHolder {
	private float value;
	
	
	public Corporation(String name, float money,float value1){
		super(name,money);
		value = value1; 
	}
	
	public void createShares(int quantity){
		
		addShare(new Share(this,this,quantity));
		
	}
	
	public float getValue(){
		return value;
	}
}
