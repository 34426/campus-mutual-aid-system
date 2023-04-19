package com.entity.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 任务信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public class RenwuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 任务类型
	 */
	
	private String renwuleixing;
		
	/**
	 * 任务要求
	 */
	
	private String renwuyaoqiu;
		
	/**
	 * 任务赏金
	 */
	
	private Integer renwushangjin;
		
	/**
	 * 任务内容
	 */
	
	private String renwuneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date faburiqi;
		
	/**
	 * 背景图片
	 */
	
	private String beijingtupian;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 发布者账号
	 */
	
	private String fabuzhezhanghao;
		
	/**
	 * 发布者姓名
	 */
	
	private String fabuzhexingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：任务要求
	 */
	 
	public void setRenwuyaoqiu(String renwuyaoqiu) {
		this.renwuyaoqiu = renwuyaoqiu;
	}
	
	/**
	 * 获取：任务要求
	 */
	public String getRenwuyaoqiu() {
		return renwuyaoqiu;
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
	 * 设置：任务内容
	 */
	 
	public void setRenwuneirong(String renwuneirong) {
		this.renwuneirong = renwuneirong;
	}
	
	/**
	 * 获取：任务内容
	 */
	public String getRenwuneirong() {
		return renwuneirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：背景图片
	 */
	 
	public void setBeijingtupian(String beijingtupian) {
		this.beijingtupian = beijingtupian;
	}
	
	/**
	 * 获取：背景图片
	 */
	public String getBeijingtupian() {
		return beijingtupian;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
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
	 * 设置：发布者姓名
	 */
	 
	public void setFabuzhexingming(String fabuzhexingming) {
		this.fabuzhexingming = fabuzhexingming;
	}
	
	/**
	 * 获取：发布者姓名
	 */
	public String getFabuzhexingming() {
		return fabuzhexingming;
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
			
}
