package org.poc.hbpersist.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ANSWER")
public class Answer implements Serializable{

	private static final long serialVersionUID = 3689506056751105869L;
	
	@Id
	@Column(name="REQUEST_ID")
	private Integer REQUEST_ID;		
	public Integer getREQUEST_ID() { return this.REQUEST_ID; } 
	public void setREQUEST_ID(Integer REQUEST_ID) { this.REQUEST_ID=REQUEST_ID; }

	@Id
	@Column(name="QUESTION_ID")
	private Integer QUESTION_ID;
	public Integer getQUESTION_ID() { return this.QUESTION_ID; } 
	public void setQUESTION_ID(Integer QUESTION_ID) { this.QUESTION_ID=QUESTION_ID; }

	@Id
	@Column(name="SORT_ORDER")
	private Integer SORT_ORDER;
	public Integer getSORT_ORDER() { return this.SORT_ORDER; } 
	public void setSORT_ORDER(Integer SORT_ORDER) { this.SORT_ORDER=SORT_ORDER; }

	@Column(name="OPTION_KEY",length=4000)
	private String OPTION_KEY;
	public String getOPTION_KEY() { return this.OPTION_KEY; } 
	public void setOPTION_KEY(String OPTION_KEY) { this.OPTION_KEY=OPTION_KEY; }

	@Column(name="ANSWER_TEXT",length=4000)
	private String ANSWER_TEXT;
	public String getANSWER_TEXT() { return this.ANSWER_TEXT; } 
	public void setANSWER_TEXT(String ANSWER_TEXT) { this.ANSWER_TEXT=ANSWER_TEXT; }

	@Column(name="FILE_SIZE")
	private Integer FILE_SIZE;
	public Integer getFILE_SIZE() { return this.FILE_SIZE; } 
	public void setFILE_SIZE(Integer FILE_SIZE) { this.FILE_SIZE=FILE_SIZE; }

	@Column(name="SEARCH_KEYWORDS",length=4000)
	private String SEARCH_KEYWORDS;
	public String getSEARCH_KEYWORDS() { return this.SEARCH_KEYWORDS; } 
	public void setSEARCH_KEYWORDS(String SEARCH_KEYWORDS) { this.SEARCH_KEYWORDS=SEARCH_KEYWORDS; }

	@Column(name="CREATED_BY",length=100)
	private String CREATED_BY;
	public String getCREATED_BY() { return this.CREATED_BY; } 
	public void setCREATED_BY(String CREATED_BY) { this.CREATED_BY=CREATED_BY; }

	@Column(name="CREATION_DATE")
	private Date CREATION_DATE;
	public Date getCREATION_DATE() { return this.CREATION_DATE; } 
	public void setCREATION_DATE(Date CREATION_DATE) { this.CREATION_DATE=CREATION_DATE; }
	
	@Column(name="LAST_UPDATED_BY",length=100)
	private String LAST_UPDATED_BY;
	public String getLAST_UPDATED_BY() { return this.LAST_UPDATED_BY; } 
	public void setLAST_UPDATED_BY(String LAST_UPDATED_BY) { this.LAST_UPDATED_BY=LAST_UPDATED_BY; }

	@Column(name="LAST_UPDATE_DATE")
	private Date LAST_UPDATE_DATE;
	public Date getLAST_UPDATE_DATE() { return this.LAST_UPDATE_DATE; } 
	public void setLAST_UPDATE_DATE(Date LAST_UPDATE_DATE) { this.LAST_UPDATE_DATE=LAST_UPDATE_DATE; }
	
	@Transient
	private String APP_SYSTEM_NAME; 
	public String getAPP_SYSTEM_NAME() { return this.APP_SYSTEM_NAME; }
	public void setAPP_SYSTEM_NAME(String APP_SYSTEM_NAME) { this.APP_SYSTEM_NAME = APP_SYSTEM_NAME; }
}
