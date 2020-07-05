
package cn.mzs.cxpz.bean;

import java.io.Serializable;

import cn.mzs.cxpz.common.BasicBean;
import org.apache.ibatis.type.Alias;

@Alias("Sjzd")
public class Sjzd extends BasicBean implements Serializable {

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
	 * 数据对象主键
	 */
	private String sjdxid;

	/**
	 * 字段代码
	 */
	private String zddm;

	/**
	 * 字段名称
	 */
	private String zdmc;

	/**
	 * 字段描述
	 */
	private String zdms;

	/**
	 * 简拼
	 */
	private String jp;

	/**
	 * 全拼
	 */
	private String qp;

	/**
	 * 字段类型
	 */
	private String zdlx;

	/**
	 * 字段长度
	 */
	private String zdcd;

	/**
	 * 宽度
	 */
	private String kd;

	/**
	 * 控件类型
	 */
	private String kjlx;

	/**
	 * 字段类别
	 */
	private String zdlb;

	/**
	 * 格式化方法;
	 */
	private String gshff;

	/**
	 * 是否展示列表
	 */
	private String sfzslb;

	/**
	 * 是否展示查询
	 */
	private String sfzscx;

	/**
	 * 是否展示新增
	 */
	private String sfzsxz;

	/**
	 * 是否展示编辑
	 */
	private String sfzsbj;

	/**
	 * 是否展示排序
	 */
	private String sfzspx;

	public Sjzd() {
	}
	
	public Sjzd(Integer id) {
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
	
	
	public void setSjdxid(String sjdxid) {
		this.sjdxid = sjdxid;
	}

	public String getSjdxid() {
		return this.sjdxid;
	}
	
	
	public void setZddm(String zddm) {
		this.zddm = zddm;
	}

	public String getZddm() {
		return this.zddm;
	}
	
	
	public void setZdmc(String zdmc) {
		this.zdmc = zdmc;
	}

	public String getZdmc() {
		return this.zdmc;
	}
	
	
	public void setZdms(String zdms) {
		this.zdms = zdms;
	}

	public String getZdms() {
		return this.zdms;
	}
	
	
	public void setJp(String jp) {
		this.jp = jp;
	}

	public String getJp() {
		return this.jp;
	}
	
	
	public void setQp(String qp) {
		this.qp = qp;
	}

	public String getQp() {
		return this.qp;
	}
	
	
	public void setZdlx(String zdlx) {
		this.zdlx = zdlx;
	}

	public String getZdlx() {
		return this.zdlx;
	}
	
	
	public void setZdcd(String zdcd) {
		this.zdcd = zdcd;
	}

	public String getZdcd() {
		return this.zdcd;
	}
	
	
	public void setKd(String kd) {
		this.kd = kd;
	}

	public String getKd() {
		return this.kd;
	}
	
	
	public void setKjlx(String kjlx) {
		this.kjlx = kjlx;
	}

	public String getKjlx() {
		return this.kjlx;
	}
	
	
	public void setZdlb(String zdlb) {
		this.zdlb = zdlb;
	}

	public String getZdlb() {
		return this.zdlb;
	}
	
	
	public void setGshff(String gshff) {
		this.gshff = gshff;
	}

	public String getGshff() {
		return this.gshff;
	}
	
	
	public void setSfzslb(String sfzslb) {
		this.sfzslb = sfzslb;
	}

	public String getSfzslb() {
		return this.sfzslb;
	}
	
	
	public void setSfzscx(String sfzscx) {
		this.sfzscx = sfzscx;
	}

	public String getSfzscx() {
		return this.sfzscx;
	}
	
	
	public void setSfzsxz(String sfzsxz) {
		this.sfzsxz = sfzsxz;
	}

	public String getSfzsxz() {
		return this.sfzsxz;
	}
	
	
	public void setSfzsbj(String sfzsbj) {
		this.sfzsbj = sfzsbj;
	}

	public String getSfzsbj() {
		return this.sfzsbj;
	}
	
	
	public void setSfzspx(String sfzspx) {
		this.sfzspx = sfzspx;
	}

	public String getSfzspx() {
		return this.sfzspx;
	}
	
	


}