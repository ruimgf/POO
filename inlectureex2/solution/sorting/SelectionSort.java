package sorting;

public class SelectionSort extends SortInteger {

	public SelectionSort(int[] v) {
		super(v);
	}

	@Override
	protected void doSort() {
		for  (int i=0; i<getDataLength(); i++){
			int idxMin=i;
			for (int j=i+1; j<getDataLength(); j++)
				if (compare(idxMin,j)>0)
					idxMin=j;
			if(idxMin!=i)
				swap(i,idxMin);
		}
	}

}
