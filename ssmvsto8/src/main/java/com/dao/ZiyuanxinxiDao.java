package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ZiyuanxinxiEntity;
import com.entity.view.ZiyuanxinxiView;
import com.entity.vo.ZiyuanxinxiVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 资源信息
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface ZiyuanxinxiDao extends BaseMapper<ZiyuanxinxiEntity> {
	
	List<ZiyuanxinxiVO> selectListVO(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
	
	ZiyuanxinxiVO selectVO(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
	
	List<ZiyuanxinxiView> selectListView(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);

	List<ZiyuanxinxiView> selectListView(Pagination page, @Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
	
	ZiyuanxinxiView selectView(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
	
}
