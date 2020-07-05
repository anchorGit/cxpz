package cn.mzs.cxpz.controller;

import cn.mzs.cxpz.bean.Sjdx;
import cn.mzs.cxpz.service.SjdxService;
import cn.mzs.cxpz.util.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sjdx")
public class SjdxController {
    Logger logger = LogManager.getLogger("SjdxController");
    @Autowired
    private SjdxService sjdxService;

    /**
     * 保存数据对象
     * @param sjdx
     * @return
     */
    @RequestMapping("/save")
    public Result save(Sjdx sjdx){
        try{
            sjdxService.saveSjdx(sjdx);
            return Result.success();
        }catch (Exception e){
            logger.error("保存数据对象失败！",e);
            return Result.fail("保存数据对象失败！");
        }
    }

    /**
     * 逻辑删除数据对象
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(String id){
        try{
            sjdxService.deleteSjdxById(id);
            return Result.success();
        }catch (Exception e){
            logger.error("删除数据对象失败！",e);
            return Result.fail("删除数据对象失败");
        }
    }

    /**
     * 更新数据对象
     * @param sjdx
     * @return
     */
    @RequestMapping("/update")
    public Result update(Sjdx sjdx){
        try {
            sjdxService.updateSjdx(sjdx);
            return Result.success();
        }catch (Exception e){
            logger.error("更新数据对象失败！",e);
            return Result.fail("更新数据对象失败");
        }
    }

    /**
     * 根据查询数据对象
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public Result findById(String id){
        try{
            Sjdx sjdx = sjdxService.findSjdxById(id);
            return Result.success(sjdx);
        }catch (Exception e){
            logger.error("查询数据对象失败！",e);
            return Result.fail("查询数据对象失败");
        }
    }

    /**
     * 查询数据对象集合
     * @param sjdx
     * @return
     */
    @RequestMapping("/findList")
    public Result findList(Sjdx sjdx){
        try {
            List<Sjdx> list = sjdxService.findSjdxList(sjdx);
            return Result.success(list);
        }catch (Exception e){
            logger.error("查询数据对象集合失败！",e);
            return Result.fail("查询数据对象集合失败");
        }
    }




}
