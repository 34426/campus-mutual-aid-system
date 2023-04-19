package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.RenwufenleiEntity;
import com.entity.view.RenwufenleiView;
import com.entity.vo.RenwufenleiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 任务分类
 *
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface RenwufenleiService extends IService<RenwufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwufenleiVO> selectListVO(Wrapper<RenwufenleiEntity> wrapper);
   	
   	RenwufenleiVO selectVO(@Param("ew") Wrapper<RenwufenleiEntity> wrapper);
   	
   	List<RenwufenleiView> selectListView(Wrapper<RenwufenleiEntity> wrapper);
   	
   	RenwufenleiView selectView(@Param("ew") Wrapper<RenwufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<RenwufenleiEntity> wrapper);
   	
}

