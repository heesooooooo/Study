package day5;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {

		
		int[] point = {92,32,52,9,81,2,68};
		
		int min=point[1]-point[0];
		min = min < 0? min*(-1): min;
		
		int[]array=new int[2];
		
		for(int i =0; i<point.length; i++) {
			for(int j=i+1; j<point.length; j++) {
				int gap=point[i]-point[j];
				gap= gap<0 ? -1*gap : gap;
				if(gap<min) {
					min=gap;
					array[0]=i; array[1]=j;
				}
			}
			
		}
		
		System.out.println("result = "+Arrays.toString(array));
		
		
	}

}
