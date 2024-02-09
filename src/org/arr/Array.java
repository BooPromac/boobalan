package org.arr;

public class Array {
	public static void main(String[] args) {
		int a[] = new int [3];
		System.out.println("1 Dimensional Array"); 
		a[0]= 5;
		a[1]= 10;
		a[2]= 15;
		
		
		System.out.println(a[0]+a[1]+a[2]);
		
		System.out.println("normal for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(i);
		}
		System.out.println("enhanced for loop");
		for (int i : a) {
			System.out.println(i);
		}
		
		System.out.println("******************");
		
		System.out.println("2 Dimensional Array");
		
		int b [][]= new int [3][3];
		
		b[0][0]= 1;
		b[0][1]= 2;
		b[0][2]= 3;
		b[1][0]= 4;
		b[1][1]= 5;
		b[1][2]= 6;
		b[2][0]= 7;
		b[2][1]= 8;
		b[2][2]= 9;
	
		
		for (int m=0;m<b.length;m++) {
		
			for (int n=0;n<b.length;n++) {
				System.out.println(b[m][n]);
			}
			
			
		}
		System.out.println("Enhanced for loop");
		
		for (int[] is : b) {
			for (int i : is) {
				System.out.println(i);
				
			}
			
		}
		
		
		
		
	}
	
	
}
