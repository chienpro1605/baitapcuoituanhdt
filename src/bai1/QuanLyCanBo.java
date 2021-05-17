package bai1;

import java.util.Scanner;

public class QuanLyCanBo {
    private CanBo[] danhsach;
    private int index;

    public QuanLyCanBo(int size) {
        this.danhsach = new CanBo[size];
        this.index = 0;
    }
    public int getIndex(){
        return index;
    }
    public void timKiemCanBo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên muốn tìm");
        String name = scanner.nextLine();
        boolean finded = false;
        int indexOfSeach = -1;
        for (int i = 0; i< index; i++){
            if (name.equals(danhsach[i].getName())){
                finded = true;
                indexOfSeach = i;
                break;
            }
        }
        if (finded = true){
            System.out.println(danhsach[indexOfSeach]);
        }else {
            System.out.println("không tìm thấy");
        }
    }
    public void themMoiCanBo(int option){
        Scanner scanner = new Scanner(System.in);
        switch (option){
            case 1:
                System.out.println("nhập tên");
                String name = scanner.nextLine();
                System.out.println("nhập tuôi");
                int age = scanner.nextInt();
                System.out.println("nhập giới tính");
                String gender = scanner.nextLine();
                System.out.println("nhập địa chỉ");
                String address = scanner.nextLine();
                System.out.println("nhập cấp bậc");
                int level = scanner.nextInt();
                this.danhsach[index] = new CongNhan(name, age, gender, address, level);
                index++;
                break;
            case 2:
                System.out.println("nhập tên");
                String name1 = scanner.nextLine();
                System.out.println("nhập tuôi");
                int age1 = scanner.nextInt();
                System.out.println("nhập giới tính");
                String gender1 = scanner.nextLine();
                System.out.println("nhập địa chỉ");
                String address1= scanner.nextLine();
                System.out.println("nhập nghành đào tạo");
                String major = scanner.nextLine();
                this.danhsach[index] = new KySu(name1, age1, gender1, address1, major);
                index ++;
                break;
            case 3:
                System.out.println("nhập tên");
                String name2 = scanner.nextLine();
                System.out.println("nhập tuôi");
                int age2 = scanner.nextInt();
                System.out.println("nhập giới tính");
                String gender2 = scanner.nextLine();
                System.out.println("nhập địa chỉ");
                String address2 = scanner.nextLine();
                System.out.println("nhập công việc");
                String task = scanner.nextLine();
                this.danhsach[index] = new NhanVien(name2, age2, gender2, address2, task);
                index ++;
                break;
        }

    }
    public void displayCanbo(){
        for (int i = 0; i<index; i++){
            System.out.println(danhsach[i]);
        }
    }
}
