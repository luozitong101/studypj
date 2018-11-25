package cn.lzt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoyong
 * @date 2018-11-25下午 4:05
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name2){

        return "hello "+ name2+" ";
    }

    @RequestMapping(value = "/sayhi")
    public String sayhi(){

        return "say hi!!";
    }

    @RequestMapping(value = "/word")
    public String world(@RequestParam String word){

        return "to be or not to be this is a  "+word;
    }
}
