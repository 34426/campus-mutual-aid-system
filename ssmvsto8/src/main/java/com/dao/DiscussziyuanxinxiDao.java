package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DiscussziyuanxinxiEntity;
import com.entity.view.DiscussziyuanxinxiView;
import com.entity.vo.DiscussziyuanxinxiVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 资源信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@Mapper
public interface DiscussziyuanxinxiDao extends BaseMapper<DiscussziyuanxinxiEntity> {
	
	List<DiscussziyuanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);
	
	DiscussziyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);
	
	List<DiscussziyuanxinxiView> selectListView(@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);

	List<DiscussziyuanxinxiView> selectListView(Pagination page, @Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);
	
	DiscussziyuanxinxiView selectView(@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);
	
}
