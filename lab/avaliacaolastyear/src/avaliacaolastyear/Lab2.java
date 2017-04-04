package avaliacaolastyear;

import java.util.Arrays;

public class Lab2 {
	private Lab1[] labs1 = new Lab1[10];
	private int nLabs = 0;
	
	
	boolean associateLab1(Lab1 l){
		if(nLabs < 10){
			for (int i = 0; i < nLabs; i++) {
				if(l.equals(labs1[i])){
					return false;
				}
			}
			labs1[nLabs] = l;
			nLabs++;
			return true;
		}else{
			System.out.println("Trying to associate more than 10 objects!");
			System.exit(2);
		}
		return false;
	}


	@Override
	public String toString() {
		return "Lab2 [labs1=" + Arrays.toString(labs1) + "]";
	}

	
}
