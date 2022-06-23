import java.util.Scanner;
import java.util.Stack;
/**
 * 후위표기식 문제 ABC*+DE/- -> (A+(B*C))-(D/E)를 의미한다.
 * 핵심은 스택의 사용가 문자의 10진법화이다.
 * A는 ASCII 코드 문자로 10진법 값으로 변환시 '65'이다. int operandNum = (int) word-65; -> 문자 - >10진법으로 변환하는 곳 이곳이 포이트
 * @author InJae
 *
 */

public class Baek1935 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.nextLine();
		
		double[] arr = new double[num];
		String stc = scan.nextLine();

		double res = 0;
		Stack<Double> stack = new Stack<>();
		
		for(int idx=0 ; idx<num ; idx++) {
			arr[idx] = scan.nextInt();
		}
				
		for(int idx=0 ; idx<stc.length() ;idx++) {
			char word = stc.charAt(idx);
			if(word == '*' || word == '/' || word == '+' ||word == '-') {
				double bfVal = stack.pop();
				double afVal = stack.pop();
				switch(word) {					
					case '*':
						res = afVal * bfVal;
						stack.push(res);
						break;
					case '/':
						res = afVal / bfVal;
						stack.push(res);
						break;
					case '+':
						res = afVal + bfVal;
						stack.push(res);
						break;
					case '-':
						res = afVal - bfVal;
						stack.push(res);
						break;	
				}
				
			} else {
				// 문자-> 10진법으로 변환 시 char 타입을 써야한다.
				int operandNum = (int) word-65; // 아스키코드 문자 -> 10진법으로 변환 
				
				stack.add(arr[operandNum]);
			}
			
		}
		
		System.out.printf("%.2f",stack.peek());
		
	}

}
