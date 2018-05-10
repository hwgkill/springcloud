package hwg.study.springcloud.web;

import hwg.study.springcloud.service.SchedualServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {

    @Autowired
    SchedualServiceClient schedualServiceClient;
    @RequestMapping(value = "/client",method = RequestMethod.GET)
    public String testClient(@RequestParam String name){
        return schedualServiceClient.test(name);
    }
}
