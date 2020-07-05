package cn.mzs.cxpz.service.impl;

import cn.mzs.cxpz.bean.Sjdx;
import cn.mzs.cxpz.mapper.SjdxMapper;
import cn.mzs.cxpz.service.SjdxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SjdxServiceImpl implements SjdxService {
    @Autowired
    private SjdxMapper sjdxMapper;

    @Override
    public int saveSjdx(Sjdx sjdx) {
        return sjdxMapper.saveSjdx(sjdx);
    }

    @Override
    public int deleteSjdxById(String id) {
        return sjdxMapper.deleteSjdxById(id);
    }

    @Override
    public int updateSjdx(Sjdx sjdx) {
        return sjdxMapper.updateSjdx(sjdx);
    }

    @Override
    public List<Sjdx> findSjdxList(Sjdx sjdx) {
        return sjdxMapper.findSjdxList(sjdx);
    }

    @Override
    public Sjdx findSjdxById(String id) {
        return sjdxMapper.findSjdxById(id);
    }
}
