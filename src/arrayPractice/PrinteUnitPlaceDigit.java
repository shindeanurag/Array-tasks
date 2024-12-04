package arrayPractice;

public class PrinteUnitPlaceDigit {

	public static void main(String[] args) {
		int unitnum=0;
		int num[]= {23,44,55,56,67,69,89,12,10};
		for (int i = 0; i < num.length; i++) {
			unitnum=num[i]%10;
			System.out.println(unitnum);
		}
		
	}
}
