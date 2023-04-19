package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.RenwulingquEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 任务领取
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@TableName("renwulingqu")
public class RenwulingquView  extends RenwulingquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenwulingquView(){
	}
 
 	public RenwulingquView(RenwulingquEntity renwulingquEntity){
 	try {
			BeanUtils.copyProperties(this, renwulingquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
