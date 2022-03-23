import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        /*инициализация сканнера и переменных*/
        Scanner sc = new Scanner(System.in);
        int kj, ki, n, m;
        System.out.print("Введите количество строк: ");
        n = sc.nextInt();
        System.out.print("Введите количество столбцов: ");
        m = sc.nextInt();
        /*объявление и ввод массива*/
        float matr[][] = new float[n][m];
        float newMatr[][] = new float[n][m];
        System.out.print("Введите массив: ");
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++)
                matr[i][j] = sc.nextFloat();
        }
        /*ввод k и сдвиг массива*/
        System.out.print("Введите k по строкам: ");
        ki = sc.nextInt();
        System.out.print("Введите k по столбцам: ");
        kj = sc.nextInt();
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++)
                newMatr[(i+ki)%n][(j+kj)%m] = matr[i][j]; }
        /*вывод итогового массива*/
        System.out.println("Итоговый массив:");
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(newMatr[i][j]+" ");
            System.out.println(); }
        System.out.println();
        System.out.println("Разработчики: Иванов И.С., Рябинин А.В.");
        System.out.println("Дата получения и выполнения: 18.02.2022");
        System.out.println("Дата сдачи задания: 25.02.2022");
    }
}
