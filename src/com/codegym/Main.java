package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double vnd;
        double usd;
        int select;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ấn 1 Để Chuyển Từ USD sang VND");
        System.out.println("Ấn 2 Để Chuyển Từ VND sang USD");
        System.out.println("--Nhập Lựa Chọn Của Bạn--");
        select = sc.nextInt();

        switch (select) {
            case 1:
                System.out.println("Mời Bạn Nhập Số Tiền Cần Chuyển");
                usd = sc.nextDouble();
                vnd = usd * 23000;
                System.out.println(usd + " usd = " + vnd + " vnd");
                break;
            case 2:
                System.out.println("Mời Bạn Nhập Số Tiền Cần Chuyển");
                vnd = sc.nextDouble();
                usd = vnd / 23000;
                System.out.println(vnd + " vnd = " + usd + " usd");
                break;
            default:
                System.out.println("Không hợp lệ");
        }


    }
}
