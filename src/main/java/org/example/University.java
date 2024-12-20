package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class University {
    private String name;
    private List<ZhuanYe> zhuanYes;

    public University(String name) {
        this.name = name;
        this.zhuanYes = new ArrayList<>();
    }


    public void addZhuanye(ZhuanYe zhuanYe) {
        this.zhuanYes.add(zhuanYe);
    }
}
