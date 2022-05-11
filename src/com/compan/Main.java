package com.compan;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int x;
        double y;

        Scanner E = new Scanner (System.in);
        Scanner exit = new Scanner (System.in);
        System.out.println ("Завершить 'exit', продолжить'':");
        while (true) {
            String S = E.nextLine ();
            if (S.equals ("exit"))
                break;

            Scanner form = new Scanner (System.in);
            System.out.println ("Введите число:");
            x = form.nextInt ();
            y = (x + Math.sin (x));
            System.out.println ("Результат:");
            System.out.println (y);

            try {
                PrintWriter pw = new PrintWriter ("C:\\rico\\ru.txt");
                pw.println (y);
                pw.close ();
            } catch (Exception exception) {
                System.out.println ();
            }
        }
    }
}