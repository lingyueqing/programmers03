package com.xdkj.edu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
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
@ApiModel(value="Works对象", description="")
public class Works implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "works_id", type = IdType.AUTO)
    private Integer worksId;

    private String worksName;

    private String worksTrade;

    private String worksKeyword;

    private String worksHref;

    private String worksDuty;

    private Blob worksImage;


}
