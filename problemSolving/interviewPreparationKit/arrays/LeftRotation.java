package problemSolving.interviewPreparationKit.arrays;

public class LeftRotation {

	public static void main(String[] args) {
		int [] arr =  {1, 2, 3, 4, 5};
		int rotation = 4;
		int [] rotatedArray = rotateArray(arr, rotation);
		
		for (int i : rotatedArray) {
			System.out.print(i + ", ");
		}
	}

	private static int[] rotateArray(int[] arr, int rotation) {
		int [] rotatedArray = new int [arr.length];
		int i = 0;
		int d = rotation;
		while (rotation < arr.length) {
			rotatedArray[i] = arr[rotation];
			rotation++;
			i++;
		}
		rotation = 0;
		
		while (rotation < d) {
			rotatedArray[i] = arr[rotation];
			i++;
			rotation++;
		}
		return rotatedArray;
	}

}
