package com.metanit;

public class Tasks {
    public void computeTask2(int num){
        switch (num){
            case 5:
                System.out.println("отлично");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 2:
                System.out.println("неудовлетвортиельно");
                break;
            default:
                System.out.println("Не знаю такой оценки");
                break;
        }
    }
    public  void computeTask3(int num){
        switch (num) {
            case 0:
                System.out.println("Воскресенье");
                break;
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            default:
                System.out.println("Не знаю такого дня недели");
                break;
        }
    }
    public void computeTask4(int num){
        if(num >= 91 && num < 100)
            System.out.println("Разряд А");
        else if (num < 91 && num >= 81)
            System.out.println("Разряд B");
        else if (num < 81 && num >= 71)
            System.out.println("Разряд С");
        else if (num < 71 && num >= 61)
            System.out.println("Разряд D");
        else if (num < 61 && num >= 51)
            System.out.println("Разряд E");
        else if (num < 51 && num > 0)
            System.out.println("Разряд F");
        else
            System.out.println("Число находится за пределами");
    }
    public void computeTask5(double x){
        double a = 1.71;
        double b = 0.83;
        System.out.println("Выполнение задания 5 при х = "+ x);
        if (x <= 1)
            System.out.println(2 * x * x + a * Math.cos(b * x));
        else
            System.out.println(Math.exp(x) + Math.tan(Math.pow(x, 3)));
        return;
    }

    public void computeTask6(double x){
        double a = 2.1;
        double b = 0.7;
        System.out.println("Выполнение задания 6 при х = "+ x);
        if (x > -2 && x <= 0)
            System.out.println(1/(1 + a * Math.abs(x)));
        else if (x <= -2)
            System.out.println(Math.cos(b * x * x) + 0.5 * x);
        else
            System.out.println(Math.sqrt(1 + Math.exp(a * x)));
    }
}
