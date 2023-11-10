package com.rangstory.rangstory.domain.artinfo.query.domain.aggregate.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "ARTINFO_TB")
@Getter
public class ArtInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false, name = "art_name")
    private String artName;

    @Column(columnDefinition = "TEXT", nullable = false, name = "painter_name")
    private String painterName;

    @Column(columnDefinition = "TEXT", nullable = false, name = "art_year")
    private String artYear;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    protected ArtInfo() {}

    public ArtInfo(String artName, String painterName, String artYear, String content) {
        this.artName = artName;
        this.painterName = painterName;
        this.artYear = artYear;
        this.content = content;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public ArtInfo setPainterName(String painterName) {
        this.painterName = painterName;
        return this;
    }

    public ArtInfo setArtYear(String artYear) {
        this.artYear = artYear;
        return this;
    }

    public ArtInfo setContent(String content) {
        this.content = content;
        return this;
    }
}
