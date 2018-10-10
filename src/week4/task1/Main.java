package week4.task1;

public class Main {
    public static void main(String[] args) {
        HoaQua qua = new HoaQua();
        qua.setNguocGoc("china");
        qua.setSoLuong(34);

        cam cam = new cam();
        cam.setNguocGoc("us");
        cam.setSoLuong(234);
        cam.setVi("chua");
        cam.setMau("xanh");

        camSanh camSanh = new camSanh();
        camSanh.setNguocGoc("us");
        camSanh.setSoLuong(234);
        camSanh.setVi("ngot");
        camSanh.setMau("xanh");
        camSanh.setNgonkhong("khong ngon");


        camThanhPhong camThanhPhong = new camThanhPhong();
        camThanhPhong.setNguocGoc("vietnam");
        camThanhPhong.setSoLuong(4);
        camThanhPhong.setVi("chua");
        camThanhPhong.setMau("man");
        camThanhPhong.setDinhDuong(23);
        camThanhPhong.setCanNangTrungBinh(12);
    }
}
