package HW4;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp="";
		Scanner sc = new Scanner(System.in);
		System.out.println("這是可以陪你聊程式!你可以問我一些問題");
			while(true) {
				System.out.print("你說:");
				temp=sc.nextLine();
				
				System.out.print("我說:");
				String resultString = temp.replace("嗎","").replace("?","!").replace("你","我");
				System.out.println(resultString);
				
				if (temp.equals("0")) {
					System.out.println("離開聊天程序");
					break;
				}
			}
	}

}
