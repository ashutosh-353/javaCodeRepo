public class SpiralMatrix {
    public static void printingSpiralFunction(int arr[][]) {

        int startRow = 0;
        int startColumn = 0;
        int endRow = arr.length - 1;
        int endColumn = arr[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // Top
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endColumn] + " ");
            }

            // Bottom
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }

            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(arr[i][startColumn] + " ");
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printingSpiralFunction(arr);
    }
}