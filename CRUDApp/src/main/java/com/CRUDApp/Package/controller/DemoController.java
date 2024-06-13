package com.CRUDApp.Package.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
  //home
  @ResponseBody
  @GetMapping("/home")
  public String showMessage(){
    return "Spring Application, welcome to my first Spring APP";
  }
}
