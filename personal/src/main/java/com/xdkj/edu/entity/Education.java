package com.xdkj.edu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
@ApiModel(value="Education对象", description="")
public class Education implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "education_id", type = IdType.AUTO)
    private Integer educationId;

    private Date educationStart;

    private Date educationEnd;

    private String schoolName;

    private String profession;

    private String educationLevel;


}
