package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.MauSac;

public interface MauSacrepository extends JpaRepository<MauSac, Byte> {
}
