package sortingalgorithms;

public class SortMetrics {

	private int compareCnt;
	private int swapCnt;
	
	void init(){
		compareCnt = 0;
		swapCnt = 0;
	}

	int getCompareCnt() {
		return compareCnt;
	}

	void incCompareCnt() {
		this.compareCnt = this.compareCnt + 1;
	}

    int getSwapCnt() {
		return swapCnt;
	}

	void incSwapCnt() {
		this.swapCnt = this.swapCnt + 1;
	}
	
	
	
}
