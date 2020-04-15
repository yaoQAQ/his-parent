package cn.bdqn.his.masterdata.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 科室表
 */
@Data
@Builder
@ToString
public class Section {
    private int id;
    private int kId;
    private int kName;
    private int kBrief;
    private Date createTime;
    private String founder;
    private int status;

}
