package cn.mzs.cxpz.mapper;

import cn.mzs.cxpz.bean.Sjdx;

import java.util.List;

public interface SjdxMapper {

    int saveSjdx(Sjdx sjdx);

    int deleteSjdxById(String id);

    int updateSjdx(Sjdx sjdx);

    List<Sjdx> findSjdxList(Sjdx sjdx);

    Sjdx findSjdxById(String id);
}
