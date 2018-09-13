package sort;

/**未测通过<br>
 *<strong>算法之排序：希尔排序</strong><br>
 * 概述:希尔排序的关键是定义一个数组间按增量跨度比较,增量逐步缩进,到最后基本排序好的.
 * 其中增量的选择直接影响到排序的效率,一般选择       ,增量是变化的增量,初始化为gap=1,按gap=gap*3+1增加-->1,4,13,40,
 *   ,先从最大增量开始,逐步减少增量到1.
 * <pre>
 *输入: 
 *输出: 
 *</pre><br>
 *代码实现步骤:
 *<pre>
 *实现一: @{@link #shellSort()}
 *实现一: @{@link #shellSort()}
 *</pre>
 *编程技巧获得:
 *</pre>
 *<code>
 *1:00000000<br>
 *2:0000000<br>
 *</code>
 * </pre>
 *<p>时间复杂度:O(N^3/2)~O(N^7/6)
 *<p>优点: 
 *<p>缺点:  
 *<p>适用场合: 
 *
 *@author ShineWong
 *2017年9月23日 下午10:32:41
 */
public class ShellSort {


	public int[] shellSort(int[] array){
		int gap=1,i,j,len=array.length;
		int temp;
		
		/*定义个循环,来给出最大合适的增量gap<len
		 * 如:len=10,gap=4:第一增量是gap=4<10,跳出循环的gap值此时为4>len/3,gap=4参与下面运算.
		 *  ju len=100,gap=40:第一增量是gap=40<100,跳出循环的gap值此时为40>len/3,gap=40参与下面的运算.
		 *   
		 *    ]
		 *     ...
		 */ 
		while(gap<len/3){
			gap=gap*3+1;
		}
	for(i=gap;i<len;i++){//i从最大增量开始循环到数组最高位
		temp=array[i];//规划最大增量的所在位置的数作为比较的边界.
		 for (j = i-gap; j > 0 && array[j]>temp;j-=gap) {
			/*交换位置*/
			 array[j+gap]=array[j];
		}
//		 array[j]=temp;
	}
		return array;
	}


  public int[] shellSortB(int[] array){
	  int inner,outer;
	  long temp;
	  int h=1;
	  while(h<array.length/3){
		  h=h*3+1;
	  }
	  while(h>0)
	  {
		  for(outer=h;outer<array.length;outer++){
			  temp=array[outer];
			  inner=outer;
			  while(inner>h-1 && array[inner-h] >=temp){
				  array[inner-1]=array[inner-h];
				  inner-=h;
			  }
			  array[inner]=(int) temp;
		  }
	  }
	  return array;
  }
}
