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
@ApiModel(value="WorkStatus对象", description="")
public class WorkStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "工作状态")
    private String jobStatus;

    @ApiModelProperty(value = "状态id")
    @TableId(value = "status_id", type = IdType.AUTO)
    private Integer statusId;

    @ApiModelProperty(value = "职业状态")
    private String professionStatus;

    @ApiModelProperty(value = "具体职业")
    private String profession;


}
