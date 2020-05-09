package com.xdkj.edu.pojo;

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
 * @since 2020-05-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Project对象", description="")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "project_id", type = IdType.AUTO)
    private Integer projectId;

    private Integer projectPublisher;

    private String projectName;

    private Double projectBudget;

    private String projectIntroduce;

    private String projectTechnique;

    private String projectFile;


}
