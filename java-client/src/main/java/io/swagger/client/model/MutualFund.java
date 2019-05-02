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
 * MutualFund
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-02T21:41:07.549Z")
public class MutualFund {
  @SerializedName("netAssetValueAmount")
  private Double netAssetValueAmount = null;

  @SerializedName("fundCode")
  private String fundCode = null;

  @SerializedName("fundName")
  private String fundName = null;

  @SerializedName("investmentAmount")
  private Double investmentAmount = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("maturityDate")
  private LocalDate maturityDate = null;

  @SerializedName("availableUnits")
  private Double availableUnits = null;

  @SerializedName("settledUnits")
  private Double settledUnits = null;

  @SerializedName("assignedUnits")
  private Double assignedUnits = null;

  @SerializedName("confirmedUnits")
  private Double confirmedUnits = null;

  @SerializedName("pendingUnits")
  private Double pendingUnits = null;

  @SerializedName("blockUnits")
  private Double blockUnits = null;

  @SerializedName("unrealizedGains")
  private Double unrealizedGains = null;

  @SerializedName("unrealizedPercentageGain")
  private Double unrealizedPercentageGain = null;

  @SerializedName("latestPrice")
  private Double latestPrice = null;

  public MutualFund netAssetValueAmount(Double netAssetValueAmount) {
    this.netAssetValueAmount = netAssetValueAmount;
    return this;
  }

   /**
   * The current market worth of investment
   * @return netAssetValueAmount
  **/
  @ApiModelProperty(example = "166171.53", value = "The current market worth of investment")
  public Double getNetAssetValueAmount() {
    return netAssetValueAmount;
  }

  public void setNetAssetValueAmount(Double netAssetValueAmount) {
    this.netAssetValueAmount = netAssetValueAmount;
  }

  public MutualFund fundCode(String fundCode) {
    this.fundCode = fundCode;
    return this;
  }

   /**
   * The code of the fund
   * @return fundCode
  **/
  @ApiModelProperty(example = "AFZ03", value = "The code of the fund")
  public String getFundCode() {
    return fundCode;
  }

  public void setFundCode(String fundCode) {
    this.fundCode = fundCode;
  }

  public MutualFund fundName(String fundName) {
    this.fundName = fundName;
    return this;
  }

   /**
   * The name of the fund
   * @return fundName
  **/
  @ApiModelProperty(example = "AXA - Australian Property Fund", value = "The name of the fund")
  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }

  public MutualFund investmentAmount(Double investmentAmount) {
    this.investmentAmount = investmentAmount;
    return this;
  }

   /**
   * The investment amount
   * @return investmentAmount
  **/
  @ApiModelProperty(example = "166000.25", value = "The investment amount")
  public Double getInvestmentAmount() {
    return investmentAmount;
  }

  public void setInvestmentAmount(Double investmentAmount) {
    this.investmentAmount = investmentAmount;
  }

  public MutualFund currencyCode(String currencyCode) {
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

  public MutualFund maturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * The maturity date in ISO 8601 format YYYY-MM-DD
   * @return maturityDate
  **/
  @ApiModelProperty(example = "2018-12-31", value = "The maturity date in ISO 8601 format YYYY-MM-DD")
  public LocalDate getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
  }

  public MutualFund availableUnits(Double availableUnits) {
    this.availableUnits = availableUnits;
    return this;
  }

   /**
   * The available units
   * @return availableUnits
  **/
  @ApiModelProperty(example = "1000.25", value = "The available units")
  public Double getAvailableUnits() {
    return availableUnits;
  }

  public void setAvailableUnits(Double availableUnits) {
    this.availableUnits = availableUnits;
  }

  public MutualFund settledUnits(Double settledUnits) {
    this.settledUnits = settledUnits;
    return this;
  }

   /**
   * The settled units
   * @return settledUnits
  **/
  @ApiModelProperty(example = "800.25", value = "The settled units")
  public Double getSettledUnits() {
    return settledUnits;
  }

  public void setSettledUnits(Double settledUnits) {
    this.settledUnits = settledUnits;
  }

  public MutualFund assignedUnits(Double assignedUnits) {
    this.assignedUnits = assignedUnits;
    return this;
  }

   /**
   * The assigned units
   * @return assignedUnits
  **/
  @ApiModelProperty(example = "1000.25", value = "The assigned units")
  public Double getAssignedUnits() {
    return assignedUnits;
  }

  public void setAssignedUnits(Double assignedUnits) {
    this.assignedUnits = assignedUnits;
  }

  public MutualFund confirmedUnits(Double confirmedUnits) {
    this.confirmedUnits = confirmedUnits;
    return this;
  }

   /**
   * The confirmed units
   * @return confirmedUnits
  **/
  @ApiModelProperty(example = "800.25", value = "The confirmed units")
  public Double getConfirmedUnits() {
    return confirmedUnits;
  }

  public void setConfirmedUnits(Double confirmedUnits) {
    this.confirmedUnits = confirmedUnits;
  }

  public MutualFund pendingUnits(Double pendingUnits) {
    this.pendingUnits = pendingUnits;
    return this;
  }

   /**
   * The pending units
   * @return pendingUnits
  **/
  @ApiModelProperty(example = "200.25", value = "The pending units")
  public Double getPendingUnits() {
    return pendingUnits;
  }

  public void setPendingUnits(Double pendingUnits) {
    this.pendingUnits = pendingUnits;
  }

  public MutualFund blockUnits(Double blockUnits) {
    this.blockUnits = blockUnits;
    return this;
  }

   /**
   * The blocked units
   * @return blockUnits
  **/
  @ApiModelProperty(example = "0.0", value = "The blocked units")
  public Double getBlockUnits() {
    return blockUnits;
  }

  public void setBlockUnits(Double blockUnits) {
    this.blockUnits = blockUnits;
  }

  public MutualFund unrealizedGains(Double unrealizedGains) {
    this.unrealizedGains = unrealizedGains;
    return this;
  }

   /**
   * The unrealized gain
   * @return unrealizedGains
  **/
  @ApiModelProperty(example = "10.25", value = "The unrealized gain")
  public Double getUnrealizedGains() {
    return unrealizedGains;
  }

  public void setUnrealizedGains(Double unrealizedGains) {
    this.unrealizedGains = unrealizedGains;
  }

  public MutualFund unrealizedPercentageGain(Double unrealizedPercentageGain) {
    this.unrealizedPercentageGain = unrealizedPercentageGain;
    return this;
  }

   /**
   * The unrealized gain in percentage
   * @return unrealizedPercentageGain
  **/
  @ApiModelProperty(example = "12.5", value = "The unrealized gain in percentage")
  public Double getUnrealizedPercentageGain() {
    return unrealizedPercentageGain;
  }

  public void setUnrealizedPercentageGain(Double unrealizedPercentageGain) {
    this.unrealizedPercentageGain = unrealizedPercentageGain;
  }

  public MutualFund latestPrice(Double latestPrice) {
    this.latestPrice = latestPrice;
    return this;
  }

   /**
   * The latest price
   * @return latestPrice
  **/
  @ApiModelProperty(example = "15.25", value = "The latest price")
  public Double getLatestPrice() {
    return latestPrice;
  }

  public void setLatestPrice(Double latestPrice) {
    this.latestPrice = latestPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MutualFund mutualFund = (MutualFund) o;
    return Objects.equals(this.netAssetValueAmount, mutualFund.netAssetValueAmount) &&
        Objects.equals(this.fundCode, mutualFund.fundCode) &&
        Objects.equals(this.fundName, mutualFund.fundName) &&
        Objects.equals(this.investmentAmount, mutualFund.investmentAmount) &&
        Objects.equals(this.currencyCode, mutualFund.currencyCode) &&
        Objects.equals(this.maturityDate, mutualFund.maturityDate) &&
        Objects.equals(this.availableUnits, mutualFund.availableUnits) &&
        Objects.equals(this.settledUnits, mutualFund.settledUnits) &&
        Objects.equals(this.assignedUnits, mutualFund.assignedUnits) &&
        Objects.equals(this.confirmedUnits, mutualFund.confirmedUnits) &&
        Objects.equals(this.pendingUnits, mutualFund.pendingUnits) &&
        Objects.equals(this.blockUnits, mutualFund.blockUnits) &&
        Objects.equals(this.unrealizedGains, mutualFund.unrealizedGains) &&
        Objects.equals(this.unrealizedPercentageGain, mutualFund.unrealizedPercentageGain) &&
        Objects.equals(this.latestPrice, mutualFund.latestPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netAssetValueAmount, fundCode, fundName, investmentAmount, currencyCode, maturityDate, availableUnits, settledUnits, assignedUnits, confirmedUnits, pendingUnits, blockUnits, unrealizedGains, unrealizedPercentageGain, latestPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MutualFund {\n");
    
    sb.append("    netAssetValueAmount: ").append(toIndentedString(netAssetValueAmount)).append("\n");
    sb.append("    fundCode: ").append(toIndentedString(fundCode)).append("\n");
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
    sb.append("    investmentAmount: ").append(toIndentedString(investmentAmount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    availableUnits: ").append(toIndentedString(availableUnits)).append("\n");
    sb.append("    settledUnits: ").append(toIndentedString(settledUnits)).append("\n");
    sb.append("    assignedUnits: ").append(toIndentedString(assignedUnits)).append("\n");
    sb.append("    confirmedUnits: ").append(toIndentedString(confirmedUnits)).append("\n");
    sb.append("    pendingUnits: ").append(toIndentedString(pendingUnits)).append("\n");
    sb.append("    blockUnits: ").append(toIndentedString(blockUnits)).append("\n");
    sb.append("    unrealizedGains: ").append(toIndentedString(unrealizedGains)).append("\n");
    sb.append("    unrealizedPercentageGain: ").append(toIndentedString(unrealizedPercentageGain)).append("\n");
    sb.append("    latestPrice: ").append(toIndentedString(latestPrice)).append("\n");
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

