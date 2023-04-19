package com.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.RenwulingquEntity;
import com.entity.view.RenwulingquView;
import com.service.RenwulingquService;
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
 * 任务领取
 * 后端接口
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@RestController
@RequestMapping("/renwulingqu")
public class RenwulingquController {
    @Autowired
    private RenwulingquService renwulingquService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, RenwulingquEntity renwulingqu,
                  HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuzhe")) {
			renwulingqu.setFabuzhezhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			renwulingqu.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RenwulingquEntity> ew = new EntityWrapper<RenwulingquEntity>();
		PageUtils page = renwulingquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwulingqu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, RenwulingquEntity renwulingqu,
                  HttpServletRequest request){
        EntityWrapper<RenwulingquEntity> ew = new EntityWrapper<RenwulingquEntity>();
		PageUtils page = renwulingquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwulingqu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RenwulingquEntity renwulingqu){
       	EntityWrapper<RenwulingquEntity> ew = new EntityWrapper<RenwulingquEntity>();
      	ew.allEq(MPUtil.allEQMapPre( renwulingqu, "renwulingqu")); 
        return R.ok().put("data", renwulingquService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RenwulingquEntity renwulingqu){
        EntityWrapper< RenwulingquEntity> ew = new EntityWrapper< RenwulingquEntity>();
 		ew.allEq(MPUtil.allEQMapPre( renwulingqu, "renwulingqu")); 
		RenwulingquView renwulingquView =  renwulingquService.selectView(ew);
		return R.ok("查询任务领取成功").put("data", renwulingquView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RenwulingquEntity renwulingqu = renwulingquService.selectById(id);
        return R.ok().put("data", renwulingqu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RenwulingquEntity renwulingqu = renwulingquService.selectById(id);
        return R.ok().put("data", renwulingqu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RenwulingquEntity renwulingqu, HttpServletRequest request){
    	renwulingqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(renwulingqu);

        renwulingquService.insert(renwulingqu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RenwulingquEntity renwulingqu, HttpServletRequest request){
    	renwulingqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(renwulingqu);

        renwulingquService.insert(renwulingqu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RenwulingquEntity renwulingqu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(renwulingqu);
        renwulingquService.updateById(renwulingqu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        renwulingquService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<RenwulingquEntity> wrapper = new EntityWrapper<RenwulingquEntity>();
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
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = renwulingquService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
