package technology.touchmars.feign.wechat.client.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import technology.touchmars.feign.wechat.client.model.SessionKeyToken;

public interface MiniProgramApi {

	@GetMapping(value="/sns/jscode2session",
			produces = "application/json",
			consumes = "application/json",
			headers = {"Content-Type=application/json","Accept=application/json"})
	public ResponseEntity<SessionKeyToken> exchangeCode(
			@RequestParam(value = "js_code", required = true) String code);
}
