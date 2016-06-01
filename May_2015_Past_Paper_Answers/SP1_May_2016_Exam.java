
public class SP1_May_2016_Exam {

	public static void main(String[] args) {
		
		int [] v = {1,2,3,4};//1,2,4,4//1,2,4,8
		print(v); 
		
		fiddle(v, v[2] - 1);//index position v[2] - value by 1 of previous element 
		print(v);
		
		fiddle(v, v[3] - 1);
		print(v);
	
	}
	
	public static void fiddle (int [] array, int index) {
		
		array[index] = array[index -1] * 2;
	}
	
	public static void print(int [] array) {
		System.out.print(array[0]);
		
		for (int i = 1; i < array.length; i++) {
			
			System.out.print(", " + array[i]);
			
		}
		
		System.out.println();
	}

}
