package sort;

/**
 *   <strong>算法之排序：</strong>
 * <p>概述:
 *  <pre>
 *    
 *  </pre>
 * <p>样例:
 *  <pre>
 *    输入: 
 *    输出: 
 *  </pre>
 *
 *<strong>代码实现的逻辑思路步骤:</strong>
 * <pre>
 * <p>方式一: @{@link #}
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
 *  <p>时间复杂度:O(n^2):比较的次数,跟冒泡排序是一样的,平均为:N(N-1)/2,但是交换的次数时间复杂度减少了
 *  <p>优点:
 *  <p>缺点:
 *  <p>适用场合:
 * @author ShineWong
 *
 */
public class SelectSort {

/**
 * 
 * @param array
 * @return
 */
	public int[] selectSort(int[] array){
		int out,in,min;
		for(out=0;out<array.length-1;out++){
			min=out;//最小数排列在最小位,循环到数组末端.
			for(in=out+1;in<array.length;in++){//选取一个数(从数组的第二个数开始),与数组第一个数作比较.
				if(array[in]<array[min]){//如果大于第一个数,则交换值,如果没有则选择后面一个数开始比较,如此循环
					min=in;
					swap(out,min);
				}
			}
		}
		return array;
	}
/**
 * 交换两个值
 * @param a
 * @param b
 */
	public void swap(int a,int b){
		int temp=a;
	    a=b;
	    b=temp;
	}
}
