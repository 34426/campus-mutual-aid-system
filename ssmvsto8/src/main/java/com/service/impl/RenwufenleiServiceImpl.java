package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.RenwufenleiDao;
import com.entity.RenwufenleiEntity;
import com.entity.view.RenwufenleiView;
import com.entity.vo.RenwufenleiVO;
import com.service.RenwufenleiService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RenwufenleiServiceImpl extends ServiceImpl<RenwufenleiDao, RenwufenleiEntity> implements RenwufenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwufenleiEntity> page = this.selectPage(
                new Query<RenwufenleiEntity>(params).getPage(),
                new EntityWrapper<RenwufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwufenleiEntity> wrapper) {
		  Page<RenwufenleiView> page =new Query<RenwufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwufenleiVO> selectListVO(Wrapper<RenwufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwufenleiVO selectVO(Wrapper<RenwufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwufenleiView> selectListView(Wrapper<RenwufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwufenleiView selectView(Wrapper<RenwufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
