
package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.entity.ConfigEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 配置
 */
@Mapper
public interface ConfigDao extends BaseMapper<ConfigEntity> {
	
}
