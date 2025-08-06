package 회문2_1216;

import java.io.File;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/회문2_1216/input_1216.txt");
		Scanner sc = new Scanner(file);
		//Scanner sc = new Scanner(System.in);
		
		for(int t = 0; t < 10; t++) {
			int TC = sc.nextInt();
			sc.nextLine();
			//입력받기 로직 아 진짜 너무 귀찮은데 하ㅅ기싫은데 몇번째야 이거
			char[][] cArr = new char[100][];
			for(int i = 0; i < 100; i++) {
				String str = sc.nextLine();
				char[] arrC = new char[100];
				for(int j = 0; j < 100; j++) {
					arrC[j] = str.charAt(j);					
				}
				cArr[i] = arrC;
			}//입력 완
		
			for(int r = 0; r < 100; r++) {
				for(int i = 100; i >0 ; i++) {
					for(int j = 0; j <= 100-i; j++) {
						char[] newChar = new char[i];
						for(int c = 0 ; c < i ; c++) {
							newChar[c] = cArr[r][i+j];
						}//새 배열에 담아줄거예요
					//담았으면 할일 합시다.
						for(int idx = 0; idx < i ; idx++) {
							if(newChar[idx] != newChar[i-1-idx]) {
								break;
							}
						}
						
						
						
					}//크기별로 행마다 만들 수 있는 배열수가 달라요
				}//회문 크기 내림차순으로 찾을거예요
			}//행마다 최대값을 찾을거예요
			
		}//tc
			
	}//main
}
