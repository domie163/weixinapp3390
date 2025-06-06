package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoxuepingjiaDao;
import com.entity.JiaoxuepingjiaEntity;
import com.service.JiaoxuepingjiaService;
import com.entity.vo.JiaoxuepingjiaVO;
import com.entity.view.JiaoxuepingjiaView;

@Service("jiaoxuepingjiaService")
public class JiaoxuepingjiaServiceImpl extends ServiceImpl<JiaoxuepingjiaDao, JiaoxuepingjiaEntity> implements JiaoxuepingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxuepingjiaEntity> page = this.selectPage(
                new Query<JiaoxuepingjiaEntity>(params).getPage(),
                new EntityWrapper<JiaoxuepingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxuepingjiaEntity> wrapper) {
		  Page<JiaoxuepingjiaView> page =new Query<JiaoxuepingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoxuepingjiaVO> selectListVO(Wrapper<JiaoxuepingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxuepingjiaVO selectVO(Wrapper<JiaoxuepingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxuepingjiaView> selectListView(Wrapper<JiaoxuepingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxuepingjiaView selectView(Wrapper<JiaoxuepingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JiaoxuepingjiaEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JiaoxuepingjiaEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JiaoxuepingjiaEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
