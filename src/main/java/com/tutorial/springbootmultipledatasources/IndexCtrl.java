package com.tutorial.springbootmultipledatasources;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

/**
 * Created by jiangzs@gmail.com on 2018/10/29.
 */
@RestController
@Slf4j
public class IndexCtrl {

    @RequestMapping("/")
    public String index() {
        return LocalTime.now().toString();
    }
}
