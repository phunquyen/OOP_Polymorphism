public class NhanVienFullTime extends NhanVien {

    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        if (loaiChucVu == Config.NHANVIEN) {
            return "Lính toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
        } else {
            return "Sếp toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
        }
    }

    @Override
    public void tinhLuong() {
        if (loaiChucVu == Config.NHANVIEN) {
            luong = Config.LUONG_NHANVIEN_FULLTIME + ngayLamThem * Config.LUONG_LAMTHEM_NGAY;
        } else if (loaiChucVu == Config.SEP) {
            luong = Config.LUONG_SEP_FULLTIME + ngayLamThem * Config.LUONG_LAMTHEM_NGAY;
        }
    }
}
