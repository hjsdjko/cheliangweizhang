package com.entity.vo;

import com.entity.CheliangKoufenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车辆扣分
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("cheliang_koufen")
public class CheliangKoufenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 车辆
     */

    @TableField(value = "cheliang_id")
    private Integer cheliangId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 车辆扣分编号
     */

    @TableField(value = "cheliang_koufen_uuid_number")
    private String cheliangKoufenUuidNumber;


    /**
     * 扣分类型
     */

    @TableField(value = "cheliang_koufen_types")
    private Integer cheliangKoufenTypes;


    /**
     * 扣分缘由
     */

    @TableField(value = "cheliang_koufen_content")
    private String cheliangKoufenContent;


    /**
     * 扣分时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "koufen_time")
    private Date koufenTime;


    /**
     * 分值
     */

    @TableField(value = "cheliang_koufen_number")
    private Integer cheliangKoufenNumber;


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
    public Integer getCheliangId() {
        return cheliangId;
    }


    /**
	 * 获取：车辆
	 */

    public void setCheliangId(Integer cheliangId) {
        this.cheliangId = cheliangId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：车辆扣分编号
	 */
    public String getCheliangKoufenUuidNumber() {
        return cheliangKoufenUuidNumber;
    }


    /**
	 * 获取：车辆扣分编号
	 */

    public void setCheliangKoufenUuidNumber(String cheliangKoufenUuidNumber) {
        this.cheliangKoufenUuidNumber = cheliangKoufenUuidNumber;
    }
    /**
	 * 设置：扣分类型
	 */
    public Integer getCheliangKoufenTypes() {
        return cheliangKoufenTypes;
    }


    /**
	 * 获取：扣分类型
	 */

    public void setCheliangKoufenTypes(Integer cheliangKoufenTypes) {
        this.cheliangKoufenTypes = cheliangKoufenTypes;
    }
    /**
	 * 设置：扣分缘由
	 */
    public String getCheliangKoufenContent() {
        return cheliangKoufenContent;
    }


    /**
	 * 获取：扣分缘由
	 */

    public void setCheliangKoufenContent(String cheliangKoufenContent) {
        this.cheliangKoufenContent = cheliangKoufenContent;
    }
    /**
	 * 设置：扣分时间
	 */
    public Date getKoufenTime() {
        return koufenTime;
    }


    /**
	 * 获取：扣分时间
	 */

    public void setKoufenTime(Date koufenTime) {
        this.koufenTime = koufenTime;
    }
    /**
	 * 设置：分值
	 */
    public Integer getCheliangKoufenNumber() {
        return cheliangKoufenNumber;
    }


    /**
	 * 获取：分值
	 */

    public void setCheliangKoufenNumber(Integer cheliangKoufenNumber) {
        this.cheliangKoufenNumber = cheliangKoufenNumber;
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
