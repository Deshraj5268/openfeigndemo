package demo.openfeigndemo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(name = "auctionFeign",url = "http://localhost:8886/api/auction")
@RestController
public interface AuctionClient {

    @GetMapping("/v1/auction-test-api")
    public String auctionFeignTesting();
}
