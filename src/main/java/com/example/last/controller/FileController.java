package com.example.last.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

// 단일 파일 전송 api
@RestController
public class FileController {

    @PostMapping("/api/fileData")
    public String upload(@RequestParam MultipartFile fileData) throws Exception {

        final String ABSOLUTE_PATH = "/Users/sopp/study/last/src/main/resources/upload";

        String fileName = fileData.getOriginalFilename();
        File destinationFile = new File(ABSOLUTE_PATH + "/" + fileName);
        System.out.println(destinationFile);

        destinationFile.getParentFile().mkdir();
        fileData.transferTo(destinationFile);
        System.out.println(fileName);
        return fileName;
    }
}