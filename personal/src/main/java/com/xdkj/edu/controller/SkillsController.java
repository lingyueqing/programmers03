package com.xdkj.edu.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xdkj.commonutils.Result;
import com.xdkj.edu.entity.Skills;
import com.xdkj.edu.entity.vo.SkillQuery;
import com.xdkj.edu.service.SkillsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fuqingqing
 * @since 2020-05-08
 */
@Api(description="技能管理")
@RestController
@RequestMapping("/skills")
public class SkillsController {
    //访问地址：   http://localhost:8888/skills/findAllSkills
//把service注入
@Autowired
    private SkillsService skillService;


    //1.查询技能表中的所有数据
    @ApiOperation(value = "所有技能列表")
    @GetMapping("/findAllSkills")
    public Result findAllSkills(){
        //调用service的方法实现查询所有的操作
        List<Skills> list = skillService.list(null);
        return Result.ok().data("items",list);

    }

    //2.删除技能的方法
    @ApiOperation(value = "根据id删技能")
    @GetMapping("{id}")
    public Result removeSkillById(@ApiParam(name = "id", value = "技能ID", required = true)@PathVariable Integer id){
        boolean flag = skillService.removeById(id);
        if(flag=true){
            return Result.ok();
        }else{
            return Result.error();
        }
    }


    //3.分页查询技能的方法
    @ApiOperation(value = "分页查询技能的方法")
    @GetMapping("/pageSkills/{current}/{limit}")
    public Result pageListSkills(@ApiParam(name = "current", value = "当前页", required = true)@PathVariable long current,@ApiParam(name = "limit", value = "每页记录数", required = true)@PathVariable long limit){
        //创建page对象
        Page<Skills> pageSkills=new Page<>(current,limit);
        //调用方法实现分页
        //调用方法的时候，底层封装，把分页所有数据封装到pageSkills对象里面
       skillService.page(pageSkills,null);
        long total = pageSkills.getTotal();//总记录数
        List<Skills> records = pageSkills.getRecords();//数据list集合
        /*
        写法二:
         Map map = new HashMap();
        map.put("total",total);
        map.put("rows",records);
        return Result.ok().data(map);

         */

        return Result.ok().data("total",total).data("rows",records);

    }

    //4.条件查询带分页的方法
    @ApiOperation(value = "条件查询带分页的方法")
    @GetMapping("/pageSkillsCondation/{current}/{limit}")
    public Result pageSkillsCondation(@ApiParam(name = "current", value = "当前页", required = true)
                                          @PathVariable long current,
                                      @ApiParam(name = "limit", value = "每页记录数", required = true)
                                      @PathVariable long limit,
                                      SkillQuery skillQuery){
        //创建page对象
        Page<Skills> pageSkills = new Page<>(current,limit);
        //构建条件
        QueryWrapper<Skills> wrapper = new QueryWrapper<>();
        //多条件组合查询
        //mybatis学过动态sql
        String name = skillQuery.getSkillName();
        String valuate = skillQuery.getSkillEvaluate();
        //判断条件值是否为空，如果不为空则拼接条件

        if(!StringUtils.isEmpty(name)){
            //构建条件
            wrapper.like("skill_name",name);
        }
        if(!StringUtils.isEmpty(valuate)){
            //构建条件
            wrapper.eq("skill_evaluate",valuate);

        }

        //调用方法实现条件查询分页
        skillService.page(pageSkills,wrapper);
        long total = pageSkills.getTotal();//总记录数
        int i=1/0;
        List<Skills> records = pageSkills.getRecords();//数据list集合
        return Result.ok().data("total",total).data("rows",records);

    }

    //5.添加技能的接口
    @ApiOperation(value = "添加技能的接口")
    @PostMapping("/addSkills")
    public Result addSkills(@ApiParam(name = "skill", value = "使用json传一个skills对象", required = true)@RequestBody Skills skills){
        boolean issave = skillService.save(skills);
        if(issave){
            return Result.ok();
        }else{
            return Result.error();
        }

    }
    //6.根据技能id进行查询
    @ApiOperation(value = "根据技能id进行查询")
    @GetMapping("/getSkillById/{id}")
    public Result getSkillById(@ApiParam(name = "id", value = "输入技能id", required = true)@PathVariable Integer id){
        Skills skill = skillService.getById(id);

        if(StringUtils.isEmpty(skill)){
            return Result.ok().data("msg","该id不存在！");
        }else{
            return Result.ok().data("skill",skill);
        }


    }

    //6.技能修改功能
    @ApiOperation(value = "根据技能id修改技能")
    @PostMapping("/updateSkill")
    public Result updateSkillById(@RequestBody Skills skill){
        boolean flag = skillService.updateById(skill);
        if(flag){
            return Result.ok();
        }else{
            return Result.ok();
        }
    }






}

