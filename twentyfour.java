package Wpn;


import java.util.Arrays;
import java.util.Scanner;

public class twentyfour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print(a[n-1]+" "+a[n-2]+" "+a[1]+" "+a[0]);
	}
}
