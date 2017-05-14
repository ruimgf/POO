package lab6;

import java.util.ArrayList;

public class Image {
	int width;
	int height;
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	public Image(int in_width, int in_height) {
		// TODO Auto-generated constructor stub
		width  = in_width;
		height = in_height;
	}

	public void addShape(Shape s){
		shapes.add(s);
	}

	public String line(int y){
		char [] ret = new char[width];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = '.';
		}
		int [] x_i;
		for(Shape temp : shapes){
			x_i = temp.intersection(y);
			for (int j = 0; j < x_i.length; j++) {
				ret[x_i[j]] = 'x'; 
			}
		}
		return new String(ret) + "\n";
		
	}

	@Override
	public String toString() {
		String str = "";
		
		for (int i = 0; i < height; i++) {
			str = str + line(i);
		}
		
		return str;
	}
	
	
	
}
