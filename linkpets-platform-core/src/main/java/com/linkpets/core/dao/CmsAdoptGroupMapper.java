package com.linkpets.core.dao;

import com.linkpets.core.model.CmsAdoptGroup;

import java.util.List;

public interface CmsAdoptGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group
     *
     * @mbg.generated Thu Dec 12 13:30:39 CST 2019
     */
    int deleteByPrimaryKey(String groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group
     *
     * @mbg.generated Thu Dec 12 13:30:39 CST 2019
     */
    int insert(CmsAdoptGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group
     *
     * @mbg.generated Thu Dec 12 13:30:39 CST 2019
     */
    int insertSelective(CmsAdoptGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group
     *
     * @mbg.generated Thu Dec 12 13:30:39 CST 2019
     */
    CmsAdoptGroup selectByPrimaryKey(String groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group
     *
     * @mbg.generated Thu Dec 12 13:30:39 CST 2019
     */
    int updateByPrimaryKeySelective(CmsAdoptGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group
     *
     * @mbg.generated Thu Dec 12 13:30:39 CST 2019
     */
    int updateByPrimaryKey(CmsAdoptGroup record);

    /**
     * 获取圈子列表
     *
     * @param groupType
     * @return
     */
    List<CmsAdoptGroup> getAdoptGroupList(String groupType);

    /**
     * 获取关注圈子列表
     * @param userId
     * @return
     */
    List<CmsAdoptGroup> getFollowedGroupList(String userId);
}