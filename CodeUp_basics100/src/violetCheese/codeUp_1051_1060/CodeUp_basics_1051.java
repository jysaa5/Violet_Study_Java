package violetCheese.codeUp_1051_1060;

import java.util.Scanner;

public class CodeUp_basics_1051 {
	
	//메인 메서드
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strNum = str.split(" ");
        int a = Integer.parseInt(strNum[0]);
        int b = Integer.parseInt(strNum[1]);
        if(b >= a){
            System.out.print(1);
        }else if(b < a){
            System.out.print(0);
        }
        sc.close();
        
	}//main 메서드 끝
	
}//CodeUp_basics_1051 클래스 끝
