package 신다솜;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main t = new Main();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(t.solution(str1,c));
	}
	
	public int solution(String str, char t) {
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		int answer = 0;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)==t)
				answer++;
		}
		return answer;
	}
}
