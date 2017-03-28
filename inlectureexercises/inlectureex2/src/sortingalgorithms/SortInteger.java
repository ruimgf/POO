package sortingalgorithms;

import java.util.Arrays;
import java.util.Random;

public abstract class SortInteger {

	private final int[] values;
	private final SortMetrics metrics = new SortMetrics();
	
	/* Protected methods*/
	
	protected final int compare(int i, int j){
		metrics.incCompareCnt();
		int i1=values[i], i2=values[j];
		
		if(i1==i2) return 0;
		else return (i1<i2 ? -1 : 1);
	}
	
	protected final void swap(int i, int j){
		metrics.incSwapCnt();
		int tmp=values[i];
		values[i] = values[j];
		values[j] = tmp;
	}
	
	protected abstract void doSort();
	
	/*public constructor and methods */
	
	public SortInteger(int [] v){
		values = v;
	}
	public final void sort(){
		metrics.init();
		doSort();
	}
	
	
	
	@Override
	public String toString() {
		return "SortInteger [values=" + Arrays.toString(values) + ", metrics=" + metrics + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0){
			System.out.println("Usage: SortInteget <num>");
			System.exit(1);
		}
		int [] vals = new int[Integer.parseInt(args[0])];
		Random random = new Random();
		
		for(int j=0;j<vals.length;j++){
			vals[j] = random.nextInt(vals.length*100 + 1);
		}
		System.out.println("vals="+Arrays.toString(vals));
		
		System.out.println("\n *** Bubble Sort \n *** ");
	}

}
