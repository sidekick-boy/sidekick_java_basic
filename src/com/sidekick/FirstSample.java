package com.sidekick;

import java.util.Scanner;

public class FirstSample {
    public static void main(String[] args) {
/*        System.out.println("we will no use 'Hello World!'");

        int x = 10;
        double str = 10.1;
        double y = Double.NaN;
        double m = Double.POSITIVE_INFINITY;
        double n = Double.NEGATIVE_INFINITY;

        System.out.println(Double.isNaN(x));
        System.out.println(Double.isNaN(str));
        System.out.println(y);
        System.out.println(m);
        System.out.println(n);*/

/*        double x = 4;
        System.out.println(Math.sqrt(x));

        System.out.println(1<<35);*/
        // 读取输入
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("我是谁？" + name);
        String where = in.nextLine();
        System.out.println("我在哪？" + where);
        String what = in.nextLine();
        System.out.println("我在干什么？" + what);
    }
}
