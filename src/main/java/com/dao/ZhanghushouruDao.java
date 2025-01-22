package com.dao;

import com.entity.ZhanghushouruEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhanghushouruVO;
import com.entity.view.ZhanghushouruView;


/**
 * 账户收入
 * 
 * @author 
 * @email 
 * @date 2022-03-16 17:22:42
 */
public interface ZhanghushouruDao extends BaseMapper<ZhanghushouruEntity> {
	
	List<ZhanghushouruVO> selectListVO(@Param("ew") Wrapper<ZhanghushouruEntity> wrapper);
	
	ZhanghushouruVO selectVO(@Param("ew") Wrapper<ZhanghushouruEntity> wrapper);
	
	List<ZhanghushouruView> selectListView(@Param("ew") Wrapper<ZhanghushouruEntity> wrapper);

	List<ZhanghushouruView> selectListView(Pagination page,@Param("ew") Wrapper<ZhanghushouruEntity> wrapper);
	
	ZhanghushouruView selectView(@Param("ew") Wrapper<ZhanghushouruEntity> wrapper);
	

}
