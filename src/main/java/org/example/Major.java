package org.example;

import lombok.Data;

@Data
public class Major {
    private String name;

    public Major(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
