package bai3;

import java.util.Scanner;

public class MainThiSinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử trong danh sách");
        int size = scanner.nextInt();
        TuyenSinh ql = new TuyenSinh(size);
        int option = -1;
        while (option!=0){
            display();
            System.out.println("nhập lựa chọn của bạn");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    int choice;
                    System.out.println("bạn muốn thêm thí sinh khối nào");
                    System.out.println("1.khối A    2.khối B    3.Khối C");
                    choice = scanner.nextInt();
                    ql.themMoiThiSinh(choice);
                    break;
                case 2:
                    ql.timKiemThiSinh();
                    break;
                case 3:
                    ql.displayThiSinh();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
    public static void display(){
        System.out.println("==========menu========");
        System.out.println("1. thêm mới thí sinh");
        System.out.println("2. tìm kiếm theo số báo danh");
        System.out.println("3. hiển thị  thông tin thí sinh");
        System.out.println("0. thoát");
        System.out.println("=======================");
    }
}
