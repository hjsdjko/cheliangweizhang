package com.entity.vo;

import com.entity.CheliangWeizhangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车辆违章
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("cheliang_weizhang")
public class CheliangWeizhangVO implements Serializable {
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
     * 车辆违章编号
     */

    @TableField(value = "cheliang_weizhang_uuid_number")
    private String cheliangWeizhangUuidNumber;


    /**
     * 违章标题
     */

    @TableField(value = "cheliang_weizhang_name")
    private String cheliangWeizhangName;


    /**
     * 违章照片
     */

    @TableField(value = "cheliang_weizhang_photo")
    private String cheliangWeizhangPhoto;


    /**
     * 违章视频
     */

    @TableField(value = "cheliang_weizhang_video")
    private String cheliangWeizhangVideo;


    /**
     * 车辆违章类型
     */

    @TableField(value = "cheliang_weizhang_types")
    private Integer cheliangWeizhangTypes;


    /**
     * 违章缘由
     */

    @TableField(value = "cheliang_weizhang_content")
    private String cheliangWeizhangContent;


    /**
     * 违章时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "weizhang_time")
    private Date weizhangTime;


    /**
     * 违章状态
     */

    @TableField(value = "cheliang_weizhang_zhuangtai_types")
    private Integer cheliangWeizhangZhuangtaiTypes;


    /**
     * 申诉理由
     */

    @TableField(value = "cheliang_weizhang_shensu_content")
    private String cheliangWeizhangShensuContent;


    /**
     * 申诉状态
     */

    @TableField(value = "cheliang_weizhang_yesno_types")
    private Integer cheliangWeizhangYesnoTypes;


    /**
     * 申诉回复
     */

    @TableField(value = "cheliang_weizhang_yesno_text")
    private String cheliangWeizhangYesnoText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "cheliang_weizhang_shenhe_time")
    private Date cheliangWeizhangShenheTime;


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
	 * 设置：车辆违章编号
	 */
    public String getCheliangWeizhangUuidNumber() {
        return cheliangWeizhangUuidNumber;
    }


    /**
	 * 获取：车辆违章编号
	 */

    public void setCheliangWeizhangUuidNumber(String cheliangWeizhangUuidNumber) {
        this.cheliangWeizhangUuidNumber = cheliangWeizhangUuidNumber;
    }
    /**
	 * 设置：违章标题
	 */
    public String getCheliangWeizhangName() {
        return cheliangWeizhangName;
    }


    /**
	 * 获取：违章标题
	 */

    public void setCheliangWeizhangName(String cheliangWeizhangName) {
        this.cheliangWeizhangName = cheliangWeizhangName;
    }
    /**
	 * 设置：违章照片
	 */
    public String getCheliangWeizhangPhoto() {
        return cheliangWeizhangPhoto;
    }


    /**
	 * 获取：违章照片
	 */

    public void setCheliangWeizhangPhoto(String cheliangWeizhangPhoto) {
        this.cheliangWeizhangPhoto = cheliangWeizhangPhoto;
    }
    /**
	 * 设置：违章视频
	 */
    public String getCheliangWeizhangVideo() {
        return cheliangWeizhangVideo;
    }


    /**
	 * 获取：违章视频
	 */

    public void setCheliangWeizhangVideo(String cheliangWeizhangVideo) {
        this.cheliangWeizhangVideo = cheliangWeizhangVideo;
    }
    /**
	 * 设置：车辆违章类型
	 */
    public Integer getCheliangWeizhangTypes() {
        return cheliangWeizhangTypes;
    }


    /**
	 * 获取：车辆违章类型
	 */

    public void setCheliangWeizhangTypes(Integer cheliangWeizhangTypes) {
        this.cheliangWeizhangTypes = cheliangWeizhangTypes;
    }
    /**
	 * 设置：违章缘由
	 */
    public String getCheliangWeizhangContent() {
        return cheliangWeizhangContent;
    }


    /**
	 * 获取：违章缘由
	 */

    public void setCheliangWeizhangContent(String cheliangWeizhangContent) {
        this.cheliangWeizhangContent = cheliangWeizhangContent;
    }
    /**
	 * 设置：违章时间
	 */
    public Date getWeizhangTime() {
        return weizhangTime;
    }


    /**
	 * 获取：违章时间
	 */

    public void setWeizhangTime(Date weizhangTime) {
        this.weizhangTime = weizhangTime;
    }
    /**
	 * 设置：违章状态
	 */
    public Integer getCheliangWeizhangZhuangtaiTypes() {
        return cheliangWeizhangZhuangtaiTypes;
    }


    /**
	 * 获取：违章状态
	 */

    public void setCheliangWeizhangZhuangtaiTypes(Integer cheliangWeizhangZhuangtaiTypes) {
        this.cheliangWeizhangZhuangtaiTypes = cheliangWeizhangZhuangtaiTypes;
    }
    /**
	 * 设置：申诉理由
	 */
    public String getCheliangWeizhangShensuContent() {
        return cheliangWeizhangShensuContent;
    }


    /**
	 * 获取：申诉理由
	 */

    public void setCheliangWeizhangShensuContent(String cheliangWeizhangShensuContent) {
        this.cheliangWeizhangShensuContent = cheliangWeizhangShensuContent;
    }
    /**
	 * 设置：申诉状态
	 */
    public Integer getCheliangWeizhangYesnoTypes() {
        return cheliangWeizhangYesnoTypes;
    }


    /**
	 * 获取：申诉状态
	 */

    public void setCheliangWeizhangYesnoTypes(Integer cheliangWeizhangYesnoTypes) {
        this.cheliangWeizhangYesnoTypes = cheliangWeizhangYesnoTypes;
    }
    /**
	 * 设置：申诉回复
	 */
    public String getCheliangWeizhangYesnoText() {
        return cheliangWeizhangYesnoText;
    }


    /**
	 * 获取：申诉回复
	 */

    public void setCheliangWeizhangYesnoText(String cheliangWeizhangYesnoText) {
        this.cheliangWeizhangYesnoText = cheliangWeizhangYesnoText;
    }
    /**
	 * 设置：回复时间
	 */
    public Date getCheliangWeizhangShenheTime() {
        return cheliangWeizhangShenheTime;
    }


    /**
	 * 获取：回复时间
	 */

    public void setCheliangWeizhangShenheTime(Date cheliangWeizhangShenheTime) {
        this.cheliangWeizhangShenheTime = cheliangWeizhangShenheTime;
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
