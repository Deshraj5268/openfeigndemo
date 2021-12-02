package demo.openfeigndemo.controller;

import demo.openfeigndemo.feignclient.AuctionClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/",consumes = MediaType.ALL_VALUE,produces = MediaType.ALL_VALUE)
public class AuctionApis {

    @Autowired
    public AuctionClient auctionClient;

    @GetMapping("/test-open-feign")
    public String openFeignTesting(){
        return auctionClient.auctionFeignTesting();
    }

    @GetMapping(value = "/test-open-feign-app")
    public String testApps(){
        return "openFeign test";
    }
}
