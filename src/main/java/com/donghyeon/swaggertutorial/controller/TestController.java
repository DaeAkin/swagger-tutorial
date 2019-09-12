package com.donghyeon.swaggertutorial.controller;


        import com.donghyeon.swaggertutorial.dto.TestDto;
        import io.swagger.annotations.Api;
        import io.swagger.annotations.ApiOperation;
        import io.swagger.annotations.ApiParam;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "테스트 하기위한 TestController 예요!")
public class TestController {

    @ApiOperation("테스트를 하기위한 Api이예요!")
    @GetMapping("/test")
    public TestDto testGetMethod(@ApiParam(value = "Test대한 정보",required = true)@RequestBody TestDto testDto) {

        return new TestDto("Test!!",true);
    }
}
