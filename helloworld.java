package com.imooc;

import java.util.Arrays;

public class helloworld {
	public static void main(String[] args) {
		int a[] = {1,8,978,46,1653,748,156,1,75,35,96,156,32,18,179,159,354};
		shell_sort(a);
		System.out.println(Arrays.toString(a));
		}
//	ϣ������
	public static void shell_sort(int a[])
	{
		int len = a.length;
		int interval = 1;
		while(interval<len)
			interval = interval * 3 + 1;  //shell sort�ļ������
		
		while(interval>=1)
		{
			int i;
			for(int j=1; j<len;j+=interval)   //���ѭ�����ǲ�������ԭ�����ڵļ��1ȫ�����interval
			{
				int key = a[j];
				i = j - interval;
				while(i>0 && a[i]>key)
				{
					a[i+interval] = a[i];
					i -= interval;
				}
				a[i+interval] = key;
			}
			
			interval/=3;   //ϣ������ļ����С����
		}	
	}
}
