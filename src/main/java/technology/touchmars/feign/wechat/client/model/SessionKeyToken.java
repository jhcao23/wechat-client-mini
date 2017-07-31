package technology.touchmars.feign.wechat.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SessionKeyToken {

	@JsonProperty("openid")
	private String openId;
	
	@JsonProperty("session_key")
	private String sessionKey;
	
	@JsonProperty("unionid")
	private String unionId;
	
}
