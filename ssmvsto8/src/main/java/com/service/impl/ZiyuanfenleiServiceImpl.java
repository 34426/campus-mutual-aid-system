package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.ZiyuanfenleiDao;
import com.entity.ZiyuanfenleiEntity;
import com.entity.view.ZiyuanfenleiView;
import com.entity.vo.ZiyuanfenleiVO;
import com.service.ZiyuanfenleiService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ZiyuanfenleiServiceImpl extends ServiceImpl<ZiyuanfenleiDao, ZiyuanfenleiEntity> implements ZiyuanfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiyuanfenleiEntity> page = this.selectPage(
                new Query<ZiyuanfenleiEntity>(params).getPage(),
                new EntityWrapper<ZiyuanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuanfenleiEntity> wrapper) {
		  Page<ZiyuanfenleiView> page =new Query<ZiyuanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiyuanfenleiVO> selectListVO(Wrapper<ZiyuanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiyuanfenleiVO selectVO(Wrapper<ZiyuanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiyuanfenleiView> selectListView(Wrapper<ZiyuanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiyuanfenleiView selectView(Wrapper<ZiyuanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
