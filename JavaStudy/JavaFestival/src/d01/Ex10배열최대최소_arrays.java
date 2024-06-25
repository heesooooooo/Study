package d01;

import java.util.Arrays;
import java.util.Random;

public class Ex10배열최대최소_arrays {

	public static void main(String[] args) {

		int[]array = new int[8];
		Random ran = new Random();
		for(int i =0; i <array.length; i++) {  // array.length
		array[i]=ran.nextInt(99)+1;
		}
		System.out.println("배열에 있는 모든 값 : "+Arrays.toString(array)); //arrays
		
		int max=array[0], min=array[0];  // 같은줄에 써도 됨
		for(int i =0; i<array.length; i++) {
//			if(array[i]>max) {
//				 max=array[i];
//			} else if (array[i]<min) {
//				min=array[i];
//			}
			max = array[i]>max? array[i]: max; //삼항연산자
			min = array[i]<min? array[i]: min;
			
		}
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);

		
		
		
		
	}

}
