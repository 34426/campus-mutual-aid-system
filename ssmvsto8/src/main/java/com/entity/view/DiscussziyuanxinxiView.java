package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.DiscussziyuanxinxiEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 资源信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@TableName("discussziyuanxinxi")
public class DiscussziyuanxinxiView  extends DiscussziyuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussziyuanxinxiView(){
	}
 
 	public DiscussziyuanxinxiView(DiscussziyuanxinxiEntity discussziyuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussziyuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
