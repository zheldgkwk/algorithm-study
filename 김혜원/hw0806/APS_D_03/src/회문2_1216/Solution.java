package 회문2_1216;

import java.io.File;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		File file = new File("src/회문2_1216/input_1216.txt");
		Scanner sc = new Scanner(file);
		//Scanner sc = new Scanner(System.in);
		
		for(int t = 0; t < 10; t++) {
			int TC = sc.nextInt();
			sc.nextLine();
			//입력받기 로직 아 진짜 너무 귀찮은데 하ㅅ기싫은데 몇번째야 이거
			//입력받을때 부터 뒤집어진 복사본을 만들자.
			char[][] cArr = new char[100][];
			char[][] rArr = new char[100][];
			for(int i = 0; i < 100; i++) {
				String str = sc.nextLine();
				char[] arrC = new char[100];
				char[] arrR = new char[100];
				for(int j = 0; j < 100; j++) {
					arrC[j] = str.charAt(j);
					arrR[j] = str.charAt(99-j);					
				}
				cArr[i] = arrC;
				rArr[i] = arrR;				
			}//입력 완
			
		//행,열별로 최대길이 회문 찾기--------------------------------------------------------
			int max =0;  //최대길이 담을 변수
			
			//행따라서 먼저
			for (int r = 0; r < 100; r++) {
				for(int c = 0; c < 100; c++) {
					for(int i = 0; i < 100; i++) {
						int count = 0;
						if(cArr[r][c] != rArr[r][i]) {continue;}
						int cIdx = c;
						int iIdx = i;
						while(cIdx <=99 && iIdx <=99) {
							if(cArr[r][cIdx] != rArr[r][iIdx]){
								break;
							}
							count++;
							cIdx++;
							iIdx++;
						}//while반복 
						//max에 넣을 값 찾기
						max = max < count ? count : max;
					}//복사본 인덱스
				}//열 따라서
			}//행 따라서 
			
			//열따라서
			for (int c = 0; c < 100; c++) {
				for(int r = 0; r < 100; r++) {
					for(int i = 0; i < 100; i++) {
						int count = 0;
						if(cArr[r][c] != rArr[i][c]) {continue;}
						int rIdx = r;
						int iIdx = i;
						
							while(rIdx <= 99 && iIdx <= 99) {
								if (cArr[rIdx][c] != rArr[iIdx][c]) {
									break;
								}
								count++;
								rIdx++;
								iIdx++;
							}//max에 넣을 값 찾기
						max = max < count ? count : max;
					}//복사본 인덱스 따라서
				}//열 따라서
			}//행 따라서	
			
			
			System.out.println(max);
		}//tc
			
	}//main
}
