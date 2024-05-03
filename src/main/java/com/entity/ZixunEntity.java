package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 资讯
 *
 * @author 
 * @email
 */
@TableName("zixun")
public class ZixunEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZixunEntity() {

	}

	public ZixunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 资讯名称
     */
    @ColumnInfo(comment="资讯名称",type="varchar(200)")
    @TableField(value = "zixun_name")

    private String zixunName;


    /**
     * 资讯图片
     */
    @ColumnInfo(comment="资讯图片",type="varchar(200)")
    @TableField(value = "zixun_photo")

    private String zixunPhoto;


    /**
     * 资讯类型
     */
    @ColumnInfo(comment="资讯类型",type="int(11)")
    @TableField(value = "zixun_types")

    private Integer zixunTypes;


    /**
     * 资讯发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="资讯发布时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 资讯详情
     */
    @ColumnInfo(comment="资讯详情",type="longtext")
    @TableField(value = "zixun_content")

    private String zixunContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：资讯名称
	 */
    public String getZixunName() {
        return zixunName;
    }
    /**
	 * 设置：资讯名称
	 */

    public void setZixunName(String zixunName) {
        this.zixunName = zixunName;
    }
    /**
	 * 获取：资讯图片
	 */
    public String getZixunPhoto() {
        return zixunPhoto;
    }
    /**
	 * 设置：资讯图片
	 */

    public void setZixunPhoto(String zixunPhoto) {
        this.zixunPhoto = zixunPhoto;
    }
    /**
	 * 获取：资讯类型
	 */
    public Integer getZixunTypes() {
        return zixunTypes;
    }
    /**
	 * 设置：资讯类型
	 */

    public void setZixunTypes(Integer zixunTypes) {
        this.zixunTypes = zixunTypes;
    }
    /**
	 * 获取：资讯发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：资讯发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：资讯详情
	 */
    public String getZixunContent() {
        return zixunContent;
    }
    /**
	 * 设置：资讯详情
	 */

    public void setZixunContent(String zixunContent) {
        this.zixunContent = zixunContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zixun{" +
            ", id=" + id +
            ", zixunName=" + zixunName +
            ", zixunPhoto=" + zixunPhoto +
            ", zixunTypes=" + zixunTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", zixunContent=" + zixunContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
