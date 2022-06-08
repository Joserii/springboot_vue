package com.example.controller;

import com.example.common.Result;
import com.example.entity.Fund;
import com.example.service.FundService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController // 返回json格式
@RequestMapping("/fund")  // 设置路由
public class FundController {

    @Resource
    private FundService fundService;

    // 新增基金
    @PostMapping
    public Result add(@RequestBody Fund fund) {
        fundService.save(fund);
        return Result.success();
    }

    // 修改基金
    @PutMapping
    public Result update(@RequestBody Fund fund) {
        fundService.save(fund);
        return Result.success();
    }

    // 删除基金
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        fundService.delete(id);
        return Result.success();
    }

    // 根据id查询用户
    @GetMapping("/{id}")
    public Result<Fund> findById(@PathVariable Long id) {
        return Result.success(fundService.findById(id));
    }

    // 分页查询用户
    @GetMapping("/page")
    public Result<Page<Fund>> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "10") Integer pageSize,
                                       @RequestParam(required = false) String name) {
        return Result.success(fundService.findPage(pageNum, pageSize, name));
    }

}
