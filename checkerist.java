import java.util.Scanner;

public class checkerist {

	static int[] testarray = {15,30,25,19,30,40};
	
	public static void main(String[] args) {
		
		showArray();
		Scanner sc = new Scanner(System.in);	

		//REMOVING PART
		while (!checkArray()) {
			System.out.println("Enter numbers to be removed");
			int num = sc.nextInt();
			
			findelement(num);
			showArray();
		}
		
		System.out.println("Empty");
		
		}
	//lists the elements of the array
	static void showArray()
	{
		for(int i = 0; i<testarray.length; i++) {
			if(testarray[i] > 0) {
				System.out.print(testarray[i] + " ");
			}
		}
		System.out.println("");
	}
	//checker and remover of array elements
	static void findelement(int num) {
		
		for(int x = 0; x < testarray.length; x++) {
			
			if(num == testarray[x]) {
				testarray[x] = 0;		
			}	
		}

	}
	//checks if the condition is true (if array is all 0)
	static boolean checkArray() {
		
		boolean isEmpty = false;
		
		for(int x = 0; x < testarray.length; x++) {
				
			if(testarray[x] != 0)
			{
				isEmpty = false;
			}
			else {
				isEmpty = true;
			}
		}
		
		return isEmpty;
	}
}
