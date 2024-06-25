package d01;

import java.util.Arrays;

public class Ex21배열거리_gap {

	public static void main(String[] args) {

		int[] point = {92,32,52,9,81,2,68};
		int[] array= new int[2];
		int min = point[0]-point[1];
		
		for(int i=0; i<point.length; i++) {          //**array아니고 point!!!
			for(int j= i+1; j<point.length; j++) {   // j=1아니고 i+1부터
				int gap= point[i]-point[j];          // for 안에 gap... point i-j
				gap = gap<0 ? -gap: gap;
				if(gap<min) {
					min=gap;
					array[0]=i;
					array[1]=j;
				
				}
			}
			
			
		}
		
		
		
		
		System.out.println("result = "+Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
//		int[] array = new int[2];
//		int min = point[0] - point[1];
//		for (int i = 0; i < point.length; i++) {
//			for (int j = i + 1; j < point.length; j++) { 
//				int gap = point[i] - point[j];           
//				gap = gap < 0 ? -gap : gap;
//				if (min > gap) {
//					min = gap;
//					array[0] = i;
//					array[1] = j;
//				}
//			}
//
//		}
//
//		System.out.println("result = " + Arrays.toString(array));
//		
//		
		
		
		
		
		
		

	}

}
