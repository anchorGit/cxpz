package cn.mzs.cxpz.mapper;

import cn.mzs.cxpz.bean.Sjdx;
import cn.mzs.cxpz.bean.Sjzd;

import java.util.List;

public interface SjzdMapper {

    int saveSjzd(Sjzd sjzd);

    int deleteSjzdById(String id);

    int updateSjzd(Sjzd sjzd);

    List<Sjzd> findSjzd(Sjzd sjzd);

    Sjzd findSjzdById(String id);

}
