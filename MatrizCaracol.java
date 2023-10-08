public class MatrizCaracol {
    public static void main(String[] args) {
        int t = 5;
        int[][] matriz = new int[t][t];

        int initialValue = 1;
        int startRow = 0;
        int endRow = t - 1;
        int startColumn = 0;
        int endColumn = t - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startRow; i <= endRow; i++) {
                matriz[startRow][i] = initialValue++;
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                matriz[i][endColumn] = initialValue++;
            }
            endColumn--;


            if (startRow <= endRow) {
                for (int i = endColumn; i >= startColumn; i--) {
                    matriz[endRow][i] = initialValue++;
                }
                endRow--;

                if (startColumn <= endColumn) {
                    for (int i = endRow; i >= startRow; i--) {
                        matriz[i][startColumn] = initialValue++;
                    }
                    startColumn++;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.printf("%3d", matriz[i][j]);

            }
            System.out.println();
        }

    }


}

