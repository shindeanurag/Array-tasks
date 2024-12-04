package arrayPractice;

public class AddAllOddNumber {

	public static void main(String[] args) {
		int sum=0;
		int num[]= {23,44,55,56,67,69,89,12,10};
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==1) {
				sum=sum+num[i];
			}
		}
		System.out.println(sum);
	}
}
