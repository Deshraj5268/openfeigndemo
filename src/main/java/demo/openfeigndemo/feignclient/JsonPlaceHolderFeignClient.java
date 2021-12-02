package demo.openfeigndemo.feignclient;

import demo.openfeigndemo.configuration.Converter;
import demo.openfeigndemo.dto.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@FeignClient(name="jsonPlaceHolder",url="https://jsonplaceholder.typicode.com",configuration = Converter.class)
@RestController
public interface JsonPlaceHolderFeignClient {

    @GetMapping(value = "/users",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserInfo> getUsers();
}
