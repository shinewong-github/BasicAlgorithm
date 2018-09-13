package sort;

/**
 * 所谓的划分算法就是把数组根据关键字划分为两组数据,小的在数组的小下标,大的在数组的大下标
 *
 *时间复杂度是：O(N)
 * @author ShineWong
 *
 */
public class PartitionIt {
	int[] array;
	public PartitionIt(int[] array){
		this.array=array;
	}
	public int partitionIt(int left,int right,int pivot){
		int leftPtr=left-1;
		int rightPtr=right+1;
		while(true){
			//从数组最小下标开始于pivot比较,如果有大于等于pivot的值则取出leftPtr当前的下标
			while(leftPtr < right && array[++leftPtr] < pivot);
			//从数组最大下标开始于pivot比较,如果有小于等于pivot的值则取出rightPtr当前的下标
			while(rightPtr > left && array[--rightPtr] > pivot);
			if(leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr,rightPtr);
		}
		return leftPtr;
	}
	public void swap(int index1,int index2){
		int temp;
		                temp=array[index1];
	           array[index1]=array[index2];
	           array[index2]=temp;
	}
	
}
