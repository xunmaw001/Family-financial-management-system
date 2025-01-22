package com.dao;

import com.entity.ZhanghuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhanghuxinxiVO;
import com.entity.view.ZhanghuxinxiView;


/**
 * 账户信息
 * 
 * @author 
 * @email 
 * @date 2022-03-16 17:22:42
 */
public interface ZhanghuxinxiDao extends BaseMapper<ZhanghuxinxiEntity> {
	
	List<ZhanghuxinxiVO> selectListVO(@Param("ew") Wrapper<ZhanghuxinxiEntity> wrapper);
	
	ZhanghuxinxiVO selectVO(@Param("ew") Wrapper<ZhanghuxinxiEntity> wrapper);
	
	List<ZhanghuxinxiView> selectListView(@Param("ew") Wrapper<ZhanghuxinxiEntity> wrapper);

	List<ZhanghuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhanghuxinxiEntity> wrapper);
	
	ZhanghuxinxiView selectView(@Param("ew") Wrapper<ZhanghuxinxiEntity> wrapper);
	

}
