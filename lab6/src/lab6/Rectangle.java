package lab6;

public class Rectangle extends Shape {
	int width;
	int heigth;
	
	public Rectangle(int in_pos_x, int in_pos_y, int inWidth, int inHeigth) {
		super(in_pos_x, in_pos_y);
		// TODO Auto-generated constructor stub
		width = inWidth;
		heigth = inHeigth;
	}
	public int [] intersection(int in_y){
		int nPoints = 0;
		int [] points ;
		if(in_y<pos_y || in_y > pos_y + heigth - 1 ){
			return (new int[0]);
		}
		
		if(in_y==pos_y || in_y == pos_y + heigth - 1 ){
			points = new int[width];
			nPoints = width;
			for(int i=0 ; i<nPoints;i++){
				points[i] = pos_x + i;
			}
			return points;
		}else{
			points = new int[2];
			nPoints = 2;
			points[0] = pos_x;
			points[1] = pos_y + width - 1 ;
			return points;
		}
		
		
		
	}
}
