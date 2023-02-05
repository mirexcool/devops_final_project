package com.application.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("title", "Main Page");
        return "home";
    }

    @GetMapping("/cv")
    public String aboutPage(Model model) {
        model.addAttribute("title", "Information about me");
        return "cv";
    }


    String getIp() throws MalformedURLException {
        String urlString = "http://checkip.amazonaws.com/";
        URL url = new URL(urlString);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/ip")
    public String ipAddress(Model model) throws MalformedURLException {
        model.addAttribute("title", "Ip address of this server");
        model.addAttribute("ip",  getIp());
        return "ip";
    }

}