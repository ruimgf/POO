package avaliacaolastyear;

public class Lab1 {
	int x;
	int y;
	
	public Lab1(int xi, int yi) {
		// TODO Auto-generated constructor stub
		x = xi;
		y = yi;
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lab1 other = (Lab1) obj;
		if (x == other.x)
			return true;
			
		return false;
	}

	@Override
	public String toString() {
		return "Lab1 [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
