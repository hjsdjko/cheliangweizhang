package com.entity.model;

import com.entity.CheliangWeizhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车辆违章
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheliangWeizhangModel implements Serializable {
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
     * 车辆违章编号
     */
    private String cheliangWeizhangUuidNumber;


    /**
     * 违章标题
     */
    private String cheliangWeizhangName;


    /**
     * 违章照片
     */
    private String cheliangWeizhangPhoto;


    /**
     * 违章视频
     */
    private String cheliangWeizhangVideo;


    /**
     * 车辆违章类型
     */
    private Integer cheliangWeizhangTypes;


    /**
     * 违章缘由
     */
    private String cheliangWeizhangContent;


    /**
     * 违章时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date weizhangTime;


    /**
     * 违章状态
     */
    private Integer cheliangWeizhangZhuangtaiTypes;


    /**
     * 申诉理由
     */
    private String cheliangWeizhangShensuContent;


    /**
     * 申诉状态
     */
    private Integer cheliangWeizhangYesnoTypes;


    /**
     * 申诉回复
     */
    private String cheliangWeizhangYesnoText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date cheliangWeizhangShenheTime;


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
