package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DiscussrenwuxinxiEntity;
import com.entity.view.DiscussrenwuxinxiView;
import com.entity.vo.DiscussrenwuxinxiVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 任务信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface DiscussrenwuxinxiDao extends BaseMapper<DiscussrenwuxinxiEntity> {
	
	List<DiscussrenwuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
	
	DiscussrenwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
	
	List<DiscussrenwuxinxiView> selectListView(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);

	List<DiscussrenwuxinxiView> selectListView(Pagination page, @Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
	
	DiscussrenwuxinxiView selectView(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
	
}
