package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;


/**
 * 校园资讯
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@TableName("xiaoyuanzixun")
public class XiaoyuanzixunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoyuanzixunEntity() {
		
	}
	
	public XiaoyuanzixunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
	private Date fabushijian;
	
	/**
	 * 封面图片
	 */
					
	private String fengmiantupian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
