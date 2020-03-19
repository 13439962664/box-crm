package com.box.crm.entity;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.box.pojo.BasePojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
* <p>
*  实体类
* </p>
*
* @author sunyizhuo-13439962664
* @since 2020-03-19
*/
@Data
@Accessors(chain = true)
@TableName("crm_customer")
public class CrmCustomerEntity extends BasePojo implements java.io.Serializable{

	private static final long serialVersionUID = 1L;


    /**
     * 姓名
     */
    @TableField("name")
    private String name;
    /**
     * 英文名
     */
    @TableField("english_name")
    private String englishName;
    /**
     * 性别
     */
    @TableField("gender")
    private Integer gender;
    /**
     * 手机号码
     */
    @TableField("mobile_phone")
    private String mobilePhone;
    /**
     * 手机号码2
     */
    @TableField("mobile_phone2")
    private String mobilePhone2;
    /**
     * 固定电话号码
     */
    @TableField("fixed_phone")
    private String fixedPhone;
    /**
     * 生日
     */
    @TableField("birthday")
    private LocalDate birthday;
    /**
     * 国籍
     */
    @TableField("nationality_name")
    private String nationalityName;
    /**
     * 省份
     */
    @TableField("province_name")
    private String provinceName;
    /**
     * 城市
     */
    @TableField("city_name")
    private String cityName;
    /**
     * 区县
     */
    @TableField("county_name")
    private String countyName;
    /**
     * 家庭住址
     */
    @TableField("home_address")
    private String homeAddress;
    /**
     * 职业
     */
    @TableField("profession_name")
    private String professionName;
    /**
     * 简介
     */
    @TableField("resume")
    private String resume;
    /**
     * 公司
     */
    @TableField("company_name")
    private String companyName;
    /**
     * 公司地址
     */
    @TableField("company_address")
    private String companyAddress;
    /**
     * 职位
     */
    @TableField("position_name")
    private String positionName;

}