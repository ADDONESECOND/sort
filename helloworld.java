package com.imooc;

import java.util.Arrays;

public class helloworld {
	public static void main(String[] args) {
		int a[] = {1,8,978,46,1653,748,156,1,75,35,96,156,32,18,179,159,354};
		select_sort(a);
		System.out.println(Arrays.toString(a));
		}
	public static void select_sort(int a[])
	{
		for(int i=0;i<a.length;i++)
			for(int j=i;j<a.length;j++)
				if(a[i]>a[j])
				{
						int tmp;
						tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;
				}
	}
}
