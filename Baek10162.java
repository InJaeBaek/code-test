
import java.util.Scanner;

public class Baek10162 {

    public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            
            // 테스트 케이스 수
            int num = scan.nextInt();
            
            if(num>=1 && num<=10000) {
            
                int[] arr = new int[3];
                
                if(num>=300) {
                    
                    arr[0] = num/300;
                    
                    num = num%300;
                
                }
                
                if(num>=60) {
                    
                    arr[1] = num/60;
                    
                    num = num%60;
                    
                }
                
                if(num>=10) {
                    
                    arr[2] = num/10;
                    
                    num = num%10;
                    
                }
                
                StringBuffer str = new StringBuffer();
                
                if(num == 0) {
                    
                    str.append(arr[0]).append(" ").append(arr[1]).append(" ").append(arr[2]);
                    
                    System.out.println(str);
                    
                } else {
                    
                    System.out.println("-1");
                    
                }
            
            
            }
            
        }
}