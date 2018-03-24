package com.gb.model;

import java.sql.Timestamp;
import java.util.List;

public class SellerAdmissionInfo {

	private Integer sellerId;
	private String contactsName;
	private String contactsTel;
	private String contactsEmail;
	private String corporateName;
	private String busLicRegNum;
	private String legalRepName;
	private Integer idCardNumber;
	private String legalRepIdcardPicture;
	private String busLicLoc;
	private String busLicDetLoc;
	private String estDate;
	private String busTerm;
	private Integer regCapital;
	private String busScope;
	private String busLicUpload;
	private String comLoc;
	private String comDetLoc;
	private String comTel;
	private String comEmContact;
	private String comEmContactTel;
	private String orgCode;
	private String orgCodeUpload;
	private Integer taxpayerNum;
	private String taxpayerType;
	private Integer taxTypeTaxCode;
	private String taxRegCertUpdate;
	private String genTaxQuaCertUpdate;
	private String bankAccountName;
	private String comBankAcc;
	private String opBankBraName;
	private Integer opBankBraNumber;
	private String opBankBraLocation;
	private String opBankAcPerCertUpdate;
	private String comType;
	private String comWebsite;
	private String annualSales;
	private Integer shopOperatorsNum;
	private String warehouseAddress;
	private String commonLogisticsCompanies;
	private String erpType;
	private String generationOperationCom;
	private String desiredStoreType;
	private String majorBusinessType;
	private String detailedCategories;
	private String industryQualificationUpdate;
	private String shopName;
	private Integer auditStatus;
	private Timestamp timestamp;
	private String note;

	private List<Goods> goodList;

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getContactsName() {
		return contactsName;
	}

	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}

	public String getContactsTel() {
		return contactsTel;
	}

	public void setContactsTel(String contactsTel) {
		this.contactsTel = contactsTel;
	}

	public String getContactsEmail() {
		return contactsEmail;
	}

	public void setContactsEmail(String contactsEmail) {
		this.contactsEmail = contactsEmail;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getBusLicRegNum() {
		return busLicRegNum;
	}

	public void setBusLicRegNum(String busLicRegNum) {
		this.busLicRegNum = busLicRegNum;
	}

	public String getLegalRepName() {
		return legalRepName;
	}

	public void setLegalRepName(String legalRepName) {
		this.legalRepName = legalRepName;
	}

	public Integer getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(Integer idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getLegalRepIdcardPicture() {
		return legalRepIdcardPicture;
	}

	public void setLegalRepIdcardPicture(String legalRepIdcardPicture) {
		this.legalRepIdcardPicture = legalRepIdcardPicture;
	}

	public String getBusLicLoc() {
		return busLicLoc;
	}

	public void setBusLicLoc(String busLicLoc) {
		this.busLicLoc = busLicLoc;
	}

	public String getBusLicDetLoc() {
		return busLicDetLoc;
	}

	public void setBusLicDetLoc(String busLicDetLoc) {
		this.busLicDetLoc = busLicDetLoc;
	}

	public String getEstDate() {
		return estDate;
	}

	public void setEstDate(String estDate) {
		this.estDate = estDate;
	}

	public String getBusTerm() {
		return busTerm;
	}

	public void setBusTerm(String busTerm) {
		this.busTerm = busTerm;
	}

	public Integer getRegCapital() {
		return regCapital;
	}

	public void setRegCapital(Integer regCapital) {
		this.regCapital = regCapital;
	}

	public String getBusScope() {
		return busScope;
	}

	public void setBusScope(String busScope) {
		this.busScope = busScope;
	}

	public String getBusLicUpload() {
		return busLicUpload;
	}

	public void setBusLicUpload(String busLicUpload) {
		this.busLicUpload = busLicUpload;
	}

	public String getComLoc() {
		return comLoc;
	}

	public void setComLoc(String comLoc) {
		this.comLoc = comLoc;
	}

	public String getComDetLoc() {
		return comDetLoc;
	}

	public void setComDetLoc(String comDetLoc) {
		this.comDetLoc = comDetLoc;
	}

	public String getComTel() {
		return comTel;
	}

	public void setComTel(String comTel) {
		this.comTel = comTel;
	}

	public String getComEmContact() {
		return comEmContact;
	}

	public void setComEmContact(String comEmContact) {
		this.comEmContact = comEmContact;
	}

	public String getComEmContactTel() {
		return comEmContactTel;
	}

	public void setComEmContactTel(String comEmContactTel) {
		this.comEmContactTel = comEmContactTel;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgCodeUpload() {
		return orgCodeUpload;
	}

	public void setOrgCodeUpload(String orgCodeUpload) {
		this.orgCodeUpload = orgCodeUpload;
	}

	public Integer getTaxpayerNum() {
		return taxpayerNum;
	}

	public void setTaxpayerNum(Integer taxpayerNum) {
		this.taxpayerNum = taxpayerNum;
	}

	public String getTaxpayerType() {
		return taxpayerType;
	}

	public void setTaxpayerType(String taxpayerType) {
		this.taxpayerType = taxpayerType;
	}

	public Integer getTaxTypeTaxCode() {
		return taxTypeTaxCode;
	}

	public void setTaxTypeTaxCode(Integer taxTypeTaxCode) {
		this.taxTypeTaxCode = taxTypeTaxCode;
	}

	public String getTaxRegCertUpdate() {
		return taxRegCertUpdate;
	}

	public void setTaxRegCertUpdate(String taxRegCertUpdate) {
		this.taxRegCertUpdate = taxRegCertUpdate;
	}

	public String getGenTaxQuaCertUpdate() {
		return genTaxQuaCertUpdate;
	}

	public void setGenTaxQuaCertUpdate(String genTaxQuaCertUpdate) {
		this.genTaxQuaCertUpdate = genTaxQuaCertUpdate;
	}

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getComBankAcc() {
		return comBankAcc;
	}

	public void setComBankAcc(String comBankAcc) {
		this.comBankAcc = comBankAcc;
	}

	public String getOpBankBraName() {
		return opBankBraName;
	}

	public void setOpBankBraName(String opBankBraName) {
		this.opBankBraName = opBankBraName;
	}

	public Integer getOpBankBraNumber() {
		return opBankBraNumber;
	}

	public void setOpBankBraNumber(Integer opBankBraNumber) {
		this.opBankBraNumber = opBankBraNumber;
	}

	public String getOpBankBraLocation() {
		return opBankBraLocation;
	}

	public void setOpBankBraLocation(String opBankBraLocation) {
		this.opBankBraLocation = opBankBraLocation;
	}

	public String getOpBankAcPerCertUpdate() {
		return opBankAcPerCertUpdate;
	}

	public void setOpBankAcPerCertUpdate(String opBankAcPerCertUpdate) {
		this.opBankAcPerCertUpdate = opBankAcPerCertUpdate;
	}

	public String getComType() {
		return comType;
	}

	public void setComType(String comType) {
		this.comType = comType;
	}

	public String getComWebsite() {
		return comWebsite;
	}

	public void setComWebsite(String comWebsite) {
		this.comWebsite = comWebsite;
	}

	public String getAnnualSales() {
		return annualSales;
	}

	public void setAnnualSales(String annualSales) {
		this.annualSales = annualSales;
	}

	public Integer getShopOperatorsNum() {
		return shopOperatorsNum;
	}

	public void setShopOperatorsNum(Integer shopOperatorsNum) {
		this.shopOperatorsNum = shopOperatorsNum;
	}

	public String getWarehouseAddress() {
		return warehouseAddress;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	public String getCommonLogisticsCompanies() {
		return commonLogisticsCompanies;
	}

	public void setCommonLogisticsCompanies(String commonLogisticsCompanies) {
		this.commonLogisticsCompanies = commonLogisticsCompanies;
	}

	public String getErpType() {
		return erpType;
	}

	public void setErpType(String erpType) {
		this.erpType = erpType;
	}

	public String getGenerationOperationCom() {
		return generationOperationCom;
	}

	public void setGenerationOperationCom(String generationOperationCom) {
		this.generationOperationCom = generationOperationCom;
	}

	public String getDesiredStoreType() {
		return desiredStoreType;
	}

	public void setDesiredStoreType(String desiredStoreType) {
		this.desiredStoreType = desiredStoreType;
	}

	public String getMajorBusinessType() {
		return majorBusinessType;
	}

	public void setMajorBusinessType(String majorBusinessType) {
		this.majorBusinessType = majorBusinessType;
	}

	public String getDetailedCategories() {
		return detailedCategories;
	}

	public void setDetailedCategories(String detailedCategories) {
		this.detailedCategories = detailedCategories;
	}

	public String getIndustryQualificationUpdate() {
		return industryQualificationUpdate;
	}

	public void setIndustryQualificationUpdate(
			String industryQualificationUpdate) {
		this.industryQualificationUpdate = industryQualificationUpdate;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Integer getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the goodList
	 */
	public List<Goods> getGoodList() {
		return goodList;
	}

	/**
	 * @param goodList
	 *            the goodList to set
	 */
	public void setGoodList(List<Goods> goodList) {
		this.goodList = goodList;
	}

}
