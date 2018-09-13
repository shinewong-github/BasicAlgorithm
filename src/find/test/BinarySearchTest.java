package find.test;

import static org.junit.Assert.*;

import org.junit.Test;

import find.BinarySearch;

public class BinarySearchTest {

	@Test
	public void binarySearchtest() {
	
		BinarySearch binarySearch=new BinarySearch();
		int[] array={2,3,5,30,60,72,96,100,102,105};
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
			int SearchValue=binarySearch.binarySearchB(array,10);
			System.out.print("找到的key值的数组下标是:"+SearchValue);
	}
}
