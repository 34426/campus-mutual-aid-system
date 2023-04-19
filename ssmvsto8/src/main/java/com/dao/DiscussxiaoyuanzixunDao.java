package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DiscussxiaoyuanzixunEntity;
import com.entity.view.DiscussxiaoyuanzixunView;
import com.entity.vo.DiscussxiaoyuanzixunVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 校园资讯评论表
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface DiscussxiaoyuanzixunDao extends BaseMapper<DiscussxiaoyuanzixunEntity> {
	
	List<DiscussxiaoyuanzixunVO> selectListVO(@Param("ew") Wrapper<DiscussxiaoyuanzixunEntity> wrapper);
	
	DiscussxiaoyuanzixunVO selectVO(@Param("ew") Wrapper<DiscussxiaoyuanzixunEntity> wrapper);
	
	List<DiscussxiaoyuanzixunView> selectListView(@Param("ew") Wrapper<DiscussxiaoyuanzixunEntity> wrapper);

	List<DiscussxiaoyuanzixunView> selectListView(Pagination page, @Param("ew") Wrapper<DiscussxiaoyuanzixunEntity> wrapper);
	
	DiscussxiaoyuanzixunView selectView(@Param("ew") Wrapper<DiscussxiaoyuanzixunEntity> wrapper);
	
}
