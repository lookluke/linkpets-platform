package com.linkpets.core.dao;

import com.linkpets.core.model.CmsAdoptGroupUserRel;

public interface CmsAdoptGroupUserRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group_user_rel
     *
     * @mbg.generated Thu Dec 12 18:52:54 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group_user_rel
     *
     * @mbg.generated Thu Dec 12 18:52:54 CST 2019
     */
    int insert(CmsAdoptGroupUserRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group_user_rel
     *
     * @mbg.generated Thu Dec 12 18:52:54 CST 2019
     */
    int insertSelective(CmsAdoptGroupUserRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group_user_rel
     *
     * @mbg.generated Thu Dec 12 18:52:54 CST 2019
     */
    CmsAdoptGroupUserRel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group_user_rel
     *
     * @mbg.generated Thu Dec 12 18:52:54 CST 2019
     */
    int updateByPrimaryKeySelective(CmsAdoptGroupUserRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_group_user_rel
     *
     * @mbg.generated Thu Dec 12 18:52:54 CST 2019
     */
    int updateByPrimaryKey(CmsAdoptGroupUserRel record);


    CmsAdoptGroupUserRel selectByUserIdAndGroupId(String userId, String groupId);
}