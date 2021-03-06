package Lesson_1.DZ_My;

//public class LambdaApp {
//
//    public static void main(String[] args) {
//
//        Operationable op = new Operationable(){
//
//            public int calculate(int x, int y){
//
//                return x + y;
//            }
//        };
//
//        int z = op.calculate(20, 10);
//        System.out.println(z); // 30
//    }
//}
//
///**
// * функциональный интерфейс
// */
//interface Operationable{
//    int calculate(int x, int y);
//}

import java.util.Scanner;

public class LambdaApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число X :");
        double numx = sc.nextDouble();

        System.out.println("Введите целое число Y :");
        double numy = sc.nextDouble();

        Operationable operation;
        boolean end = false;

        while (!end) {
            double result = 0.0;
            System.out.println("Введите оператор + - * / :");
            Scanner scn = new Scanner(System.in);
            String operator = scn.nextLine();

            switch (operator) {
                case ("+"): {
                    operation = (x, y) -> {//в скобках сигнатура лямды а после стрелки - тело лямды
                        return x + y;
                    };
                    result = operation.calculate(numx, numy);

                    System.out.println(result);
                    end = true;
                    break;
                }
                case ("-"): {
                    operation = (x, y) -> x - y;
                    result = operation.calculate(numx, numy);
                    System.out.println(result);
                    end = true;
                    break;
                }
                case ("*"): {
                    operation = (x, y) -> x * y;
                    result = operation.calculate(numx, numy);
                    System.out.println(result);
                    end = true;
                    break;
                }
                case ("/"): {
                    try {
                        operation = (x, y) -> x / y;
                        result = operation.calculate(numx, numy);
                        System.out.println(result);
                        end = true;
                    } catch (ArithmeticException err){
                        System.out.println("Не можем делить на 0");
                    }
                    break;
                }
            }
        }
    }
}

interface Operationable {
    double calculate(double x, double y);

}
