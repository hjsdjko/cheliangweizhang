package com.entity.model;

import com.entity.CheliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车辆
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheliangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 车辆
     */
    private Integer yonghuId;


    /**
     * 车辆名称
     */
    private String cheliangName;


    /**
     * 车辆编号
     */
    private String cheliangUuidNumber;


    /**
     * 车辆照片
     */
    private String cheliangPhoto;


    /**
     * 车辆类型
     */
    private Integer cheliangTypes;


    /**
     * 车牌号
     */
    private String cheliangChepai;


    /**
     * 车辆颜色
     */
    private String cheliangYanse;


    /**
     * 品牌
     */
    private String cheliangPinpai;


    /**
     * 车座
     */
    private String cheliangChezuo;


    /**
     * 车辆备注
     */
    private String cheliangContent;


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
