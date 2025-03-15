package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.DonViVanChuyen;
import spring.api.apistart.repository.DonViVanChuyenRepository;

import java.util.List;

@Service
public class DonViVanChuyenService {
    @Autowired
    private DonViVanChuyenRepository donViVanChuyenRepository;

    public List<DonViVanChuyen> getAll(int page, int size) {
        List<DonViVanChuyen> all = donViVanChuyenRepository.findAll();
        int totalItems = all.size();
        int start = page * size;
        int end = Math.min(start + size, totalItems);
        if (start >= totalItems) {
            return List.of();
        }
        return all.subList(start, end);
    }

    public DonViVanChuyen getById(Integer id) {
        return donViVanChuyenRepository.findById(id).orElse(null);
    }

    public DonViVanChuyen add(DonViVanChuyen donViVanChuyen) {
        return donViVanChuyenRepository.save(donViVanChuyen);
    }

    public DonViVanChuyen update(Integer id, DonViVanChuyen donViVanChuyen) {
        return donViVanChuyenRepository.findById(id)
                .map(existing -> {
                    existing.setTen(donViVanChuyen.getTen());
                    existing.setTrangThai(donViVanChuyen.getTrangThai());
                    return donViVanChuyenRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        donViVanChuyenRepository.deleteById(id);
    }
}