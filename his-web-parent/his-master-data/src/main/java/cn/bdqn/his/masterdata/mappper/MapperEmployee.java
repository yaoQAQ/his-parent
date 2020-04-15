package cn.bdqn.his.masterdata.mappper;

import cn.bdqn.his.masterdata.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MapperEmployee {
    List<Employee> findAll();
    List<Employee> findAllBy(@Param("kId") Integer typeId, @Param("name") String name);
}
