package cn.bdqn.his.medicine.service;

import cn.bdqn.his.medicine.entity.Medicine;
import cn.bdqn.his.medicine.mapper.MedicineMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {
    @Resource
    private MedicineMapper medicineMapper;
    @Override
    public List<Medicine> findAll() {
        return medicineMapper.findAll();
    }

    @Override
    public List<Medicine> findAll(Integer typeId, String name) {
        return medicineMapper.findAllBy(typeId, name);
    }
}
