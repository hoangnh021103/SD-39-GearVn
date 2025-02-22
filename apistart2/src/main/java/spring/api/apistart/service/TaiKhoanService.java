package spring.api.apistart.service;// ⚠️ Package phải đúng!

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import spring.api.apistart.dto.TaiKhoanCustom;
import spring.api.apistart.entity.TaiKhoan;
import spring.api.apistart.repository.TaiKhoanrepo;

import java.util.List;

@Service
public class TaiKhoanService {
    @Autowired
    private TaiKhoanrepo repo;

    public List<TaiKhoanCustom> getAll() {

       return  repo.getAllTaiKhoan();
    }
}

