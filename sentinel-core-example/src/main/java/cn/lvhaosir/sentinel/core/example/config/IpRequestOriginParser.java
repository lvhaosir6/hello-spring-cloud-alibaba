package cn.lvhaosir.sentinel.core.example.config;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lvhaosir 2020/3/22 18:02
 * @Description: TODO(黑白名单控制)
 * @Version v1.0
 **/
@Component
public class IpRequestOriginParser implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getRemoteAddr();
    }
}
