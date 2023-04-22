package com.spring_boot_project_00000000.Spring_boot_practice_000000.Repository;

import com.spring_boot_project_00000000.Spring_boot_practice_000000.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
