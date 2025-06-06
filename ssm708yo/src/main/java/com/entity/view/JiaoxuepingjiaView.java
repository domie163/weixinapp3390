package com.entity.view;

import com.entity.JiaoxuepingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教学评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-06 14:26:56
 */
@TableName("jiaoxuepingjia")
public class JiaoxuepingjiaView  extends JiaoxuepingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoxuepingjiaView(){
	}
 
 	public JiaoxuepingjiaView(JiaoxuepingjiaEntity jiaoxuepingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoxuepingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
