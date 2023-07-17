package com.test.model;

import lombok.Data;

@Data
public class Test {

    private String id;
    private String name;

    public Test(String _id, String _name) {
        this.id = _id;
        this.name = _name;
    }
}
