package com.linkpets.core.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CmsAdoptAgreement {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.agreement_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String agreementId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.apply_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String applyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.adopter_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String adopterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.pet_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String petId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.apply_by
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String applyBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.agreement
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String agreement;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.adopter_name
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String adopterName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.adopter_idcard
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String adopterIdcard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.adopter_address
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String adopterAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.adopter_phone
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String adopterPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.adopter_sign
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String adopterSign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.apply_name
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String applyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.apply_idcard
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String applyIdcard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.apply_address
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String applyAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.apply_phone
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String applyPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.apply_sign
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String applySign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.sign_status
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String signStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.sign_time
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    @JsonFormat(pattern="yyyy年MM月dd日",timezone = "GMT+8")
    private Date signTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.create_by
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.create_date
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_adopt_agreement.is_valid
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    private String isValid;

    private String formId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.agreement_id
     *
     * @return the value of cms_adopt_agreement.agreement_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getAgreementId() {
        return agreementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.agreement_id
     *
     * @param agreementId the value for cms_adopt_agreement.agreement_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.apply_id
     *
     * @return the value of cms_adopt_agreement.apply_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.apply_id
     *
     * @param applyId the value for cms_adopt_agreement.apply_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.adopter_id
     *
     * @return the value of cms_adopt_agreement.adopter_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getAdopterId() {
        return adopterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.adopter_id
     *
     * @param adopterId the value for cms_adopt_agreement.adopter_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setAdopterId(String adopterId) {
        this.adopterId = adopterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.pet_id
     *
     * @return the value of cms_adopt_agreement.pet_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getPetId() {
        return petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.pet_id
     *
     * @param petId the value for cms_adopt_agreement.pet_id
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setPetId(String petId) {
        this.petId = petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.apply_by
     *
     * @return the value of cms_adopt_agreement.apply_by
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getApplyBy() {
        return applyBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.apply_by
     *
     * @param applyBy the value for cms_adopt_agreement.apply_by
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setApplyBy(String applyBy) {
        this.applyBy = applyBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.agreement
     *
     * @return the value of cms_adopt_agreement.agreement
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getAgreement() {
        return agreement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.agreement
     *
     * @param agreement the value for cms_adopt_agreement.agreement
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.adopter_name
     *
     * @return the value of cms_adopt_agreement.adopter_name
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getAdopterName() {
        return adopterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.adopter_name
     *
     * @param adopterName the value for cms_adopt_agreement.adopter_name
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.adopter_idcard
     *
     * @return the value of cms_adopt_agreement.adopter_idcard
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getAdopterIdcard() {
        return adopterIdcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.adopter_idcard
     *
     * @param adopterIdcard the value for cms_adopt_agreement.adopter_idcard
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setAdopterIdcard(String adopterIdcard) {
        this.adopterIdcard = adopterIdcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.adopter_address
     *
     * @return the value of cms_adopt_agreement.adopter_address
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getAdopterAddress() {
        return adopterAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.adopter_address
     *
     * @param adopterAddress the value for cms_adopt_agreement.adopter_address
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setAdopterAddress(String adopterAddress) {
        this.adopterAddress = adopterAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.adopter_phone
     *
     * @return the value of cms_adopt_agreement.adopter_phone
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getAdopterPhone() {
        return adopterPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.adopter_phone
     *
     * @param adopterPhone the value for cms_adopt_agreement.adopter_phone
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setAdopterPhone(String adopterPhone) {
        this.adopterPhone = adopterPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.adopter_sign
     *
     * @return the value of cms_adopt_agreement.adopter_sign
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getAdopterSign() {
        return adopterSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.adopter_sign
     *
     * @param adopterSign the value for cms_adopt_agreement.adopter_sign
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setAdopterSign(String adopterSign) {
        this.adopterSign = adopterSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.apply_name
     *
     * @return the value of cms_adopt_agreement.apply_name
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getApplyName() {
        return applyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.apply_name
     *
     * @param applyName the value for cms_adopt_agreement.apply_name
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.apply_idcard
     *
     * @return the value of cms_adopt_agreement.apply_idcard
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getApplyIdcard() {
        return applyIdcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.apply_idcard
     *
     * @param applyIdcard the value for cms_adopt_agreement.apply_idcard
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setApplyIdcard(String applyIdcard) {
        this.applyIdcard = applyIdcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.apply_address
     *
     * @return the value of cms_adopt_agreement.apply_address
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getApplyAddress() {
        return applyAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.apply_address
     *
     * @param applyAddress the value for cms_adopt_agreement.apply_address
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setApplyAddress(String applyAddress) {
        this.applyAddress = applyAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.apply_phone
     *
     * @return the value of cms_adopt_agreement.apply_phone
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getApplyPhone() {
        return applyPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.apply_phone
     *
     * @param applyPhone the value for cms_adopt_agreement.apply_phone
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setApplyPhone(String applyPhone) {
        this.applyPhone = applyPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.apply_sign
     *
     * @return the value of cms_adopt_agreement.apply_sign
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getApplySign() {
        return applySign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.apply_sign
     *
     * @param applySign the value for cms_adopt_agreement.apply_sign
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setApplySign(String applySign) {
        this.applySign = applySign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.sign_status
     *
     * @return the value of cms_adopt_agreement.sign_status
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getSignStatus() {
        return signStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.sign_status
     *
     * @param signStatus the value for cms_adopt_agreement.sign_status
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.sign_time
     *
     * @return the value of cms_adopt_agreement.sign_time
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.sign_time
     *
     * @param signTime the value for cms_adopt_agreement.sign_time
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.create_by
     *
     * @return the value of cms_adopt_agreement.create_by
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.create_by
     *
     * @param createBy the value for cms_adopt_agreement.create_by
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.create_date
     *
     * @return the value of cms_adopt_agreement.create_date
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.create_date
     *
     * @param createDate the value for cms_adopt_agreement.create_date
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_adopt_agreement.is_valid
     *
     * @return the value of cms_adopt_agreement.is_valid
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_adopt_agreement.is_valid
     *
     * @param isValid the value for cms_adopt_agreement.is_valid
     *
     * @mbggenerated Sun May 26 05:24:39 CST 2019
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }
}