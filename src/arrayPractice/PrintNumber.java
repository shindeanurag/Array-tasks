package arrayPractice;

import java.util.Iterator;

public class PrintNumber {

	public static void main(String[] args) {
		int num[]= {2,4,5,8,10};
		for (int i = 0; i < num.length; i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(num[i]*j+" ");
			}
			System.out.println();
		}
	}
}
