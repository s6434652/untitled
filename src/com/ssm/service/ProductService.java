package com.ssm.service;

import com.ssm.pojo.Product;

import java.util.List;
import java.util.Map;

/**
 * Created by Maze on 2018-04-12.
 */
public interface ProductService {
    List<Product> findAllPRO();

    List<Product> getPageSelPRO(Map<String, Object> map);

    int getCount();

    int DeletePRO(String id);
}
