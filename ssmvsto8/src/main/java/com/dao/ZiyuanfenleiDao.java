package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ZiyuanfenleiEntity;
import com.entity.view.ZiyuanfenleiView;
import com.entity.vo.ZiyuanfenleiVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 资源分类
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface ZiyuanfenleiDao extends BaseMapper<ZiyuanfenleiEntity> {
	
	List<ZiyuanfenleiVO> selectListVO(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
	
	ZiyuanfenleiVO selectVO(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
	
	List<ZiyuanfenleiView> selectListView(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);

	List<ZiyuanfenleiView> selectListView(Pagination page, @Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
	
	ZiyuanfenleiView selectView(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
	
}
