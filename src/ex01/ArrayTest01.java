package ex01;

public class ArrayTest01 {
	public static void main(String[] args) {
		String[] btss = {"김남준", "김석진", "민윤기", "정호석", "박지민", "김태형", "전정국"};
		
		System.out.println(btss[0]);
		System.out.println(btss[6]);
		System.out.println();

		for (int i = 0; i < btss.length; i++) {
			System.out.println(btss[i]);
		}
	}
}