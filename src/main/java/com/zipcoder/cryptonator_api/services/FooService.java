package com.zipcoder.cryptonator_api.services;

import com.zipcoder.cryptonator_api.repositories.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by leon on 1/22/18.
 */
public class FooService {
    FooRepository fooRepository;

    @Autowired
    public FooService(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }


}
