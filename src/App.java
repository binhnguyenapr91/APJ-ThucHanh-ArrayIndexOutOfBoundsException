import java.util.Random;
import java.util.Scanner;

public class App {

	public int[] randomInt() {
		Random rd = new Random();
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = rd.nextInt(100);
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		return array;
	}
	public static void main(String[] args){
	
			App app = new App();
			int[] newArray = app.randomInt();
			System.out.println("Enter index to get value");
			try (Scanner sc = new Scanner(System.in)) {
				int indexNeedToGet = sc.nextInt();
				try {
					System.out.printf("Index %d has value : %d",indexNeedToGet,newArray[indexNeedToGet]);	
				}catch(IndexOutOfBoundsException e) {
					System.err.print("Index is out of bounds");
				}
			}
				
	

	}

}
