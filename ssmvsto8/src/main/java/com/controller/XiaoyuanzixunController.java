package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.XiaoyuanzixunEntity;
import com.entity.view.XiaoyuanzixunView;
import com.service.XiaoyuanzixunService;
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
 * 校园资讯
 * 后端接口
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@RestController
@RequestMapping("/xiaoyuanzixun")
public class XiaoyuanzixunController {
    @Autowired
    private XiaoyuanzixunService xiaoyuanzixunService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, XiaoyuanzixunEntity xiaoyuanzixun,
                  HttpServletRequest request){

        EntityWrapper<XiaoyuanzixunEntity> ew = new EntityWrapper<XiaoyuanzixunEntity>();
		PageUtils page = xiaoyuanzixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaoyuanzixun), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, XiaoyuanzixunEntity xiaoyuanzixun,
                  HttpServletRequest request){
        EntityWrapper<XiaoyuanzixunEntity> ew = new EntityWrapper<XiaoyuanzixunEntity>();
		PageUtils page = xiaoyuanzixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaoyuanzixun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(XiaoyuanzixunEntity xiaoyuanzixun){
       	EntityWrapper<XiaoyuanzixunEntity> ew = new EntityWrapper<XiaoyuanzixunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiaoyuanzixun, "xiaoyuanzixun")); 
        return R.ok().put("data", xiaoyuanzixunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiaoyuanzixunEntity xiaoyuanzixun){
        EntityWrapper<XiaoyuanzixunEntity> ew = new EntityWrapper<XiaoyuanzixunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiaoyuanzixun, "xiaoyuanzixun")); 
		XiaoyuanzixunView xiaoyuanzixunView =  xiaoyuanzixunService.selectView(ew);
		return R.ok("查询校园资讯成功").put("data", xiaoyuanzixunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiaoyuanzixunEntity xiaoyuanzixun = xiaoyuanzixunService.selectById(id);
        return R.ok().put("data", xiaoyuanzixun);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiaoyuanzixunEntity xiaoyuanzixun = xiaoyuanzixunService.selectById(id);
        return R.ok().put("data", xiaoyuanzixun);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiaoyuanzixunEntity xiaoyuanzixun, HttpServletRequest request){
    	xiaoyuanzixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaoyuanzixun);

        xiaoyuanzixunService.insert(xiaoyuanzixun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiaoyuanzixunEntity xiaoyuanzixun, HttpServletRequest request){
    	xiaoyuanzixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaoyuanzixun);

        xiaoyuanzixunService.insert(xiaoyuanzixun);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XiaoyuanzixunEntity xiaoyuanzixun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiaoyuanzixun);
        xiaoyuanzixunService.updateById(xiaoyuanzixun);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiaoyuanzixunService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XiaoyuanzixunEntity> wrapper = new EntityWrapper<XiaoyuanzixunEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = xiaoyuanzixunService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
