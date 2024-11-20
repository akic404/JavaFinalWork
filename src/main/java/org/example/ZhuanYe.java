package org.example;

import lombok.Data;

@Data
public class ZhuanYe {
    private String name;

    public ZhuanYe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
