package bai3;

public class ThiSinhKhoiA extends ThiSinh{
   private String khoiA;

    public ThiSinhKhoiA(int soBaoDanh, String name, String address, int mucUuTien, String khoiA) {
        super(soBaoDanh, name, address, mucUuTien);
        this.khoiA = khoiA;
    }

    public String getKhoiA() {
        return khoiA;
    }

    public void setKhoiA(String khoiA) {
        this.khoiA = khoiA;
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "sobaodanh='" + getSoBaoDanh() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", mucuutien=" + getMucUuTien() +
                ", khoimonthi = "+ khoiA+ '}';
    }

}
