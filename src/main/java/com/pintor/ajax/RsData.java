package com.pintor.ajax;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RsData<T> {
    private String resultCode;
    private String msg;
    private T data;
}
