import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* Инициализация переменных и сканнера */
        Scanner sc = new Scanner(System.in);
        int n;
        float avg, sum = 0;
        /* Объявление и ввод массива и его длины */
        System.out.print("Введите длину массива: ");
        n = sc.nextInt();
        float inArr[] = new float[n];
        System.out.println("Введите элементы массива: ");
        for(int i = 0; i<n; i++)
        {
            inArr[i] = sc.nextFloat();
            sum+=inArr[i];
        }
        /* Вычисление среднего и сравнение с ним каждого элемента */
        avg = sum / n;
        System.out.println("Элементы массива, меньшие, чем среднее значение:");
        for (float el: inArr ) {
            if(el<avg)
                System.out.print(el+" ");
        }
        System.out.println();
        System.out.println("Элементы массива, большие, чем среднее значение:");
        for (float el: inArr ) {
            if(el>avg)
                System.out.print(el+" ");
        }
        System.out.println();
        /* Вывод оставшихся данных */
        System.out.println("Длина массива: "+n);
        System.out.println("Среднее значение: "+avg);
        System.out.println();
        System.out.println("Разработчики: Иванов И.С., Рябинин А.В.");
        System.out.println("Дата получения и выполнения: 18.02.2022");
        System.out.println("Дата сдачи задания: 25.02.2022");
    }
}
