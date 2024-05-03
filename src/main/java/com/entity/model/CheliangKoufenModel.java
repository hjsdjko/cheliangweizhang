package com.entity.model;

import com.entity.CheliangKoufenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车辆扣分
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheliangKoufenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 车辆
     */
    private Integer cheliangId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 车辆扣分编号
     */
    private String cheliangKoufenUuidNumber;


    /**
     * 扣分类型
     */
    private Integer cheliangKoufenTypes;


    /**
     * 扣分缘由
     */
    private String cheliangKoufenContent;


    /**
     * 扣分时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date koufenTime;


    /**
     * 分值
     */
    private Integer cheliangKoufenNumber;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
