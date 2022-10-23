package 단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main t = new Main();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i =0; i<N;i++) {
			String str = sc.next();
			System.out.println(t.solution(str));
		}

	}
	
	public String solution(String str) {
		String answer = "";
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=arr.length-1;i>=0;i--) {
			sb.append(arr[i]);
		}
		answer = sb.toString();
		return answer;
	}
}
