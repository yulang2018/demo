package com.yulang.project.service.impl;

import com.yulang.project.entity.God;
import com.yulang.project.mapper.GodMapper;
import com.yulang.project.service.GodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yulang
 * @since 2019-01-28
 */
@Service
public class GodServiceImpl extends ServiceImpl<GodMapper, God> implements GodService {

    @Autowired
    private GodMapper godMapper;

    @Override
    public List<God> selectId() {
        return godMapper.selectId();
    }
}
