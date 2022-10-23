package 특정문자뒤집기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main t = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(t.solution(str));

	}
	public String solution(String str) {
		String answer = "";
		char[] arr = str.toCharArray();
		int lt =0;
		int rt = arr.length-1;
		int cnt = 0;
		while(lt<rt) {
			// 알파벳이 아닐 때
			if(!Character.isAlphabetic(arr[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(arr[rt])) {
				rt--;
				}
			// 알파벳일 때 
				else{ 
					char temp = arr[lt];
					arr[lt]=arr[rt];
					arr[rt]=temp;
					
					lt++;
					rt--;
				}
		}
		answer = String.valueOf(arr);
		return answer;
	}

}
