package com.beeant.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table app_role
 *
 * @mbggenerated do_not_delete_during_merge Fri Mar 04 16:25:45 CST 2016
 */
public class AppRole implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private String id;

    /**
     * Database Column Remarks:
     *   外部节点ID
     *
     * This field was generated by MyBatis Generator.
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private String rootId;

    /**
     * Database Column Remarks:
     *   父ID
     *
     * This field was generated by MyBatis Generator.
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private String pid;

    /**
     * Database Column Remarks:
     *   全路径
     *
     * This field was generated by MyBatis Generator.
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private String fullPath;

    /**
     * Database Column Remarks:
     *   深度
     *
     * This field was generated by MyBatis Generator.
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private Integer grade;

    /**
     * Database Column Remarks:
     *   排序值
     *
     * This field was generated by MyBatis Generator.
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private Integer sortNum;

    /**
     * Database Column Remarks:
     *   角色名称
     *
     * This field was generated by MyBatis Generator.
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private String roleName;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private String description;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   删除
     *
     * This field was generated by MyBatis Generator.
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private String deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_role
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_role.id
     *
     * @return the value of app_role.id
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_role.id
     *
     * @param id the value for app_role.id
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_role.root_id
     *
     * @return the value of app_role.root_id
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public String getRootId() {
        return rootId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_role.root_id
     *
     * @param rootId the value for app_role.root_id
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public void setRootId(String rootId) {
        this.rootId = rootId == null ? null : rootId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_role.pid
     *
     * @return the value of app_role.pid
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_role.pid
     *
     * @param pid the value for app_role.pid
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_role.full_path
     *
     * @return the value of app_role.full_path
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public String getFullPath() {
        return fullPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_role.full_path
     *
     * @param fullPath the value for app_role.full_path
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public void setFullPath(String fullPath) {
        this.fullPath = fullPath == null ? null : fullPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_role.grade
     *
     * @return the value of app_role.grade
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_role.grade
     *
     * @param grade the value for app_role.grade
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_role.sort_num
     *
     * @return the value of app_role.sort_num
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_role.sort_num
     *
     * @param sortNum the value for app_role.sort_num
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_role.role_name
     *
     * @return the value of app_role.role_name
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_role.role_name
     *
     * @param roleName the value for app_role.role_name
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_role.description
     *
     * @return the value of app_role.description
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_role.description
     *
     * @param description the value for app_role.description
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_role.create_time
     *
     * @return the value of app_role.create_time
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_role.create_time
     *
     * @param createTime the value for app_role.create_time
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_role.deleted
     *
     * @return the value of app_role.deleted
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_role.deleted
     *
     * @param deleted the value for app_role.deleted
     *
     * @mbggenerated Fri Mar 04 16:25:45 CST 2016
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public boolean isNotNull() {
        return  null != this.id || null != this.rootId || null != this.pid || null != this.fullPath || null != this.grade || null != this.sortNum || null != this.roleName || null != this.description || null != this.createTime || null != this.deleted;
    }
}