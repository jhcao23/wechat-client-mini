package technology.touchmars.outside.feign.wechat.config;

import javax.servlet.Filter;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.netflix.feign.support.ResponseEntityDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import feign.Logger;
import feign.codec.Decoder;
import feign.codec.ErrorDecoder;
import technology.touchmars.feign.wechat.client.config.WechatErrorDecoder;
import technology.touchmars.feign.wechat.client.config.WechatSpringDecoder;

@Configuration
public class WechatMiniProgramCommonConfiguration {

	@Autowired
	private ObjectFactory<HttpMessageConverters> messageConverters;
	
	@Bean
	public ErrorDecoder errorDecoder(){
		return new WechatErrorDecoder(feignDecoder());
	}
	
	@Bean
	public Decoder feignDecoder() {
		return new ResponseEntityDecoder(new WechatSpringDecoder(this.messageConverters));
	}
	
	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

	@Bean
	public Filter commonsRequestLoggingFilter() {
		CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
		filter.setIncludeClientInfo(true);
		filter.setIncludeQueryString(true);
		filter.setIncludeHeaders(true);
		filter.setIncludePayload(true);
		return filter;
	}
		
}
