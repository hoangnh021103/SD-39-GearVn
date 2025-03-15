package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.ThuongHieu;
import spring.api.apistart.repository.ThuongHieuRepository;

import java.util.List;

@Service
public class ThuongHieuService {
    @Autowired
    private ThuongHieuRepository thuongHieuRepository;

    public List<ThuongHieu> getAll(int page, int size) {
        List<ThuongHieu> all = thuongHieuRepository.findAll();
        int totalItems = all.size();
        int start = page * size;
        int end = Math.min(start + size, totalItems);
        if (start >= totalItems) {
            return List.of();
        }
        return all.subList(start, end);
    }

    public ThuongHieu getById(Integer id) {
        return thuongHieuRepository.findById(id).orElse(null);
    }

    public ThuongHieu add(ThuongHieu thuongHieu) {
        return thuongHieuRepository.save(thuongHieu);
    }

    public ThuongHieu update(Integer id, ThuongHieu thuongHieu) {
        return thuongHieuRepository.findById(id)
                .map(existing -> {
                    existing.setTen(thuongHieu.getTen());
                    existing.setTrangThai(thuongHieu.getTrangThai());
                    return thuongHieuRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        thuongHieuRepository.deleteById(id);
    }
}