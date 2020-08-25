package com.hm.cloud.common.domain;

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
@NoArgsConstructor
public class CommonResult<T> {

    private T data;

    private String ifSuccess;

    private String message;

    private String code;

    public CommonResult(String ifSuccess,String message, String code) {
        this(null, ifSuccess, message, code);
    }

    public CommonResult(T data, String ifSuccess, String message, String code) {
        this.data = data;
        this.message = message;
        this.code = code;
        this.ifSuccess = ifSuccess;
    }

    public CommonResult(T data) {
        this(data,"Y", "操作成功", "200");
    }
}
