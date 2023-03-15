import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void printByte(double number)
    {
        // Массив для хранения едениц измерения памяти до йоттабайта и индекс для определения еденицы
        String [] unitofinfo= {" "," K"," M"," G"," T"," P"," E"," Z"," Y"};
        int index=0;

        while (number>1024d) {
            number/=1024d;
            ++index;
        }

        System.out.println("Результат: "+String.format(Locale.US,"%.1f",number)+unitofinfo[index]+"B");
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Введите число: ");

        double number=sc.nextDouble();

        //Проверка на длину числа, программа не преобразует число дальше йоттабайта
        if(number>Math.pow(2,80)) {
            System.out.println("Число слишком большое.");
        }
        else {
            printByte(number);
        }
    }
}