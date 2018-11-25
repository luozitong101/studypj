package cn.lzt.controller;

import org.springframework.stereotype.Component;

/**
 * @author luoyong
 * @date 2018-11-25下午 7:56
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(String name2) {
        return null;
    }

    @Override
    public String sayhi() {
        return null;
    }

    @Override
    public String world(String word) {
        return "fall back ,this is error message !!!!s";
    }
}
