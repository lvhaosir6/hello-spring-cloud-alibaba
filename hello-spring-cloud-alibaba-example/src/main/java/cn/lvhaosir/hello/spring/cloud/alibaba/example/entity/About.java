package cn.lvhaosir.hello.spring.cloud.alibaba.example.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *	关于
 */
@Entity
@Table(name = "ux_about")
public class About implements Serializable{

	private static final long serialVersionUID = -756752868627526511L;
	
	public static final Integer websiteType = 1;
	//public static final String websiteDefault = "http://www.wherecom.com/wap";
	public static final Integer facebookType = 2;
	//public static final String facebookDefault = "https://www.facebook.com/wherecom";
	public static final Integer faqType = 3;
	//public static final String faqDefault = "http://www.babywei.cn/wap/en/problemapp.html";
	public static final Integer licenseType = 4;
	//public static final String licenseDefault = "http://www.babywei.cn/wap/en/installationapp.html";
	public static final Integer statementType = 5;
	//public static final String statementDefault = "http://www.babywei.cn/wap/en/privacyprotocolapp.html";
	
	private Long id;
	
	/**
	 * 渠道编码
	 */
	private String saleChannel;
	
	/**
	 * 官网
	 */
	private String websiteUrl;
	
	/**
	 * facebook
	 */
	private String facebookUrl;
	
	/**
	 * 常见问题
	 */
	private String faqUrl;
	
	/**
	 * 软件使用许可协议
	 */
	private String license;
	
	/**
	 * 隐私声明
	 *//*
	private String statement;*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSaleChannel() {
		return saleChannel;
	}

	public void setSaleChannel(String saleChannel) {
		this.saleChannel = saleChannel;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getFacebookUrl() {
		return facebookUrl;
	}

	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}

	public String getFaqUrl() {
		return faqUrl;
	}

	public void setFaqUrl(String faqUrl) {
		this.faqUrl = faqUrl;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	/*public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}*/
	
	
}
