package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.DiscussxiaoyuanzixunEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 校园资讯评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@TableName("discussxiaoyuanzixun")
public class DiscussxiaoyuanzixunView  extends DiscussxiaoyuanzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxiaoyuanzixunView(){
	}
 
 	public DiscussxiaoyuanzixunView(DiscussxiaoyuanzixunEntity discussxiaoyuanzixunEntity){
 	try {
			BeanUtils.copyProperties(this, discussxiaoyuanzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
