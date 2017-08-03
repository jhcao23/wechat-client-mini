package technology.touchmars.feign.wechat.client.api;

import static technology.touchmars.feign.wechat.client.api.MiniProgramConstant.URL_BASE;

import org.springframework.cloud.netflix.feign.FeignClient;

import technology.touchmars.outside.feign.wechat.config.WechatMiniProgramCommonConfiguration;
import technology.touchmars.outside.feign.wechat.config.WechatMiniProgramRequestInterceptorConfiguration;

@FeignClient(name="miniProgramApiClient", url=URL_BASE, 
	configuration={WechatMiniProgramRequestInterceptorConfiguration.class, WechatMiniProgramCommonConfiguration.class}
)
public interface MiniProgramApiClient extends MiniProgramApi {

}
