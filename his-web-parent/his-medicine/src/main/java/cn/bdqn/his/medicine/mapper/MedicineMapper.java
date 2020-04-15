package cn.bdqn.his.medicine.mapper;

import cn.bdqn.his.medicine.entity.Medicine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

@Mapper
public interface MedicineMapper {
    List<Medicine> findAll();
    List<Medicine> findAllBy(@Param("typeId") Integer typeId, @Param("name") String name);
}
