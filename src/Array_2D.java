import java.util.Scanner;

public class Array_2D {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        //row 0 = arr[0][0] arr[0][1] arr[0][2] arr[0][3] arr[0][4] arr[0][5]
        //row 1 = arr[1][0] arr[1][1] arr[1][2] arr[1][3] arr[1][4] arr[1][5]
        //row 2 = arr[2][0] arr[2][1] arr[2][2] arr[2][3] arr[2][4] arr[2][5]
        //row 3 = arr[3][0] arr[3][1] arr[3][2] arr[3][3] arr[3][4] arr[3][5]
        //row 4 = arr[4][0] arr[4][1] arr[4][2] arr[4][3] arr[4][4] arr[4][5]
        //row 5 = arr[5][0] arr[5][1] arr[5][2] arr[5][3] arr[5][4] arr[5][5]
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                arr[row][col] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println(maxHourglass(arr));
    }

    public static int maxHourglass(int [][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = findSum(arr, row, col);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    private static int findSum(int [][] arr, int r, int c) {
        return  arr[r]  [c] + arr[r]  [c+1] + arr[r]  [c+2]
                            + arr[r+1][c+1] +
                arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];
    }
}