package com.yanghui;

import java.util.Scanner;

public class jiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sjc = new Scanner(System.in);// ����һ�����ǲ���������
		System.out.println("�����������");

		int c = sjc.nextInt();// ����һ������c����������Ĳ���

		// ����һ����ά����a

		int[][] a = new int[c][];

		int i, j;

		for (i = 0; i < c; i++) {

			a[i] = new int[i + 1];

			a[i][i] = 1;

			for (j = 0; j < i; j++) {

				if (j == 0) {

					a[i][j] = 1;

				} else {

					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];

				}

			}

		}

		System.out.println("�������������£�");

		// ����һ������ѭ���������

		for (i = 0; i < c; i++)

		{

			for (j = 0; j < a[i].length; j++)

			{

				System.out.print(a[i][j] + "\t");

			}
			System.out.println();

		}
	}

}
