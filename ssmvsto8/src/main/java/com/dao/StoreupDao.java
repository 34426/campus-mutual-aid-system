package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.StoreupEntity;
import com.entity.view.StoreupView;
import com.entity.vo.StoreupVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 收藏表
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface StoreupDao extends BaseMapper<StoreupEntity> {
	
	List<StoreupVO> selectListVO(@Param("ew") Wrapper<StoreupEntity> wrapper);
	
	StoreupVO selectVO(@Param("ew") Wrapper<StoreupEntity> wrapper);
	
	List<StoreupView> selectListView(@Param("ew") Wrapper<StoreupEntity> wrapper);

	List<StoreupView> selectListView(Pagination page, @Param("ew") Wrapper<StoreupEntity> wrapper);
	
	StoreupView selectView(@Param("ew") Wrapper<StoreupEntity> wrapper);
	
}
