import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Baek1966 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 테스트 케이스 수
		int num = scan.nextInt();
		scan.nextLine();
		
		int[] result = new int[num];
		
		for(int idx=0 ; idx<num ; idx++) {
			
			LinkedList<int[]> que = new LinkedList<>();
			
			// 배열에 넣을 초기 index값 세팅
			int first = 0;
	
			//문서 개수와 찾고자하는 인덱스 값 
			String info = scan.nextLine();
			String[] arr = info.split(" ");		
			
			// 문서 개수
			int dNum = Integer.parseInt(arr[0]);		
			// 찾고자 하는 인덱스
			int sNum = Integer.parseInt(arr[1]);
		
			// 중요도 순서
			String word = scan.nextLine();
			
			String[] rankArr = word.split(" ");
			
			for(int jdx=0 ; jdx<dNum ; jdx++) {			
				que.offer(new int[] { jdx, Integer.parseInt(rankArr[jdx])});		
			}
			
			// 결과를 저장할 배열
			String[] arrResult = new String[dNum]; 
			
	
			while(que.size() !=0) {
				
				// 최대값
				int max = 0;
				// 기준값
				int stan = 0;
				
				// 최대값 찾기
				for(int kdx=0 ; kdx<que.size() ; kdx++) {	
					
					stan = que.peek()[1];
					que.offer(que.poll());
					
					if(stan>max) {
						max = stan;
					}
					
				}
				
				int size = que.size();

				for(int kdx=0 ; kdx<size ; kdx++) {
					
					// 중간값
					int value = que.peek()[1]; 

					if(value < max) {
						
						que.offer(que.poll());
						
					} else {

						// 여기						
						arrResult[first] = Integer.toString(que.peek()[0]);
						que.poll();
						first += 1;
						break;
						
					}
					
				}

			}
			
			int value = Arrays.asList(arrResult).indexOf(Integer.toString(sNum))+1;
			
			result[idx] = value;
			
		}
		
		for(int idx=0 ; idx<result.length ; idx++) {
			System.out.println(result[idx]);
		}
		
	}
}
