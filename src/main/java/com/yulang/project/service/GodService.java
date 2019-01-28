package com.yulang.project.service;

import com.yulang.project.entity.God;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yulang
 * @since 2019-01-28
 */
public interface GodService extends IService<God> {
    public List<God> selectId();
}
