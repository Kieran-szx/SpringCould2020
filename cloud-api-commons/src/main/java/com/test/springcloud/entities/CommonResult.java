package com.test.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * json封装体
 * <p>
 * 泛型：如果装的payment，返回payment，如果装的是order，则返回order
 *
 * @author Shizx
 * @date 2020/7/1 8:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String  message;
    private T       date;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
