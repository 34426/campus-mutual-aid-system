package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.FabuzheEntity;
import com.entity.view.FabuzheView;
import com.entity.vo.FabuzheVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 发布者
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface FabuzheDao extends BaseMapper<FabuzheEntity> {
	
	List<FabuzheVO> selectListVO(@Param("ew") Wrapper<FabuzheEntity> wrapper);
	
	FabuzheVO selectVO(@Param("ew") Wrapper<FabuzheEntity> wrapper);
	
	List<FabuzheView> selectListView(@Param("ew") Wrapper<FabuzheEntity> wrapper);

	List<FabuzheView> selectListView(Pagination page, @Param("ew") Wrapper<FabuzheEntity> wrapper);
	
	FabuzheView selectView(@Param("ew") Wrapper<FabuzheEntity> wrapper);
	
}
