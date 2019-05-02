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
import io.swagger.client.model.AccountGroupSummary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountsGroupList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-02T21:41:07.549Z")
public class AccountsGroupList {
  @SerializedName("accountGroupSummary")
  private List<AccountGroupSummary> accountGroupSummary = null;

  @SerializedName("nextStartIndex")
  private String nextStartIndex = null;

  public AccountsGroupList accountGroupSummary(List<AccountGroupSummary> accountGroupSummary) {
    this.accountGroupSummary = accountGroupSummary;
    return this;
  }

  public AccountsGroupList addAccountGroupSummaryItem(AccountGroupSummary accountGroupSummaryItem) {
    if (this.accountGroupSummary == null) {
      this.accountGroupSummary = new ArrayList<AccountGroupSummary>();
    }
    this.accountGroupSummary.add(accountGroupSummaryItem);
    return this;
  }

   /**
   * Summarized list of every product group by the customer
   * @return accountGroupSummary
  **/
  @ApiModelProperty(value = "Summarized list of every product group by the customer")
  public List<AccountGroupSummary> getAccountGroupSummary() {
    return accountGroupSummary;
  }

  public void setAccountGroupSummary(List<AccountGroupSummary> accountGroupSummary) {
    this.accountGroupSummary = accountGroupSummary;
  }

  public AccountsGroupList nextStartIndex(String nextStartIndex) {
    this.nextStartIndex = nextStartIndex;
    return this;
  }

   /**
   * In some cases there is more data than what can be returned in a single response. If there is additional data available a nextStartIndex will be returned. Pass the nextStartIndex in your next request to retrieve the next set of data.
   * @return nextStartIndex
  **/
  @ApiModelProperty(example = "11", value = "In some cases there is more data than what can be returned in a single response. If there is additional data available a nextStartIndex will be returned. Pass the nextStartIndex in your next request to retrieve the next set of data.")
  public String getNextStartIndex() {
    return nextStartIndex;
  }

  public void setNextStartIndex(String nextStartIndex) {
    this.nextStartIndex = nextStartIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsGroupList accountsGroupList = (AccountsGroupList) o;
    return Objects.equals(this.accountGroupSummary, accountsGroupList.accountGroupSummary) &&
        Objects.equals(this.nextStartIndex, accountsGroupList.nextStartIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroupSummary, nextStartIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsGroupList {\n");
    
    sb.append("    accountGroupSummary: ").append(toIndentedString(accountGroupSummary)).append("\n");
    sb.append("    nextStartIndex: ").append(toIndentedString(nextStartIndex)).append("\n");
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

