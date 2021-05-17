package bai2;

public class Book extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Book(String matailieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(matailieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", ma tai lieu= "+ getMatailieu()+
                ", ten nha xuat ban= "+ getTenNhaXuatBan()+
                ", so ban phat hanh= "+ getSoBanPhatHanh()+"}";
    }
}
