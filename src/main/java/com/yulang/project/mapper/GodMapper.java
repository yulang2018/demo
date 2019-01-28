package com.yulang.project.mapper;

import com.yulang.project.entity.God;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yulang
 * @since 2019-01-28
 */
@Mapper
public interface GodMapper extends BaseMapper<God> {

    public List<God> selectId();

}
