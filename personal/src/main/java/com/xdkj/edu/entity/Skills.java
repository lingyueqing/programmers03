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
@ApiModel(value="Skills对象", description="")
public class Skills implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "技能id")
    @TableId(value = "skill_id", type = IdType.AUTO)
    private Integer skillId;

    @ApiModelProperty(value = "技能自评")
    private String skillEvaluate;

    @ApiModelProperty(value = "技能名称")
    private String skillName;


}
