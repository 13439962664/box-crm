package com.box.crm.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CrmCustomer implements Serializable {
	private static final long serialVersionUID = 2093437778602154789L;
	private Long id;
	private String name;
	private String englishName;
	private Integer gender;
	private String mobilePhone;
	private String mobilePhone2;
	private String fixedPhone;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	private String nationalityName;
	private String provinceName;
	private String cityName;
	private String countyName;
	private String homeAddress;
	private String professionName;

	private String resume;
	private String companyName;
	private String companyAddress;
	private String positionName;
	private Integer del_ = 0;
	private Long version_ = 0L;

	public CrmCustomer() {
		super();
	}

	public CrmCustomer(Long id, String name, String englishName, Integer gender, String mobilePhone,
			String mobilePhone2, String fixedPhone, Date birthday, String nationalityName, String provinceName,
			String cityName, String countyName, String homeAddress, String professionName, String resume,
			String companyName, String companyAddress, String positionName, Integer del_, Long version_) {
		super();
		this.id = id;
		this.name = name;
		this.englishName = englishName;
		this.gender = gender;
		this.mobilePhone = mobilePhone;
		this.mobilePhone2 = mobilePhone2;
		this.fixedPhone = fixedPhone;
		this.birthday = birthday;
		this.nationalityName = nationalityName;
		this.provinceName = provinceName;
		this.cityName = cityName;
		this.countyName = countyName;
		this.homeAddress = homeAddress;
		this.professionName = professionName;
		this.resume = resume;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.positionName = positionName;
		this.del_ = del_;
		this.version_ = version_;
	}

	@Override
	public String toString() {
		return "CrmCustomer [id=" + id + ", name=" + name + ", englishName=" + englishName + ", gender=" + gender
				+ ", mobilePhone=" + mobilePhone + ", mobilePhone2=" + mobilePhone2 + ", fixedPhone=" + fixedPhone
				+ ", birthday=" + birthday + ", nationalityName=" + nationalityName + ", provinceName=" + provinceName
				+ ", cityName=" + cityName + ", countyName=" + countyName + ", homeAddress=" + homeAddress
				+ ", professionName=" + professionName + ", resume=" + resume + ", companyName=" + companyName
				+ ", companyAddress=" + companyAddress + ", positionName=" + positionName + ", del_=" + del_
				+ ", version_=" + version_ + "]";
	}

	public Integer getDel_() {
		return del_;
	}

	public void setDel_(Integer del_) {
		this.del_ = del_;
	}

	public Long getVersion_() {
		return version_;
	}

	public void setVersion_(Long version_) {
		this.version_ = version_;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getMobilePhone2() {
		return mobilePhone2;
	}

	public void setMobilePhone2(String mobilePhone2) {
		this.mobilePhone2 = mobilePhone2;
	}

	public String getFixedPhone() {
		return fixedPhone;
	}

	public void setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNationalityName() {
		return nationalityName;
	}

	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getProfessionName() {
		return professionName;
	}

	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

}
