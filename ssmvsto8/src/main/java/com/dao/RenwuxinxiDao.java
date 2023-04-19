package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.RenwuxinxiEntity;
import com.entity.view.RenwuxinxiView;
import com.entity.vo.RenwuxinxiVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 任务信息
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface RenwuxinxiDao extends BaseMapper<RenwuxinxiEntity> {
	
	List<RenwuxinxiVO> selectListVO(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
	RenwuxinxiVO selectVO(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
	List<RenwuxinxiView> selectListView(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);

	List<RenwuxinxiView> selectListView(Pagination page, @Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
	RenwuxinxiView selectView(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
}
