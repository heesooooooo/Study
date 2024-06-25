package d01;

public class bonus02 {

	public static void main(String[] args) {

		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));
		
//		4글자..(1,3) -> [1][2] 
//		5글자..(2,3) -> [2]?
		
		
	}
	
//	 substring ( 2, 4) -> 2~3??
	
	// return
	
	private static String getMiddle(String str) {
		if(str.length()%2==0) {
			return str.substring(str.length()/2-1, str.length()/2+1);
		}else {
			return str.substring(str.length()/2, str.length()/2+1);
 
		}
		
		
		
	};
	
	
	

}
