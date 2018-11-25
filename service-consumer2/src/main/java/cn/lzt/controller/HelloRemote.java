package cn.lzt.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author luoyong
 * @date 2018-11-25下午 4:15
 */
@FeignClient(name = "service-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(name = "/hello")
    public String hello(@RequestParam(value = "name2") String name2);

    @RequestMapping("/sayhi")
    public String sayhi();


    @RequestMapping("/word")
    public String world(@RequestParam(value = "word") String word);
}
