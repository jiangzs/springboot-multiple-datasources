package com.tutorial.springbootmultipledatasources;

import com.tutorial.springbootmultipledatasources.bar.domain.Bar;
import com.tutorial.springbootmultipledatasources.bar.repo.BarRepo;
import com.tutorial.springbootmultipledatasources.foo.domain.Foo;
import com.tutorial.springbootmultipledatasources.foo.repo.FooRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by jiangzs@gmail.com on 2018/10/29.
 */
@Slf4j
@RestController
public class FooBarCtrl {

    private final FooRepo fooRepo;
    private final BarRepo barRepo;

    @Autowired
    public FooBarCtrl(FooRepo fooRepo, BarRepo barRepo) {
        this.fooRepo = fooRepo;
        this.barRepo = barRepo;
    }

    @RequestMapping("/foobar/{id}")
    public String fooBar(@PathVariable("id") String id){
        Optional<Foo> foo = fooRepo.findById(id);
        Optional<Bar> bar = barRepo.findById(id);
        return foo.get().getFoo().toString()+ " - " + bar.get().getBar().toString();

    }

}
