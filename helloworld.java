package com.imooc;

import java.util.Arrays;

public class helloworld {
	public static void main(String[] args) {
		int a[] = {1,8,978,46,1653,748,156,1,75,35,96,156,32,18,179,159,354};
		shell_sort(a);
		System.out.println(Arrays.toString(a));
		}
//希尔排序
	public static int exch(int[]a,int i,int j) //数组里交换元素位置的函数
	{
		if(i == j)
			return 0;
		int tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		return 0;
	}
	public static void shell_sort(int a[]) //希尔排序算法
	{
		int h = 0;   //希尔排序的取值间隔
		while(h<a.length)
			h = 3*h + 1;//将间隔最大化
		while(h>=1)//希尔排序缩小间隔循环
		{
			int i;       //循环体为插入排序
			for(int j=2;j<a.length;j+=h)
			{
				int key = a[j];
				i = j-h;
				while(i>0 && a[i]>key)
				{
					a[i+h] = a[i];
					i = i-h;
				}
				a[i+h] = key;
			}
			h = h/3;  //缩小希尔间隔值；
		}
	}
}
