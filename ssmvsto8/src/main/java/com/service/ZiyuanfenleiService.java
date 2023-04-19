package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ZiyuanfenleiEntity;
import com.entity.view.ZiyuanfenleiView;
import com.entity.vo.ZiyuanfenleiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 资源分类
 *
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface ZiyuanfenleiService extends IService<ZiyuanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiyuanfenleiVO> selectListVO(Wrapper<ZiyuanfenleiEntity> wrapper);
   	
   	ZiyuanfenleiVO selectVO(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
   	
   	List<ZiyuanfenleiView> selectListView(Wrapper<ZiyuanfenleiEntity> wrapper);
   	
   	ZiyuanfenleiView selectView(@Param("ew") Wrapper<ZiyuanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuanfenleiEntity> wrapper);
   	
}

