package com.personal.ofm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("control")
public class ProdutosController {

    @GetMapping("prueba")
    public String producto() {
        return "/productos/producto";
    }
}
