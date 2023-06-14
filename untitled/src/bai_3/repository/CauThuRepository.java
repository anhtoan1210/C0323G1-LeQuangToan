package bai_3.repository;

import bai_3.common.ReadAndWrite;
import bai_3.model.CauThu;

import java.util.ArrayList;
import java.util.List;

public class CauThuRepository implements ICauThuRepository {
    private static List<CauThu> cauThus = new ArrayList<>();
    public static final String PATH_CAUTHU = "cau_thu.csv";


    @Override
    public List<CauThu> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_CAUTHU);
        cauThus.clear();
        String[] info;
        for (String s : strings) {
            info = s.split(",");
            cauThus.add(new CauThu(info[0], info[1], Integer.parseInt(info[2]), info[3], info[4]));
        }
        return cauThus;
    }

    @Override
    public void add(CauThu cauThu) {
        List<String> strings = new ArrayList<>();
        strings.add(cauThu.getMaCauThu() + "," + cauThu.getHoTenCauThu() + "," + cauThu.getNgaySinhCauThu() + "," + cauThu.getDiaChi() + "," + cauThu.getDoiTuyen());
        ReadAndWrite.writeFile(PATH_CAUTHU, strings, true);
    }
}
