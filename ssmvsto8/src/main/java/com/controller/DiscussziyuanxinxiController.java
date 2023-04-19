package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.DiscussziyuanxinxiEntity;
import com.entity.view.DiscussziyuanxinxiView;
import com.service.DiscussziyuanxinxiService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;


/**
 * 资源信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@RestController
@RequestMapping("/discussziyuanxinxi")
public class DiscussziyuanxinxiController {
    @Autowired
    private DiscussziyuanxinxiService discussziyuanxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, DiscussziyuanxinxiEntity discussziyuanxinxi,
                  HttpServletRequest request){

        EntityWrapper<DiscussziyuanxinxiEntity> ew = new EntityWrapper<DiscussziyuanxinxiEntity>();
		PageUtils page = discussziyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussziyuanxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, DiscussziyuanxinxiEntity discussziyuanxinxi,
                  HttpServletRequest request){
        EntityWrapper<DiscussziyuanxinxiEntity> ew = new EntityWrapper<DiscussziyuanxinxiEntity>();
		PageUtils page = discussziyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussziyuanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(DiscussziyuanxinxiEntity discussziyuanxinxi){
       	EntityWrapper<DiscussziyuanxinxiEntity> ew = new EntityWrapper<DiscussziyuanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussziyuanxinxi, "discussziyuanxinxi")); 
        return R.ok().put("data", discussziyuanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussziyuanxinxiEntity discussziyuanxinxi){
        EntityWrapper<DiscussziyuanxinxiEntity> ew = new EntityWrapper<DiscussziyuanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussziyuanxinxi, "discussziyuanxinxi")); 
		DiscussziyuanxinxiView discussziyuanxinxiView =  discussziyuanxinxiService.selectView(ew);
		return R.ok("查询资源信息评论表成功").put("data", discussziyuanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussziyuanxinxiEntity discussziyuanxinxi = discussziyuanxinxiService.selectById(id);
        return R.ok().put("data", discussziyuanxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussziyuanxinxiEntity discussziyuanxinxi = discussziyuanxinxiService.selectById(id);
        return R.ok().put("data", discussziyuanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussziyuanxinxiEntity discussziyuanxinxi, HttpServletRequest request){
    	discussziyuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussziyuanxinxi);

        discussziyuanxinxiService.insert(discussziyuanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussziyuanxinxiEntity discussziyuanxinxi, HttpServletRequest request){
    	discussziyuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussziyuanxinxi);

        discussziyuanxinxiService.insert(discussziyuanxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussziyuanxinxiEntity discussziyuanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussziyuanxinxi);
        discussziyuanxinxiService.updateById(discussziyuanxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussziyuanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request,
                         @PathVariable("type") String type, @RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussziyuanxinxiEntity> wrapper = new EntityWrapper<DiscussziyuanxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussziyuanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
