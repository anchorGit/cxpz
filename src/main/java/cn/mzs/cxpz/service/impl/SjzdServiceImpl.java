package cn.mzs.cxpz.service.impl;

import cn.mzs.cxpz.bean.Sjdx;
import cn.mzs.cxpz.bean.Sjzd;
import cn.mzs.cxpz.mapper.SjzdMapper;
import cn.mzs.cxpz.service.SjdxService;
import cn.mzs.cxpz.service.SjzdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SjzdServiceImpl implements SjzdService {
    @Autowired
    private SjzdMapper sjzdMapper;

    @Override
    public int saveSjzd(Sjzd sjzd) {
        return sjzdMapper.saveSjzd(sjzd);
    }

    @Override
    public int deleteSjzdById(String id) {
        return sjzdMapper.deleteSjzdById(id);
    }

    @Override
    public int updateSjzd(Sjzd sjzd) {
        return sjzdMapper.updateSjzd(sjzd);
    }

    @Override
    public List<Sjzd> findSjzdList(Sjzd sjzd) {
        return sjzdMapper.findSjzd(sjzd);
    }

    @Override
    public Sjzd findSjzdById(String id) {
        return sjzdMapper.findSjzdById(id);
    }
}
