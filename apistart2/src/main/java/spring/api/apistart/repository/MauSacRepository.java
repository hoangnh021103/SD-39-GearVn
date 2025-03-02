package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.MauSac;

public interface MauSacRepository extends JpaRepository<MauSac, Byte> {
}
