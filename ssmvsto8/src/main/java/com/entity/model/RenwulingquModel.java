package com.entity.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 任务领取
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public class RenwulingquModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 任务类型
	 */
	
	private String renwuleixing;
		
	/**
	 * 任务赏金
	 */
	
	private Integer renwushangjin;
		
	/**
	 * 领取日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date lingquriqi;
		
	/**
	 * 完成情况
	 */
	
	private String wanchengqingkuang;
		
	/**
	 * 完成内容
	 */
	
	private String wanchengneirong;
		
	/**
	 * 发布者账号
	 */
	
	private String fabuzhezhanghao;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：任务类型
	 */
	 
	public void setRenwuleixing(String renwuleixing) {
		this.renwuleixing = renwuleixing;
	}
	
	/**
	 * 获取：任务类型
	 */
	public String getRenwuleixing() {
		return renwuleixing;
	}
				
	
	/**
	 * 设置：任务赏金
	 */
	 
	public void setRenwushangjin(Integer renwushangjin) {
		this.renwushangjin = renwushangjin;
	}
	
	/**
	 * 获取：任务赏金
	 */
	public Integer getRenwushangjin() {
		return renwushangjin;
	}
				
	
	/**
	 * 设置：领取日期
	 */
	 
	public void setLingquriqi(Date lingquriqi) {
		this.lingquriqi = lingquriqi;
	}
	
	/**
	 * 获取：领取日期
	 */
	public Date getLingquriqi() {
		return lingquriqi;
	}
				
	
	/**
	 * 设置：完成情况
	 */
	 
	public void setWanchengqingkuang(String wanchengqingkuang) {
		this.wanchengqingkuang = wanchengqingkuang;
	}
	
	/**
	 * 获取：完成情况
	 */
	public String getWanchengqingkuang() {
		return wanchengqingkuang;
	}
				
	
	/**
	 * 设置：完成内容
	 */
	 
	public void setWanchengneirong(String wanchengneirong) {
		this.wanchengneirong = wanchengneirong;
	}
	
	/**
	 * 获取：完成内容
	 */
	public String getWanchengneirong() {
		return wanchengneirong;
	}
				
	
	/**
	 * 设置：发布者账号
	 */
	 
	public void setFabuzhezhanghao(String fabuzhezhanghao) {
		this.fabuzhezhanghao = fabuzhezhanghao;
	}
	
	/**
	 * 获取：发布者账号
	 */
	public String getFabuzhezhanghao() {
		return fabuzhezhanghao;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
