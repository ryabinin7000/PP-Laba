public class Main2 {
    public static void main(String[] args) {
        final int N = 100;
        System.out.println("Числа от 1 до 100, которые делятся на 3 без остатка:");
        /*Проверка на mod=0 и вывод элемента*/
        for (int i = 1; i<N; i++)
        {
            if(i%3==0)
                System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Разработчики: Иванов И.С., Рябинин А.В.");
        System.out.println("Дата получения и выполнения: 18.02.2022");
        System.out.println("Дата сдачи задания: 25.02.2022");
    }
}
