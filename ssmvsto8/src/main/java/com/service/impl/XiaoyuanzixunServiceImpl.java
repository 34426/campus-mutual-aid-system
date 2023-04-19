package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.XiaoyuanzixunDao;
import com.entity.XiaoyuanzixunEntity;
import com.entity.view.XiaoyuanzixunView;
import com.entity.vo.XiaoyuanzixunVO;
import com.service.XiaoyuanzixunService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class XiaoyuanzixunServiceImpl extends ServiceImpl<XiaoyuanzixunDao, XiaoyuanzixunEntity> implements XiaoyuanzixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuanzixunEntity> page = this.selectPage(
                new Query<XiaoyuanzixunEntity>(params).getPage(),
                new EntityWrapper<XiaoyuanzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuanzixunEntity> wrapper) {
		  Page<XiaoyuanzixunView> page =new Query<XiaoyuanzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuanzixunVO> selectListVO(Wrapper<XiaoyuanzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuanzixunVO selectVO(Wrapper<XiaoyuanzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuanzixunView> selectListView(Wrapper<XiaoyuanzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuanzixunView selectView(Wrapper<XiaoyuanzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
