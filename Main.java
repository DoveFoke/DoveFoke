//  № зачётки - 1428
//  С2 = 0, операция О1 - "+"
//  С3 = 0, константа = 0
//  С5 = 3, операция О2 - "+"
//  С7 = 0, тип индексов i и j - byte
package com.kpi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int n;
        final int m;
        int numerator;
        double denominator;
        byte a, b, i, j;
        final double constanta = 1428 % 3;
        double res = 0;
        try {
            System.out.print("Введите значение n: ");
            n = scan.nextInt();
            System.out.print("Введите значение m: ");
            m = scan.nextInt();
            System.out.print("Введите значение a: ");
            a = scan.nextByte();
            System.out.print("Введите значение b: ");
            b = scan.nextByte();
        } catch (InputMismatchException exc) {
            System.out.println("Введённые данные должны соответствовать типу, обозначенному в задании!");
            return;
        }
        if (a > n || b > m) {
            System.out.println("Вводимые данные a и b не могут быть больше n и m соответственно.");
            return;
        }
        if (a <= -constanta && -constanta <= n) {
            System.out.println("На 0 делить нельзя!");
            return;
        }
        for (i = a; i <= n; i++) {
            for (j = b; j <= m; j++) {
                denominator = i + constanta;
                numerator = i + j;
                res += numerator / denominator;
            }
        }
        System.out.println("Результат: S = " + res);
    }
}
