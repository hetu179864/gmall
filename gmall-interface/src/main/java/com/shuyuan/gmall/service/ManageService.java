package com.shuyuan.gmall.service;

import com.shuyuan.gmall.bean.*;

import java.util.List;

public interface ManageService {
    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2);

    public List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);


    List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    BaseAttrInfo getAttrInfo(String attrId);

    List<BaseAttrValue> getAttrValueList(String attrId);

    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    List<BaseSaleAttr> getBaseSaleAttrList();

    void saveSpuInfo(SpuInfo spuInfo);

    List<SpuImage> getSpuImageList(String spuId);

    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);

    void saveSkuInfo(SkuInfo skuInfo);
}
