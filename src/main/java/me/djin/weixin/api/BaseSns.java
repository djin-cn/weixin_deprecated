/**
 * 
 */
package me.djin.weixin.api;

import feign.Param;
import feign.RequestLine;
import me.djin.weixin.pojo.basesns.GetUserAccessTokenResponse;

/**
 * @author djin 微信基础接口
 */
public interface BaseSns {
	/**
	 * 获取用户访问令牌
	 * 
	 * @param appid
	 *            appid,可登录微信公众号平台，在“开发”-“基本配置”-“开发者ID”获取
	 * @param appsecret
	 *            appsecret,可登录微信公众号平台，在“开发”-“基本配置”-“开发者密码”获取
	 * @param code
	 *            可参考微信网页授权的第一步“用户同意授权，获取code”获取. 第一步可通过网页获取，但是需要设置网页授权回调域名(需认证).
	 *            网址：https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421140842
	 * @return
	 */
	@RequestLine("GET /sns/oauth2/access_token?appid={appid}&secret={secret}&code={code}&grant_type=authorization_code")
	GetUserAccessTokenResponse getUserAccessToken(@Param("appid") String appid, @Param("secret") String appsecret, @Param("code") String code);
}
