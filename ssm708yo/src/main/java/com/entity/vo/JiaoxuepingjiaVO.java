package com.entity.vo;

import com.entity.JiaoxuepingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教学评价
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-06 14:26:56
 */
public class JiaoxuepingjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程图片
	 */
	
	private String kechengtupian;
		
	/**
	 * 教学方法
	 */
	
	private String jiaoxuefangfa;
		
	/**
	 * 教师评分
	 */
	
	private String jiaoshipingfen;
		
	/**
	 * 课程评分
	 */
	
	private Integer kechengpingfen;
		
	/**
	 * 学生留言
	 */
	
	private String xueshengliuyan;
		
	/**
	 * 授课教师
	 */
	
	private String shoukejiaoshi;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
	/**
	 * 选修课程
	 */
	
	private String xuanxiukecheng;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：课程图片
	 */
	 
	public void setKechengtupian(String kechengtupian) {
		this.kechengtupian = kechengtupian;
	}
	
	/**
	 * 获取：课程图片
	 */
	public String getKechengtupian() {
		return kechengtupian;
	}
				
	
	/**
	 * 设置：教学方法
	 */
	 
	public void setJiaoxuefangfa(String jiaoxuefangfa) {
		this.jiaoxuefangfa = jiaoxuefangfa;
	}
	
	/**
	 * 获取：教学方法
	 */
	public String getJiaoxuefangfa() {
		return jiaoxuefangfa;
	}
				
	
	/**
	 * 设置：教师评分
	 */
	 
	public void setJiaoshipingfen(String jiaoshipingfen) {
		this.jiaoshipingfen = jiaoshipingfen;
	}
	
	/**
	 * 获取：教师评分
	 */
	public String getJiaoshipingfen() {
		return jiaoshipingfen;
	}
				
	
	/**
	 * 设置：课程评分
	 */
	 
	public void setKechengpingfen(Integer kechengpingfen) {
		this.kechengpingfen = kechengpingfen;
	}
	
	/**
	 * 获取：课程评分
	 */
	public Integer getKechengpingfen() {
		return kechengpingfen;
	}
				
	
	/**
	 * 设置：学生留言
	 */
	 
	public void setXueshengliuyan(String xueshengliuyan) {
		this.xueshengliuyan = xueshengliuyan;
	}
	
	/**
	 * 获取：学生留言
	 */
	public String getXueshengliuyan() {
		return xueshengliuyan;
	}
				
	
	/**
	 * 设置：授课教师
	 */
	 
	public void setShoukejiaoshi(String shoukejiaoshi) {
		this.shoukejiaoshi = shoukejiaoshi;
	}
	
	/**
	 * 获取：授课教师
	 */
	public String getShoukejiaoshi() {
		return shoukejiaoshi;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
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
	 * 设置：院系
	 */
	 
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
				
	
	/**
	 * 设置：选修课程
	 */
	 
	public void setXuanxiukecheng(String xuanxiukecheng) {
		this.xuanxiukecheng = xuanxiukecheng;
	}
	
	/**
	 * 获取：选修课程
	 */
	public String getXuanxiukecheng() {
		return xuanxiukecheng;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
