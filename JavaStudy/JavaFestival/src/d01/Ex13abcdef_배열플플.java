package d01;

public class Ex13abcdef_배열플플 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] arr = score.split(",");
		int[] num = new int[5];		//배열만들기	
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("A")) {
				num[0]++; 			// num[0]++ 기억		
			} else if(arr[i].equals("B")) {
				num[1]++;
			} else if(arr[i].equals("C")) {
				num[2]++;
			} else if(arr[i].equals("D")) {
				num[3]++;
			} else if(arr[i].equals("F")) {
				num[4]++;	
			}
				
			
				
				
		}
		
		
		System.out.println("A : "+num[0]+"명");	
		System.out.println("B : "+num[1]+"명");	
		System.out.println("C : "+num[2]+"명");	
		System.out.println("D : "+num[3]+"명");	
		System.out.println("F : "+num[4]+"명");	
			
			
		
		
		
		
		
		
	}

}
