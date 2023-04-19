package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.DiscussxiaoyuanzixunEntity;
import com.entity.view.DiscussxiaoyuanzixunView;
import com.entity.vo.DiscussxiaoyuanzixunVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 校园资讯评论表
 *
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface DiscussxiaoyuanzixunService extends IService<DiscussxiaoyuanzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxiaoyuanzixunVO> selectListVO(Wrapper<DiscussxiaoyuanzixunEntity> wrapper);
   	
   	DiscussxiaoyuanzixunVO selectVO(@Param("ew") Wrapper<DiscussxiaoyuanzixunEntity> wrapper);
   	
   	List<DiscussxiaoyuanzixunView> selectListView(Wrapper<DiscussxiaoyuanzixunEntity> wrapper);
   	
   	DiscussxiaoyuanzixunView selectView(@Param("ew") Wrapper<DiscussxiaoyuanzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiaoyuanzixunEntity> wrapper);
   	
}

