package com.DhruvTheDev1.Leetcode_API;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(LeetcodeController.class)
public class LeetcodeControllerTests {

  @Autowired
  private MockMvc mockMvc;

  @MockitoBean
  private LeetcodeService service; // create and inject mock for LeetcodeService

  @Test
  void testingGetLeetcodeStats() throws Exception {
    LeetcodeData mockData = new LeetcodeData(100, 100, 100, 300);
    when(service.getStats("TestUsername")).thenReturn(mockData); // mocking service with mock data

    this.mockMvc.perform(MockMvcRequestBuilders.post("/leetcode/stats")
        .param("username", "TestUsername"))
        .andExpect(MockMvcResultMatchers.status().isOk()) // response is 200
        .andExpect(MockMvcResultMatchers.model().attribute("data", mockData)) // model contains mock data
        .andExpect(MockMvcResultMatchers.view().name("form")); // correct view name returned

  }
}
