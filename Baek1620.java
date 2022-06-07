import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Baek1620
 */
public class Baek1620 {
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sNum = scan.nextInt();
		int qNum = scan.nextInt();
		scan.nextLine();
		
		if((sNum>=1 && sNum<=100000) && (qNum>=1 && qNum<=100000)) {
			
			HashMap<String, String> map = new HashMap<String, String>();
			String[] arr = new String[sNum+1];
			
			for(int idx=1 ; idx<=sNum ; idx++) {
				String str = scan.nextLine();
				String num = Integer.toString(idx);
				map.put(num, str);
				arr[idx]= str;
			}
			
			StringBuilder stb = new StringBuilder();
			
			for(int idx=0 ; idx<qNum ; idx++) {
				String str = scan.nextLine();
				
				if(map.containsKey(str)) {
					stb.append(map.get(str)).append("\n");
				}
				
				if(map.containsValue(str)) {
					stb.append(Arrays.asList(arr).indexOf(str)).append("\n");		
				}
			}
		
			System.out.println(stb);
				
		}
	}

}
