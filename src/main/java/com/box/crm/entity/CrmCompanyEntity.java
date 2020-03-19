package com.box.crm.entity;

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
* @since 2020-03-18
*/
@Data
@Accessors(chain = true)
@TableName("crm_company")
public class CrmCompanyEntity extends BasePojo implements java.io.Serializable{

	private static final long serialVersionUID = 1L;


    /**
     * 公司名称
     */
    @TableField("name")
    private String name;
    /**
     * 地址
     */
    @TableField("address")
    private String address;
    /**
     * 国家
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

}