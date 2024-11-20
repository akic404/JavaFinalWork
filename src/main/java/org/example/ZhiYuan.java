package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class ZhiYuan {
    private University university;
    private List<ZhuanYe> zhuanYes;

    public ZhiYuan(University university) {
        this.university = university;
        this.zhuanYes = new ArrayList<>();
    }


    public void addMajor(ZhuanYe zhuanYe) {
        this.zhuanYes.add(zhuanYe);
    }

}
