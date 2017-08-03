package technology.touchmars.feign.wechat.client.api;

import static technology.touchmars.feign.wechat.client.api.MiniProgramConstant.URL_BASE;

import org.springframework.cloud.netflix.feign.FeignClient;

import technology.touchmars.outside.feign.wechat.config.WechatMiniProgramCommonConfiguration;

@FeignClient(name="miniProgramUnionApiClient", url=URL_BASE, 
	configuration={WechatMiniProgramCommonConfiguration.class}
)
public interface MiniProgramUnionApiClient extends MiniProgramUnionApi {

}
