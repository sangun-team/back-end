package com.rangstory.rangstory.domain.artinfo.query.application.dto;

import com.rangstory.rangstory.domain.artinfo.query.domain.aggregate.entity.ArtInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class FindArtInfoDTO {

    private final Long artId;
    private final String artName;
    private final String painterName;
    private final String artYear;
    private final String content;

    public FindArtInfoDTO(Long artId, String artName, String painterName, String artYear, String content) {
        this.artId = artId;
        this.artName = artName;
        this.painterName = painterName;
        this.artYear = artYear;
        this.content = content;
    }

    public static FindArtInfoDTO toEntity(ArtInfo artInfo) {

        return FindArtInfoDTO.builder()
                .artId(artInfo.getId())
                .artName(artInfo.getArtName())
                .painterName(artInfo.getPainterName())
                .artYear(artInfo.getArtYear())
                .content(artInfo.getContent())
                .build();
    }
}
