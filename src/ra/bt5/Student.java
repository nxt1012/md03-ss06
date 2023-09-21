package ra.bt5;

public class Student {
    int maHS;
    String tenHS;
    byte tuoiHS;
    boolean gioiTinh;
    String diaChi;
    int soDienThoai;

    public Student(int maHS, String tenHS, byte tuoiHS, boolean gioiTinh, String diaChi, int soDienThoai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoiHS = tuoiHS;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public int getMaHS() {
        return this.maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return this.tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public byte getTuoiHS() {
        return this.tuoiHS;
    }

    public void setTuoiHS(byte tuoiHS) {
        this.tuoiHS = tuoiHS;
    }

    public boolean isGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return this.soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void inputData(int maHS, String tenHS, byte tuoiHS, boolean gioiTinh, String diaChi, int soDienThoai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoiHS = tuoiHS;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }
    public void displayData(){
        System.out.println("Mã học sinh: " + maHS +
                        " Tên học sinh: " + tenHS +
                " Tuổi học sinh: " + tuoiHS +
                " Giới tính: " + gioiTinh +
                " Địa chỉ: " + diaChi +
                " Số điện thoại: " + soDienThoai
        );
    }
}
