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
@ApiModel(value="Experience对象", description="")
public class Experience implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "experience_id", type = IdType.AUTO)
    private Integer experienceId;

    private Date experienceStart;

    private Date experienceEnd;

    private String companyName;

    private String companyPost;


}
