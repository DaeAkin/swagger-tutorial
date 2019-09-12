package com.donghyeon.swaggertutorial.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "이 모델은 Test하기 위한 Dto 입니다.")
public class TestDto {
    @ApiModelProperty(notes = "원하는 message 내용을 넣으세요.")
    private String message;
    @ApiModelProperty(notes = "원하는 boolean 값을 넣으세요.")
    private boolean flag;

    public TestDto(String message, boolean flag) {
        this.message = message;
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public boolean isFlag() {
        return flag;
    }
}
