package code;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		인코딩 : UTF-8
		
		Scanner scan = new Scanner(System.in);
		System.out.println("궁금한 년도 입력 : ");
		int year = scan.nextInt();
		
//		4로 안나눠지면 윤년이 아니라고 확정
		if (year % 4 == 0) {
			System.out.println("윤년이 아님");
			System.out.println("4로 안나눠 떨어짐.");
		}
		else {
//			100으로 나누고
		}
		
	}

}
