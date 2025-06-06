package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxuepingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxuepingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxuepingjiaView;


/**
 * 教学评价
 *
 * @author 
 * @email 
 * @date 2022-02-06 14:26:56
 */
public interface JiaoxuepingjiaService extends IService<JiaoxuepingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxuepingjiaVO> selectListVO(Wrapper<JiaoxuepingjiaEntity> wrapper);
   	
   	JiaoxuepingjiaVO selectVO(@Param("ew") Wrapper<JiaoxuepingjiaEntity> wrapper);
   	
   	List<JiaoxuepingjiaView> selectListView(Wrapper<JiaoxuepingjiaEntity> wrapper);
   	
   	JiaoxuepingjiaView selectView(@Param("ew") Wrapper<JiaoxuepingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxuepingjiaEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiaoxuepingjiaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiaoxuepingjiaEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiaoxuepingjiaEntity> wrapper);
}

