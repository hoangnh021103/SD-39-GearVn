package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.KhachHang;
import spring.api.apistart.repository.KhachHangrepo;


import java.util.List;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangrepo repo;

    public List<KhachHang>getAll(){
        return repo.findAll();
    }
}
