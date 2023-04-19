package com.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.ZiyuanfenleiEntity;
import com.entity.view.ZiyuanfenleiView;
import com.service.ZiyuanfenleiService;
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
 * 资源分类
 * 后端接口
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@RestController
@RequestMapping("/ziyuanfenlei")
public class ZiyuanfenleiController {
    @Autowired
    private ZiyuanfenleiService ziyuanfenleiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, ZiyuanfenleiEntity ziyuanfenlei,
                  HttpServletRequest request){

        EntityWrapper<ZiyuanfenleiEntity> ew = new EntityWrapper<ZiyuanfenleiEntity>();
		PageUtils page = ziyuanfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziyuanfenlei), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, ZiyuanfenleiEntity ziyuanfenlei,
                  HttpServletRequest request){
        EntityWrapper<ZiyuanfenleiEntity> ew = new EntityWrapper<ZiyuanfenleiEntity>();
		PageUtils page = ziyuanfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziyuanfenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZiyuanfenleiEntity ziyuanfenlei){
       	EntityWrapper<ZiyuanfenleiEntity> ew = new EntityWrapper<ZiyuanfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ziyuanfenlei, "ziyuanfenlei")); 
        return R.ok().put("data", ziyuanfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZiyuanfenleiEntity ziyuanfenlei){
        EntityWrapper<ZiyuanfenleiEntity> ew = new EntityWrapper<ZiyuanfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ziyuanfenlei, "ziyuanfenlei")); 
		ZiyuanfenleiView ziyuanfenleiView =  ziyuanfenleiService.selectView(ew);
		return R.ok("查询资源分类成功").put("data", ziyuanfenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZiyuanfenleiEntity ziyuanfenlei = ziyuanfenleiService.selectById(id);
        return R.ok().put("data", ziyuanfenlei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZiyuanfenleiEntity ziyuanfenlei = ziyuanfenleiService.selectById(id);
        return R.ok().put("data", ziyuanfenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZiyuanfenleiEntity ziyuanfenlei, HttpServletRequest request){
    	ziyuanfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ziyuanfenlei);

        ziyuanfenleiService.insert(ziyuanfenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZiyuanfenleiEntity ziyuanfenlei, HttpServletRequest request){
    	ziyuanfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ziyuanfenlei);

        ziyuanfenleiService.insert(ziyuanfenlei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZiyuanfenleiEntity ziyuanfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ziyuanfenlei);
        ziyuanfenleiService.updateById(ziyuanfenlei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ziyuanfenleiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZiyuanfenleiEntity> wrapper = new EntityWrapper<ZiyuanfenleiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = ziyuanfenleiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
