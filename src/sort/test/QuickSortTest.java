package sort.test;



import org.junit.Test;



import sort.PartitionIt;
import sort.QuickSort;

public class QuickSortTest {

	@Test
	public void test() {
		int[] array={19,6,18,20,10,7,8,9,15,16};
		QuickSort quickSort=new QuickSort(array);
//		quickSort.quickSortA(0, 9);
//		quickSort.quickSortB(0, 9);
		quickSort.quickSortC(0, 9);
			
			for (int z= 0; z < array.length; z++) {
				System.out.print(array[z]+" ");
			}

	}

}
