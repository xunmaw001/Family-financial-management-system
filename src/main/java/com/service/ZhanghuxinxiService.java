package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhanghuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhanghuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhanghuxinxiView;


/**
 * 账户信息
 *
 * @author 
 * @email 
 * @date 2022-03-16 17:22:42
 */
public interface ZhanghuxinxiService extends IService<ZhanghuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhanghuxinxiVO> selectListVO(Wrapper<ZhanghuxinxiEntity> wrapper);
   	
   	ZhanghuxinxiVO selectVO(@Param("ew") Wrapper<ZhanghuxinxiEntity> wrapper);
   	
   	List<ZhanghuxinxiView> selectListView(Wrapper<ZhanghuxinxiEntity> wrapper);
   	
   	ZhanghuxinxiView selectView(@Param("ew") Wrapper<ZhanghuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhanghuxinxiEntity> wrapper);
   	

}

