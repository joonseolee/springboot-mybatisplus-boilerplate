package com.joonseolee.myplusboilerplate.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class School {
    private int id;
    @TableField(value = "isActive")
    private boolean isActive;
    private String name;
    private String location;

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
