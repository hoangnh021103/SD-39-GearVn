package spring.api.apistart.dto;

public interface DanhMucCustom {
        Integer getId();
        String getTen();
        DanhMucChaCustom getDanhMucCha(); // Lấy thêm thông tin danh mục cha
    }

