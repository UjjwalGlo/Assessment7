package com.javainuse.test;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.springframework.web.context.WebApplicationContext;

public class TestWebApp extends SpringBootHelloWorldTests {

 @Autowired

 private WebApplicationContext webApplicationContext;

 private MockMvc mockMvc;

 @Before

 public void setup() {

 mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

 }

 @Test

 public void testEmployee() throws Exception {

 mockMvc.perform(get("/customer")).andExpect(status().isOk())

  .andExpect(content().contentType("application/json;charset=UTF-8"))

  .andExpect(jsonPath("$.cust_Name").value("Uttam")).andExpect(jsonPath("$.cust_Address").value("Indore"))

  .andExpect(jsonPath("$.cust_Id").value("1")).andExpect(jsonPath("$.cust_Pin").value(465333));

 }

}



