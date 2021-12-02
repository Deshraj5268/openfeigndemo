package demo.openfeigndemo.controller;

import demo.openfeigndemo.dto.UserInfo;
import demo.openfeigndemo.feignclient.JsonPlaceHolderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/",consumes = MediaType.ALL_VALUE,produces = MediaType.ALL_VALUE)
public class JsonPlaceHolderController {

    @Autowired
    public JsonPlaceHolderFeignClient jsonPlaceHolderFeignClient;

    @GetMapping(value = "/users-open-feign",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserInfo> openFeignTesting(){
        return jsonPlaceHolderFeignClient.getUsers();
    }
}
