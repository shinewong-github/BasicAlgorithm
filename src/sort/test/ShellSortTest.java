package sort.test;

import static org.junit.Assert.*;

import org.junit.Test;

import sort.InsertSort;
import sort.ShellSort;

public class ShellSortTest {

	@Test
	public void test() {
		ShellSort shellSort=new ShellSort();
		int[] array={12,34,53,33,65,5,31,7,8,2};
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println() ;
			array=shellSort.shellSortB(array);
			for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}

}
