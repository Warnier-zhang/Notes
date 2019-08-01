package org.warnier.zhang.notes.mybatis3.generator.model;

import java.io.Serializable;
import java.util.Date;

public class Link implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CMS_LINK.LINK_ID
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    private Long linkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CMS_LINK.LINK_NAME
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    private String linkName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CMS_LINK.LINK_URL
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    private String linkUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CMS_LINK.LINK_DESCRIPTION
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    private String linkDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CMS_LINK.LINK_CATE_ID
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    private Long linkCateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CMS_LINK.LINK_CREATE_TIME
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    private Date linkCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CMS_LINK.LINK_CREATE_USER
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    private Long linkCreateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CMS_LINK.LINK_AVAILABLE
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    private String linkAvailable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CMS_LINK.LINK_ID
     *
     * @return the value of CMS_LINK.LINK_ID
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public Long getLinkId() {
        return linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CMS_LINK.LINK_ID
     *
     * @param linkId the value for CMS_LINK.LINK_ID
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CMS_LINK.LINK_NAME
     *
     * @return the value of CMS_LINK.LINK_NAME
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CMS_LINK.LINK_NAME
     *
     * @param linkName the value for CMS_LINK.LINK_NAME
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CMS_LINK.LINK_URL
     *
     * @return the value of CMS_LINK.LINK_URL
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CMS_LINK.LINK_URL
     *
     * @param linkUrl the value for CMS_LINK.LINK_URL
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CMS_LINK.LINK_DESCRIPTION
     *
     * @return the value of CMS_LINK.LINK_DESCRIPTION
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public String getLinkDescription() {
        return linkDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CMS_LINK.LINK_DESCRIPTION
     *
     * @param linkDescription the value for CMS_LINK.LINK_DESCRIPTION
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription == null ? null : linkDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CMS_LINK.LINK_CATE_ID
     *
     * @return the value of CMS_LINK.LINK_CATE_ID
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public Long getLinkCateId() {
        return linkCateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CMS_LINK.LINK_CATE_ID
     *
     * @param linkCateId the value for CMS_LINK.LINK_CATE_ID
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void setLinkCateId(Long linkCateId) {
        this.linkCateId = linkCateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CMS_LINK.LINK_CREATE_TIME
     *
     * @return the value of CMS_LINK.LINK_CREATE_TIME
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public Date getLinkCreateTime() {
        return linkCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CMS_LINK.LINK_CREATE_TIME
     *
     * @param linkCreateTime the value for CMS_LINK.LINK_CREATE_TIME
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void setLinkCreateTime(Date linkCreateTime) {
        this.linkCreateTime = linkCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CMS_LINK.LINK_CREATE_USER
     *
     * @return the value of CMS_LINK.LINK_CREATE_USER
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public Long getLinkCreateUser() {
        return linkCreateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CMS_LINK.LINK_CREATE_USER
     *
     * @param linkCreateUser the value for CMS_LINK.LINK_CREATE_USER
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void setLinkCreateUser(Long linkCreateUser) {
        this.linkCreateUser = linkCreateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CMS_LINK.LINK_AVAILABLE
     *
     * @return the value of CMS_LINK.LINK_AVAILABLE
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public String getLinkAvailable() {
        return linkAvailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CMS_LINK.LINK_AVAILABLE
     *
     * @param linkAvailable the value for CMS_LINK.LINK_AVAILABLE
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void setLinkAvailable(String linkAvailable) {
        this.linkAvailable = linkAvailable == null ? null : linkAvailable.trim();
    }
}