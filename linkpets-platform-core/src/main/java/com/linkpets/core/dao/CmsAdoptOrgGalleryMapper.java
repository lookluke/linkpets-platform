package com.linkpets.core.dao;

import com.linkpets.core.model.CmsAdoptOrgGallery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CmsAdoptOrgGalleryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_org_gallery
     *
     * @mbg.generated Sun Aug 25 21:32:26 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_org_gallery
     *
     * @mbg.generated Sun Aug 25 21:32:26 CST 2019
     */
    int insert(CmsAdoptOrgGallery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_org_gallery
     *
     * @mbg.generated Sun Aug 25 21:32:26 CST 2019
     */
    int insertSelective(CmsAdoptOrgGallery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_org_gallery
     *
     * @mbg.generated Sun Aug 25 21:32:26 CST 2019
     */
    CmsAdoptOrgGallery selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_org_gallery
     *
     * @mbg.generated Sun Aug 25 21:32:26 CST 2019
     */
    int updateByPrimaryKeySelective(CmsAdoptOrgGallery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_adopt_org_gallery
     *
     * @mbg.generated Sun Aug 25 21:32:26 CST 2019
     */
    int updateByPrimaryKey(CmsAdoptOrgGallery record);

    /**
     * 获取公益组织相册列表
     *
     * @param orgId
     * @return
     */
    List<CmsAdoptOrgGallery> getAdoptGalleryList(String orgId);

	int getGalleryCountForByOrgIdWithRange(@Param("orgId") String orgId, @Param("fromDay") String fromDay, @Param("toDay") String toDay);
	
}