package com.simplecoding.simpledms.filedb.repository;

import com.simplecoding.simpledms.filedb.entity.FileDb;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDbRepository extends JpaRepository<FileDb, String> {
    @Query(value = "select f from FileDb f\n" +
            "where f.fileTitle like %:searchKeyword%")
    Page<FileDb> selectFileDbList(
            @Param("searchKeyword") String searchKeyword,
            Pageable pageable
    );
}

