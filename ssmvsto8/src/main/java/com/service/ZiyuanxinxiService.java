package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ZiyuanxinxiEntity;
import com.entity.view.ZiyuanxinxiView;
import com.entity.vo.ZiyuanxinxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 资源信息
 *
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface ZiyuanxinxiService extends IService<ZiyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiyuanxinxiVO> selectListVO(Wrapper<ZiyuanxinxiEntity> wrapper);
   	
   	ZiyuanxinxiVO selectVO(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
   	
   	List<ZiyuanxinxiView> selectListView(Wrapper<ZiyuanxinxiEntity> wrapper);
   	
   	ZiyuanxinxiView selectView(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuanxinxiEntity> wrapper);
   	
}

