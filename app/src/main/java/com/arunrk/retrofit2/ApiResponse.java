package com.arunrk.retrofit2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {

    public boolean error;
    public String message;

    @SerializedName("company")
    public List<Company> companyList;

}

class Company {

    @SerializedName("SUPP_ID")
    public int suppId;

    @SerializedName("SUPP_CODE")
    public String suppCode;

    @SerializedName("CO_ID")
    public String coID;

    @SerializedName("CO_NAME")
    public String coName;

    @SerializedName("SUPP_NAME")
    public String suppName;

    @SerializedName("SUPP_SHORT_NAME")
    public String suppShName;

    @SerializedName("SUPP_MOBILE_1")
    public String suppMobile1;

    @SerializedName("SUPP_MOBILE_2")
    public String suppMobile2;

    @SerializedName("SUPP_PHONE_1")
    public String suppPhone1;

    @SerializedName("SUPP_PHONE_2")
    public String getSuppPhone2;

    @SerializedName("SUPP_EMAIL")
    public String suppEmail;

    @SerializedName("SUPP_ADDR_1")
    public String suppAddr1;

    @SerializedName("SUPP_ADDR_2")
    public String getSuppAddr2;

    @SerializedName("SUPP_ADDR_3")
    public String suppAddr3;

    @SerializedName("SUPP_ADDR_4")
    public String suppAddr4;

    @SerializedName("SUPP_ADDR_5")
    public String suppAddr5;

    @SerializedName("SUPP_CITY_ID")
    public String suppCityId;

    @SerializedName("SUPP_CITY_NAME")
    public String suppCityName;

    @SerializedName("SUPP_STATE_ID")
    public String suppStateId;

    @SerializedName("SUPP_STATE_NAME")
    public String suppStateName;

    @SerializedName("SUPP_COUNTRY_ID")
    public String suppCountryId;

    @SerializedName("SUPP_COUNTYR_NAME")
    public String suppCountryName;

    @SerializedName("SUPP_DF_PT_ID")
    public int suppDfPtId;

    @SerializedName("SUPP_PT_CODE")
    public String suppPtCode;

    @SerializedName("SUPP_CR_UID")
    public int suppCrUid;

    @SerializedName("SUPP_CR_DT")
    public String suppCrDt;
    //"2019-05-06 15:40:07"

    @SerializedName("SUPP_UP_UID")
    public int suppUpUid;

    @SerializedName("SUPP_UP_DT")
    public String suppUpDt;

    @SerializedName("SUPP_FRZ_YN")
    public int suppFrzYn;

    @SerializedName("SUPP_IS_DELETED")
    public int suppIsDeleted;

}
