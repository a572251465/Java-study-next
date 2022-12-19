package com.lihh.controller;

import org.springframework.web.bind.annotation.*;

public class TestRequestController {

    @RequestMapping("/testReq")
    public void testReq() {

    }

    @GetMapping("/testGet")
    public void testGet() {

    }

    @PostMapping("/postMapping")
    public void testPost() {

    }

    @DeleteMapping
    public void testDel() {

    }

    @PutMapping
    public void testPut() {

    }

    @RequestMapping(value = "/test/rest01/{name}")
    public void testRest01(@PathVariable String name) {
        System.out.println(name);
    }

    @ResponseBody
    @RequestMapping(value = "/test/rest02/{name}/{id}")
    public void testRest02(@PathVariable(value = "name") String pname, @PathVariable String id) {
        System.out.println(pname);
        System.out.println(id);
    }
}
