package test;

public class test1_200629_q3 {

	// 스택 문제 - 스택 안 쓰면 시간초과됨! ^^!!!
	// 난 스택 안 썼는데 !!!! 
	// 이렇게 풀면 시간초과됨 ㅋㅋㅋ 
	
	public static int solution(String S) {
		
		// 문자를 한 글자씩 잘라서 배열에 넣는다 
		String[] arr=S.split(""); 
		int leng=S.length();
		
		for(int i=0; i<leng-1;i++) {
			//System.out.println("i="+i);
			
			int num1=Integer.parseInt(arr[i]);
			int num2=Integer.parseInt(arr[i+1]);
			if(num1-num2==-1 || num1-num2==1) {
				for(int j=i+2; j<leng-1; j++) {
					arr[i]=arr[i+2];
					leng=leng-2;
				}
			}
		}
		
		System.out.println(leng);
		return leng;
	}
	
	public static void main(String[] args) {
		
		String S="1010111100010111";
		solution(S);
	}
}
