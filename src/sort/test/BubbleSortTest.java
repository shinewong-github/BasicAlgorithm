package sort.test;

import static org.junit.Assert.*;

import org.junit.Test;

import sort.BubbleSort;
import sort.InsertSort;

public class BubbleSortTest {

	@Test
	public void test() {
		BubbleSort bubbleSort=new BubbleSort();
		int[] array={2,34,5,3,6,5,3,7,8,2};
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
			array=bubbleSort.bubbleSort(array);
			for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}

}
