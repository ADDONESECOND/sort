package com.imooc;

import java.util.Arrays;

public class helloworld {
	public static void main(String[] args) {
		int a[] = {1,8,978,46,1653,748,156,1,75,35,96,156,32,18,179,159,354};
		insert_sort(a);
		System.out.println(Arrays.toString(a));
		}
	public static void insert_sort(int a[])
	{
		int i;
		for(int j=2;j<a.length;j++)
		{
			int key = a[j];
			i = j-1;
			while(i>0 && a[i]>key)
			{
				a[i+1] = a[i];
				i = i-1;
			}
			a[i+1] = key;
		}
	}
}
