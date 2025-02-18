package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.NhanVien;
import spring.api.apistart.repository.NhanVienrepo;

import java.util.List;

@Service
public class NhanVienService {

    @Autowired
    private NhanVienrepo nhanVienRepository;

    public List<NhanVien> getAll() {
        return nhanVienRepository.findAll();
    }
}
