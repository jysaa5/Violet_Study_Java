package violetCheese.codeUp_1061_1070;

import java.util.Scanner;

public class CodeUp_basics_1062 {
	
	//메인 메서드
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strNum = str.split(" ");
        int a = Integer.parseInt(strNum[0]);
        int b = Integer.parseInt(strNum[1]);
        System.out.print(a^b);
        sc.close();
        
	}//main 메서드 끝
	
}//CodeUp_basics_1062 클래스 끝
