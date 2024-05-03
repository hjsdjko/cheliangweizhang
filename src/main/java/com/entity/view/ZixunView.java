package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZixunEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 资讯
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("zixun")
public class ZixunView extends ZixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 资讯类型的值
	*/
	@ColumnInfo(comment="资讯类型的字典表值",type="varchar(200)")
	private String zixunValue;




	public ZixunView() {

	}

	public ZixunView(ZixunEntity zixunEntity) {
		try {
			BeanUtils.copyProperties(this, zixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 资讯类型的值
	*/
	public String getZixunValue() {
		return zixunValue;
	}
	/**
	* 设置： 资讯类型的值
	*/
	public void setZixunValue(String zixunValue) {
		this.zixunValue = zixunValue;
	}




	@Override
	public String toString() {
		return "ZixunView{" +
			", zixunValue=" + zixunValue +
			"} " + super.toString();
	}
}
