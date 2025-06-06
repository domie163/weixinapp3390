package com.dao;

import com.entity.JiaoxuepingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxuepingjiaVO;
import com.entity.view.JiaoxuepingjiaView;


/**
 * 教学评价
 * 
 * @author 
 * @email 
 * @date 2022-02-06 14:26:56
 */
public interface JiaoxuepingjiaDao extends BaseMapper<JiaoxuepingjiaEntity> {
	
	List<JiaoxuepingjiaVO> selectListVO(@Param("ew") Wrapper<JiaoxuepingjiaEntity> wrapper);
	
	JiaoxuepingjiaVO selectVO(@Param("ew") Wrapper<JiaoxuepingjiaEntity> wrapper);
	
	List<JiaoxuepingjiaView> selectListView(@Param("ew") Wrapper<JiaoxuepingjiaEntity> wrapper);

	List<JiaoxuepingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxuepingjiaEntity> wrapper);
	
	JiaoxuepingjiaView selectView(@Param("ew") Wrapper<JiaoxuepingjiaEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<JiaoxuepingjiaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaoxuepingjiaEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaoxuepingjiaEntity> wrapper);
}
