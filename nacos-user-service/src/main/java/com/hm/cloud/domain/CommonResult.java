package com.hm.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Merlin
 * @Title: CommonResult
 * @ProjectName springcloud-learning
 * @Description: TODO
 * @date 2020/8/2515:03
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private T data;

    private Boolean ifSuccess;

    private String message;

    private String code;

    public CommonResult(String message, String code) {
        this(null, message, code);
    }

    public CommonResult(T data, String message, String code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public CommonResult(T data) {
        this(data, "操作成功", "200");
    }
}
