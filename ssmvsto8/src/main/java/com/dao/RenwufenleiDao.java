package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.RenwufenleiEntity;
import com.entity.view.RenwufenleiView;
import com.entity.vo.RenwufenleiVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 任务分类
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface RenwufenleiDao extends BaseMapper<RenwufenleiEntity> {
	
	List<RenwufenleiVO> selectListVO(@Param("ew") Wrapper<RenwufenleiEntity> wrapper);
	
	RenwufenleiVO selectVO(@Param("ew") Wrapper<RenwufenleiEntity> wrapper);
	
	List<RenwufenleiView> selectListView(@Param("ew") Wrapper<RenwufenleiEntity> wrapper);

	List<RenwufenleiView> selectListView(Pagination page, @Param("ew") Wrapper<RenwufenleiEntity> wrapper);
	
	RenwufenleiView selectView(@Param("ew") Wrapper<RenwufenleiEntity> wrapper);
	
}
