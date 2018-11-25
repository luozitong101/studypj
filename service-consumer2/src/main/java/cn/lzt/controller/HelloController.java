package cn.lzt.controller;


import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author luoyong
 * @date 2018-11-25下午 4:05
 */

@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name){

        return "hello "+ name+" consumer";
    }


    @RequestMapping("/hello2/{name}")
    public String hello2(@PathVariable String name){

        return helloRemote.hello(name);
    }

    @RequestMapping("/hello3/{name}")
    public String hello3(@PathVariable(name = "name") String name){
        String res = restTemplate.getForObject("http://service-producer/hello?name="+name,String.class);
        return res;
    }


    @RequestMapping("/sayhi")
    public String hello4(){

        return helloRemote.sayhi();
    }

    @RequestMapping("/sayhi/{word}")
    public String hello5(@PathVariable String word){

        return helloRemote.world(word);
    }
}
