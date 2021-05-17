package bai1;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử trong danh sách");
        int size = scanner.nextInt();
        QuanLyCanBo ql = new QuanLyCanBo(size);
        int option = -1;
        while (option!=0){
            display();
            System.out.println("nhập lựa chọn vào đây");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    int choice;
                    System.out.println("bạn muốn thêm cán bộ nào");
                    System.out.println("1. công nhân  2. kỹ sư  3. nhân viên");
                    choice = scanner.nextInt();
                    ql.themMoiCanBo(choice);
                    break;
                case 2:
                    ql.timKiemCanBo();
                    break;
                case 3:
                    ql.displayCanbo();
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
    public static void display(){
        System.out.println("==========menu========");
        System.out.println("1. thêm mới cán bộ");
        System.out.println("2. tìm kiếm theo tên");
        System.out.println("3. hiển thị  thông tin danh sách cán bộ");
        System.out.println("0. thoát");
        System.out.println("=======================");
    }
}
