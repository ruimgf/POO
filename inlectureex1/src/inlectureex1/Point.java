package inlectureex1;

public class Point {
	int x;
	int y;

	public Point(){
		x = 0;
		y = 0;
	}

	public Point(int value){
		x = value;
		y = 0;
	}

	public Point(int xS, int yS){
		x = xS;
		y = yS;
	}

	public static void main(String[] args){
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point(2,3);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

	public String toString(){
		String str = "(" + x + "," + y + ")";
		return str;
	}
}
