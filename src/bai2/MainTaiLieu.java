package bai2;

import java.util.Scanner;

public class MainTaiLieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử trong tài liệu");
        int size = scanner.nextInt();
        QuanLyTaiLieu ql = new QuanLyTaiLieu(size);
        int option = -1;
        while (option!=0){
            display();
            System.out.println("nhập lựa chọn của bạn");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    int choice;
                    System.out.println("bạn muốn thêm tài liệu gì");
                    System.out.println("1.sách   2.tạp chí   3.báo");
                    choice = scanner.nextInt();
                    ql.themMoiTaiLieu(choice);
                    break;
                case 2:
                    ql.timKiemTaiLieu();
                    break;
                case 3:
                    ql.xoaTaiLieu();
                    break;
                case 4:
                    ql.displayTaiLieu();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    public static void display(){
        System.out.println("==========menu========");
        System.out.println("1. thêm tài liệu");
        System.out.println("2. tìm kiếm tài liệu");
        System.out.println("3. xóa tài liệu");
        System.out.println("4. hiển thị tài liệu");
        System.out.println("0. thoát");
        System.out.println("=======================");
    }
}
