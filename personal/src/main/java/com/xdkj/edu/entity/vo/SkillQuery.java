package com.xdkj.edu.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author fuqingqing
 * @date 2020-05-09 0:52
 */
@Data
public class SkillQuery {

    @ApiModelProperty(value = "技能熟练程度，精通，熟悉，了解")
    private String skillEvaluate;

    @ApiModelProperty(value = "技能名称精确查询")
    private String skillName;



}
