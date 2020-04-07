/**
 * 
 */
package me.djin.weixin.pojo;

/**
 * @author djin
 * 所有微信返回值的基础对象
 */
public class BaseModel {
	private String errcode;
	private String errmsg;
	
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
}