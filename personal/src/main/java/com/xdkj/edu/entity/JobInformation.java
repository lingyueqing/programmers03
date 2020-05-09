package com.xdkj.edu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author fuqingqing
 * @since 2020-05-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="JobInformation对象", description="")
public class JobInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "job_id", type = IdType.AUTO)
    private Integer jobId;

    private String jobTime;

    private String jobUntime;

    private String jobAddress;

    private Integer jobHours;

    private String jobPattern;

    private Integer jobPerson;


}
