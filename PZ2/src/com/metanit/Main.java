package com.metanit;

public class Main {

    public static void main(String[] args){
        char symb1=1067;
        char symb2 ='Ы';

        System.out.println("symb1 contains "+ symb1);
        System.out.println("symb2 contains "+ symb2);

        char ch = 'J';
        int intCh = (int) ch;

        System.out.println("J corresponds with "+ intCh);

        String s1 = "I have ";
        String s2 = " apples ";
        int num = 3;
        String s = s1 + num + s2;

        System.out.println(s);

        int i = 35;
        String str = Integer.toString(i);
        System.out.println(str);

        double  i2 = 32.4e10;
        String str2 = Double.toString(i);
        System.out.println(str);

        long  i3 = 3422222;
        String str3 = Long.toString(i);
        System.out.println(str);

        float  i4 = 3.46f;
        String str4 = Float.toString(i);
        System.out.println(str);

        char ch10 = 'S';

        // c использованием класса Character
        String charToString = Character.toString(ch10);
        System.out.println(charToString);

        // с использованием операции добавления класса String
        String str10 = "" + ch10;
        System.out.println(str10);

        //с использованием массива
        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);

        // с использованием метода valueOf класса String
        String valueOfChar = String.valueOf(ch10);
        System.out.println(valueOfChar);


        char ch20 = '9';

        // c использованием метода getNumericValue
        // класса Character
        int i30 = Character.getNumericValue(ch);
        System.out.println(i30);

        // c использованием метода digit класса Character
        int i40 = Character.digit(ch,10);
        System.out.println(i40);
    }
}
