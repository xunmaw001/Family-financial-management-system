package com.dao;

import com.entity.ZhanghuzhichuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhanghuzhichuVO;
import com.entity.view.ZhanghuzhichuView;


/**
 * 账户支出
 * 
 * @author 
 * @email 
 * @date 2022-03-16 17:22:42
 */
public interface ZhanghuzhichuDao extends BaseMapper<ZhanghuzhichuEntity> {
	
	List<ZhanghuzhichuVO> selectListVO(@Param("ew") Wrapper<ZhanghuzhichuEntity> wrapper);
	
	ZhanghuzhichuVO selectVO(@Param("ew") Wrapper<ZhanghuzhichuEntity> wrapper);
	
	List<ZhanghuzhichuView> selectListView(@Param("ew") Wrapper<ZhanghuzhichuEntity> wrapper);

	List<ZhanghuzhichuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhanghuzhichuEntity> wrapper);
	
	ZhanghuzhichuView selectView(@Param("ew") Wrapper<ZhanghuzhichuEntity> wrapper);
	

}
