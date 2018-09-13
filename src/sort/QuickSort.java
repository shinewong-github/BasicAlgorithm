package sort;

/**
 * 快速排序的前提要明白划分算法{@link PartitionIt}
 *   <strong>算法之排序：快速排序</strong>
 * <p>概述:
 *  <pre>
 *    思想：选取一个枢纽（数组最右端或者子数组的三数取中作为枢纽，枢纽本身不做比较运算，只作插入适当位置时的交换运算。），通过枢纽划分左右
 *     数组，再为左右数组选取合适的枢纽，最后，由枢纽和最小子数组排列成合适的序列。这就是快速排序的思想。
 *  </pre>
 * <p>样例:给定一个是个数的数组{19,6,18,20,10,7,8,9,15,16}
 *  <pre>
 *    输入: 
 *    输出: 
 *  </pre>
 *
 *<strong>代码实现的逻辑思路步骤:</strong>
 * <pre>
 * <p>方式一: @{@link #}:选取数组最右端的
 * <p>方式二:@{@link #}
 * <p>方式二:@{@link #}
 * </pre>
 
 *<strong>编程技巧获得:</strong>
 *<pre>
 * <code>
 * <p>1:
 * <p>2:
 *
 *  </code>
 *  </pre>
 *  
 *  <p>时间复杂度:
 *  <p>优点:
 *  <p>缺点:
 *  <p>适用场合:
 */
public class QuickSort {
	
	int[] array;
	public QuickSort(int[] array){
		this.array=array;
	}
	
/**
 * 选取最右端的数作为枢纽，但是不作为比较运算。
 * 最坏情况时间复杂度降为O(N^2),一般为O(N)
 * 
 */
	public void quickSortA(int left,int right){
		
		if(right-left <=0)//当只有一个数时
			return;	
		else
		{
			int pivot=array[right];
			int partition=partitionItA(left,right,pivot);
			quickSortA(left,partition-1);
			quickSortA(partition+1,right);
		}
   }
	
/**
 *选取数组前后中三个数排列，选中最为枢纽，放在后数的前面(原位置的数需要被调换给中数，最后再调回)
 *一共有四个步骤，一般为四个函数：
 *  快排函数 原型
 *  划分算法
 *  判断子数组元素个数小于三的函数
 */
	public void quickSortB(int left,int right){
		int size=right-left+1;
		if(size <= 3)
			manualSort(left,right);//手动交换处理
		else
		{
		int median=medianOf3(left,right);//计算数组中枢纽
		int partiton=partitionItB(left,right,median);
		
		quickSortB(left,partiton-1);//递归调用本函数
		quickSortB(partiton+1,right);
		}
   }
	
/**
 * 
 */
	public void quickSortC(int left,int right){
		int size = right-left+1;
	      if(size < 10)                   // insertion sort if small
	         insertionSort(left, right);
	      else                            // quicksort if large
	         {
	    	  int median = medianOf3(left, right);
	         int partition = partitionItB(left, right, median);
	         quickSortC(left, partition-1);
	         quickSortC(partition+1, right);
	         }
  }

///////////////////////////////////////////////////////////////////////////////////
/**
 * 划分算法，需要判断边界rightPtr > 0 
 * 
 */
	public int partitionItA(int left,int right,int pivot){
		int leftPtr=left-1;
		int rightPtr=right;
		while(true){
			while(array[++leftPtr] < pivot);
			//不用增加leftPtr < right的检测，因为 最右端的数组不参与运算，leftPtr在极端的情况下会落到right上，因为是拿right作为枢纽的
			//此时会跳出循环，比如{1,2,3,4,5,6,7,8}
			//
			while(rightPtr > 0 && array[--rightPtr] > pivot);
			//取数组右端的第二位开始比较，最右端那一位用来交换位置。
			//需要增加 > 0的检测，因为没不上上面的循环中有枢纽作为比较后会跳出。
			if(leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr,rightPtr);	
		}//end while
		swap(leftPtr,right);//将右端枢纽插入到合适的位置
		return leftPtr;
	}
	
/**
 * 划分算法，不需要判断边界
 */
		public int partitionItB(int left,int right,int pivot){
			int leftPtr=left;
			int rightPtr=right-1;
			while(true){
				while(array[++leftPtr] < pivot);
				//不用增加leftPtr < right的检测，因为 最右端的数组不参与运算，leftPtr在极端的情况下会落到right上，因为是拿right作为枢纽的
				//此时会跳出循环，比如{1,2,3,4,5,6,7,8}
				//
				while(array[--rightPtr] > pivot);
				//取数组右端的第二位开始比较，最右端那一位用来交换位置。
				//需要增加 > 0的检测，因为没不上上面的循环中有枢纽作为比较后会跳出。
				if(leftPtr >= rightPtr)
					break;
				else
					swap(leftPtr,rightPtr);	
			}//end while
			swap(leftPtr,right-1);//将右端枢纽插入到合适的位置
			return leftPtr;
		}
		
		
/**
 * 选三数的中，并跟后前数交换
 * @param left
 * @param right
 * @return
 */
		public int medianOf3(int left, int right)
	      {
	      int center = (left+right)/2;
	                                         
	      if( array[left] > array[center] )
	         swap(left, center);
	                                        
	      if( array[left] > array[right] )
	         swap(left, right);
	                                         
	      if( array[center] > array[right] )
	         swap(center, right);

	      swap(center, right-1);             // 
	      return array[right-1];          // return median value
	      }  
		
/**
 * 三数排列
 */
		 public void manualSort(int left, int right)
	      {
	      int size = right-left+1;
	      if(size <= 1)
	         return;         // no sort necessary
	      if(size == 2)
	         {               // 2-sort left and right
	         if( array[left] > array[right] )
	            swap(left, right);
	         return;
	         }
	      else               // size is 3
	         {               // 3-sort left, center, & right
	         if( array[left] > array[right-1] )
	            swap(left, right-1);                // left, center
	         if( array[left] > array[right] )
	            swap(left, right);                  // left, right
	         if( array[right-1] > array[right] )
	            swap(right-1, right);               // center, right
	         }
	      }  // end manualSort()
		 
/**这是一个处理小划分的插入排序算法
 * 	处理小划分，数据节点在9或10，可以把快速排序发挥到极限
 * 
 * @param left
 * @param right
 */
		 public void insertionSort(int left, int right)
	      {
	      int in, out;
	                                       //  sorted on left of out
	      for(out=left+1; out<=right; out++)
	         {
	         int temp = array[out];    // remove marked item
	         in = out;                     // start shifts at out
	                                       // until one is smaller,
	         while(in>left && array[in-1] >= temp)
	            {
	            array[in] = array[in-1]; // shift item to right
	            --in;                      // go left one position
	            }
	         array[in] = temp;          // insert marked item
	         }  // end for
	      }  // end insertionSort()
/**
 * 交换
 */
	public void swap(int index1,int index2){
		         int temp=array[index1];
	           array[index1]=array[index2];
	           array[index2]=temp;
	}
}
