package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Employee;
import cn.bdqn.his.masterdata.mappper.MapperEmployee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private MapperEmployee mapperEmployee;
    @Override
    public List<Employee> findAll() {
        return mapperEmployee.findAll();
    }

    @Override
    public List<Employee> findAll(Integer KId, String name) {
        return mapperEmployee.findAllBy(KId,name);
    }
}
