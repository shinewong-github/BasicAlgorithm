package sort;

/**
 * <strong>算法之排序：冒泡排序</strong><br>
 * 概述:通过两两交换走一趟,把符合目标值放在合适的位置,接着除了合适值不比较之外,再走n-1趟,如此循环.
 * 代码实现步骤: @{@link #bubbleSort(int[] array)}.
 *<strong>编程技巧获得:</strong><br>
 *<code>
 *<p>1:交换两个数值的值:temp=a a=b b=temp.
 *<p>
 *</code>
 *
 *<p>时间复杂度:O(n^2):比较和交换的时间复杂度都是N(N-1)/2=2N^2-2N次,时间复杂度是O(n^2)
 *<p>优点: 
 *<p>缺点:  
 *<p>适用场合:
 * @author ShineWong
 *
 */
public class BubbleSort {
	
/**
 * sss
 * @param array
 * @return
 */
	public int[] bubbleSort(int[] array){
		int out,in;
		for(out=array.length-1;out>1;out--){
			for(in=0;in<out;in++){
				if(array[in]>array[in+1]){
					int temp=array[in+1];
					array[in+1]=array[in];
					array[in]=temp;
				}
			}
		}
		return array;
			
	}

}
