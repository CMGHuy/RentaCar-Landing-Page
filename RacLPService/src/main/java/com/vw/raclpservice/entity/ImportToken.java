package com.vw.raclpservice.entity;
// default package
// Generated 30 Dec, 2019 4:20:53 PM by Hibernate Tools 3.2.2.GA

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ImportToken generated by hbm2java
 */
@Entity
@Table(name = "IMPORT_TOKEN", schema = "SIEBEL_LP")
public class ImportToken implements java.io.Serializable {

	private static final long serialVersionUID = -8158167474262560275L;

	@Id
	@Column(name = "TOKEN", unique = true, nullable = false, length = 100)
	private String token;
	public String getToken() {
		return this.token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "VALID_UNTIL", nullable = false)
	private Date validUntil;
	public Date getValidUntil() {
		return this.validUntil;
	}
	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}

	@Column(name = "IMPORT_TYPE", nullable = false, length = 3)
	private String importType;
	public String getImportType() {
		return this.importType;
	}
	public void setImportType(String importType) {
		this.importType = importType;
	}

	@Column(name = "COMPANY_NAME", nullable = false, length = 100)
	private String companyName;
	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "COMPANY_ID", nullable = false, length = 15)
	private String companyId;
	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Column(name = "PROC_ENTITY_ID", nullable = false, length = 15)
	private String procEntityId;
	public String getProcEntityId() {
		return this.procEntityId;
	}
	public void setProcEntityId(String procEntityId) {
		this.procEntityId = procEntityId;
	}

	@Column(name = "ROW_ID", nullable = true, length = 15)
	private String rowId;
	public String getRowId() {
		return rowId;
	}
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public ImportToken() {
	}

	public ImportToken(String token, Date validUntil, String importType, String companyName, String companyId,
					   String procEntityId) {
		this.token = token;
		this.validUntil = validUntil;
		this.importType = importType;
		this.companyName = companyName;
		this.companyId = companyId;
		this.procEntityId = procEntityId;
	}


	//@Temporal(TemporalType.DATE)


}
