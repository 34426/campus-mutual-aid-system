package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XiaoyuanzixunEntity;
import com.entity.view.XiaoyuanzixunView;
import com.entity.vo.XiaoyuanzixunVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 校园资讯
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface XiaoyuanzixunDao extends BaseMapper<XiaoyuanzixunEntity> {
	
	List<XiaoyuanzixunVO> selectListVO(@Param("ew") Wrapper<XiaoyuanzixunEntity> wrapper);
	
	XiaoyuanzixunVO selectVO(@Param("ew") Wrapper<XiaoyuanzixunEntity> wrapper);
	
	List<XiaoyuanzixunView> selectListView(@Param("ew") Wrapper<XiaoyuanzixunEntity> wrapper);

	List<XiaoyuanzixunView> selectListView(Pagination page, @Param("ew") Wrapper<XiaoyuanzixunEntity> wrapper);
	
	XiaoyuanzixunView selectView(@Param("ew") Wrapper<XiaoyuanzixunEntity> wrapper);
	
}
