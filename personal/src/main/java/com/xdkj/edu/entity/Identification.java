package com.xdkj.edu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="Identification对象", description="")
public class Identification implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "identity_id", type = IdType.AUTO)
    private Integer identityId;

    private String identityCard;

    @TableField("PositiveImage")
    private String PositiveImage;

    private Integer identityStatus;

    private Integer identityPerson;

    @TableField("ReverseImage")
    private String ReverseImage;


}
