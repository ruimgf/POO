package lab6;

public abstract class Shape {
	int pos_x;
	int pos_y;
	
	public Shape(int in_pos_x,int in_pos_y) {
		// TODO Auto-generated constructor stub
		pos_x = in_pos_x;
		pos_y = in_pos_y;
	}
	
	abstract public int [] intersection(int in_y);
	
}
