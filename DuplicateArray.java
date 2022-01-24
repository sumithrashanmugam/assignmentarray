package assignment1;

public class DuplicateArray {

	public static void main(String[] args) {
		int[]array= {2,5,6,7,8,7,9,10,5,6};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
			if(array[i]==array[j])
		System.out.println("duplicate element is"+array[i]);
				}
			}
		}

	}


