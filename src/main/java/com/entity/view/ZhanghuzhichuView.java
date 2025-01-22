package com.entity.view;

import com.entity.ZhanghuzhichuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 账户支出
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 17:22:42
 */
@TableName("zhanghuzhichu")
public class ZhanghuzhichuView  extends ZhanghuzhichuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhanghuzhichuView(){
	}
 
 	public ZhanghuzhichuView(ZhanghuzhichuEntity zhanghuzhichuEntity){
 	try {
			BeanUtils.copyProperties(this, zhanghuzhichuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
