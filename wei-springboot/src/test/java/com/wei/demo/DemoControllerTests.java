package com.wei.demo;

import com.wei.controller.demo.DemoController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * 通过注解@RunWith()和@SpringBootTest开启测试功能
 *
 * @author tanping
 * @date 2018/8/28 20:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoControllerTests {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new DemoController()).build();
    }

    @Test
    public void testDemoHi() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/demo/hi").accept(MediaType.APPLICATION_JSON)).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andDo(MockMvcResultHandlers.print()).andReturn();
    }
}
