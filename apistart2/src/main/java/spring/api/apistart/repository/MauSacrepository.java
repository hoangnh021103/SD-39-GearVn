package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.MauSac;
@Repository
public interface MauSacrepository extends JpaRepository<MauSac, Byte> {
}
