import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int miles; //Количество полученных миль

        Scanner console = new Scanner(System.in);
        System.out.println("Введите стоимость билета");
        int price = console.nextInt();
        miles = price / 20;
        System.out.println("Количество начисленных миль составит: " + miles);

    }
}
