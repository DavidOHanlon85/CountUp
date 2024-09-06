package slideDeckChallenges;

public class CountUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countUp(10);

	}

	public static void countUp(int num) {
		if (num <= 0) {
			System.out.println(num);
		} else {
			countUp(num-1);
			System.out.println(num);
		}
	}

}
