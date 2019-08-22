package com.linkpets.cms.wiki.service.impl;

import com.linkpets.cms.wiki.service.IWikiService;
import com.linkpets.core.dao.SdArticleMapper;
import com.linkpets.core.dao.SdCatalogListMapper;
import com.linkpets.core.dao.SdCatalogMapper;
import com.linkpets.core.model.SdArticle;
import com.linkpets.core.model.SdCatalog;
import com.linkpets.core.model.SdCatalogList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WikiServiceImpl implements IWikiService {

    @Resource
    private SdCatalogMapper sdCatalogMapper;

    @Resource
    private SdCatalogListMapper sdCatalogListMapper;

    @Resource
    private SdArticleMapper sdArticleMapper;

    @Override
    public List<SdCatalog> getCatalogs(String type) {
        return sdCatalogMapper.getCatalogs(type);
    }

    @Override
    public SdArticle getArticleDetail(String catalogId) {
        return sdArticleMapper.selectByCatalogId(catalogId);
    }

    @Override
    public List<SdCatalogList> searchArticle(String search) {
        return sdCatalogListMapper.searchArticle(search);
    }

    @Override
    public void addArticleReadNum(SdCatalogList catalogList) {
        sdCatalogListMapper.updateByPrimaryKeySelective(catalogList);
    }

    @Override
    public void addArticleLikeNum(SdCatalogList catalogList) {
        sdCatalogListMapper.updateByPrimaryKeySelective(catalogList);
    }

    @Override
    public SdCatalogList getCatalogList(String id) {
        return sdCatalogListMapper.selectByPrimaryKey(id);
    }

    @Override
    public void uptArticle(SdArticle sdArticle) {
        sdArticleMapper.updateByPrimaryKeySelective(sdArticle);
    }
}
