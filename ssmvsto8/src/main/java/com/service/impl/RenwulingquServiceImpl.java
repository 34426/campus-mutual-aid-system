package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.RenwulingquDao;
import com.entity.RenwulingquEntity;
import com.entity.view.RenwulingquView;
import com.entity.vo.RenwulingquVO;
import com.service.RenwulingquService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RenwulingquServiceImpl extends ServiceImpl<RenwulingquDao, RenwulingquEntity> implements RenwulingquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwulingquEntity> page = this.selectPage(
                new Query<RenwulingquEntity>(params).getPage(),
                new EntityWrapper<RenwulingquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwulingquEntity> wrapper) {
		  Page<RenwulingquView> page =new Query<RenwulingquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwulingquVO> selectListVO(Wrapper<RenwulingquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwulingquVO selectVO(Wrapper<RenwulingquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwulingquView> selectListView(Wrapper<RenwulingquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwulingquView selectView(Wrapper<RenwulingquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
