package bai4;

import java.util.Scanner;

public class Ngươi {
    private String name;
    private int age;
    private String carrer;
    private int numbercmnd;

    public Ngươi(String name, int age, String carrer, int numbercmnd) {
        this.name = name;
        this.age = age;
        this.carrer = carrer;
        this.numbercmnd = numbercmnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public int getNumbercmnd() {
        return numbercmnd;
    }

    public void setNumbercmnd(int numbercmnd) {
        this.numbercmnd = numbercmnd;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        this.name = scanner.nextLine();
        System.out.println("nhập tuổi");
        this.age = scanner.nextInt();
        System.out.println("nhập nghề nghiệp");
        this.carrer = scanner.nextLine();
        System.out.println("nhập chứng minh nhân dân");
        this.numbercmnd = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Ngươi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carrer='" + carrer + '\'' +
                ", numbercmnd=" + numbercmnd +
                '}';
    }
}
