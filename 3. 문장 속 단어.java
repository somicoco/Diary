package 알고리즘문제;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main t = new Main();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println(t.solution(str1));
	}
	
	public String solution(String str) {
		String answer="";
		int m = Integer.MIN_VALUE, pos;
		while((pos =str.indexOf(' '))!=-1) {
			String tmp = str.substring(0,pos);
			
			if(m<tmp.length()) {
				m=tmp.length();
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
			if(str.length()>m) answer=str;
			
		
		return answer;
	}
}
