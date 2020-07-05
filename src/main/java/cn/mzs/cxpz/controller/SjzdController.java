package cn.mzs.cxpz.controller;

import cn.mzs.cxpz.bean.Sjzd;
import cn.mzs.cxpz.service.SjzdService;
import cn.mzs.cxpz.util.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sjzd")
public class SjzdController {
    Logger logger = LogManager.getLogger("SjzdController");
    @Autowired
    private SjzdService sjzdService;

    /**
     * 保存数据字段
     * @param sjzd
     * @return
     */
    @RequestMapping("/save")
    public Result save(Sjzd sjzd){
        try{
            sjzdService.saveSjzd(sjzd);
            return Result.success();
        }catch (Exception e){
            logger.error("保存数据字段失败！",e);
            return Result.fail("保存数据字段失败!");
        }
    }

    /**
     * 删除数据字段
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(String id){
        try{
            sjzdService.deleteSjzdById(id);
            return Result.success();
        }catch (Exception e){
            logger.error("删除数据字段失败！",e);
            return Result.fail("删除数据字段失败！");
        }
    }

    /**
     * 更新数据字段
     * @param sjzd
     * @return
     */
    @RequestMapping("/update")
    public Result update(Sjzd sjzd){
        try{
            sjzdService.updateSjzd(sjzd);
            return Result.success();
        }catch (Exception e){
            logger.error("更新数据字段失败！",e);
            return Result.fail("更新数据字段失败！");
        }
    }

    /**
     * 查询数据字段集合
     * @param sjzd
     * @return
     */
    @RequestMapping("/findList")
    public Result findList(Sjzd sjzd){
        try{
            List<Sjzd> list = sjzdService.findSjzdList(sjzd);
            return Result.success(list);
        }catch (Exception e){
            logger.error("查询数据字段集合失败！",e);
            return Result.fail("查询数据字段集合失败！");
        }
    }

    /**
     * 根据id查询数据字段对象
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public Result findById(String id){
        try{
            Sjzd sjzd = sjzdService.findSjzdById(id);
            return Result.success(sjzd);
        }catch (Exception e){
            logger.error("查询数据字段失败！",e);
            return Result.fail("查询数据字段失败！");
        }
    }
}
