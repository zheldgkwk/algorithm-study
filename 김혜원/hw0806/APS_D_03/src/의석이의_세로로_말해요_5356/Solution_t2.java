package 의석이의_세로로_말해요_5356;

import java.io.File;
import java.util.Scanner;

public class Solution_t2 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/의석이의_세로로_말해요_5356/input_5356.txt");
		Scanner sc = new Scanner(file);
		//Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		sc.nextLine();
		
		for(int t =0; t< TC; t++) {
			char[][] arr = new char[5][];//TC마다 초기화되는 배열 생성
			int cMax = 0; 
			
			for(int i = 0; i < 5 ; i++) {
				String str = sc.nextLine();
				int l = str.length();
				char[] strArr = new char[l];
				for(int j = 0; j < l ; j++) {
					strArr[j] = str.charAt(j);
				}//for-inner
				arr[i] = strArr;
				if(l > cMax) cMax = l;
			}//for-outer
			
			System.out.print("#"+(t+1)+" ");
			for(int j =0; j < cMax; j++) {
				for(int i = 0; i < arr.length; i++) {
					try {System.out.print(arr[i][j]);
					} catch(ArrayIndexOutOfBoundsException e) {continue;}
				}//for-행순회
			
			}//for-열순회
			System.out.println();
		}//TC-for
		
	}//main
}
