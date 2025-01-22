package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhanghushouruEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhanghushouruVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhanghushouruView;


/**
 * 账户收入
 *
 * @author 
 * @email 
 * @date 2022-03-16 17:22:42
 */
public interface ZhanghushouruService extends IService<ZhanghushouruEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhanghushouruVO> selectListVO(Wrapper<ZhanghushouruEntity> wrapper);
   	
   	ZhanghushouruVO selectVO(@Param("ew") Wrapper<ZhanghushouruEntity> wrapper);
   	
   	List<ZhanghushouruView> selectListView(Wrapper<ZhanghushouruEntity> wrapper);
   	
   	ZhanghushouruView selectView(@Param("ew") Wrapper<ZhanghushouruEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhanghushouruEntity> wrapper);
   	

}

