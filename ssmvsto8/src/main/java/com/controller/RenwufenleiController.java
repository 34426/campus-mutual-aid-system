package com.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.RenwufenleiEntity;
import com.entity.view.RenwufenleiView;
import com.service.RenwufenleiService;
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
 * 任务分类
 * 后端接口
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@RestController
@RequestMapping("/renwufenlei")
public class RenwufenleiController {
    @Autowired
    private RenwufenleiService renwufenleiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, RenwufenleiEntity renwufenlei,
                  HttpServletRequest request){

        EntityWrapper<RenwufenleiEntity> ew = new EntityWrapper<RenwufenleiEntity>();
		PageUtils page = renwufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwufenlei), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, RenwufenleiEntity renwufenlei,
                  HttpServletRequest request){
        EntityWrapper<RenwufenleiEntity> ew = new EntityWrapper<RenwufenleiEntity>();
		PageUtils page = renwufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwufenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RenwufenleiEntity renwufenlei){
       	EntityWrapper<RenwufenleiEntity> ew = new EntityWrapper<RenwufenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( renwufenlei, "renwufenlei")); 
        return R.ok().put("data", renwufenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RenwufenleiEntity renwufenlei){
        EntityWrapper< RenwufenleiEntity> ew = new EntityWrapper< RenwufenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( renwufenlei, "renwufenlei")); 
		RenwufenleiView renwufenleiView =  renwufenleiService.selectView(ew);
		return R.ok("查询任务分类成功").put("data", renwufenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RenwufenleiEntity renwufenlei = renwufenleiService.selectById(id);
        return R.ok().put("data", renwufenlei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RenwufenleiEntity renwufenlei = renwufenleiService.selectById(id);
        return R.ok().put("data", renwufenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RenwufenleiEntity renwufenlei, HttpServletRequest request){
    	renwufenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(renwufenlei);

        renwufenleiService.insert(renwufenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RenwufenleiEntity renwufenlei, HttpServletRequest request){
    	renwufenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(renwufenlei);

        renwufenleiService.insert(renwufenlei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RenwufenleiEntity renwufenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(renwufenlei);
        renwufenleiService.updateById(renwufenlei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        renwufenleiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<RenwufenleiEntity> wrapper = new EntityWrapper<RenwufenleiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = renwufenleiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
