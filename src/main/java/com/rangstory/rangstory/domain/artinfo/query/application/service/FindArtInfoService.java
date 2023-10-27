package com.rangstory.rangstory.domain.artinfo.query.application.service;

import com.rangstory.rangstory.domain.artinfo.query.application.dto.FindArtInfoDTO;
import com.rangstory.rangstory.domain.artinfo.query.domain.aggregate.entity.ArtInfo;
import com.rangstory.rangstory.domain.artinfo.query.domain.repository.ArtInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class FindArtInfoService {

    private final ArtInfoRepository artInfoRepository;

    @Autowired
    public FindArtInfoService(ArtInfoRepository artInfoRepository) {
        this.artInfoRepository = artInfoRepository;
    }

    @Transactional
    public FindArtInfoDTO findArtInfoId(Long artId) {
        ArtInfo artInfo = findByArtId(artId);

        FindArtInfoDTO findArtIn
    }

    private ArtInfo findByArtId(Long artId) {
        Optional<ArtInfo> artInfo = artInfoRepository.findById(artId);

        return artInfo.get();
    }
}
