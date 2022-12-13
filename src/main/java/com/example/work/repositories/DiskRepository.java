package com.example.work.repositories;

import com.example.work.models.Disk;
import org.springframework.data.repository.CrudRepository;


/**
 * @author Ivan 12.12.2022
 */
public interface DiskRepository extends CrudRepository<Disk, Long> {
}
