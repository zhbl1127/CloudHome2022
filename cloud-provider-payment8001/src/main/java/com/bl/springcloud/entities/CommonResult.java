package com.bl.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author bl
 * @date 2022/4/9 - 19:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable{
    private Integer code;
    private String massage;
    private T data;

    public CommonResult(Integer code,String massage){
        this(code,massage,null);
    }
}
