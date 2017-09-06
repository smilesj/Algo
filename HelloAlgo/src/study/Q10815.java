package study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Q. ÀÌºÐÅ½»ö
public class Q10815 {

	private int M;
	private int[] card;
	private int N;
	private int[] checkNum;
	
	public Q10815() {
		init();
	}
		
	public void init(){
		try {
			Scanner sc = new Scanner(new File("C:\\gitAlgo\\testsource\\q10815.txt"));
			M = sc.nextInt();
			card = new int[M];
			int mid = M/2;
			for(int i = 0; i < M; i++){
				card[i] = sc.nextInt();
			}
			N = sc.nextInt();
			checkNum = new int[N];
			for(int i = 0; i < N; i++){
				checkNum[i] = sc.nextInt();
			}
			if(M > 1)
				sorting();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void sorting(){
		int temp;
		for(int i = 1; i < M; i++){
			for(int j = 1; j < M; j++){
				if(card[j-1] > card[j]){
					temp = card[j-1];
					card[j-1] = card[j];
					card[j] = temp;
				}
			}
		}
	}
	
	public void start(){
		for(int i = 0; i < N; i++){
			searchNum(checkNum[i], 0, M);
		}
	}
	
	public void searchNum(int num, int left, int right){
		if(left > right){
			System.out.print(0+ " ");
			return;
		}
		int mid = (left+right)/2;
		if(card[mid]==num){
			System.out.print(1+ " ");
		}else if(card[mid]<num){
			searchNum(num, mid+1, right);
		}else{
			searchNum(num, left, mid-1);
		}

	}
	
	public static void main(String[] args) {
		Q10815 q = new Q10815();
		q.start();
	}

}
