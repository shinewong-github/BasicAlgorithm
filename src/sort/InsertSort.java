package sort;

import java.util.Iterator;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * <strong>算法之排序：插入排序</strong>
 * <p>概述:
 * <pre>
 * 前面的数列已经排序好了,把下一个  数要跟前面已经排序好的数列进行比较,找到合适位置进行插入.
 * </pre>
 * <pre>
 *输入: 随机int类型的数组:34,5,67,3,7,78,53,33,35,4.
 *输出: 从小到大排序:      3,4,5,7,33,34,35,53,67,78.
 *<strong>代码实现的逻辑思路步骤:</strong>
 *<pre>
 *<p>方式一: @{@link #insertSort(int[])}
 *<p>方式二:@{@link #insertSortB(int[])}
 *</pre>
 *
 *<strong>编程技巧获得:</strong>
 *<pre>
 *<code>
 *<p>1:把数组前面一个覆盖给后面的数:arrry[in]=arrry[in-1]
 *<p>2:
 *
 *</code>
 * </pre>
 * 
 *<p>时间复杂度:log(N^2)
 *<p>优点:对于小量数据进行排序,比较快.
 *<p>缺点:对于大量数据进行排序,比较快.
 *<p>适用场合:小量数据.
 * @author ShineWong
 * 2017年9月21日 下午3:39:48
 */
public class InsertSort {

/**
 * insertSort排序的第一实现方式.
 * <pre>思想实现概述:
 * 拿第二个数开始跟第一个数进行比较,符合交换条件则交换<br>
 * 接着拿第三个数跟第二个数比较,符合则交换,交换后再跟第一个数比较,符合再 交换,如此循环.
 * </pre>
 * <pre>代码逻辑思路:
 *   定义一个外循环,前移动下一个要拿来比较的数,命名为temp,边界值为array.length=1;
 *   定义一个内循环,把temp逐一跟前面已经排序好的数列进行比较,找到合适的就把temp插入进去.
 *  </pre>
 * @param array
 * @return array返回排序好的数组
 */
	public int[] insertSort(int[] array){
		int in,out;
		for(out=1;out<array.length;out++){
	//从前面已经按照要求排序好的数列开始第一个将被比较的数是temp,作为插入数,插入到前面数列合适的位置.
			int temp=array[out];
			in=out;
		 while(in>0 && array[in-1]>=temp){
			 array[in]=array[in-1];
			 --in;
		 }
		 array[in]=temp;//将temp插入到合适的位置.
		}
		return array;
	}
	
/**
 * insertSort排序的第二种实现方式.
 * <pre>思想实现概述:
 * 如果符合条件则两两交换,直到最后一个数.
 * </pre>
 * <pre>代码逻辑思路:
 * 外循环中定义一个变量,边界值为array.length-2,再定义一个跟随其变换而变换的j变量,j的初始位置要=i+1,边界值是
 *  array.length-1,j不断跟j-1比较,如果合适就一直两两交换,直到不能再交换为止.
 * </pre>
 * @param array
 * @return
 */
	public int[] insertSortB(int[] array){
	  for (int i = 0; i < array.length-1; i++) {
		for (int j = i+1; j > 0; j--) {
			if(array[j-1]<=array[j])
				break;
			 int temp=array[j];
			 array[j]=array[j-1];
			 array[j-1]=temp;
		}
	}
		return array;
	}
	
}

