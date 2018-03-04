package com.imooc;

import java.util.Arrays;

public class helloworld {
	public static void main(String[] args) {
		int a[] = {1,8,978,46,1653,748,156,1,75,35,96,156,32,18,179,159,354};
		quick_sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		}
//快速排序
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
	public static void quick_sort(int a[],int left,int right) //快速排序算法
	{
		if(left >= right)//判断是否已经分割到这个集合只剩下一个元素
			return;
		
		int i = left;
		int j = right;
		int cut_off_point = a[left];  //定义一个分界点用于判断，可以对这个点进行优化加快代码运行速度
		
		while(left<right)                //主要的算法循环
		{
			while(left<right && a[right]>=cut_off_point)//当已经遍历过的下标小于上标，并且遍历上标指向的数据大于分界点的值时
				right--;					//遍历上标向下移动一位
			if(left<right)				//当跳出上循环，即遍历到一个小于分界点的元素时
				exch(a,left,right);   //交换上下标的元素，并进入下一条指令，下标递增遍历
			
			while(left<right && a[left]<=cut_off_point)//当已经遍历过的下标小于上标，并且遍历下标指向的数据小于分界点的值时
				left++;					 //遍历下标向上移动一位
			if(left<right)            //当跳出上循环，即遍历到一个大于分界点的元素时
				exch(a,left,right);//交换上下标的元素，并进入下一条指令，进入下一个循环，即上标递减遍历
						
		}
		
		quick_sort(a,i,left-1);  //结束了本次函数之后，分界点的值已经到达了正确位置
		quick_sort(a,left+1,j);//接下来分别对分界点位置以上、以下剩余元素进行同样的操作，直到每一个元素都放到正确位置
		
	}
}
