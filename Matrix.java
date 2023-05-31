import java.util.Scanner;

public class Matrix {

    private int firstMatrixWidth;
    private int firstMatrixHeight;
    private int secondMatrixWidth;
    private int secondMatrixHeight;
    private int[][] firstMatrix;
    private int[][] secondMatrix;

    public Matrix(int firstMatrixWidth, int firstMatrixHeight, int secondMatrixWidth, int secondMatrixHeight) {
        this.firstMatrixWidth = firstMatrixWidth;
        this.firstMatrixHeight = firstMatrixHeight;
        this.secondMatrixWidth = secondMatrixWidth;
        this.secondMatrixHeight = secondMatrixHeight;
        firstMatrix = new int[this.firstMatrixHeight][this.firstMatrixWidth];
        secondMatrix = new int[this.secondMatrixHeight][this.secondMatrixWidth];
    }

    public void fillMatrixManually(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < firstMatrixHeight; i++){
            for (int j = 0; j < firstMatrixWidth; j++){
                System.out.println("Введите элемент [" + (i + 1) + ","+ (j + 1) +"] в первой матрице: ");
                firstMatrix[i][j] = scanner.nextInt();
                System.out.println();
            }
        }

        for (int i = 0; i < secondMatrixHeight; i++){
            for (int j = 0; j < secondMatrixWidth; j++){
                System.out.println("Введите элемент [" + (i + 1) + ","+ (j + 1) +"] во второй матрице: ");
                secondMatrix[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
    }

    public void fillMatrixAutomatically(int max, int min){
        for (int i = 0; i < firstMatrixHeight; i++){
            for (int j = 0; j < firstMatrixWidth; j++){
                firstMatrix[i][j] = (int) Math.round((Math.random() * ((max - min) + 1)) + min);
            }
        }

        for (int i = 0; i < secondMatrixHeight; i++){
            for (int j = 0; j < secondMatrixWidth; j++){
                secondMatrix[i][j] = (int) Math.round((Math.random() * ((max - min) + 1)) + min);
            }
        }
        System.out.println("Матрицы заполнены случайными значениями");
    }

    public void showFirstMatrix(){
        for (int i = 0; i < firstMatrixHeight; i++){
            for (int j = 0; j < firstMatrixWidth; j++){
                System.out.print(firstMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void showSecondMatrix(){
        for (int i = 0; i < secondMatrixHeight; i++){
            for (int j = 0; j < secondMatrixWidth; j++){
                System.out.print(secondMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void showOneColumnFromFirstMatrix(int column){
        for (int j = 0; j < firstMatrixWidth; j++){
            System.out.println(firstMatrix[j][column-1] + "\t");
        }
    }

    public void showOneColumnFromSecondMatrix(int column){
        for (int j = 0; j < secondMatrixWidth; j++){
            System.out.println(secondMatrix[j][column-1] + "\t");
        }
    }

    public void showOneRowFromFirstMatrix(int row){
        for (int j = 0; j < firstMatrixHeight; j++){
            System.out.print(firstMatrix[row-1][j] + "\t");
        }
    }

    public void showOneRowFromSecondMatrix(int row){
        for (int j = 0; j < secondMatrixHeight; j++){
            System.out.print(secondMatrix[row-1][j] + "\t");
        }
    }

    public void showFirstMatrixMajorDiagonal(){
        for (int i = 0; i < firstMatrixHeight; i++){
            for (int j = 0; j < firstMatrixWidth; j++){
                if (i==j) {
                    System.out.print(firstMatrix[i][j] + "\t");
                } else System.out.print("\t");
            }
            System.out.println();
        }
    }

    public void showSecondMatrixMajorDiagonal(){
        for (int i = 0; i < secondMatrixHeight; i++){
            for (int j = 0; j < secondMatrixWidth; j++){
                if (i==j) {
                    System.out.print(secondMatrix[i][j] + "\t");
                } else System.out.print("\t");
            }
            System.out.println();
        }
    }

    public void showFirstMatrixDopDiagonal() {
        for (int i = 0; i < firstMatrixHeight; i++) {
            System.out.print(firstMatrix[i][firstMatrixHeight - 1 - i] + " ");
        }
    }

    public void showSecondMatrixDopDiagonal() {
        for (int i = 0; i < secondMatrixHeight; i++) {
            System.out.print(secondMatrix[i][secondMatrixHeight - 1 - i] + " ");
        }
    }

    public void summarizeMatrix(){
        if ((firstMatrixHeight == secondMatrixHeight) && (firstMatrixWidth == secondMatrixWidth)){
            System.out.println("Суммированная матрица:");
            for (int i = 0; i < secondMatrixHeight; i++){
                for (int j = 0; j < secondMatrixWidth; j++){
                    System.out.print(firstMatrix[i][j] + secondMatrix[i][j] +"\t");
                }
                System.out.println();
            }
        } else System.out.println("Размер матриц не совпадает!");
    }

    public void subtractionMatrix(){
        if ((firstMatrixHeight == secondMatrixHeight) && (firstMatrixWidth == secondMatrixWidth)){
            System.out.println("Вычтеная матрица:");
            for (int i = 0; i < secondMatrixHeight; i++){
                for (int j = 0; j < secondMatrixWidth; j++){
                    System.out.print(firstMatrix[i][j] - secondMatrix[i][j] +"\t");
                }
                System.out.println();
            }
        } else System.out.println("Размер матриц не совпадает!");
    }

    public void multiplyMatrix(){
        if (firstMatrixHeight == secondMatrixWidth){
            System.out.println("Умноженная матрица:");
            /*for (int i = 0; i < firstMatrixHeight; i++){
                for (int j = 0; j < secondMatrixWidth; j++){
                    System.out.print(firstMatrix[i][j] + secondMatrix[i][j] +"\t");
                }
                System.out.println();
            }*/
            for (int i = 0; i < firstMatrixHeight; i++) {
                for (int j = 0; j < secondMatrixWidth; j++) {
                    for (int k = 0; k < secondMatrixWidth; k++) {
                        System.out.print(firstMatrix[i][k] * secondMatrix[k][j] +"\t");
                    }
                }
                System.out.println();
            }
        } else System.out.println("Размер матриц не совпадает!");
    }
}
