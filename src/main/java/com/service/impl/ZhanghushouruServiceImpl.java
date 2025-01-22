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


import com.dao.ZhanghushouruDao;
import com.entity.ZhanghushouruEntity;
import com.service.ZhanghushouruService;
import com.entity.vo.ZhanghushouruVO;
import com.entity.view.ZhanghushouruView;

@Service("zhanghushouruService")
public class ZhanghushouruServiceImpl extends ServiceImpl<ZhanghushouruDao, ZhanghushouruEntity> implements ZhanghushouruService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhanghushouruEntity> page = this.selectPage(
                new Query<ZhanghushouruEntity>(params).getPage(),
                new EntityWrapper<ZhanghushouruEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhanghushouruEntity> wrapper) {
		  Page<ZhanghushouruView> page =new Query<ZhanghushouruView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhanghushouruVO> selectListVO(Wrapper<ZhanghushouruEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhanghushouruVO selectVO(Wrapper<ZhanghushouruEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhanghushouruView> selectListView(Wrapper<ZhanghushouruEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhanghushouruView selectView(Wrapper<ZhanghushouruEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
