package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.ZiyuanxinxiEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 资源信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@TableName("ziyuanxinxi")
public class ZiyuanxinxiView  extends ZiyuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZiyuanxinxiView(){
	}
 
 	public ZiyuanxinxiView(ZiyuanxinxiEntity ziyuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, ziyuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
