package cn.mzs.cxpz.service;

import cn.mzs.cxpz.bean.Sjdx;
import cn.mzs.cxpz.bean.Sjzd;

import java.util.List;

public interface SjzdService {
    /**
     * 保存数据字段
     * @param sjzd
     * @return
     */
    int saveSjzd(Sjzd sjzd);

    /**
     * 根据主键删除数据字段
     * @param id
     * @return
     */
    int deleteSjzdById(String id);

    /**
     * 更新数据字段
     * @param sjzd
     * @return
     */
    int updateSjzd(Sjzd sjzd);

    /**
     * 查询数据字段数组
     * @param sjzd
     * @return
     */
    List<Sjzd> findSjzdList(Sjzd sjzd);

    /**
     * 根据主键查询数据字段
     * @param id
     * @return
     */
    Sjzd findSjzdById(String id);

}
