package study;

public class NextBigNumber {

	public int oneCount(int n){
		int result = 0;
		int temp = n;
		while(temp >= 1){
			if(temp == 1){
				result++;
				break;
			}
			if(temp % 2 == 1)
				result++;
			temp = temp/2;
		}
		return result;
	}
	
	public int nextBigNumber(int n) {
		int answer = n;
		int oriCount = oneCount(n);
		while(true){
			if(oriCount == oneCount(++answer))
				break;
		}
		return answer;
	}

	public static void main(String[] args) {
		NextBigNumber nb = new NextBigNumber();
		int num = 78;
		System.out.println(nb.nextBigNumber(num));
	}
}
