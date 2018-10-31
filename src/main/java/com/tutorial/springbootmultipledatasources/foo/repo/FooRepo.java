package com.tutorial.springbootmultipledatasources.foo.repo;

import com.tutorial.springbootmultipledatasources.foo.domain.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by jiangzs@gmail.com on 2018/10/29.
 */
public interface FooRepo extends JpaRepository<Foo, String> {

    @Override
    Optional<Foo> findById(String id);
}
