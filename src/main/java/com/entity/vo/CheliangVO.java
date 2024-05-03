package com.entity.vo;

import com.entity.CheliangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车辆
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("cheliang")
public class CheliangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 车辆
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 车辆名称
     */

    @TableField(value = "cheliang_name")
    private String cheliangName;


    /**
     * 车辆编号
     */

    @TableField(value = "cheliang_uuid_number")
    private String cheliangUuidNumber;


    /**
     * 车辆照片
     */

    @TableField(value = "cheliang_photo")
    private String cheliangPhoto;


    /**
     * 车辆类型
     */

    @TableField(value = "cheliang_types")
    private Integer cheliangTypes;


    /**
     * 车牌号
     */

    @TableField(value = "cheliang_chepai")
    private String cheliangChepai;


    /**
     * 车辆颜色
     */

    @TableField(value = "cheliang_yanse")
    private String cheliangYanse;


    /**
     * 品牌
     */

    @TableField(value = "cheliang_pinpai")
    private String cheliangPinpai;


    /**
     * 车座
     */

    @TableField(value = "cheliang_chezuo")
    private String cheliangChezuo;


    /**
     * 车辆备注
     */

    @TableField(value = "cheliang_content")
    private String cheliangContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：车辆
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：车辆
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：车辆名称
	 */
    public String getCheliangName() {
        return cheliangName;
    }


    /**
	 * 获取：车辆名称
	 */

    public void setCheliangName(String cheliangName) {
        this.cheliangName = cheliangName;
    }
    /**
	 * 设置：车辆编号
	 */
    public String getCheliangUuidNumber() {
        return cheliangUuidNumber;
    }


    /**
	 * 获取：车辆编号
	 */

    public void setCheliangUuidNumber(String cheliangUuidNumber) {
        this.cheliangUuidNumber = cheliangUuidNumber;
    }
    /**
	 * 设置：车辆照片
	 */
    public String getCheliangPhoto() {
        return cheliangPhoto;
    }


    /**
	 * 获取：车辆照片
	 */

    public void setCheliangPhoto(String cheliangPhoto) {
        this.cheliangPhoto = cheliangPhoto;
    }
    /**
	 * 设置：车辆类型
	 */
    public Integer getCheliangTypes() {
        return cheliangTypes;
    }


    /**
	 * 获取：车辆类型
	 */

    public void setCheliangTypes(Integer cheliangTypes) {
        this.cheliangTypes = cheliangTypes;
    }
    /**
	 * 设置：车牌号
	 */
    public String getCheliangChepai() {
        return cheliangChepai;
    }


    /**
	 * 获取：车牌号
	 */

    public void setCheliangChepai(String cheliangChepai) {
        this.cheliangChepai = cheliangChepai;
    }
    /**
	 * 设置：车辆颜色
	 */
    public String getCheliangYanse() {
        return cheliangYanse;
    }


    /**
	 * 获取：车辆颜色
	 */

    public void setCheliangYanse(String cheliangYanse) {
        this.cheliangYanse = cheliangYanse;
    }
    /**
	 * 设置：品牌
	 */
    public String getCheliangPinpai() {
        return cheliangPinpai;
    }


    /**
	 * 获取：品牌
	 */

    public void setCheliangPinpai(String cheliangPinpai) {
        this.cheliangPinpai = cheliangPinpai;
    }
    /**
	 * 设置：车座
	 */
    public String getCheliangChezuo() {
        return cheliangChezuo;
    }


    /**
	 * 获取：车座
	 */

    public void setCheliangChezuo(String cheliangChezuo) {
        this.cheliangChezuo = cheliangChezuo;
    }
    /**
	 * 设置：车辆备注
	 */
    public String getCheliangContent() {
        return cheliangContent;
    }


    /**
	 * 获取：车辆备注
	 */

    public void setCheliangContent(String cheliangContent) {
        this.cheliangContent = cheliangContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
