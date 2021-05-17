package bai3;

public class ThiSinhKhoiB extends ThiSinh{
    private String khoiB;

    public ThiSinhKhoiB(int soBaoDanh, String name, String address, int mucUuTien, String khoiA) {
        super(soBaoDanh, name, address, mucUuTien);
        this.khoiB = khoiB;
    }

    public String getKhoiB() {
        return khoiB;
    }

    public void setKhoiB(String khoiB) {
        this.khoiB = khoiB;
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "sobaodanh='" + getSoBaoDanh() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", mucuutien=" + getMucUuTien() +
                ", khoimonthi = "+ khoiB+ '}';
    }

}
