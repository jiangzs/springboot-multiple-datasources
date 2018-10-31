package com.tutorial.springbootmultipledatasources.bar.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by jiangzs@gmail.com on 2018/10/29.
 */
@Data
@Entity
@Table(name="t_bar")
public class Bar {
    @Id
    private String id;

    private String bar;
}
