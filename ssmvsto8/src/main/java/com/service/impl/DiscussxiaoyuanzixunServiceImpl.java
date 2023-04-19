package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.DiscussxiaoyuanzixunDao;
import com.entity.DiscussxiaoyuanzixunEntity;
import com.entity.view.DiscussxiaoyuanzixunView;
import com.entity.vo.DiscussxiaoyuanzixunVO;
import com.service.DiscussxiaoyuanzixunService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DiscussxiaoyuanzixunServiceImpl extends ServiceImpl<DiscussxiaoyuanzixunDao, DiscussxiaoyuanzixunEntity> implements DiscussxiaoyuanzixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxiaoyuanzixunEntity> page = this.selectPage(
                new Query<DiscussxiaoyuanzixunEntity>(params).getPage(),
                new EntityWrapper<DiscussxiaoyuanzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiaoyuanzixunEntity> wrapper) {
		  Page<DiscussxiaoyuanzixunView> page =new Query<DiscussxiaoyuanzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxiaoyuanzixunVO> selectListVO(Wrapper<DiscussxiaoyuanzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxiaoyuanzixunVO selectVO(Wrapper<DiscussxiaoyuanzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxiaoyuanzixunView> selectListView(Wrapper<DiscussxiaoyuanzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxiaoyuanzixunView selectView(Wrapper<DiscussxiaoyuanzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
