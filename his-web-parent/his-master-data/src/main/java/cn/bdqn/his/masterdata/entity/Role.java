package cn.bdqn.his.masterdata.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 角色表
 */
@Data
@Builder
@ToString
public class Role {
    private int id;
    private int rid;
    private String rname;
    private String description;
    private Date createTime;
    private String founder;
    private int status;
}
