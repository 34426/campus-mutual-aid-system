package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XueshengEntity;
import com.entity.view.XueshengView;
import com.entity.vo.XueshengVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 学生
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface XueshengDao extends BaseMapper<XueshengEntity> {
	
	List<XueshengVO> selectListVO(@Param("ew") Wrapper<XueshengEntity> wrapper);
	
	XueshengVO selectVO(@Param("ew") Wrapper<XueshengEntity> wrapper);
	
	List<XueshengView> selectListView(@Param("ew") Wrapper<XueshengEntity> wrapper);

	List<XueshengView> selectListView(Pagination page, @Param("ew") Wrapper<XueshengEntity> wrapper);
	
	XueshengView selectView(@Param("ew") Wrapper<XueshengEntity> wrapper);
	
}
