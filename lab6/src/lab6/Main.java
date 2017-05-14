package lab6;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}


   public static void main(String[] args) {
	   Rectangle r = new Rectangle(3,3,5,5);
	   Image fig = new Image(20,20);
	   
	   fig.addShape(r);
	   
	   System.out.println(fig);
   }
}
