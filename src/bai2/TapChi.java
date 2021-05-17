package bai2;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String matailieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(matailieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tenTacGia='" + soPhatHanh + '\'' +
                ", soTrang=" + thangPhatHanh +
                ", ma tai lieu= "+ getMatailieu()+
                ", ten nha xuat ban= "+ getTenNhaXuatBan()+
                ", so ban phat hanh= "+ getSoBanPhatHanh()+"}";
    }
}
