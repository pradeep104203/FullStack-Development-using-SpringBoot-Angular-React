package com.pradeep.document.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.document.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}
