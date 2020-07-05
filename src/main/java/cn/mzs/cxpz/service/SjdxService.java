package cn.mzs.cxpz.service;

import cn.mzs.cxpz.bean.Sjdx;

import java.util.List;

public interface SjdxService {
    /**
     * 保存数据对象
     * @param sjdx
     * @return
     */
    int saveSjdx(Sjdx sjdx);

    /**
     * 根据主键删除数据对象
     * @param id
     * @return
     */
    int deleteSjdxById(String id);

    /**
     * 更新数据对象
     * @param sjdx
     * @return
     */
    int updateSjdx(Sjdx sjdx);

    /**
     * 查询数据对象数组
     * @param sjdx
     * @return
     */
    List<Sjdx> findSjdxList(Sjdx sjdx);

    /**
     * 根据主键查询数据对象
     * @param id
     * @return
     */
    Sjdx findSjdxById(String id);

}
