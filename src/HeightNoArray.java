
public class HeightNoArray {
	
	static int arr[] = {3,4,8,11,33, 99, 0, 3};
	
	static int highVal[] = new int[1];
	
	public static void main(String args[]){
		
		for(int i = 0; i< arr.length; i++){
			
			if(highVal[0] < arr[i])
				highVal[0] = arr[i];
			
		}
		
		System.out.println(highVal[0]);
		
	}

}
