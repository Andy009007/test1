package com.yunqi;

import com.sun.xml.internal.bind.util.Which;

import java.util.Scanner;

public class JinZiTa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int count1 = sc.nextInt();
        switch (count1) {
            case 1:
                demo_1(count);
                break;
            case 2:
                demo_2(count);
                break;
            default:
                System.out.println("输入有误");
                break;
        }
        sc.close();
    }

    public static void demo_1(int count) {
        for (int i = 0; i < count; i++) {
            for (int a = (count - i - 1); a > 0; a--) {
                System.out.print("  ");
            }
            for (int b = 0; b < (i * 2 + 1); b++) {
                System.out.print("☆");
            }
            System.out.println();
        }
    }

    public static void function_1(int count) {
        for (int i = 0; i < count; i++) {
            for (int space = count - i - 1; space > 0; space--) {
                System.out.print("   ");
            }
            for (int star = 0; star < (2 * i + 1); star++) {
                System.out.print("☆");
            }
            System.out.println();
        }
    }

    public static void demo_2(int count) {
        for (int i = 0; i < count; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("  ");
            }
            for (int b = 0; b < (2 * (count - i) - 1); b++) {
                System.out.print("☆");
            }
            System.out.println();
        }

    }

    public static void function_2(int count) {
        for (int i = 0; i < count; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print("    ");
            }
            for (int star = 0; star < (2 * (count - i) - 1); star++) {
                System.out.print("☆");
            }
            System.out.println();
        }
    }

}
