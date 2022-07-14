package com.svkp.array;

public class DemoArray {

	public static void main(String[] args) {
		int num[]=new int[4];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		for(int i=0;i<4;i++)
		{
			System.out.println("The array values are"+num[i]);
		}
for(int i:num)
{
	System.out.println("The array values are"+i);
}
int a[]= {1,2,3,4};
int b[]= {5,6,7,8};
int c[]= {9,0,11,12};
int d[][]= {a,b,c};
System.out.println(d[1][3]);

	}

}
