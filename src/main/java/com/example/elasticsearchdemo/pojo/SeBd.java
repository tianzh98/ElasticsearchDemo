package com.example.elasticsearchdemo.pojo;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * (SeBd)实体类
 *
 * @author makejava
 * @since 2021-07-27 19:19:49
 */
@Data
@Document(indexName = "#{@esIndexNameConfig.seBd}")
public class SeBd extends EsBasePO implements Serializable {
    private static final long serialVersionUID = 409615730106062576L;

    @Field(type = FieldType.Keyword)
    private Integer urid;

    @Field(type = FieldType.Keyword)
    private String entNum;

    @Field(type = FieldType.Keyword)
    private String batNo;

    @Field(type = FieldType.Keyword)
    private String bdNo;

    @Field(type = FieldType.Keyword)
    private String entChannelCode;

    @Field(type = FieldType.Text)
    private String entAccNum;

    @Field(type = FieldType.Keyword)
    private String cardType;

    @Field(type = FieldType.Keyword)
    private String custBankCode;

    @Field(type = FieldType.Text)
    private String custAccNum;

    @Field(type = FieldType.Text)
    private String custAccName;

    @Field(type = FieldType.Text)
    private String custAreaCode;

    @Field(type = FieldType.Text)
    private String custBankLocationCode;

    @Field(type = FieldType.Text)
    private String custBankLocationName;

    @Field(type = FieldType.Keyword)
    private String privateFlag;

    @Field(type = FieldType.Text)
    private String amount;

    @Field(type = FieldType.Keyword)
    private String currency;

    @Field(type = FieldType.Keyword)
    private String protocolCode;

    @Field(type = FieldType.Keyword)
    private String protocolUserCode;

    @Field(type = FieldType.Keyword)
    private String certType;

    @Field(type = FieldType.Text)
    private String certNum;

    @Field(type = FieldType.Keyword)
    private String phone;

    @Field(type = FieldType.Keyword)
    private String reconciliationCode;

    @Field(type = FieldType.Text)
    private String purpose;

    @Field(type = FieldType.Text)
    private String memo;

    @Field(type = FieldType.Keyword)
    private String batchToSingleFlag;

    @Field(type = FieldType.Keyword)
    private String flowNo;

    @Field(type = FieldType.Keyword)
    private String singleTransVerifyCode;

    @Field(type = FieldType.Keyword)
    private String singleQueryVerifyCode;

    @Field(type = FieldType.Text)
    private String sourceNote;

    @Field(type = FieldType.Text)
    private String orgCode;

    @Field(type = FieldType.Keyword)
    private String sameBankFlag;

    @Field(type = FieldType.Keyword)
    private String urgentFlag;

    @Field(type = FieldType.Keyword)
    private String sourceUrid;

    @Field(type = FieldType.Text)
    private String warnRevoked;

    @Field(type = FieldType.Text)
    private String repeatConditionValue;

    @Field(type = FieldType.Text)
    private String warnDate;

    @Field(type = FieldType.Text)
    private String detailMd5;

    @Field(type = FieldType.Text)
    private String bankExtend1;

    @Field(type = FieldType.Text)
    private String bankExtend2;

    @Field(type = FieldType.Text)
    private String bankExtend3;

    @Field(type = FieldType.Text)
    private String bankExtend4;

    @Field(type = FieldType.Text)
    private String bankExtend5;

    @Field(type = FieldType.Keyword)
    private String bankReturnState;

    @Field(type = FieldType.Text)
    private String bankReturnCode;

    @Field(type = FieldType.Text)
    private String bankReturnMsg;

    @Field(type = FieldType.Short)
    private Integer bankLocationMatchFlag;

    @Field(type = FieldType.Text)
    private String bankLocationMatchName;

    @Field(type = FieldType.Keyword)
    private String moneyWay;

    @Field(type = FieldType.Text)
    private String accountingDate;

    @Field(type = FieldType.Keyword)
    private String fgUniqueId;

    @Field(type = FieldType.Text)
    private String matchBankId;

    @Field(type = FieldType.Text)
    private String matchAreaCode;

    @Field(type = FieldType.Text)
    private String bankDetailReconcile;

    @Field(type = FieldType.Text)
    private String reconcileFileReconcile;

    @Field(type = FieldType.Text)
    private String totalAmountReconcile;

    @Field(type = FieldType.Text)
    private String failBankDetailReconcile;

    @Field(type = FieldType.Text)
    private String failAccountingDate;

    @Field(type = FieldType.Date)
    private Date cycleDate;

    @Field(type = FieldType.Date)
    private Date failCycleDate;

    @Field(type = FieldType.Text)
    private String supportCreditFlag;

    @Field(type = FieldType.Text)
    private String unionPayCardType;

    @Field(type = FieldType.Text)
    private String absTract;

    @Field(type = FieldType.Text)
    private String complianceState;

    @Field(type = FieldType.Text)
    private String complianceInfo;

    @Field(type = FieldType.Text)
    private String overLength;

    @Field(type = FieldType.Long)
    private Integer rowVersion;

    @Field(type = FieldType.Double)
    private Double decodeAmount;

    @Field(type = FieldType.Keyword)
    private String accountingFlag;

    @Field(type = FieldType.Date)
    private Date reqDate;

    @Field(type = FieldType.Date)
    private Date bankReturnTime;

    @Field(type = FieldType.Text)
    private String policyNum;

    @Field(type = FieldType.Text)
    private String custAreaName;

    @Field(type = FieldType.Keyword)
    private String encryptFlag;

    @Field(type = FieldType.Text)
    private String convertedBdNo;

    @Field(type = FieldType.Keyword)
    private String riskControlState;

    @Field(type = FieldType.Keyword)
    private String riskControlHitType;

    @Field(type = FieldType.Date)
    private Date inTime;

    @Field(type = FieldType.Date)
    private Date sendBankTime;

    @Field(type = FieldType.Text)
    private String failReconcileType;

    @Field(type = FieldType.Date)
    private Date lastQueryTime;

    @Field(type = FieldType.Date)
    private Date lastModifyTime;

    @Field(type = FieldType.Text)
    private String dayFlowNo;

    @Field(type = FieldType.Text)
    private String accountingNo;

    @Field(type = FieldType.Integer)
    private Integer remainQueryCount;

    @Field(type = FieldType.Text)
    private String protocolNum;

    @Field(type = FieldType.Text)
    private String agreementNo;

    @Field(type = FieldType.Keyword)
    private String signBusType;

    @Field(type = FieldType.Text)
    private String prdName;

    @Field(type = FieldType.Keyword)
    private String signTrans;

    @Field(type = FieldType.Text)
    private String matchedAreaCode;

    @Field(type = FieldType.Text)
    private String matchedBankLocationCode;

    @Field(type = FieldType.Text)
    private String matchedBankLocationName;

    @Field(type = FieldType.Text)
    private String matchedCustBankCode;

    @Field(type = FieldType.Keyword)
    private String refundFlag;

    @Field(type = FieldType.Text)
    private String icbcSignRespMsg;

    @Field(type = FieldType.Text)
    private String fgResultOutLibrary;

    @Field(type = FieldType.Text)
    private String currentBankReturnResult;

    @Field(type = FieldType.Text)
    private String belongAreaMatched;

    @Field(type = FieldType.Text)
    private String belongAreaMatchRule;

    @Field(type = FieldType.Text)
    private String sourceBankReturnCode;

    @Field(type = FieldType.Text)
    private String sourceBankReturnMsg;


    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public String getEntNum() {
        return entNum;
    }

    public void setEntNum(String entNum) {
        this.entNum = entNum;
    }

    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo;
    }

    public String getBdNo() {
        return bdNo;
    }

    public void setBdNo(String bdNo) {
        this.bdNo = bdNo;
    }

    public String getEntChannelCode() {
        return entChannelCode;
    }

    public void setEntChannelCode(String entChannelCode) {
        this.entChannelCode = entChannelCode;
    }

    public String getEntAccNum() {
        return entAccNum;
    }

    public void setEntAccNum(String entAccNum) {
        this.entAccNum = entAccNum;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCustBankCode() {
        return custBankCode;
    }

    public void setCustBankCode(String custBankCode) {
        this.custBankCode = custBankCode;
    }

    public String getCustAccNum() {
        return custAccNum;
    }

    public void setCustAccNum(String custAccNum) {
        this.custAccNum = custAccNum;
    }

    public String getCustAccName() {
        return custAccName;
    }

    public void setCustAccName(String custAccName) {
        this.custAccName = custAccName;
    }

    public String getCustAreaCode() {
        return custAreaCode;
    }

    public void setCustAreaCode(String custAreaCode) {
        this.custAreaCode = custAreaCode;
    }

    public String getCustBankLocationCode() {
        return custBankLocationCode;
    }

    public void setCustBankLocationCode(String custBankLocationCode) {
        this.custBankLocationCode = custBankLocationCode;
    }

    public String getCustBankLocationName() {
        return custBankLocationName;
    }

    public void setCustBankLocationName(String custBankLocationName) {
        this.custBankLocationName = custBankLocationName;
    }

    public String getPrivateFlag() {
        return privateFlag;
    }

    public void setPrivateFlag(String privateFlag) {
        this.privateFlag = privateFlag;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getProtocolCode() {
        return protocolCode;
    }

    public void setProtocolCode(String protocolCode) {
        this.protocolCode = protocolCode;
    }

    public String getProtocolUserCode() {
        return protocolUserCode;
    }

    public void setProtocolUserCode(String protocolUserCode) {
        this.protocolUserCode = protocolUserCode;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReconciliationCode() {
        return reconciliationCode;
    }

    public void setReconciliationCode(String reconciliationCode) {
        this.reconciliationCode = reconciliationCode;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getBatchToSingleFlag() {
        return batchToSingleFlag;
    }

    public void setBatchToSingleFlag(String batchToSingleFlag) {
        this.batchToSingleFlag = batchToSingleFlag;
    }

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    public String getSingleTransVerifyCode() {
        return singleTransVerifyCode;
    }

    public void setSingleTransVerifyCode(String singleTransVerifyCode) {
        this.singleTransVerifyCode = singleTransVerifyCode;
    }

    public String getSingleQueryVerifyCode() {
        return singleQueryVerifyCode;
    }

    public void setSingleQueryVerifyCode(String singleQueryVerifyCode) {
        this.singleQueryVerifyCode = singleQueryVerifyCode;
    }

    public String getSourceNote() {
        return sourceNote;
    }

    public void setSourceNote(String sourceNote) {
        this.sourceNote = sourceNote;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getSameBankFlag() {
        return sameBankFlag;
    }

    public void setSameBankFlag(String sameBankFlag) {
        this.sameBankFlag = sameBankFlag;
    }

    public String getUrgentFlag() {
        return urgentFlag;
    }

    public void setUrgentFlag(String urgentFlag) {
        this.urgentFlag = urgentFlag;
    }

    public String getSourceUrid() {
        return sourceUrid;
    }

    public void setSourceUrid(String sourceUrid) {
        this.sourceUrid = sourceUrid;
    }

    public String getWarnRevoked() {
        return warnRevoked;
    }

    public void setWarnRevoked(String warnRevoked) {
        this.warnRevoked = warnRevoked;
    }

    public String getRepeatConditionValue() {
        return repeatConditionValue;
    }

    public void setRepeatConditionValue(String repeatConditionValue) {
        this.repeatConditionValue = repeatConditionValue;
    }

    public String getWarnDate() {
        return warnDate;
    }

    public void setWarnDate(String warnDate) {
        this.warnDate = warnDate;
    }

    public String getDetailMd5() {
        return detailMd5;
    }

    public void setDetailMd5(String detailMd5) {
        this.detailMd5 = detailMd5;
    }

    public String getBankExtend1() {
        return bankExtend1;
    }

    public void setBankExtend1(String bankExtend1) {
        this.bankExtend1 = bankExtend1;
    }

    public String getBankExtend2() {
        return bankExtend2;
    }

    public void setBankExtend2(String bankExtend2) {
        this.bankExtend2 = bankExtend2;
    }

    public String getBankExtend3() {
        return bankExtend3;
    }

    public void setBankExtend3(String bankExtend3) {
        this.bankExtend3 = bankExtend3;
    }

    public String getBankExtend4() {
        return bankExtend4;
    }

    public void setBankExtend4(String bankExtend4) {
        this.bankExtend4 = bankExtend4;
    }

    public String getBankExtend5() {
        return bankExtend5;
    }

    public void setBankExtend5(String bankExtend5) {
        this.bankExtend5 = bankExtend5;
    }

    public String getBankReturnState() {
        return bankReturnState;
    }

    public void setBankReturnState(String bankReturnState) {
        this.bankReturnState = bankReturnState;
    }

    public String getBankReturnCode() {
        return bankReturnCode;
    }

    public void setBankReturnCode(String bankReturnCode) {
        this.bankReturnCode = bankReturnCode;
    }

    public String getBankReturnMsg() {
        return bankReturnMsg;
    }

    public void setBankReturnMsg(String bankReturnMsg) {
        this.bankReturnMsg = bankReturnMsg;
    }

    public Integer getBankLocationMatchFlag() {
        return bankLocationMatchFlag;
    }

    public void setBankLocationMatchFlag(Integer bankLocationMatchFlag) {
        this.bankLocationMatchFlag = bankLocationMatchFlag;
    }

    public String getBankLocationMatchName() {
        return bankLocationMatchName;
    }

    public void setBankLocationMatchName(String bankLocationMatchName) {
        this.bankLocationMatchName = bankLocationMatchName;
    }

    public String getMoneyWay() {
        return moneyWay;
    }

    public void setMoneyWay(String moneyWay) {
        this.moneyWay = moneyWay;
    }

    public String getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(String accountingDate) {
        this.accountingDate = accountingDate;
    }

    public String getFgUniqueId() {
        return fgUniqueId;
    }

    public void setFgUniqueId(String fgUniqueId) {
        this.fgUniqueId = fgUniqueId;
    }

    public String getMatchBankId() {
        return matchBankId;
    }

    public void setMatchBankId(String matchBankId) {
        this.matchBankId = matchBankId;
    }

    public String getMatchAreaCode() {
        return matchAreaCode;
    }

    public void setMatchAreaCode(String matchAreaCode) {
        this.matchAreaCode = matchAreaCode;
    }

    public String getBankDetailReconcile() {
        return bankDetailReconcile;
    }

    public void setBankDetailReconcile(String bankDetailReconcile) {
        this.bankDetailReconcile = bankDetailReconcile;
    }

    public String getReconcileFileReconcile() {
        return reconcileFileReconcile;
    }

    public void setReconcileFileReconcile(String reconcileFileReconcile) {
        this.reconcileFileReconcile = reconcileFileReconcile;
    }

    public String getTotalAmountReconcile() {
        return totalAmountReconcile;
    }

    public void setTotalAmountReconcile(String totalAmountReconcile) {
        this.totalAmountReconcile = totalAmountReconcile;
    }

    public String getFailBankDetailReconcile() {
        return failBankDetailReconcile;
    }

    public void setFailBankDetailReconcile(String failBankDetailReconcile) {
        this.failBankDetailReconcile = failBankDetailReconcile;
    }

    public String getFailAccountingDate() {
        return failAccountingDate;
    }

    public void setFailAccountingDate(String failAccountingDate) {
        this.failAccountingDate = failAccountingDate;
    }

    public Date getCycleDate() {
        return cycleDate;
    }

    public void setCycleDate(Date cycleDate) {
        this.cycleDate = cycleDate;
    }

    public Date getFailCycleDate() {
        return failCycleDate;
    }

    public void setFailCycleDate(Date failCycleDate) {
        this.failCycleDate = failCycleDate;
    }

    public String getSupportCreditFlag() {
        return supportCreditFlag;
    }

    public void setSupportCreditFlag(String supportCreditFlag) {
        this.supportCreditFlag = supportCreditFlag;
    }

    public String getUnionPayCardType() {
        return unionPayCardType;
    }

    public void setUnionPayCardType(String unionPayCardType) {
        this.unionPayCardType = unionPayCardType;
    }

    public String getAbsTract() {
        return absTract;
    }

    public void setAbsTract(String absTract) {
        this.absTract = absTract;
    }

    public String getComplianceState() {
        return complianceState;
    }

    public void setComplianceState(String complianceState) {
        this.complianceState = complianceState;
    }

    public String getComplianceInfo() {
        return complianceInfo;
    }

    public void setComplianceInfo(String complianceInfo) {
        this.complianceInfo = complianceInfo;
    }

    public String getOverLength() {
        return overLength;
    }

    public void setOverLength(String overLength) {
        this.overLength = overLength;
    }

    public Integer getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }

    public Double getDecodeAmount() {
        return decodeAmount;
    }

    public void setDecodeAmount(Double decodeAmount) {
        this.decodeAmount = decodeAmount;
    }

    public String getAccountingFlag() {
        return accountingFlag;
    }

    public void setAccountingFlag(String accountingFlag) {
        this.accountingFlag = accountingFlag;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getBankReturnTime() {
        return bankReturnTime;
    }

    public void setBankReturnTime(Date bankReturnTime) {
        this.bankReturnTime = bankReturnTime;
    }

    public String getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    public String getCustAreaName() {
        return custAreaName;
    }

    public void setCustAreaName(String custAreaName) {
        this.custAreaName = custAreaName;
    }

    public String getEncryptFlag() {
        return encryptFlag;
    }

    public void setEncryptFlag(String encryptFlag) {
        this.encryptFlag = encryptFlag;
    }

    public String getConvertedBdNo() {
        return convertedBdNo;
    }

    public void setConvertedBdNo(String convertedBdNo) {
        this.convertedBdNo = convertedBdNo;
    }

    public String getRiskControlState() {
        return riskControlState;
    }

    public void setRiskControlState(String riskControlState) {
        this.riskControlState = riskControlState;
    }

    public String getRiskControlHitType() {
        return riskControlHitType;
    }

    public void setRiskControlHitType(String riskControlHitType) {
        this.riskControlHitType = riskControlHitType;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getSendBankTime() {
        return sendBankTime;
    }

    public void setSendBankTime(Date sendBankTime) {
        this.sendBankTime = sendBankTime;
    }

    public String getFailReconcileType() {
        return failReconcileType;
    }

    public void setFailReconcileType(String failReconcileType) {
        this.failReconcileType = failReconcileType;
    }

    public Date getLastQueryTime() {
        return lastQueryTime;
    }

    public void setLastQueryTime(Date lastQueryTime) {
        this.lastQueryTime = lastQueryTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getDayFlowNo() {
        return dayFlowNo;
    }

    public void setDayFlowNo(String dayFlowNo) {
        this.dayFlowNo = dayFlowNo;
    }

    public String getAccountingNo() {
        return accountingNo;
    }

    public void setAccountingNo(String accountingNo) {
        this.accountingNo = accountingNo;
    }

    public Integer getRemainQueryCount() {
        return remainQueryCount;
    }

    public void setRemainQueryCount(Integer remainQueryCount) {
        this.remainQueryCount = remainQueryCount;
    }

    public String getProtocolNum() {
        return protocolNum;
    }

    public void setProtocolNum(String protocolNum) {
        this.protocolNum = protocolNum;
    }

    public String getAgreementNo() {
        return agreementNo;
    }

    public void setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
    }

    public String getSignBusType() {
        return signBusType;
    }

    public void setSignBusType(String signBusType) {
        this.signBusType = signBusType;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public String getSignTrans() {
        return signTrans;
    }

    public void setSignTrans(String signTrans) {
        this.signTrans = signTrans;
    }

    public String getMatchedAreaCode() {
        return matchedAreaCode;
    }

    public void setMatchedAreaCode(String matchedAreaCode) {
        this.matchedAreaCode = matchedAreaCode;
    }

    public String getMatchedBankLocationCode() {
        return matchedBankLocationCode;
    }

    public void setMatchedBankLocationCode(String matchedBankLocationCode) {
        this.matchedBankLocationCode = matchedBankLocationCode;
    }

    public String getMatchedBankLocationName() {
        return matchedBankLocationName;
    }

    public void setMatchedBankLocationName(String matchedBankLocationName) {
        this.matchedBankLocationName = matchedBankLocationName;
    }

    public String getMatchedCustBankCode() {
        return matchedCustBankCode;
    }

    public void setMatchedCustBankCode(String matchedCustBankCode) {
        this.matchedCustBankCode = matchedCustBankCode;
    }

    public String getRefundFlag() {
        return refundFlag;
    }

    public void setRefundFlag(String refundFlag) {
        this.refundFlag = refundFlag;
    }

    public String getIcbcSignRespMsg() {
        return icbcSignRespMsg;
    }

    public void setIcbcSignRespMsg(String icbcSignRespMsg) {
        this.icbcSignRespMsg = icbcSignRespMsg;
    }

    public String getFgResultOutLibrary() {
        return fgResultOutLibrary;
    }

    public void setFgResultOutLibrary(String fgResultOutLibrary) {
        this.fgResultOutLibrary = fgResultOutLibrary;
    }

    public String getCurrentBankReturnResult() {
        return currentBankReturnResult;
    }

    public void setCurrentBankReturnResult(String currentBankReturnResult) {
        this.currentBankReturnResult = currentBankReturnResult;
    }

    public String getBelongAreaMatched() {
        return belongAreaMatched;
    }

    public void setBelongAreaMatched(String belongAreaMatched) {
        this.belongAreaMatched = belongAreaMatched;
    }

    public String getBelongAreaMatchRule() {
        return belongAreaMatchRule;
    }

    public void setBelongAreaMatchRule(String belongAreaMatchRule) {
        this.belongAreaMatchRule = belongAreaMatchRule;
    }

    public String getSourceBankReturnCode() {
        return sourceBankReturnCode;
    }

    public void setSourceBankReturnCode(String sourceBankReturnCode) {
        this.sourceBankReturnCode = sourceBankReturnCode;
    }

    public String getSourceBankReturnMsg() {
        return sourceBankReturnMsg;
    }

    public void setSourceBankReturnMsg(String sourceBankReturnMsg) {
        this.sourceBankReturnMsg = sourceBankReturnMsg;
    }

}
