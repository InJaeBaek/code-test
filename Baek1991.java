import java.util.Scanner;

public class Baek1991 {

	// 결과값
	static StringBuilder str = new StringBuilder();
	static Node[] nodeArr;
	// Node 세팅
	static class Node{		
		char ch;
		Node left;
		Node right;
		
		public Node(char ch) {
			this.ch = ch;
		}		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 노드 개수
		int num = scan.nextInt();
		scan.nextLine();
		// 노드 배열 인스턴스 생성
		nodeArr = new Node[num];
		// node ch값 세팅
		for(int idx=0 ; idx<num ; idx++) {
			nodeArr[idx] = new Node((char)(idx + 'A'));  
		}
		
		for(int idx=0 ; idx<num ; idx++) {
			
			char f, s, t;
			
			String st = scan.nextLine();
			
			f = st.charAt(0);
			s = st.charAt(2);
			t = st.charAt(4);
			
			if(s !='.') {
				nodeArr[f-'A'].left = nodeArr[s-'A'];
			}
			if(t !='.') {
				nodeArr[f-'A'].right = nodeArr[t-'A'];
			}
			
		}
		
      // 전위 순회
      preOrder(nodeArr[0]);
      str.append("\n");
      // 중위 순회
      inOrder(nodeArr[0]);
      str.append("\n");
      // 후위 순회
      postOrder(nodeArr[0]);
      str.append("\n");

      System.out.println(str);
		
	}
	
	// 전위 순회 메소드
	public static void preOrder(Node nd) {
		str.append(nd.ch);
		if(nd.left != null) {
			preOrder(nd.left);
		}
		if(nd.right != null) {
			preOrder(nd.right);
		}
	}
	
	// 중위 순회 메소드
	public static void inOrder(Node nd) {		
		if(nd.left != null) {
			inOrder(nd.left);
		}
		str.append(nd.ch);
		if(nd.right != null) {
			inOrder(nd.right);
		}
	}
	
	// 후위 순회 메소드
	public static void postOrder(Node nd) {
		if(nd.left != null) {
			postOrder(nd.left);
		}
		if(nd.right != null) {
			postOrder(nd.right);
		}
		str.append(nd.ch);
	}
	
	
}