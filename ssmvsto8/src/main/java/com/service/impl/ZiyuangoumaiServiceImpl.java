package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.ZiyuangoumaiDao;
import com.entity.ZiyuangoumaiEntity;
import com.entity.view.ZiyuangoumaiView;
import com.entity.vo.ZiyuangoumaiVO;
import com.service.ZiyuangoumaiService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ZiyuangoumaiServiceImpl extends ServiceImpl<ZiyuangoumaiDao, ZiyuangoumaiEntity> implements ZiyuangoumaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiyuangoumaiEntity> page = this.selectPage(
                new Query<ZiyuangoumaiEntity>(params).getPage(),
                new EntityWrapper<ZiyuangoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuangoumaiEntity> wrapper) {
		  Page<ZiyuangoumaiView> page =new Query<ZiyuangoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiyuangoumaiVO> selectListVO(Wrapper<ZiyuangoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiyuangoumaiVO selectVO(Wrapper<ZiyuangoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiyuangoumaiView> selectListView(Wrapper<ZiyuangoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiyuangoumaiView selectView(Wrapper<ZiyuangoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
