package com.imooc;

import java.util.Arrays;

public class helloworld {
	public static void main(String[] args) {
		int a[] = {1,8,978,46,1653,748,156,1,75,35,96,156,32,18,179,159,354};
		heap_sort(a);
		System.out.println(Arrays.toString(a));
		}
//	堆排序
	public static void swap(int heap[],int i) //建堆时交换父子结点
	{
		if(heap[i]<heap[(i-1)/2])
		{
			int tmp;
			tmp = heap[i];
			heap[i] = heap[(i-1)/2];
			heap[(i-1)/2] = tmp;
			
			i = (i-1)/2;
			swap(heap,i);
		}
	}
	public static void _swap(int heap[],int j,int len) //出堆时交换父子结点
	{
		if((2*j+2)<=len&&heap[2*j+1]>heap[2*j+2]&&heap[j]>heap[2*j+2])
		{
			int tmp = heap[j];
			heap[j] = heap[2*j+2];
			heap[2*j+2] = tmp;
			j = 2*j+2;
			_swap(heap,j,len);
		}
		if((2*j+2)<=len&&heap[2*j+1]<heap[2*j+2]&&heap[j]>heap[2*j+1])
		{
			int tmp = heap[j];
			heap[j] = heap[2*j+1];
			heap[2*j+1] = tmp;
			j = 2*j+1;
			_swap(heap,j,len);
		}
	}
	public static void heap_sort(int a[])  
	{
		int[] heap= new int[100];
		for(int i=0;i<a.length;i++)
			{heap[i] = a[i];swap(heap,i);} //建堆
//		System.out.println(Arrays.toString(heap));
		int top;
		int len = a.length-1;
		for(top=0;top<a.length;top++)
		{
			a[top] = heap[0];
			heap[0] = heap[len];
			len--;
		    _swap(heap,0,len);
		}
	}
}
