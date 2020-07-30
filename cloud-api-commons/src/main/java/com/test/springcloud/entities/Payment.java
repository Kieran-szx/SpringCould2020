package com.test.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Shizx
 * @date 2020/7/1 8:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long   id;
    private String serial;
}
