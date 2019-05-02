/*
 * Accounts
 * The Accounts API allows you to retrieve account and transaction data for Citi Customers who have authorized your app. In most cases, you'll want to request a summary of all accounts first, which will return basic account information and accountIds. Once you have this information, you can request additional account details and/or transactions.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * ReadyCreditAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-02T21:41:07.549Z")
public class ReadyCreditAccount {
  @SerializedName("productName")
  private String productName = null;

  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("displayAccountNumber")
  private String displayAccountNumber = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("outstandingBalance")
  private Double outstandingBalance = null;

  @SerializedName("lastStatementBalance")
  private Double lastStatementBalance = null;

  @SerializedName("lastStatementDate")
  private LocalDate lastStatementDate = null;

  @SerializedName("minimumDueAmount")
  private Double minimumDueAmount = null;

  @SerializedName("creditLimit")
  private Double creditLimit = null;

  @SerializedName("availableCredit")
  private Double availableCredit = null;

  @SerializedName("cashAdvanceLimit")
  private Double cashAdvanceLimit = null;

  @SerializedName("cashAdvanceAvailableAmount")
  private Double cashAdvanceAvailableAmount = null;

  @SerializedName("lastPaymentAmount")
  private Double lastPaymentAmount = null;

  @SerializedName("lastPaymentDate")
  private LocalDate lastPaymentDate = null;

  @SerializedName("nextPaymentAmount")
  private Double nextPaymentAmount = null;

  @SerializedName("nextPaymentDate")
  private LocalDate nextPaymentDate = null;

  public ReadyCreditAccount productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * The name of the product
   * @return productName
  **/
  @ApiModelProperty(example = "Ready Credit Account", value = "The name of the product")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ReadyCreditAccount productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * A unique code that identifies the product
   * @return productCode
  **/
  @ApiModelProperty(example = "0900_VC301", value = "A unique code that identifies the product")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public ReadyCreditAccount displayAccountNumber(String displayAccountNumber) {
    this.displayAccountNumber = displayAccountNumber;
    return this;
  }

   /**
   * A masked account number that can be displayed to the customer
   * @return displayAccountNumber
  **/
  @ApiModelProperty(example = "XXXXXX2364", required = true, value = "A masked account number that can be displayed to the customer")
  public String getDisplayAccountNumber() {
    return displayAccountNumber;
  }

  public void setDisplayAccountNumber(String displayAccountNumber) {
    this.displayAccountNumber = displayAccountNumber;
  }

  public ReadyCreditAccount currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code of the account in ISO 4217 format
   * @return currencyCode
  **/
  @ApiModelProperty(example = "EUR", value = "The currency code of the account in ISO 4217 format")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ReadyCreditAccount outstandingBalance(Double outstandingBalance) {
    this.outstandingBalance = outstandingBalance;
    return this;
  }

   /**
   * The amount of money owed
   * @return outstandingBalance
  **/
  @ApiModelProperty(example = "10000.25", value = "The amount of money owed")
  public Double getOutstandingBalance() {
    return outstandingBalance;
  }

  public void setOutstandingBalance(Double outstandingBalance) {
    this.outstandingBalance = outstandingBalance;
  }

  public ReadyCreditAccount lastStatementBalance(Double lastStatementBalance) {
    this.lastStatementBalance = lastStatementBalance;
    return this;
  }

   /**
   * The balance on last statement date
   * @return lastStatementBalance
  **/
  @ApiModelProperty(example = "15000.25", value = "The balance on last statement date")
  public Double getLastStatementBalance() {
    return lastStatementBalance;
  }

  public void setLastStatementBalance(Double lastStatementBalance) {
    this.lastStatementBalance = lastStatementBalance;
  }

  public ReadyCreditAccount lastStatementDate(LocalDate lastStatementDate) {
    this.lastStatementDate = lastStatementDate;
    return this;
  }

   /**
   * The date of the last statement in ISO 8601 date format YYYY-MM-DD
   * @return lastStatementDate
  **/
  @ApiModelProperty(example = "2015-06-25", value = "The date of the last statement in ISO 8601 date format YYYY-MM-DD")
  public LocalDate getLastStatementDate() {
    return lastStatementDate;
  }

  public void setLastStatementDate(LocalDate lastStatementDate) {
    this.lastStatementDate = lastStatementDate;
  }

  public ReadyCreditAccount minimumDueAmount(Double minimumDueAmount) {
    this.minimumDueAmount = minimumDueAmount;
    return this;
  }

   /**
   * Minimum due amount for a payment cycle
   * @return minimumDueAmount
  **/
  @ApiModelProperty(example = "1500.25", value = "Minimum due amount for a payment cycle")
  public Double getMinimumDueAmount() {
    return minimumDueAmount;
  }

  public void setMinimumDueAmount(Double minimumDueAmount) {
    this.minimumDueAmount = minimumDueAmount;
  }

  public ReadyCreditAccount creditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * The maximum amount of credit that extend to a customer
   * @return creditLimit
  **/
  @ApiModelProperty(example = "50000.25", value = "The maximum amount of credit that extend to a customer")
  public Double getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
  }

  public ReadyCreditAccount availableCredit(Double availableCredit) {
    this.availableCredit = availableCredit;
    return this;
  }

   /**
   * Available credit limit of ready credit account
   * @return availableCredit
  **/
  @ApiModelProperty(example = "3750.5", value = "Available credit limit of ready credit account")
  public Double getAvailableCredit() {
    return availableCredit;
  }

  public void setAvailableCredit(Double availableCredit) {
    this.availableCredit = availableCredit;
  }

  public ReadyCreditAccount cashAdvanceLimit(Double cashAdvanceLimit) {
    this.cashAdvanceLimit = cashAdvanceLimit;
    return this;
  }

   /**
   * Some percentage of credit limit to withdraw cash
   * @return cashAdvanceLimit
  **/
  @ApiModelProperty(example = "15000.25", value = "Some percentage of credit limit to withdraw cash")
  public Double getCashAdvanceLimit() {
    return cashAdvanceLimit;
  }

  public void setCashAdvanceLimit(Double cashAdvanceLimit) {
    this.cashAdvanceLimit = cashAdvanceLimit;
  }

  public ReadyCreditAccount cashAdvanceAvailableAmount(Double cashAdvanceAvailableAmount) {
    this.cashAdvanceAvailableAmount = cashAdvanceAvailableAmount;
    return this;
  }

   /**
   * The amount available under cash advance limit
   * @return cashAdvanceAvailableAmount
  **/
  @ApiModelProperty(example = "15000.25", value = "The amount available under cash advance limit")
  public Double getCashAdvanceAvailableAmount() {
    return cashAdvanceAvailableAmount;
  }

  public void setCashAdvanceAvailableAmount(Double cashAdvanceAvailableAmount) {
    this.cashAdvanceAvailableAmount = cashAdvanceAvailableAmount;
  }

  public ReadyCreditAccount lastPaymentAmount(Double lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

   /**
   * The amount of the last payment made
   * @return lastPaymentAmount
  **/
  @ApiModelProperty(example = "1500.25", value = "The amount of the last payment made")
  public Double getLastPaymentAmount() {
    return lastPaymentAmount;
  }

  public void setLastPaymentAmount(Double lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }

  public ReadyCreditAccount lastPaymentDate(LocalDate lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

   /**
   * The date of the last payment in ISO 8601 date format YYYY-MM-DD
   * @return lastPaymentDate
  **/
  @ApiModelProperty(example = "2015-06-12", value = "The date of the last payment in ISO 8601 date format YYYY-MM-DD")
  public LocalDate getLastPaymentDate() {
    return lastPaymentDate;
  }

  public void setLastPaymentDate(LocalDate lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }

  public ReadyCreditAccount nextPaymentAmount(Double nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

   /**
   * The next payment amount due
   * @return nextPaymentAmount
  **/
  @ApiModelProperty(example = "1500.25", value = "The next payment amount due")
  public Double getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  public void setNextPaymentAmount(Double nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public ReadyCreditAccount nextPaymentDate(LocalDate nextPaymentDate) {
    this.nextPaymentDate = nextPaymentDate;
    return this;
  }

   /**
   * The date of the next payment in ISO 8601 date format YYYY-MM-DD
   * @return nextPaymentDate
  **/
  @ApiModelProperty(example = "2015-06-12", value = "The date of the next payment in ISO 8601 date format YYYY-MM-DD")
  public LocalDate getNextPaymentDate() {
    return nextPaymentDate;
  }

  public void setNextPaymentDate(LocalDate nextPaymentDate) {
    this.nextPaymentDate = nextPaymentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadyCreditAccount readyCreditAccount = (ReadyCreditAccount) o;
    return Objects.equals(this.productName, readyCreditAccount.productName) &&
        Objects.equals(this.productCode, readyCreditAccount.productCode) &&
        Objects.equals(this.displayAccountNumber, readyCreditAccount.displayAccountNumber) &&
        Objects.equals(this.currencyCode, readyCreditAccount.currencyCode) &&
        Objects.equals(this.outstandingBalance, readyCreditAccount.outstandingBalance) &&
        Objects.equals(this.lastStatementBalance, readyCreditAccount.lastStatementBalance) &&
        Objects.equals(this.lastStatementDate, readyCreditAccount.lastStatementDate) &&
        Objects.equals(this.minimumDueAmount, readyCreditAccount.minimumDueAmount) &&
        Objects.equals(this.creditLimit, readyCreditAccount.creditLimit) &&
        Objects.equals(this.availableCredit, readyCreditAccount.availableCredit) &&
        Objects.equals(this.cashAdvanceLimit, readyCreditAccount.cashAdvanceLimit) &&
        Objects.equals(this.cashAdvanceAvailableAmount, readyCreditAccount.cashAdvanceAvailableAmount) &&
        Objects.equals(this.lastPaymentAmount, readyCreditAccount.lastPaymentAmount) &&
        Objects.equals(this.lastPaymentDate, readyCreditAccount.lastPaymentDate) &&
        Objects.equals(this.nextPaymentAmount, readyCreditAccount.nextPaymentAmount) &&
        Objects.equals(this.nextPaymentDate, readyCreditAccount.nextPaymentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productName, productCode, displayAccountNumber, currencyCode, outstandingBalance, lastStatementBalance, lastStatementDate, minimumDueAmount, creditLimit, availableCredit, cashAdvanceLimit, cashAdvanceAvailableAmount, lastPaymentAmount, lastPaymentDate, nextPaymentAmount, nextPaymentDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadyCreditAccount {\n");
    
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    displayAccountNumber: ").append(toIndentedString(displayAccountNumber)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    outstandingBalance: ").append(toIndentedString(outstandingBalance)).append("\n");
    sb.append("    lastStatementBalance: ").append(toIndentedString(lastStatementBalance)).append("\n");
    sb.append("    lastStatementDate: ").append(toIndentedString(lastStatementDate)).append("\n");
    sb.append("    minimumDueAmount: ").append(toIndentedString(minimumDueAmount)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    availableCredit: ").append(toIndentedString(availableCredit)).append("\n");
    sb.append("    cashAdvanceLimit: ").append(toIndentedString(cashAdvanceLimit)).append("\n");
    sb.append("    cashAdvanceAvailableAmount: ").append(toIndentedString(cashAdvanceAvailableAmount)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    nextPaymentDate: ").append(toIndentedString(nextPaymentDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

