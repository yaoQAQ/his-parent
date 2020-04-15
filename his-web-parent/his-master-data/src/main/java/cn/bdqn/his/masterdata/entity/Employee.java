package cn.bdqn.his.masterdata.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 员工基本信息表
 */
@Data
@Builder
@ToString
public class Employee {
    private int eid;
    private int emNo;
    private String emName;
    private String gender;
    private int age;
    private String phone;
    private String eClinic;
    private int eSection;
    private int eRole;
    private Date createTime;
    private String createPerson;
    private int status;
}
