import java.util.Scanner;
import java.util.Stack;

public class Baek9012 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		Stack<String> stack = new Stack<>();
			
		String[] arr = new String[num];
		String[] resultArr = new String[num];
		
		for(int idx=0 ; idx<arr.length ; idx++) {

			arr[idx] = scan.nextLine();
			
			if(arr[idx].length()>=2 && arr[idx].length()<=50) {
				
				for(int jdx=0 ; jdx<arr[idx].length() ; jdx++) {
					
					String word = arr[idx].substring(jdx, jdx+1);

					if(word.equals("(")) {
						stack.push(word);

					} else {
						// ")"시작하면 VPS가 될 수 없기 떄문에 무조건 NO - stack.size()=1로 만들어서 "NO"로 빠지게 구현
						if(stack.size()==0) {
							stack.push("NO");
							break;	// if문 안의 조건 성립시 즉시 반복문을 벗어남.
						} else {
							stack.pop();
						}
						
					}
					
				}
				
					if(stack.empty()) {
						resultArr[idx] = "YES";
						stack.clear();
					} else {
						resultArr[idx] = "NO";
						stack.clear();
					}				
			}
		}
		
		// 결과값 도출
		for(int idx=0 ; idx<resultArr.length ; idx++) {
			System.out.println(resultArr[idx]);
		}
		
	}

}

