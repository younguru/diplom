package ru.netology.diplom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface FileRepository extends JpaRepository<File, Long>{
    File findFirstByFilename(String fileName);
    @Modifying
    @Query("update File f set f.filename = ?2 where f.id = ?1")
    int setFileName(Long id, String fileName);

}
