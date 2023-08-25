package testProject;
import java.util.Scanner;

public class A지뢰 {
	 public static void main(String[] args) {
	        final int SIZE =6; // 격자 크기
	        final int NUM_MINES = 25; // 지뢰 개수

	        char[][] board = new char[SIZE][SIZE]; // 게임판 초기화
	        initializeBoard(board, SIZE);

	        placeMines(board, SIZE, NUM_MINES); // 지뢰 배치
	        fillHints(board, SIZE); // 힌트(인접한 지뢰 개수) 계산

	        playGame(board, SIZE); // 게임 실행
	    }

	    // 게임판 초기화
	    public static void initializeBoard(char[][] board, int size) {
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                board[i][j] = '-';
	            }
	        }
	    }

	    // 지뢰 랜덤 배치
	    public static void placeMines(char[][] board, int size, int numMines) {
	        int minesPlaced = 0;
	        while (minesPlaced < numMines) {
	            int x = (int) (Math.random() * size);
	            int y = (int) (Math.random() * size);

	            if (board[x][y] != '*') {
	                board[x][y] = '*';
	                minesPlaced++;
	            }
	        }
	    }

	    // 힌트(인접한 지뢰 개수) 계산
	    public static void fillHints(char[][] board, int size) {
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                if (board[i][j] != '*') {
	                    int count = 0;
	                    for (int dx = -1; dx <= 1; dx++) {
	                        for (int dy = -1; dy <= 1; dy++) {
	                            if (i + dx >= 0 && i + dx < size && j + dy >= 0 && j + dy < size) {
	                                if (board[i + dx][j + dy] == '*') {
	                                    count++;
	                                }
	                            }
	                        }
	                    }
	                    board[i][j] = (char) (count + '0');
	                }
	            }
	        }
	    }

	    // 게임 실행
	    public static void playGame(char[][] board, int size) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            printBoard(board, size);

	            System.out.print("열 좌표 (0 ~ " + (size - 1) + "): ");
	            int x = scanner.nextInt();
	            System.out.print("행 좌표 (0 ~ " + (size - 1) + "): ");
	            int y = scanner.nextInt();

	            if (x < 0 || x >= size || y < 0 || y >= size) {
	                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
	            } else {
	                if (board[x][y] == '*') {
	                    System.out.println("지뢰를 밟았습니다! 게임 오버!");
	                    break;
	                } else if (board[x][y] == '0') {
	                    revealEmpty(board, size, x, y);
	                } else {
	                    board[x][y] = '-';
	                }
	            }
	        }
	        scanner.close();
	    }

	    // 빈 칸이면 인접한 빈 칸들을 모두 열기 (재귀 호출)
	    public static void revealEmpty(char[][] board, int size, int x, int y) {
	        if (x < 0 || x >= size || y < 0 || y >= size || board[x][y] != '-') {
	            return;
	        }

	        board[x][y] = ' ';
	        for (int dx = -1; dx <= 1; dx++) {
	            for (int dy = -1; dy <= 1; dy++) {
	                revealEmpty(board, size, x + dx, y + dy);
	            }
	        }
	    }

	    // 게임판 출력
	    public static void printBoard(char[][] board, int size) {
	        System.out.println("게임판 상태:");
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	}