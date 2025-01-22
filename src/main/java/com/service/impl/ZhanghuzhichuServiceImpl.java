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


import com.dao.ZhanghuzhichuDao;
import com.entity.ZhanghuzhichuEntity;
import com.service.ZhanghuzhichuService;
import com.entity.vo.ZhanghuzhichuVO;
import com.entity.view.ZhanghuzhichuView;

@Service("zhanghuzhichuService")
public class ZhanghuzhichuServiceImpl extends ServiceImpl<ZhanghuzhichuDao, ZhanghuzhichuEntity> implements ZhanghuzhichuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhanghuzhichuEntity> page = this.selectPage(
                new Query<ZhanghuzhichuEntity>(params).getPage(),
                new EntityWrapper<ZhanghuzhichuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhanghuzhichuEntity> wrapper) {
		  Page<ZhanghuzhichuView> page =new Query<ZhanghuzhichuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhanghuzhichuVO> selectListVO(Wrapper<ZhanghuzhichuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhanghuzhichuVO selectVO(Wrapper<ZhanghuzhichuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhanghuzhichuView> selectListView(Wrapper<ZhanghuzhichuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhanghuzhichuView selectView(Wrapper<ZhanghuzhichuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
