package cn.bdqn.his.medicine.service;

import cn.bdqn.his.medicine.entity.Medicine;

import java.util.List;

public interface MedicineService {
    List<Medicine> findAll();
    List<Medicine> findAll(Integer typeId,String name);
}
