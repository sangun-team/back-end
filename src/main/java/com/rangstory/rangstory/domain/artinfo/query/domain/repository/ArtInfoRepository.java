package com.rangstory.rangstory.domain.artinfo.query.domain.repository;

import com.rangstory.rangstory.domain.artinfo.query.domain.aggregate.entity.ArtInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtInfoRepository extends JpaRepository<ArtInfo, Long> {
}
