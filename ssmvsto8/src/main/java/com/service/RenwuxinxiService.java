package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.RenwuxinxiEntity;
import com.entity.view.RenwuxinxiView;
import com.entity.vo.RenwuxinxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 任务信息
 *
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface RenwuxinxiService extends IService<RenwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwuxinxiVO> selectListVO(Wrapper<RenwuxinxiEntity> wrapper);
   	
   	RenwuxinxiVO selectVO(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
   	
   	List<RenwuxinxiView> selectListView(Wrapper<RenwuxinxiEntity> wrapper);
   	
   	RenwuxinxiView selectView(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<RenwuxinxiEntity> wrapper);
   	
}

