package com.rangstory.rangstory.domain.artinfo.query.application.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FindArtInfoDTO {

    private final Long artId;
    private final String painterName;
    private final String artYear;
    private final String content;

    public FindArtInfoDTO(Long artId, String painterName, String artYear, String content) {
        this.artId = artId;
        this.painterName = painterName;
        this.artYear = artYear;
        this.content = content;
    }
}
