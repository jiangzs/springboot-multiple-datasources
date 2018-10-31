package com.tutorial.springbootmultipledatasources.bar.repo;

import com.tutorial.springbootmultipledatasources.bar.domain.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jiangzs@gmail.com on 2018/10/29.
 */
public interface BarRepo extends JpaRepository<Bar,String> {
}
