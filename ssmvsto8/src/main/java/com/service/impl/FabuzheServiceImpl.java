package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.FabuzheDao;
import com.entity.FabuzheEntity;
import com.entity.view.FabuzheView;
import com.entity.vo.FabuzheVO;
import com.service.FabuzheService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FabuzheServiceImpl extends ServiceImpl<FabuzheDao, FabuzheEntity> implements FabuzheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FabuzheEntity> page = this.selectPage(
                new Query<FabuzheEntity>(params).getPage(),
                new EntityWrapper<FabuzheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FabuzheEntity> wrapper) {
		  Page<FabuzheView> page =new Query<FabuzheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FabuzheVO> selectListVO(Wrapper<FabuzheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FabuzheVO selectVO(Wrapper<FabuzheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FabuzheView> selectListView(Wrapper<FabuzheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FabuzheView selectView(Wrapper<FabuzheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
