package com.jossy.transaction.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-02T21:41:07.549Z")
public class Transaction {

	private String displayAccountNumber = null;

	private String transactionDate = null;

	private String transactionDescription = null;

	private String transactionReferenceId = null;

	private String checkSerialNumber = null;

	private Double transactionAmount = null;

	private String currencyCode = null;

	private BigDecimal foreignTransactionAmount = null;

	private String foreignCurrencyCode = null;

	private BigDecimal foreignExchangeRate = null;

	private String transactionType = null;

	private String transactionStatus = null;

	private Double runningBalance = null;

	private String transactionPostingDate = null;

	private String transactionCode = null;

	private String merchantName = null;

	private String eligibleForEqualPaymentPlan = null;

	private String statementDate;
	
	private String transactionAuthorizationCode;
	
		
	public String getTransactionAuthorizationCode() {
		return transactionAuthorizationCode;
	}

	public void setTransactionAuthorizationCode(String transactionAuthorizationCode) {
		this.transactionAuthorizationCode = transactionAuthorizationCode;
	}

	public String getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(String statementDate) {
		this.statementDate = statementDate;
	}

	public String getDisplayAccountNumber() {
		return displayAccountNumber;
	}

	public void setDisplayAccountNumber(String displayAccountNumber) {
		this.displayAccountNumber = displayAccountNumber;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getTransactionReferenceId() {
		return transactionReferenceId;
	}

	public void setTransactionReferenceId(String transactionReferenceId) {
		this.transactionReferenceId = transactionReferenceId;
	}

	public String getCheckSerialNumber() {
		return checkSerialNumber;
	}

	public void setCheckSerialNumber(String checkSerialNumber) {
		this.checkSerialNumber = checkSerialNumber;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getForeignTransactionAmount() {
		return foreignTransactionAmount;
	}

	public void setForeignTransactionAmount(BigDecimal foreignTransactionAmount) {
		this.foreignTransactionAmount = foreignTransactionAmount;
	}

	public String getForeignCurrencyCode() {
		return foreignCurrencyCode;
	}

	public void setForeignCurrencyCode(String foreignCurrencyCode) {
		this.foreignCurrencyCode = foreignCurrencyCode;
	}

	public BigDecimal getForeignExchangeRate() {
		return foreignExchangeRate;
	}

	public void setForeignExchangeRate(BigDecimal foreignExchangeRate) {
		this.foreignExchangeRate = foreignExchangeRate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public Double getRunningBalance() {
		return runningBalance;
	}

	public void setRunningBalance(Double runningBalance) {
		this.runningBalance = runningBalance;
	}

	public String getTransactionPostingDate() {
		return transactionPostingDate;
	}

	public void setTransactionPostingDate(String transactionPostingDate) {
		this.transactionPostingDate = transactionPostingDate;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getEligibleForEqualPaymentPlan() {
		return eligibleForEqualPaymentPlan;
	}

	public void setEligibleForEqualPaymentPlan(String eligibleForEqualPaymentPlan) {
		this.eligibleForEqualPaymentPlan = eligibleForEqualPaymentPlan;
	}

}
