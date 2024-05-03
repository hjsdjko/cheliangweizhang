package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.CheliangKoufenEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 车辆扣分
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("cheliang_koufen")
public class CheliangKoufenView extends CheliangKoufenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 扣分类型的值
	*/
	@ColumnInfo(comment="扣分类型的字典表值",type="varchar(200)")
	private String cheliangKoufenValue;

	//级联表 车辆
					 
		/**
		* 车辆 的 车辆
		*/
		@ColumnInfo(comment="车辆",type="int(11)")
		private Integer cheliangYonghuId;
		/**
		* 车辆名称
		*/

		@ColumnInfo(comment="车辆名称",type="varchar(200)")
		private String cheliangName;
		/**
		* 车辆编号
		*/

		@ColumnInfo(comment="车辆编号",type="varchar(200)")
		private String cheliangUuidNumber;
		/**
		* 车辆照片
		*/

		@ColumnInfo(comment="车辆照片",type="varchar(200)")
		private String cheliangPhoto;
		/**
		* 车辆类型
		*/
		@ColumnInfo(comment="车辆类型",type="int(11)")
		private Integer cheliangTypes;
			/**
			* 车辆类型的值
			*/
			@ColumnInfo(comment="车辆类型的字典表值",type="varchar(200)")
			private String cheliangValue;
		/**
		* 车牌号
		*/

		@ColumnInfo(comment="车牌号",type="varchar(200)")
		private String cheliangChepai;
		/**
		* 车辆颜色
		*/

		@ColumnInfo(comment="车辆颜色",type="varchar(200)")
		private String cheliangYanse;
		/**
		* 品牌
		*/

		@ColumnInfo(comment="品牌",type="varchar(200)")
		private String cheliangPinpai;
		/**
		* 车座
		*/

		@ColumnInfo(comment="车座",type="varchar(200)")
		private String cheliangChezuo;
		/**
		* 车辆备注
		*/

		@ColumnInfo(comment="车辆备注",type="longtext")
		private String cheliangContent;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;



	public CheliangKoufenView() {

	}

	public CheliangKoufenView(CheliangKoufenEntity cheliangKoufenEntity) {
		try {
			BeanUtils.copyProperties(this, cheliangKoufenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 扣分类型的值
	*/
	public String getCheliangKoufenValue() {
		return cheliangKoufenValue;
	}
	/**
	* 设置： 扣分类型的值
	*/
	public void setCheliangKoufenValue(String cheliangKoufenValue) {
		this.cheliangKoufenValue = cheliangKoufenValue;
	}


	//级联表的get和set 车辆
		/**
		* 获取：车辆 的 车辆
		*/
		public Integer getCheliangYonghuId() {
			return cheliangYonghuId;
		}
		/**
		* 设置：车辆 的 车辆
		*/
		public void setCheliangYonghuId(Integer cheliangYonghuId) {
			this.cheliangYonghuId = cheliangYonghuId;
		}

		/**
		* 获取： 车辆名称
		*/
		public String getCheliangName() {
			return cheliangName;
		}
		/**
		* 设置： 车辆名称
		*/
		public void setCheliangName(String cheliangName) {
			this.cheliangName = cheliangName;
		}

		/**
		* 获取： 车辆编号
		*/
		public String getCheliangUuidNumber() {
			return cheliangUuidNumber;
		}
		/**
		* 设置： 车辆编号
		*/
		public void setCheliangUuidNumber(String cheliangUuidNumber) {
			this.cheliangUuidNumber = cheliangUuidNumber;
		}

		/**
		* 获取： 车辆照片
		*/
		public String getCheliangPhoto() {
			return cheliangPhoto;
		}
		/**
		* 设置： 车辆照片
		*/
		public void setCheliangPhoto(String cheliangPhoto) {
			this.cheliangPhoto = cheliangPhoto;
		}
		/**
		* 获取： 车辆类型
		*/
		public Integer getCheliangTypes() {
			return cheliangTypes;
		}
		/**
		* 设置： 车辆类型
		*/
		public void setCheliangTypes(Integer cheliangTypes) {
			this.cheliangTypes = cheliangTypes;
		}


			/**
			* 获取： 车辆类型的值
			*/
			public String getCheliangValue() {
				return cheliangValue;
			}
			/**
			* 设置： 车辆类型的值
			*/
			public void setCheliangValue(String cheliangValue) {
				this.cheliangValue = cheliangValue;
			}

		/**
		* 获取： 车牌号
		*/
		public String getCheliangChepai() {
			return cheliangChepai;
		}
		/**
		* 设置： 车牌号
		*/
		public void setCheliangChepai(String cheliangChepai) {
			this.cheliangChepai = cheliangChepai;
		}

		/**
		* 获取： 车辆颜色
		*/
		public String getCheliangYanse() {
			return cheliangYanse;
		}
		/**
		* 设置： 车辆颜色
		*/
		public void setCheliangYanse(String cheliangYanse) {
			this.cheliangYanse = cheliangYanse;
		}

		/**
		* 获取： 品牌
		*/
		public String getCheliangPinpai() {
			return cheliangPinpai;
		}
		/**
		* 设置： 品牌
		*/
		public void setCheliangPinpai(String cheliangPinpai) {
			this.cheliangPinpai = cheliangPinpai;
		}

		/**
		* 获取： 车座
		*/
		public String getCheliangChezuo() {
			return cheliangChezuo;
		}
		/**
		* 设置： 车座
		*/
		public void setCheliangChezuo(String cheliangChezuo) {
			this.cheliangChezuo = cheliangChezuo;
		}

		/**
		* 获取： 车辆备注
		*/
		public String getCheliangContent() {
			return cheliangContent;
		}
		/**
		* 设置： 车辆备注
		*/
		public void setCheliangContent(String cheliangContent) {
			this.cheliangContent = cheliangContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}


	@Override
	public String toString() {
		return "CheliangKoufenView{" +
			", cheliangKoufenValue=" + cheliangKoufenValue +
			", cheliangName=" + cheliangName +
			", cheliangUuidNumber=" + cheliangUuidNumber +
			", cheliangPhoto=" + cheliangPhoto +
			", cheliangChepai=" + cheliangChepai +
			", cheliangYanse=" + cheliangYanse +
			", cheliangPinpai=" + cheliangPinpai +
			", cheliangChezuo=" + cheliangChezuo +
			", cheliangContent=" + cheliangContent +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			"} " + super.toString();
	}
}
