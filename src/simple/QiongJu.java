package simple;
import java.util.Scanner;
/*
 * 用穷举法求鸡兔同栏问题 
 * 问题：上35头，下94足。
 * 设鸡x,兔y,则有数学表达式子：
 *   x+y=35;
 *   2x+4y=94
 *   解二元一次方程组，结果x=23,y=12;
 * 
 */
public class QiongJu {
	static int chichen,habbit;
	public static int qiongJu(int head,int foot)
	{
		int re,i,j;
		re=0;
		for(i=0;i<head;i++)
		{
			j=head-i;
			if(2*i+4*j==foot)
			{
				re=1;
				chichen=i;
				habbit=j;
			}
		}
		return re;
	}
	public static void main(String[] args)
	{
		int re,head,foot;
		System.out.println("穷举法求解鸡图同笼问题：");
		System.out.print("请输入头数：");
		Scanner input=new Scanner(System.in);
		head=input.nextInt();
		System.out.println("请输入脚数：");
		foot=input.nextInt();
		re=qiongJu(head,foot);
		if(re==1)
		{
			System.out.println("鸡有"+chichen+"只，兔有"+habbit+"只 ");
		}
			else
			{
				System.out.println("无法求解 ");
			}
		
		
	}
}
