package avaliacaolastyear;

import java.util.Random;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if(n<1){
			System.out.println("Input number must be greater than 1");
			System.exit(1);
		}
		Lab2[] labs2 = new Lab2[n];
		Random random = new Random();
		
		for(int m=0;true;m++){
			
			for (int i = 0; i < n; i++) {
				boolean flag = false;
				labs2[i] = new Lab2();
			 	for (int j = 0; j < 10 ; j++) {
			 		Lab1 l = new Lab1(random.nextInt(),0);
					if(!labs2[i].associateLab1(l)){
						System.out.println("oal");
						flag = true;
						continue;
					}
					
			 	}	
			 	if(!flag){
			 		System.out.println("Found it:" + labs2[i] + "after "+ m + " iteration(s)");
			 		System.exit(3);
			 	}
			}
			
		
		}
	}
	
	
}
