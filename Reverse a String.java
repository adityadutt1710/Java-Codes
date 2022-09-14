package secondproject;

public class QuestionString {

	public static void main(String[] args) {
		// how to reverse a string
		StringBuilder sb = new StringBuilder("tony");
		
		for(int i=0;i<sb.length()/2;i++) {
			int front = i;
			int back = sb.length()-1-i;
			
			char frontchar = sb.charAt(front);
			char backchar = sb.charAt(back);
			
			sb.setCharAt(front, backchar);
			sb.setCharAt(back, frontchar);
			
		}
		System.out.print(sb);

	}

}
