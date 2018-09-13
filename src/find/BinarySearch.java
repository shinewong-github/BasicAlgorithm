package find;

/**
 * 理解折半查找的思想:基于有序数据.
 * 找出一个值得数组下标，也就是找出在数组中的该值的位置
 * <p>时间复杂度对比:
 *  <p>线性查找:O(N)
 *  <p>二分查找:O(logN)
 *  <p>无序数组插入:O(1)
 *  <P>有序数组插入O(N)
 *  <P>有序数组删除O(N)
 *  <P>无序数组删除O(N)
 *  测试2
 */
public class BinarySearch {

/**
 * 折半查找的代码实现
 * 
 *
 * @param arr
 * @param key
 * @return
 */
	public  int binarySearch(int[] array, int searchKey) {
		int min = 0;
		int max = array.length - 1;
		int mid = (max + min) / 2;
		while (searchKey != array[mid]) {
			if (searchKey > array[mid])
				min = mid + 1;
			else if (searchKey < array[mid])
				max = mid - 1;

			if (min > max)
				return -1;
			mid = (max + min) / 2;
		}
		return mid;
	}

	public int binarySearchB(int[] array,int searchKey) {
		int lowerBound=0;
		int upperBound=array.length-1;
		int curIn;
		while(true){
			curIn=(lowerBound+upperBound)/2;
			if(array[curIn]==searchKey)
				return curIn;
			  else if(lowerBound>upperBound)
				  return -1;//找不到,返回-1
			
				  else{
					  if(array[curIn] < searchKey)
						  lowerBound= curIn + 1; 
					  else
						  upperBound=curIn+1;
				  }
			
		}
	}
}
