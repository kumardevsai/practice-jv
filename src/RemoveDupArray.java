
public class RemoveDupArray {
	
	static int array[] = new int[] {1,2,3,4,5,5,6,9, 5, 4 , 9, 10};
	
	static int temp[] = new int[array.length -1 ];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < temp.length - 1; i ++){
		   int count = 0;
			for(int j = i; j < array.length -1; j ++){
			   if(array[i] == array[j]){
				 count = count + 1;  
			   }
			}
			
			if(count > 1){
			   temp[i] = array[i];
			}
			
		}
		
		for(int t : temp)
		   if(t != 0)
		     System.err.println(t);
		
	}
}
