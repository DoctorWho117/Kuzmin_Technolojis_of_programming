import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1,y1,x2,y2;

        System.out.println("Пожалуйста, введите размерности двух матриц для начала работы программы");
        System.out.println("Ширина первой матрицы: ");
        x1 = scanner.nextInt();
        System.out.println("Высота первой матрицы: ");
        y1 = scanner.nextInt();
        System.out.println("Ширина второй матрицы: ");
        x2 = scanner.nextInt();
        System.out.println("Высота второй матрицы: ");
        y2 = scanner.nextInt();
        Matrix matrix = new Matrix(x1,y1,x2,y2);
        System.out.println();

        System.out.println("Как вы хотите внести значения?\n1. Вручную\n2. Автоматически с выбором диапазона значений");
        int flagFill;
        flagFill = scanner.nextInt();
        if (flagFill == 1) {
            System.out.println("Введите значения матриц: ");
            matrix.fillMatrixManually();
        } else {
            int max, min;
            System.out.println("Введите максимальное значения диапзона: ");
            max = scanner.nextInt();
            System.out.println("Введите минимальное значения диапзона: ");
            min = scanner.nextInt();
            matrix.fillMatrixAutomatically(max, min);
        }
        System.out.println();

        while (flagFill != -1) {
            System.out.println("Меню:\n1. Математические операции\n2. Вывод матриц и их диагоналей\n3. Выход");
            flagFill = scanner.nextInt();
            if (flagFill == 1) {
                System.out.println("Математические операции:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Меню");
                flagFill = scanner.nextInt();
                switch (flagFill){
                    case 1:
                        matrix.summarizeMatrix();
                        break;
                    case 2:
                        matrix.subtractionMatrix();
                        break;
                    case 3:
                        matrix.multiplyMatrix();
                        break;
                }
                flagFill = 0;
                System.out.println("Выход в меню...");
            } else if (flagFill == 2) {
                System.out.println("Вывод матриц и их диагоналей:\n1. Первая матрица\n2. Вторая матрица\n3. Столбец из " +
                        "первой матрицы\n4. Столбец из второй матрицы\n5. Строка из первой матрицы\n6. Строка из второй " +
                        "матрицы\n7. Главная диагональ первой матрицы\n8. Главная диагональ второй матрицы\n9. Побочная " +
                        "диагональ первой матрицы\n10. Побочная диагональ второй матрицы\n11. Выход");
                int column;
                flagFill = scanner.nextInt();
                switch (flagFill){
                    case 1:
                        System.out.println("Первая матрица: ");
                        matrix.showFirstMatrix();
                        break;
                    case 2:
                        System.out.println("Вторая матрица: ");
                        matrix.showSecondMatrix();
                        break;
                    case 3:
                        System.out.println("Введите номер столбца, который хотите вывести: ");
                        column = scanner.nextInt();
                        matrix.showOneColumnFromFirstMatrix(column);
                        break;
                    case 4:
                        System.out.println("Введите номер столбца, который хотите вывести: ");
                        column = scanner.nextInt();
                        matrix.showOneColumnFromSecondMatrix(column);
                        break;
                    case 5:
                        System.out.println("Введите номер строки, который хотите вывести: ");
                        column = scanner.nextInt();
                        matrix.showOneRowFromFirstMatrix(column);
                        break;
                    case 6:
                        System.out.println("Введите номер строки, который хотите вывести: ");
                        column = scanner.nextInt();
                        matrix.showOneRowFromSecondMatrix(column);
                        break;
                    case 7:
                        System.out.println("Главная диагональ первой матрицы: ");
                        matrix.showFirstMatrixMajorDiagonal();
                        break;
                    case 8:
                        System.out.println("Главная диагональ второй матрицы: ");
                        matrix.showSecondMatrixMajorDiagonal();
                        break;
                    case 9:
                        System.out.println("Побочная диагональ первой матрицы: ");
                        matrix.showFirstMatrixDopDiagonal();
                        break;
                    case 10:
                        System.out.println("Побочная диагональ второй матрицы: ");
                        matrix.showSecondMatrixDopDiagonal();
                        break;
                }
                flagFill = 0;
                System.out.println("Выход в меню...");
            } else flagFill = -1;
            System.out.println();
        }
    }
}