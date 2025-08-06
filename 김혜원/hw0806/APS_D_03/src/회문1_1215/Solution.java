package 회문1_1215;

import java.io.File;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		File file = new File("src/회문1_1215/input_1215.txt");
		Scanner sc = new Scanner(file);
		//Scanner sc = new Scanner(System.in);
		
		for(int t = 1;t<=10;t++) {
			int count =0;
			int l = sc.nextInt(); //회문길이
			sc.nextLine();
			char[][] sArr = new char[8][]; //자꾸 배열을 String으로 잡는다.. char로 잡아라 
		//배열에 글자 담기
			for(int i = 0; i < 8 ; i++) {
				String str = sc.nextLine();
				char[] arr = new char[8];
				
				for(int j = 0; j<8; j++) {
					arr[j] = str.charAt(j);
				}
				sArr[i] = arr;
			}//담기 끝
			
		//행따라 탐색해봅시다.
			for(int r = 0; r < 8; r++) { //이렇게 숫자를 직접쓰는것이 좋아보이지는 않는다.
				for(int c = 0; c <= 8-l; c++) {
					if(sArr[r][c] != sArr[r][l-1-c]) {
						continue;
					}//만일 글자 다르면 이번 열 idx 탐색은 pass
					//만일 회문임이 검증되었다면?
					count++;
				}//열 탐색
			}//행 순회
			
		//열따라 탐색해봅시다
			for(int c = 0; c < 8; c++) { 
				for(int r = 0; r <= 8-l; r++) {
					if(sArr[r][c] != sArr[r][l-1-c]) {
						continue;
					}//만일 글자 다르면 이번 행 idx 탐색은 pass
					//만일 회문임이 검증되었다면?
					count++;
				}//행 탐색
			}//열 순회
			
		//다 끈났으면 출력을 하자
			System.out.println("#"+t+" "+count);
		}//tc-for
	}//main
}
