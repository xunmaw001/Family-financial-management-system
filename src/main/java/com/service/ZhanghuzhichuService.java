package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhanghuzhichuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhanghuzhichuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhanghuzhichuView;


/**
 * 账户支出
 *
 * @author 
 * @email 
 * @date 2022-03-16 17:22:42
 */
public interface ZhanghuzhichuService extends IService<ZhanghuzhichuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhanghuzhichuVO> selectListVO(Wrapper<ZhanghuzhichuEntity> wrapper);
   	
   	ZhanghuzhichuVO selectVO(@Param("ew") Wrapper<ZhanghuzhichuEntity> wrapper);
   	
   	List<ZhanghuzhichuView> selectListView(Wrapper<ZhanghuzhichuEntity> wrapper);
   	
   	ZhanghuzhichuView selectView(@Param("ew") Wrapper<ZhanghuzhichuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhanghuzhichuEntity> wrapper);
   	

}

