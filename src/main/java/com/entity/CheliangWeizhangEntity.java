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
 * 车辆违章
 *
 * @author 
 * @email
 */
@TableName("cheliang_weizhang")
public class CheliangWeizhangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheliangWeizhangEntity() {

	}

	public CheliangWeizhangEntity(T t) {
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
    @TableField(value = "cheliang_id")

    private Integer cheliangId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 车辆违章编号
     */
    @ColumnInfo(comment="车辆违章编号",type="varchar(200)")
    @TableField(value = "cheliang_weizhang_uuid_number")

    private String cheliangWeizhangUuidNumber;


    /**
     * 违章标题
     */
    @ColumnInfo(comment="违章标题",type="varchar(200)")
    @TableField(value = "cheliang_weizhang_name")

    private String cheliangWeizhangName;


    /**
     * 违章照片
     */
    @ColumnInfo(comment="违章照片",type="varchar(200)")
    @TableField(value = "cheliang_weizhang_photo")

    private String cheliangWeizhangPhoto;


    /**
     * 违章视频
     */
    @ColumnInfo(comment="违章视频",type="varchar(200)")
    @TableField(value = "cheliang_weizhang_video")

    private String cheliangWeizhangVideo;


    /**
     * 车辆违章类型
     */
    @ColumnInfo(comment="车辆违章类型",type="int(11)")
    @TableField(value = "cheliang_weizhang_types")

    private Integer cheliangWeizhangTypes;


    /**
     * 违章缘由
     */
    @ColumnInfo(comment="违章缘由",type="longtext")
    @TableField(value = "cheliang_weizhang_content")

    private String cheliangWeizhangContent;


    /**
     * 违章时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="违章时间",type="timestamp")
    @TableField(value = "weizhang_time")

    private Date weizhangTime;


    /**
     * 违章状态
     */
    @ColumnInfo(comment="违章状态",type="int(11)")
    @TableField(value = "cheliang_weizhang_zhuangtai_types")

    private Integer cheliangWeizhangZhuangtaiTypes;


    /**
     * 申诉理由
     */
    @ColumnInfo(comment="申诉理由",type="longtext")
    @TableField(value = "cheliang_weizhang_shensu_content")

    private String cheliangWeizhangShensuContent;


    /**
     * 申诉状态
     */
    @ColumnInfo(comment="申诉状态",type="int(11)")
    @TableField(value = "cheliang_weizhang_yesno_types")

    private Integer cheliangWeizhangYesnoTypes;


    /**
     * 申诉回复
     */
    @ColumnInfo(comment="申诉回复",type="longtext")
    @TableField(value = "cheliang_weizhang_yesno_text")

    private String cheliangWeizhangYesnoText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="回复时间",type="timestamp")
    @TableField(value = "cheliang_weizhang_shenhe_time")

    private Date cheliangWeizhangShenheTime;


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
    public Integer getCheliangId() {
        return cheliangId;
    }
    /**
	 * 设置：车辆
	 */

    public void setCheliangId(Integer cheliangId) {
        this.cheliangId = cheliangId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：车辆违章编号
	 */
    public String getCheliangWeizhangUuidNumber() {
        return cheliangWeizhangUuidNumber;
    }
    /**
	 * 设置：车辆违章编号
	 */

    public void setCheliangWeizhangUuidNumber(String cheliangWeizhangUuidNumber) {
        this.cheliangWeizhangUuidNumber = cheliangWeizhangUuidNumber;
    }
    /**
	 * 获取：违章标题
	 */
    public String getCheliangWeizhangName() {
        return cheliangWeizhangName;
    }
    /**
	 * 设置：违章标题
	 */

    public void setCheliangWeizhangName(String cheliangWeizhangName) {
        this.cheliangWeizhangName = cheliangWeizhangName;
    }
    /**
	 * 获取：违章照片
	 */
    public String getCheliangWeizhangPhoto() {
        return cheliangWeizhangPhoto;
    }
    /**
	 * 设置：违章照片
	 */

    public void setCheliangWeizhangPhoto(String cheliangWeizhangPhoto) {
        this.cheliangWeizhangPhoto = cheliangWeizhangPhoto;
    }
    /**
	 * 获取：违章视频
	 */
    public String getCheliangWeizhangVideo() {
        return cheliangWeizhangVideo;
    }
    /**
	 * 设置：违章视频
	 */

    public void setCheliangWeizhangVideo(String cheliangWeizhangVideo) {
        this.cheliangWeizhangVideo = cheliangWeizhangVideo;
    }
    /**
	 * 获取：车辆违章类型
	 */
    public Integer getCheliangWeizhangTypes() {
        return cheliangWeizhangTypes;
    }
    /**
	 * 设置：车辆违章类型
	 */

    public void setCheliangWeizhangTypes(Integer cheliangWeizhangTypes) {
        this.cheliangWeizhangTypes = cheliangWeizhangTypes;
    }
    /**
	 * 获取：违章缘由
	 */
    public String getCheliangWeizhangContent() {
        return cheliangWeizhangContent;
    }
    /**
	 * 设置：违章缘由
	 */

    public void setCheliangWeizhangContent(String cheliangWeizhangContent) {
        this.cheliangWeizhangContent = cheliangWeizhangContent;
    }
    /**
	 * 获取：违章时间
	 */
    public Date getWeizhangTime() {
        return weizhangTime;
    }
    /**
	 * 设置：违章时间
	 */

    public void setWeizhangTime(Date weizhangTime) {
        this.weizhangTime = weizhangTime;
    }
    /**
	 * 获取：违章状态
	 */
    public Integer getCheliangWeizhangZhuangtaiTypes() {
        return cheliangWeizhangZhuangtaiTypes;
    }
    /**
	 * 设置：违章状态
	 */

    public void setCheliangWeizhangZhuangtaiTypes(Integer cheliangWeizhangZhuangtaiTypes) {
        this.cheliangWeizhangZhuangtaiTypes = cheliangWeizhangZhuangtaiTypes;
    }
    /**
	 * 获取：申诉理由
	 */
    public String getCheliangWeizhangShensuContent() {
        return cheliangWeizhangShensuContent;
    }
    /**
	 * 设置：申诉理由
	 */

    public void setCheliangWeizhangShensuContent(String cheliangWeizhangShensuContent) {
        this.cheliangWeizhangShensuContent = cheliangWeizhangShensuContent;
    }
    /**
	 * 获取：申诉状态
	 */
    public Integer getCheliangWeizhangYesnoTypes() {
        return cheliangWeizhangYesnoTypes;
    }
    /**
	 * 设置：申诉状态
	 */

    public void setCheliangWeizhangYesnoTypes(Integer cheliangWeizhangYesnoTypes) {
        this.cheliangWeizhangYesnoTypes = cheliangWeizhangYesnoTypes;
    }
    /**
	 * 获取：申诉回复
	 */
    public String getCheliangWeizhangYesnoText() {
        return cheliangWeizhangYesnoText;
    }
    /**
	 * 设置：申诉回复
	 */

    public void setCheliangWeizhangYesnoText(String cheliangWeizhangYesnoText) {
        this.cheliangWeizhangYesnoText = cheliangWeizhangYesnoText;
    }
    /**
	 * 获取：回复时间
	 */
    public Date getCheliangWeizhangShenheTime() {
        return cheliangWeizhangShenheTime;
    }
    /**
	 * 设置：回复时间
	 */

    public void setCheliangWeizhangShenheTime(Date cheliangWeizhangShenheTime) {
        this.cheliangWeizhangShenheTime = cheliangWeizhangShenheTime;
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
        return "CheliangWeizhang{" +
            ", id=" + id +
            ", cheliangId=" + cheliangId +
            ", yonghuId=" + yonghuId +
            ", cheliangWeizhangUuidNumber=" + cheliangWeizhangUuidNumber +
            ", cheliangWeizhangName=" + cheliangWeizhangName +
            ", cheliangWeizhangPhoto=" + cheliangWeizhangPhoto +
            ", cheliangWeizhangVideo=" + cheliangWeizhangVideo +
            ", cheliangWeizhangTypes=" + cheliangWeizhangTypes +
            ", cheliangWeizhangContent=" + cheliangWeizhangContent +
            ", weizhangTime=" + DateUtil.convertString(weizhangTime,"yyyy-MM-dd") +
            ", cheliangWeizhangZhuangtaiTypes=" + cheliangWeizhangZhuangtaiTypes +
            ", cheliangWeizhangShensuContent=" + cheliangWeizhangShensuContent +
            ", cheliangWeizhangYesnoTypes=" + cheliangWeizhangYesnoTypes +
            ", cheliangWeizhangYesnoText=" + cheliangWeizhangYesnoText +
            ", cheliangWeizhangShenheTime=" + DateUtil.convertString(cheliangWeizhangShenheTime,"yyyy-MM-dd") +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
