package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    List<Employee> findAll(Integer KId,String name);
}
