package simple;
import java.util.Scanner;
/*第推算法。
 * 兔子产仔
 * 第一个月：1对
 *   二     : 2对
 *   三     ：3对
 *   四    ：4对
 *   五    ：5对
 *   六    ：8对
 *   ......
 *   
 */
public class Fibonacci {
	public static int fibonacci(int n)
	{
		int t1,t2;
		if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
			t1=fibonacci(n-1);
			t2=fibonacci(n-2);
			return t1+t2;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("递推算法求解兔子产仔问题！");
		System.out.println("青先输入的几个月：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num=fibonacci(n);
		System.out.println("兔子数量超出计算机计算范围："+Integer.MAX_VALUE);
		if(num>Integer.MAX_VALUE)
		{
			System.out.println("兔子数量超出计算机计算范围,范围在这个数，如下所示例"+Integer.MAX_VALUE);
		}
		else
		{
		System.out.println("经过"+n+"月的时间，共能繁殖成"+num+"对兔子！");
		}
	}
	
}
