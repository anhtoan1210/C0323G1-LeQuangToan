package bai_3.model;

import java.util.Objects;

public class CauThu {
    private String maCauThu;
    private String hoTenCauThu;
    private int ngaySinhCauThu;
    private String diaChi;
    private String doiTuyen;

    public CauThu() {
    }

    public CauThu(String maCauThu, String hoTenCauThu, int ngaySinhCauThu, String diaChi, String doiTuyen) {
        this.maCauThu = maCauThu;
        this.hoTenCauThu = hoTenCauThu;
        this.ngaySinhCauThu = ngaySinhCauThu;
        this.diaChi = diaChi;
        this.doiTuyen = doiTuyen;
    }

    public String getMaCauThu() {
        return maCauThu;
    }

    public void setMaCauThu(String maCauThu) {
        this.maCauThu = maCauThu;
    }

    public String getHoTenCauThu() {
        return hoTenCauThu;
    }

    public void setHoTenCauThu(String hoTenCauThu) {
        this.hoTenCauThu = hoTenCauThu;
    }

    public int getNgaySinhCauThu() {
        return ngaySinhCauThu;
    }

    public void setNgaySinhCauThu(int ngaySinhCauThu) {
        this.ngaySinhCauThu = ngaySinhCauThu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDoiTuyen() {
        return doiTuyen;
    }

    public void setDoiTuyen(String doiTuyen) {
        this.doiTuyen = doiTuyen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CauThu cauThu = (CauThu) o;
        return Objects.equals(maCauThu, cauThu.maCauThu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maCauThu);
    }

    @Override
    public String toString() {
        return "CauThu{" +
                "maCauThu='" + maCauThu + '\'' +
                ", hoTenCauThu='" + hoTenCauThu + '\'' +
                ", ngaySinhCauThu=" + ngaySinhCauThu +
                ", diaChi='" + diaChi + '\'' +
                ", doiTuyen='" + doiTuyen + '\'' +
                '}';
    }
}
