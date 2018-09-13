package sort.test;



import org.junit.Test;


import sort.PartitionIt;

public class PartitionItTest {

	@Test
	public void test() {
		int[] array={19,6,18,20,10,7,8,9,15,16};
		PartitionIt partitionIt=new PartitionIt(array);
		int index=partitionIt.partitionIt(0, array.length-1, 10);
			System.out.println("位置"+index);
			for (int z= 0; z < array.length; z++) {
				System.out.print(array[z]+" ");
			}

	}

}
