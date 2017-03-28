package sorting;

public class SortMetrics {
	
	private int compareCnt;
	private int swapCnt;
	
	void init(){
		compareCnt=0;
		swapCnt=0;
	}

	int getCompareCnt() {
		return compareCnt;
	}

	void incCompareCnt() {
		this.compareCnt++;
	}

	int getSwapCnt() {
		return swapCnt;
	}

	void incSwapCnt() {
		this.swapCnt++;
	}

	@Override
	public String toString() {
		return "SortMetrics [compareCnt=" + compareCnt + ", swapCnt=" + swapCnt
				+ "]";
	}

}
