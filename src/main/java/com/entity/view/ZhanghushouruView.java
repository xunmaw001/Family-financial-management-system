package com.entity.view;

import com.entity.ZhanghushouruEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 账户收入
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 17:22:42
 */
@TableName("zhanghushouru")
public class ZhanghushouruView  extends ZhanghushouruEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhanghushouruView(){
	}
 
 	public ZhanghushouruView(ZhanghushouruEntity zhanghushouruEntity){
 	try {
			BeanUtils.copyProperties(this, zhanghushouruEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
