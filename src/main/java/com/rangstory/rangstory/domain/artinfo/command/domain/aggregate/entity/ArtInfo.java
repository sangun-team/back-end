package com.rangstory.rangstory.domain.artinfo.command.domain.aggregate.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "ARTINFO_TB")
@Getter
public class ArtInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String painterName;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String era;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    protected ArtInfo() {}

    public ArtInfo(Long id, String painterName, String era, String content) {
        this.id = id;
        this.painterName = painterName;
        this.era = era;
        this.content = content;
    }

    public ArtInfo setPainterName(String painterName) {
        this.painterName = painterName;
        return this;
    }

    public ArtInfo setEra(String era) {
        this.era = era;
        return this;
    }

    public ArtInfo setContent(String content) {
        this.content = content;
        return this;
    }
}
