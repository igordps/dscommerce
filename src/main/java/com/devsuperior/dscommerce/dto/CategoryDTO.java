package com.devsuperior.dscommerce.dto;

import java.io.Serializable;

public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 1310303193489471557L;

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
