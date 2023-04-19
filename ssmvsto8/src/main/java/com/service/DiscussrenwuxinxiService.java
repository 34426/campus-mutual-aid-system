package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.DiscussrenwuxinxiEntity;
import com.entity.view.DiscussrenwuxinxiView;
import com.entity.vo.DiscussrenwuxinxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 任务信息评论表
 *
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface DiscussrenwuxinxiService extends IService<DiscussrenwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussrenwuxinxiVO> selectListVO(Wrapper<DiscussrenwuxinxiEntity> wrapper);
   	
   	DiscussrenwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
   	
   	List<DiscussrenwuxinxiView> selectListView(Wrapper<DiscussrenwuxinxiEntity> wrapper);
   	
   	DiscussrenwuxinxiView selectView(@Param("ew") Wrapper<DiscussrenwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussrenwuxinxiEntity> wrapper);
   	
}

