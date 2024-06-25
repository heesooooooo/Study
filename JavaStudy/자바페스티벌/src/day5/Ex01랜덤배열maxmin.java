package day5;

import java.util.Random;

public class Ex01랜덤배열maxmin {

	public static void main(String[] args) {

		int[] array = new int[8];
		Random ran = new Random();
		System.out.print("배열에 있는 모든 값 : ");
		for(int i =0; i<array.length; i++) {
			array[i] = ran.nextInt(100)+1;
			System.out.print( array[i] + " ");
		}
		int max=array[0];
		int min=array[0];
		//** int 값 기억하기
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			} else if(array[i]<min) {
				min=array[i];
			}
		
		}
		System.out.println(" ");
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
	}

}
