package com.rangstory.rangstory.domain.artinfo.query.application.controller;

import com.rangstory.rangstory.domain.artinfo.query.application.dto.FindArtInfoDTO;
import com.rangstory.rangstory.domain.artinfo.query.application.service.FindArtInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/artinfo")
public class FindArtInfoController {

    private final FindArtInfoService findArtInfoService;

    @Autowired
    public FindArtInfoController(FindArtInfoService findArtInfoService) {

        this.findArtInfoService = findArtInfoService;
    }

    @GetMapping("/{artId}")
    public ResponseEntity<FindArtInfoDTO> getArtInfoId(@PathVariable Long artId) {

        FindArtInfoDTO findArtInfoDTO = findArtInfoService.findByArtId(artId);

        return ResponseEntity.ok().body(findArtInfoDTO);
    }
}
