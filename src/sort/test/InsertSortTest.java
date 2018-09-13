package sort.test;

import static org.junit.Assert.*;

import org.junit.Test;

import sort.InsertSort;

public class InsertSortTest {
	
	@Test
	public void testInsertSort() {
		InsertSort insertSort=new InsertSort();
		int[] array={2,34,5,3,6,5,3,7,8,2};
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
			array=insertSort.insertSort(array);
			for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	
	@Test
	public void testInsertSortB(){
		InsertSort insertSort=new InsertSort();
		int[] array1={10,9,8,7,6,5,4,3,2,1};
			for(int i=0;i<array1.length;i++)
				System.out.print(array1[i]+" ");
			System.out.println();
			array1=insertSort.insertSortB(array1);
			for(int i=0;i<array1.length;i++)
			System.out.print(array1[i]+" ");
	}

}
