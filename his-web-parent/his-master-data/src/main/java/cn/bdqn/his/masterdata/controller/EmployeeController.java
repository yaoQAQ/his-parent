package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.entity.Employee;
import cn.bdqn.his.masterdata.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @ApiOperation(value = "调用继基础模块api,分页查询员工列表",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码，查询第几页数据，必填",name="pageNum",required = true,dataType = "1"),
            @ApiImplicitParam(value = "每页显示几条，必填",name="pageNum",required = true,dataType = "2"),
    })
    @GetMapping("")
    public Response findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Employee> list = employeeService.findAll();
        PageInfo<Employee> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
    @ApiOperation(value = "调用继基础模块api,根据条件分页查询员工列表",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码，查询第几页数据，必填",name="pageNum",required = true,dataType = "1"),
            @ApiImplicitParam(value = "每页显示几条，必填",name="pageNum",required = true,dataType = "2"),
            @ApiImplicitParam(value = "所属科室ID",name="kId"),
            @ApiImplicitParam(value = "员工名称，模糊查询",name="name"),

    })
    @RequestMapping(value = "/findBy",method = {RequestMethod.GET,RequestMethod.POST})
    public Response findBy(Integer pageNum, Integer pageSize, Integer kId, String name) {
        PageHelper.startPage(pageNum,pageSize);
        List<Employee> list = employeeService.findAll(kId, name);
        PageInfo<Employee> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
}
