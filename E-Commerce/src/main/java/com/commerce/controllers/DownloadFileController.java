package com.commerce.controllers;

import com.commerce.services.FileFormerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class DownloadFileController {

    @Autowired
    private FileFormerService fileFormerService;

    @RequestMapping(value = "/file", method = RequestMethod.GET)
    public void downloadFile(HttpServletResponse response) throws IOException {
        File file = fileFormerService.writeDataToFile();
        InputStream in = new FileInputStream(file);
        response.setContentType("application/txt");
        response.setHeader("Content-Disposition", "attachment; filename=" + file.getName());
        response.setHeader("Content-Length", String.valueOf(file.length()));
        FileCopyUtils.copy(in, response.getOutputStream());
    }

}