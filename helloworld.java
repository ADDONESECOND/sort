package com.imooc;

import java.util.Arrays;

public class helloworld {
	public static void main(String[] args) {
		int a[] = {1,8,978,46,1653,748,156,1,75,35,96,156,32,18,179,159,354};
		quick_sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		}
//��������
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
	public static void quick_sort(int a[],int left,int right) //���������㷨
	{
		if(left >= right)//�ж��Ƿ��Ѿ��ָ�������ֻʣ��һ��Ԫ��
			return;
		
		int i = left;
		int j = right;
		int cut_off_point = a[left];  //����һ���ֽ�������жϣ����Զ����������Ż��ӿ���������ٶ�
		
		while(left<right)                //��Ҫ���㷨ѭ��
		{
			while(left<right && a[right]>=cut_off_point)//���Ѿ����������±�С���ϱ꣬���ұ����ϱ�ָ������ݴ��ڷֽ���ֵʱ
				right--;					//�����ϱ������ƶ�һλ
			if(left<right)				//��������ѭ������������һ��С�ڷֽ���Ԫ��ʱ
				exch(a,left,right);   //�������±��Ԫ�أ���������һ��ָ��±��������
			
			while(left<right && a[left]<=cut_off_point)//���Ѿ����������±�С���ϱ꣬���ұ����±�ָ�������С�ڷֽ���ֵʱ
				left++;					 //�����±������ƶ�һλ
			if(left<right)            //��������ѭ������������һ�����ڷֽ���Ԫ��ʱ
				exch(a,left,right);//�������±��Ԫ�أ���������һ��ָ�������һ��ѭ�������ϱ�ݼ�����
						
		}
		
		quick_sort(a,i,left-1);  //�����˱��κ���֮�󣬷ֽ���ֵ�Ѿ���������ȷλ��
		quick_sort(a,left+1,j);//�������ֱ�Էֽ��λ�����ϡ�����ʣ��Ԫ�ؽ���ͬ���Ĳ�����ֱ��ÿһ��Ԫ�ض��ŵ���ȷλ��
		
	}
}
