import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr = new int[9][9];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		sudoku(0,0);
		
	}
	
	public static void sudoku(int row, int col) {
		if(col == 9) {
			sudoku(row+1,0);
			return;
		}
		
		if(row == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		
		if(arr[row][col]==0) {
			for (int i = 1; i <= 9; i++) {
				if(possible(row,col,i)) {
					arr[row][col] = i;
					sudoku(row,col+1);
				}
			}
			arr[row][col] = 0;
			return;
		}
		sudoku(row,col+1);
	}
	
	public static boolean possible(int row, int col, int value) {
		
		//행
		for (int i = 0; i < 9; i++) {
			if(arr[row][i] == value) {
				return false;
			}
		}
		
		//열
		for (int i = 0; i < 9; i++) {
			if(arr[i][col] == value) {
				return false;
			}
		}
		
		//3*3 박스
		int setRow = (row/3) * 3;
		int setCol = (col/3) *3;
		
		for (int i = setRow; i < setRow + 3; i++) {
			for (int j = setCol; j < setCol + 3; j++) {
				if(arr[i][j] == value) {
					return false;
				}
				
			}
			
		}
		
		return true;
	}
}