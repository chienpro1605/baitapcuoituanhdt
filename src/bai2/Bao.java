package bai2;

public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public Bao(String matailieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(matailieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    @Override
    public String toString() {
        return "Book{" +
                "tenTacGia='" + ngayPhatHanh +
                ", ma tai lieu= "+ getMatailieu()+
                ", ten nha xuat ban= "+ getTenNhaXuatBan()+
                ", so ban phat hanh= "+ getSoBanPhatHanh()+"}";
    }
}
