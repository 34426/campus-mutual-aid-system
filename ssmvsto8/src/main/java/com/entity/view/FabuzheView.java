package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.FabuzheEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 发布者
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@TableName("fabuzhe")
public class FabuzheView  extends FabuzheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FabuzheView(){
	}
 
 	public FabuzheView(FabuzheEntity fabuzheEntity){
 	try {
			BeanUtils.copyProperties(this, fabuzheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
