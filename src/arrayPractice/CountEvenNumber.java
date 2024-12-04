package arrayPractice;

public class CountEvenNumber {
	
	
	public static void main(String[] args) {
		int count=0;
		int num[]= {23,44,55,56,67,69,89,12,10};
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
