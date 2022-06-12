import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baek2309 {
static List<Integer> resultList;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 9;
		int[] arr = new int[num+1];
		
		for(int idx=0 ; idx<num ; idx++) {
			
			arr[idx] = scan.nextInt();
			
		}
		
		boolean[] visited = new boolean[num];
		
		combination(arr, visited, 0 , num, 7);	
		
		Collections.sort(resultList);
		
		for(int idx=0 ; idx < resultList.size() ; idx++ ) {
			System.out.println(resultList.get(idx));
		}
		
	}

	// 조합
	static void combination(int[] arr, boolean[] visited, int depth, int n, int r) {
		if(r==0) {
			print(arr, visited, n);
			return;
		}
		
		if(depth == n) {
			return;
		}
		
		visited[depth] = true;
		combination(arr, visited, depth+1, n, r-1);
		

		visited[depth] = false;
		combination(arr, visited, depth+1, n, r);		
		
	}
	
	// 배열 출력 
	static void print(int[] arr, boolean[] visited, int n) {
		
		int sum = 0;
		
		for(int idx=0 ; idx<n ; idx++) {			
			if(visited[idx]) {
				sum = sum + arr[idx];
			}			
		}
		
		if(sum ==100) {

			resultList = new ArrayList<Integer>();
			for(int idx=0 ; idx<n ; idx++) {				
				if(visited[idx]) {
					resultList.add(arr[idx]);
				}				
			}			
		}
	}
	
}
