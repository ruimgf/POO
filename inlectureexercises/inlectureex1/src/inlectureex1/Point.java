package inlectureex1;

import java.util.HashSet;

public class Point {
	int x,y;

	public Point(){
		/* if i don't provide anything is the same */
		this(0,0);
	}

	public Point(int value){
		this(value,0);
	}

	public Point(int xS, int yS){
		x = xS;
		y = yS;
	}

	public static void main(String[] args){
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point(2,3);
		
		/*textual description */
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		/*testing identity */
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p3.equals(p1));
		
		
		HashSet<Point> hs = new HashSet<Point>(); 
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		System.out.println(hs);
		p1 = null;
		p2 = null;
		p3 = null;
		
	}

	@Override
	public String toString() {
		return "Point (" + x + "," + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Point))
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Help I am");
		super.finalize();
	}
	
	
	
	
}
