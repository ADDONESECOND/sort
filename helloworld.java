package com.imooc;

import java.util.Arrays;

public class helloworld {
	public static void main(String[] args) {
		int a[] = {1,8,978,46,1653,748,156,1,75,35,96,156,32,18,179,159,354};
		shell_sort(a);
		System.out.println(Arrays.toString(a));
		}
//ϣ������
	public static int exch(int[]a,int i,int j) //�����ｻ��Ԫ��λ�õĺ���
	{
		if(i == j)
			return 0;
		int tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		return 0;
	}
	public static void shell_sort(int a[]) //ϣ�������㷨
	{
		int h = 0;   //ϣ�������ȡֵ���
		while(h<a.length)
			h = 3*h + 1;//��������
		while(h>=1)//ϣ��������С���ѭ��
		{
			int i;       //ѭ����Ϊ��������
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
			h = h/3;  //��Сϣ�����ֵ��
		}
	}
}
