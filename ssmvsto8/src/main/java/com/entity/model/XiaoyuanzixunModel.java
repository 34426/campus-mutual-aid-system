package com.entity.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 校园资讯
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public class XiaoyuanzixunModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 资讯简介
	 */
	
	private String zixunjianjie;
		
	/**
	 * 资讯内容
	 */
	
	private String zixunneirong;
		
	/**
	 * 编辑
	 */
	
	private String bianji;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date fabushijian;
		
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：资讯简介
	 */
	 
	public void setZixunjianjie(String zixunjianjie) {
		this.zixunjianjie = zixunjianjie;
	}
	
	/**
	 * 获取：资讯简介
	 */
	public String getZixunjianjie() {
		return zixunjianjie;
	}
				
	
	/**
	 * 设置：资讯内容
	 */
	 
	public void setZixunneirong(String zixunneirong) {
		this.zixunneirong = zixunneirong;
	}
	
	/**
	 * 获取：资讯内容
	 */
	public String getZixunneirong() {
		return zixunneirong;
	}
				
	
	/**
	 * 设置：编辑
	 */
	 
	public void setBianji(String bianji) {
		this.bianji = bianji;
	}
	
	/**
	 * 获取：编辑
	 */
	public String getBianji() {
		return bianji;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
			
}
