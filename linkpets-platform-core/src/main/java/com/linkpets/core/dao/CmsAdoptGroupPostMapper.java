package com.linkpets.core.dao;

import com.linkpets.core.model.CmsAdoptGroupPost;

public interface CmsAdoptGroupPostMapper {
    int deleteByPrimaryKey(String postId);

    int insert(CmsAdoptGroupPost record);

    int insertSelective(CmsAdoptGroupPost record);

    CmsAdoptGroupPost selectByPrimaryKey(String postId);

    int updateByPrimaryKeySelective(CmsAdoptGroupPost record);

    int updateByPrimaryKey(CmsAdoptGroupPost record);
}