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
 * 车辆
 *
 * @author 
 * @email
 */
@TableName("cheliang")
public class CheliangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheliangEntity() {

	}

	public CheliangEntity(T t) {
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
     * 车辆
     */
    @ColumnInfo(comment="车辆",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 车辆名称
     */
    @ColumnInfo(comment="车辆名称",type="varchar(200)")
    @TableField(value = "cheliang_name")

    private String cheliangName;


    /**
     * 车辆编号
     */
    @ColumnInfo(comment="车辆编号",type="varchar(200)")
    @TableField(value = "cheliang_uuid_number")

    private String cheliangUuidNumber;


    /**
     * 车辆照片
     */
    @ColumnInfo(comment="车辆照片",type="varchar(200)")
    @TableField(value = "cheliang_photo")

    private String cheliangPhoto;


    /**
     * 车辆类型
     */
    @ColumnInfo(comment="车辆类型",type="int(11)")
    @TableField(value = "cheliang_types")

    private Integer cheliangTypes;


    /**
     * 车牌号
     */
    @ColumnInfo(comment="车牌号",type="varchar(200)")
    @TableField(value = "cheliang_chepai")

    private String cheliangChepai;


    /**
     * 车辆颜色
     */
    @ColumnInfo(comment="车辆颜色",type="varchar(200)")
    @TableField(value = "cheliang_yanse")

    private String cheliangYanse;


    /**
     * 品牌
     */
    @ColumnInfo(comment="品牌",type="varchar(200)")
    @TableField(value = "cheliang_pinpai")

    private String cheliangPinpai;


    /**
     * 车座
     */
    @ColumnInfo(comment="车座",type="varchar(200)")
    @TableField(value = "cheliang_chezuo")

    private String cheliangChezuo;


    /**
     * 车辆备注
     */
    @ColumnInfo(comment="车辆备注",type="longtext")
    @TableField(value = "cheliang_content")

    private String cheliangContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间   listShow
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
	 * 获取：车辆
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：车辆
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：车辆名称
	 */
    public String getCheliangName() {
        return cheliangName;
    }
    /**
	 * 设置：车辆名称
	 */

    public void setCheliangName(String cheliangName) {
        this.cheliangName = cheliangName;
    }
    /**
	 * 获取：车辆编号
	 */
    public String getCheliangUuidNumber() {
        return cheliangUuidNumber;
    }
    /**
	 * 设置：车辆编号
	 */

    public void setCheliangUuidNumber(String cheliangUuidNumber) {
        this.cheliangUuidNumber = cheliangUuidNumber;
    }
    /**
	 * 获取：车辆照片
	 */
    public String getCheliangPhoto() {
        return cheliangPhoto;
    }
    /**
	 * 设置：车辆照片
	 */

    public void setCheliangPhoto(String cheliangPhoto) {
        this.cheliangPhoto = cheliangPhoto;
    }
    /**
	 * 获取：车辆类型
	 */
    public Integer getCheliangTypes() {
        return cheliangTypes;
    }
    /**
	 * 设置：车辆类型
	 */

    public void setCheliangTypes(Integer cheliangTypes) {
        this.cheliangTypes = cheliangTypes;
    }
    /**
	 * 获取：车牌号
	 */
    public String getCheliangChepai() {
        return cheliangChepai;
    }
    /**
	 * 设置：车牌号
	 */

    public void setCheliangChepai(String cheliangChepai) {
        this.cheliangChepai = cheliangChepai;
    }
    /**
	 * 获取：车辆颜色
	 */
    public String getCheliangYanse() {
        return cheliangYanse;
    }
    /**
	 * 设置：车辆颜色
	 */

    public void setCheliangYanse(String cheliangYanse) {
        this.cheliangYanse = cheliangYanse;
    }
    /**
	 * 获取：品牌
	 */
    public String getCheliangPinpai() {
        return cheliangPinpai;
    }
    /**
	 * 设置：品牌
	 */

    public void setCheliangPinpai(String cheliangPinpai) {
        this.cheliangPinpai = cheliangPinpai;
    }
    /**
	 * 获取：车座
	 */
    public String getCheliangChezuo() {
        return cheliangChezuo;
    }
    /**
	 * 设置：车座
	 */

    public void setCheliangChezuo(String cheliangChezuo) {
        this.cheliangChezuo = cheliangChezuo;
    }
    /**
	 * 获取：车辆备注
	 */
    public String getCheliangContent() {
        return cheliangContent;
    }
    /**
	 * 设置：车辆备注
	 */

    public void setCheliangContent(String cheliangContent) {
        this.cheliangContent = cheliangContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间   listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间   listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Cheliang{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", cheliangName=" + cheliangName +
            ", cheliangUuidNumber=" + cheliangUuidNumber +
            ", cheliangPhoto=" + cheliangPhoto +
            ", cheliangTypes=" + cheliangTypes +
            ", cheliangChepai=" + cheliangChepai +
            ", cheliangYanse=" + cheliangYanse +
            ", cheliangPinpai=" + cheliangPinpai +
            ", cheliangChezuo=" + cheliangChezuo +
            ", cheliangContent=" + cheliangContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
