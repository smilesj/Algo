package dp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q11052 {
	
	private int[] dp;
	private int count;
	
	public void readFile() throws FileNotFoundException{
		Scanner sc = new Scanner(new File("C:\\gitAlgo\\testsource\\q11052.txt"));
		count = sc.nextInt();
		dp = new int[count];		
		for(int i = 0; i < count; i++){
			dp[i] = sc.nextInt();
		}
	}
	
	public void getMaxSalePrice(){
		int[] price = new int[count];
		price[0] = dp[0];
		
		for(int i = 1; i < count; i++){
			price[i] = dp[i];
			for(int j = 0; j<i; j++){
				int max = price[i-j-1]+dp[j];
				price[i] = Math.max(max, price[i]);
			}
		}
		System.out.println(price[3]);
	}
	
	public static void main(String[] args){
		
		Q11052 q = new Q11052();
		try {
			q.readFile();
			q.getMaxSalePrice();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
