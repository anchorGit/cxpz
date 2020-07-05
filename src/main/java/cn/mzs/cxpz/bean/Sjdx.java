
package cn.mzs.cxpz.bean;

import cn.mzs.cxpz.common.BasicBean;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("Sjdx")
public class Sjdx extends BasicBean implements Serializable {

	private static final long serialVersionUID = -1L;
	

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 创建时间
	 */
	private java.util.Date createtime;

	/**
	 * 更新时间
	 */
	private java.util.Date updatetime;

	/**
	 * 有效性：1-有效，0-无效
	 */
	private String yxx;

	/**
	 * 是否删除：0-否，1-是
	 */
	private String isdel;

	/**
	 * 排序
	 */
	private Integer px;

	/**
	 * 创建人姓名
	 */
	private String cjrxm;

	/**
	 * 创建人代码
	 */
	private String cjrdm;

	/**
	 * 对象代码
	 */
	private String dxdm;

	/**
	 * 对象名称
	 */
	private String dxmc;

	/**
	 * 对象类型
	 */
	private String dxlx;

	/**
	 * 数据库
	 */
	private String sjk;

	/**
	 * 具体对象
	 */
	private String jtdx;

	/**
	 * 主键字段
	 */
	private String zjzd;

	/**
	 * 默认排序
	 */
	private String mrpx;

	/**
	 * 权限字段
	 */
	private String qxzd;

	/**
	 * 是否展示编辑
	 */
	private String sfzsbj;

	/**
	 * 是否展示查询
	 */
	private String sfzscxq;

	/**
	 * 导入sql
	 */
	private String drsql;

	/**
	 * 过滤字段
	 */
	private String gltj;

	/**
	 * 对象描述
	 */
	private String dxms;

	public Sjdx() {
	}
	
	public Sjdx(Integer id) {
		//this.id = id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}
	
	
	public void setCreatetime(java.util.Date createtime) {
		this.createtime = createtime;
	}

	public java.util.Date getCreatetime() {
		return this.createtime;
	}
	
	
	public void setUpdatetime(java.util.Date updatetime) {
		this.updatetime = updatetime;
	}

	public java.util.Date getUpdatetime() {
		return this.updatetime;
	}
	
	
	public void setYxx(String yxx) {
		this.yxx = yxx;
	}

	public String getYxx() {
		return this.yxx;
	}


	public String getIsdel() {
		return isdel;
	}

	public void setIsdel(String isdel) {
		this.isdel = isdel;
	}

	public void setPx(Integer px) {
		this.px = px;
	}

	public Integer getPx() {
		return this.px;
	}
	
	
	public void setCjrxm(String cjrxm) {
		this.cjrxm = cjrxm;
	}

	public String getCjrxm() {
		return this.cjrxm;
	}
	
	
	public void setCjrdm(String cjrdm) {
		this.cjrdm = cjrdm;
	}

	public String getCjrdm() {
		return this.cjrdm;
	}
	
	
	public void setDxdm(String dxdm) {
		this.dxdm = dxdm;
	}

	public String getDxdm() {
		return this.dxdm;
	}
	
	
	public void setDxmc(String dxmc) {
		this.dxmc = dxmc;
	}

	public String getDxmc() {
		return this.dxmc;
	}
	
	
	public void setDxlx(String dxlx) {
		this.dxlx = dxlx;
	}

	public String getDxlx() {
		return this.dxlx;
	}
	
	
	public void setSjk(String sjk) {
		this.sjk = sjk;
	}

	public String getSjk() {
		return this.sjk;
	}
	
	
	public void setJtdx(String jtdx) {
		this.jtdx = jtdx;
	}

	public String getJtdx() {
		return this.jtdx;
	}
	
	
	public void setZjzd(String zjzd) {
		this.zjzd = zjzd;
	}

	public String getZjzd() {
		return this.zjzd;
	}
	
	
	public void setMrpx(String mrpx) {
		this.mrpx = mrpx;
	}

	public String getMrpx() {
		return this.mrpx;
	}
	
	
	public void setQxzd(String qxzd) {
		this.qxzd = qxzd;
	}

	public String getQxzd() {
		return this.qxzd;
	}
	
	
	public void setSfzsbj(String sfzsbj) {
		this.sfzsbj = sfzsbj;
	}

	public String getSfzsbj() {
		return this.sfzsbj;
	}
	
	
	public void setSfzscxq(String sfzscxq) {
		this.sfzscxq = sfzscxq;
	}

	public String getSfzscxq() {
		return this.sfzscxq;
	}
	
	
	public void setDrsql(String drsql) {
		this.drsql = drsql;
	}

	public String getDrsql() {
		return this.drsql;
	}
	
	
	public void setGltj(String gltj) {
		this.gltj = gltj;
	}

	public String getGltj() {
		return this.gltj;
	}
	
	
	public void setDxms(String dxms) {
		this.dxms = dxms;
	}

	public String getDxms() {
		return this.dxms;
	}
	
	


}