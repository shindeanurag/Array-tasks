package arrayPractice;

public class EvenNumber {

	public static void main(String[] args) {
		int num[]= {23,44,55,56,67,69,89,12,10};
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
	}
}