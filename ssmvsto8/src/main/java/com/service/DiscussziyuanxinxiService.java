package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.DiscussziyuanxinxiEntity;
import com.entity.view.DiscussziyuanxinxiView;
import com.entity.vo.DiscussziyuanxinxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 资源信息评论表
 *
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface DiscussziyuanxinxiService extends IService<DiscussziyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussziyuanxinxiVO> selectListVO(Wrapper<DiscussziyuanxinxiEntity> wrapper);
   	
   	DiscussziyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);
   	
   	List<DiscussziyuanxinxiView> selectListView(Wrapper<DiscussziyuanxinxiEntity> wrapper);
   	
   	DiscussziyuanxinxiView selectView(@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussziyuanxinxiEntity> wrapper);
   	
}

