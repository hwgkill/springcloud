package hwg.study.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-client")
public interface SchedualServiceClient {
    @RequestMapping(value = "/client",method = RequestMethod.GET)
    String test(@RequestParam(value = "name") String name);
}
