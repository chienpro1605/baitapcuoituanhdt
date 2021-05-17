package bai4;

import java.util.Scanner;

public class HoGiaDinh{
    private Ngươi[] nguoi;
    private int size;
    private String address;

    public HoGiaDinh (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập size");
        this.size = scanner.nextInt();
        nguoi = new Ngươi[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập địa chỉ");
        this.address = scanner.nextLine();
    }
}
