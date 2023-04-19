package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.XueshengEntity;
import com.entity.view.XueshengView;
import com.entity.vo.XueshengVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 学生
 *
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface XueshengService extends IService<XueshengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengVO> selectListVO(Wrapper<XueshengEntity> wrapper);
   	
   	XueshengVO selectVO(@Param("ew") Wrapper<XueshengEntity> wrapper);
   	
   	List<XueshengView> selectListView(Wrapper<XueshengEntity> wrapper);
   	
   	XueshengView selectView(@Param("ew") Wrapper<XueshengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengEntity> wrapper);
   	
}

