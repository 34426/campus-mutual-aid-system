package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ZiyuangoumaiEntity;
import com.entity.view.ZiyuangoumaiView;
import com.entity.vo.ZiyuangoumaiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 资源购买
 *
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface ZiyuangoumaiService extends IService<ZiyuangoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiyuangoumaiVO> selectListVO(Wrapper<ZiyuangoumaiEntity> wrapper);
   	
   	ZiyuangoumaiVO selectVO(@Param("ew") Wrapper<ZiyuangoumaiEntity> wrapper);
   	
   	List<ZiyuangoumaiView> selectListView(Wrapper<ZiyuangoumaiEntity> wrapper);
   	
   	ZiyuangoumaiView selectView(@Param("ew") Wrapper<ZiyuangoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuangoumaiEntity> wrapper);
   	
}

