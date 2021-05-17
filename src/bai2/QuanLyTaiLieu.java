package bai2;

import java.util.Scanner;

public class QuanLyTaiLieu {
    private TaiLieu[] tailieu;
    private int index;

    public QuanLyTaiLieu(int size){
        this.tailieu = new TaiLieu[size];
        this.index = 0;
    }
    public int getIndex(){
        return index;
    }
    public void themMoiTaiLieu(int option){
        Scanner scanner = new Scanner(System.in);
        switch (option){
            case 1:
                System.out.println("nhập mã tài liệu");
                String ma = scanner.nextLine();
                System.out.println("nhập tên nhà xuất bản");
                String name = scanner.nextLine();
                System.out.println("nhập số bản phát hành");
                int number = scanner.nextInt();
                System.out.println("nhập tên tác giả");
                String nameAuthor = scanner.nextLine();
                System.out.println("nhập số trang");
                int pageNumber = scanner.nextInt();
                this.tailieu[index] = new Book(ma, name, number, nameAuthor, pageNumber);
                index++;
                break;
            case 2:
                System.out.println("nhập mã tài liệu");
                String ma1 = scanner.nextLine();
                System.out.println("nhập tên nhà xuất bản");
                String name1 = scanner.nextLine();
                System.out.println("nhập số bản phát hành");
                int number1 = scanner.nextInt();
                System.out.println("nhập  số phát hành");
                int soPhatHanh = scanner.nextInt();
                System.out.println("nhập tháng phát hành");
                int thangPhatHanh = scanner.nextInt();
                this.tailieu[index] = new TapChi(ma1, name1, number1, soPhatHanh, thangPhatHanh);
                index++;
                break;
            case 3:
                System.out.println("nhập mã tài liệu");
                String ma2 = scanner.nextLine();
                System.out.println("nhập tên nhà xuất bản");
                String name2 = scanner.nextLine();
                System.out.println("nhập số bản phát hành");
                int number2 = scanner.nextInt();
                System.out.println("nhập ngày phát hành");
                int ngayPhatHanh = scanner.nextInt();
                this.tailieu[index] = new Bao(ma2, name2, number2, ngayPhatHanh);
                index++;
                break;
        }
    }
    public void timKiemTaiLieu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn muốn tìm kiếm tài liệu nào");
        System.out.println("1.sách   2.tạp chí   3.báo");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                boolean issach = false;
                for (int i =0; i<index; i++){
                    if (tailieu[i] instanceof Book){
                        System.out.println(tailieu[i]);
                        issach = true;
                    }
            }
                if (!issach){
                    System.out.println("không tìm thấy sách");
                }
                break;
            case 2:
                boolean istapchi = false;
                for (int i = 0; i<index; i++){
                    if (tailieu[i] instanceof TapChi){
                        System.out.println(tailieu[i]);
                        istapchi = true;
                    }
                }
                if (!istapchi){
                    System.out.println("không tìm thấy tạp chí");
                }
                break;
            case 3:
                boolean isbao = false;
                for (int i = 0; i<index; i++){
                    if (tailieu[i] instanceof Bao){
                        System.out.println(tailieu[i]);
                        isbao = true;
                    }
                }
                if (!isbao){
                    System.out.println("không tìm thấy báo");
                }
                break;
        }

    }
    public void xoaTaiLieu(){
         Scanner scanner = new Scanner(System.in);
         int vitrixoa = -1;
        System.out.println("nhập mã tài liệu muốn xóa");
        String maTaiLieu = scanner.nextLine();
        for (int i = 0; i<index; i++){
            if (maTaiLieu.equals(tailieu[i].getMatailieu())){
                vitrixoa = i;
                break;
            }
        }
        if (vitrixoa>=0){
            tailieu[vitrixoa] = null;
            for (int i = vitrixoa; i<index; i++){
                tailieu[i] = tailieu[i+1];
                tailieu[i+1] = null;
            }
            this.index = this.index-1;
        }else {
            System.out.println("không tìm thấy mã tài liệu này");
        }
    }
    public void displayTaiLieu(){
        for (int i =0; i<index; i++){
            System.out.println(tailieu[i]);
        }
    }

}
