package com.metanit;

public class Main {

    public static void main(String[] args) {
        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));
    }
}

enum Operation{
    SUM{
        public int action(int x, int y ){return  x + y;}
    },
    SUBSTRACT{
        public int action(int x, int y){return  x - y;}
    },
    MULTIPLY{
      public int action(int x, int y){return  x * y;}
    };
    public abstract int action(int x, int y);
}