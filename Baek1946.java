import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baek1946 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 케이스 개수
		int num = scan.nextInt();
		
		if(num>=1 && num<=20) {
			for(int idx=0 ; idx<num ; idx++) {
				
				// 결과값 세팅 
				int result = 0;
				
				int aplNum = scan.nextInt();
				int[][] arr = new int[aplNum][2]; 
				
				for(int jdx=0; jdx<aplNum ; jdx++) {
					arr[jdx][0] = scan.nextInt();
					arr[jdx][1] = scan.nextInt();
				}
				
				Arrays.sort(arr, new Comparator<int[]>() {
					
					@Override
					public int compare(int[] arr1, int[] arr2) {
						return Integer.compare(arr1[0], arr2[0]);
					}
				
				});
				
				int stan = arr[0][1];
				
				for(int kdx=0 ; kdx<arr.length ; kdx++) {
					
					if(arr[kdx][1]<=stan) {
						stan = arr[kdx][1];
						result++;
					}
					
				}
				
				System.out.println(result);
				
			}
		} else {
			System.out.println("테스트 케이스는 1이상 20이하의 숫자만 해당합니다.");
		}
		
		scan.close();
	
	}

}
