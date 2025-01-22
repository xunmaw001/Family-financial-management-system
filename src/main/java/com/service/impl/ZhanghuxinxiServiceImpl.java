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


import com.dao.ZhanghuxinxiDao;
import com.entity.ZhanghuxinxiEntity;
import com.service.ZhanghuxinxiService;
import com.entity.vo.ZhanghuxinxiVO;
import com.entity.view.ZhanghuxinxiView;

@Service("zhanghuxinxiService")
public class ZhanghuxinxiServiceImpl extends ServiceImpl<ZhanghuxinxiDao, ZhanghuxinxiEntity> implements ZhanghuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhanghuxinxiEntity> page = this.selectPage(
                new Query<ZhanghuxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhanghuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhanghuxinxiEntity> wrapper) {
		  Page<ZhanghuxinxiView> page =new Query<ZhanghuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhanghuxinxiVO> selectListVO(Wrapper<ZhanghuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhanghuxinxiVO selectVO(Wrapper<ZhanghuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhanghuxinxiView> selectListView(Wrapper<ZhanghuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhanghuxinxiView selectView(Wrapper<ZhanghuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
