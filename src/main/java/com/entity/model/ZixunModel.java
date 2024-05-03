package com.entity.model;

import com.entity.ZixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 资讯
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZixunModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 资讯名称
     */
    private String zixunName;


    /**
     * 资讯图片
     */
    private String zixunPhoto;


    /**
     * 资讯类型
     */
    private Integer zixunTypes;


    /**
     * 资讯发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 资讯详情
     */
    private String zixunContent;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
