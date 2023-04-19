package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.ZiyuanxinxiEntity;
import com.entity.view.ZiyuanxinxiView;
import com.service.ZiyuanxinxiService;
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
 * 资源信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@RestController
@RequestMapping("/ziyuanxinxi")
public class ZiyuanxinxiController {
    @Autowired
    private ZiyuanxinxiService ziyuanxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, ZiyuanxinxiEntity ziyuanxinxi,
                  HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuzhe")) {
			ziyuanxinxi.setFabuzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZiyuanxinxiEntity> ew = new EntityWrapper<ZiyuanxinxiEntity>();
		PageUtils page = ziyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziyuanxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, ZiyuanxinxiEntity ziyuanxinxi,
                  HttpServletRequest request){
        EntityWrapper<ZiyuanxinxiEntity> ew = new EntityWrapper<ZiyuanxinxiEntity>();
		PageUtils page = ziyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziyuanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(ZiyuanxinxiEntity ziyuanxinxi){
       	EntityWrapper<ZiyuanxinxiEntity> ew = new EntityWrapper<ZiyuanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ziyuanxinxi, "ziyuanxinxi")); 
        return R.ok().put("data", ziyuanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZiyuanxinxiEntity ziyuanxinxi){
        EntityWrapper< ZiyuanxinxiEntity> ew = new EntityWrapper< ZiyuanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ziyuanxinxi, "ziyuanxinxi")); 
		ZiyuanxinxiView ziyuanxinxiView =  ziyuanxinxiService.selectView(ew);
		return R.ok("查询资源信息成功").put("data", ziyuanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZiyuanxinxiEntity ziyuanxinxi = ziyuanxinxiService.selectById(id);
        return R.ok().put("data", ziyuanxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZiyuanxinxiEntity ziyuanxinxi = ziyuanxinxiService.selectById(id);
        return R.ok().put("data", ziyuanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZiyuanxinxiEntity ziyuanxinxi, HttpServletRequest request){
    	ziyuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ziyuanxinxi);

        ziyuanxinxiService.insert(ziyuanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZiyuanxinxiEntity ziyuanxinxi, HttpServletRequest request){
    	ziyuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ziyuanxinxi);

        ziyuanxinxiService.insert(ziyuanxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZiyuanxinxiEntity ziyuanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ziyuanxinxi);
        ziyuanxinxiService.updateById(ziyuanxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ziyuanxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZiyuanxinxiEntity> wrapper = new EntityWrapper<ZiyuanxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuzhe")) {
			wrapper.eq("fabuzhezhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = ziyuanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
