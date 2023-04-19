package com.entity.vo;

import java.io.Serializable;


/**
 * 资源信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public class ZiyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资源类型
	 */
	
	private String ziyuanleixing;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 成色
	 */
	
	private String chengse;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 资源描述
	 */
	
	private String ziyuanmiaoshu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
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
	 * 设置：资源类型
	 */
	 
	public void setZiyuanleixing(String ziyuanleixing) {
		this.ziyuanleixing = ziyuanleixing;
	}
	
	/**
	 * 获取：资源类型
	 */
	public String getZiyuanleixing() {
		return ziyuanleixing;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：成色
	 */
	 
	public void setChengse(String chengse) {
		this.chengse = chengse;
	}
	
	/**
	 * 获取：成色
	 */
	public String getChengse() {
		return chengse;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：资源描述
	 */
	 
	public void setZiyuanmiaoshu(String ziyuanmiaoshu) {
		this.ziyuanmiaoshu = ziyuanmiaoshu;
	}
	
	/**
	 * 获取：资源描述
	 */
	public String getZiyuanmiaoshu() {
		return ziyuanmiaoshu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
