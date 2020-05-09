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
@ApiModel(value="Resume对象", description="")
public class Resume implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "resume_id", type = IdType.AUTO)
    private Integer resumeId;

    private Integer resumeWorkstatus;

    private Integer resumeSkill;

    private Integer resumeWorks;

    private String resumeIntroduce;

    private Integer resumePerson;

    private Integer resumeExperience;

    private Integer resumeEducation;


}
