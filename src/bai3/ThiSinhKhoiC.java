package bai3;

public class ThiSinhKhoiC extends ThiSinh{
    private String khoiC;

    public ThiSinhKhoiC(int soBaoDanh, String name, String address, int mucUuTien, String khoiC) {
        super(soBaoDanh, name, address, mucUuTien);
        this.khoiC = khoiC;
    }

    public String getKhoiC() {
        return khoiC;
    }

    public void setKhoiC(String khoiC) {
        this.khoiC = khoiC;
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "sobaodanh='" + getSoBaoDanh() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", mucuutien=" + getMucUuTien() +
                ", khoimonthi = "+ khoiC+ '}';
    }

}
