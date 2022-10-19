import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Представьте, что у Вас имеется автомат по приготовлению кофе, есть 4 кнопки для выбора напитка:
// эспрессо, американо, капучино, чай. Вам необходимо написать алгоритм, используя switch-case конструкцию для создания этих напитков,
// процесс приготовления которых будет напечатан в консоли. При этом, каждый напиток включает в себя определенные действия
// (элементарные процессы, будут описаны ниже), которые можно упаковать в самостоятельные методы, для их многократного использования.
//
//
//Выбор кнопки можно считать через командную строку (например в int значение).
//Приготовление эспрессо - минимально неразделимый процесс.
//Приготовление американо - эспрессо + добавление воды.
//Приготовление капучино - эспрессо + добавление вспененного молока.
//Приготовление чая - выбор чайного пакетика + добавление воды.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Выберите напиток ");


        int drink = scanner.nextInt();
        String drinkStr ;

      switch (drink) {
            case 1:
                makeEsprosso();
                break;
            case 2:
                makeEsprosso();
                addWater();
                break;
            case 3:
                makeEsprosso();
                addMilk();
                break;
            case 4:
                addTea();
                addWater();
                break;
            default:
                drinkStr = "error";
        }
    }
    public static void makeEsprosso(){
        System.out.println("приготовление espresso");
    }

    public static void addWater(){
        System.out.println("добавление воды.... ");
    }
    public static void addMilk(){
        System.out.println("добавление вспененного молока. ");
    }

    public static void addTea(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("выбор чайного пакетика");

        int tea = scanner.nextInt();
         String result = switch (tea){
              case 1 -> "мaлиновый чай";
              case 2 -> "черный чай";
              case 3 -> "green tea";
             default -> "not exist";
          };

        System.out.println(result);
    }

}
