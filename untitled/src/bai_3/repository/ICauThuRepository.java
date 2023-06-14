package bai_3.repository;

import bai_3.model.CauThu;

import java.util.List;

public interface ICauThuRepository {
    List<CauThu> getAll();

    void add(CauThu cauThu);


}
