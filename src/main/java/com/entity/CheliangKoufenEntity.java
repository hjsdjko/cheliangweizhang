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
 * 车辆扣分
 *
 * @author 
 * @email
 */
@TableName("cheliang_koufen")
public class CheliangKoufenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheliangKoufenEntity() {

	}

	public CheliangKoufenEntity(T t) {
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
     * 车辆扣分编号
     */
    @ColumnInfo(comment="车辆扣分编号",type="varchar(200)")
    @TableField(value = "cheliang_koufen_uuid_number")

    private String cheliangKoufenUuidNumber;


    /**
     * 扣分类型
     */
    @ColumnInfo(comment="扣分类型",type="int(11)")
    @TableField(value = "cheliang_koufen_types")

    private Integer cheliangKoufenTypes;


    /**
     * 扣分缘由
     */
    @ColumnInfo(comment="扣分缘由",type="longtext")
    @TableField(value = "cheliang_koufen_content")

    private String cheliangKoufenContent;


    /**
     * 扣分时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="扣分时间",type="timestamp")
    @TableField(value = "koufen_time")

    private Date koufenTime;


    /**
     * 分值
     */
    @ColumnInfo(comment="分值",type="int(11)")
    @TableField(value = "cheliang_koufen_number")

    private Integer cheliangKoufenNumber;


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
	 * 获取：车辆扣分编号
	 */
    public String getCheliangKoufenUuidNumber() {
        return cheliangKoufenUuidNumber;
    }
    /**
	 * 设置：车辆扣分编号
	 */

    public void setCheliangKoufenUuidNumber(String cheliangKoufenUuidNumber) {
        this.cheliangKoufenUuidNumber = cheliangKoufenUuidNumber;
    }
    /**
	 * 获取：扣分类型
	 */
    public Integer getCheliangKoufenTypes() {
        return cheliangKoufenTypes;
    }
    /**
	 * 设置：扣分类型
	 */

    public void setCheliangKoufenTypes(Integer cheliangKoufenTypes) {
        this.cheliangKoufenTypes = cheliangKoufenTypes;
    }
    /**
	 * 获取：扣分缘由
	 */
    public String getCheliangKoufenContent() {
        return cheliangKoufenContent;
    }
    /**
	 * 设置：扣分缘由
	 */

    public void setCheliangKoufenContent(String cheliangKoufenContent) {
        this.cheliangKoufenContent = cheliangKoufenContent;
    }
    /**
	 * 获取：扣分时间
	 */
    public Date getKoufenTime() {
        return koufenTime;
    }
    /**
	 * 设置：扣分时间
	 */

    public void setKoufenTime(Date koufenTime) {
        this.koufenTime = koufenTime;
    }
    /**
	 * 获取：分值
	 */
    public Integer getCheliangKoufenNumber() {
        return cheliangKoufenNumber;
    }
    /**
	 * 设置：分值
	 */

    public void setCheliangKoufenNumber(Integer cheliangKoufenNumber) {
        this.cheliangKoufenNumber = cheliangKoufenNumber;
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
        return "CheliangKoufen{" +
            ", id=" + id +
            ", cheliangId=" + cheliangId +
            ", yonghuId=" + yonghuId +
            ", cheliangKoufenUuidNumber=" + cheliangKoufenUuidNumber +
            ", cheliangKoufenTypes=" + cheliangKoufenTypes +
            ", cheliangKoufenContent=" + cheliangKoufenContent +
            ", koufenTime=" + DateUtil.convertString(koufenTime,"yyyy-MM-dd") +
            ", cheliangKoufenNumber=" + cheliangKoufenNumber +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
