package com.yulang.project.controller;


import com.yulang.project.entity.God;
import com.yulang.project.service.GodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yulang
 * @since 2019-01-28
 */
@RestController
@RequestMapping("/god")
public class GodController {

    @Autowired
    private GodService godService;

    @RequestMapping("/list")
    public List<God> selectId(){
        return godService.selectId();
    }

}

