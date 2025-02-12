create database Gearvn1
use Gearvn1
CREATE TABLE tai_khoan
(
    id            INT PRIMARY KEY IDENTITY,
    email         NVARCHAR(50) UNIQUE NOT NULL,
    mat_khau_hash NVARCHAR(255),
    vai_tro       NVARCHAR(40)        NOT NULL,
    token_lam_moi NVARCHAR(255),
    trang_thai    BIT                 NOT NULL DEFAULT 1
);
GO

CREATE TABLE khach_hang
(
    id            NVARCHAR(20) PRIMARY KEY,
    tai_khoan_id  INT FOREIGN KEY REFERENCES tai_khoan (id),
    ho_ten        NVARCHAR(50) NOT NULL,
    so_dien_thoai NVARCHAR(20),
    sdt_phu       NVARCHAR(20),
    tinh          NVARCHAR(50),
    huyen         NVARCHAR(50),
    xa            NVARCHAR(50),
    dia_chi       NVARCHAR(255),
    dia_chi_phu   NVARCHAR(255)
);
GO

CREATE TABLE nhan_vien
(
    id            NVARCHAR(20) PRIMARY KEY,
    tai_khoan_id  INT FOREIGN KEY REFERENCES tai_khoan (id),
    ho_ten        NVARCHAR(50) NOT NULL,
    ngay_sinh     DATE,
    gioi_tinh     NVARCHAR(10),
    cmnd_cccd     NVARCHAR(20),
    so_dien_thoai NVARCHAR(20),
    dia_chi       NVARCHAR(255)
);
GO


CREATE TABLE danh_muc_cha
(
    id   INT PRIMARY KEY IDENTITY,
    ten  NVARCHAR(50) NOT NULL UNIQUE
);
GO

CREATE TABLE danh_muc
(
    id              INT PRIMARY KEY IDENTITY,
    danh_muc_cha_id INT NULL FOREIGN KEY REFERENCES danh_muc_cha(id), 
    ten             NVARCHAR(50) NOT NULL UNIQUE
);
GO



CREATE TABLE mau_sac
(
    id         TINYINT PRIMARY KEY IDENTITY,
    mau_json   NVARCHAR(255) NOT NULL
);
GO

CREATE TABLE hinh_anh
(
    id         TINYINT PRIMARY KEY IDENTITY,
    hinh_json  NVARCHAR(1000) NOT NULL
);
GO

CREATE TABLE thuoc_tinh
(
    id            TINYINT PRIMARY KEY IDENTITY,
    thuoc_tinh_json NVARCHAR(4000) NOT NULL
);
GO

CREATE TABLE san_pham
(
    id              NVARCHAR(20) PRIMARY KEY,
    danh_muc_id     INT FOREIGN KEY REFERENCES danh_muc (id),
    ten             NVARCHAR(50) NOT NULL,
    hinh_dai_dien   NVARCHAR(255),
    thuong_hieu     NVARCHAR(50),
    bao_hanh        INT,
    gia_nhap        MONEY        NOT NULL,
    gia_ban         MONEY        NOT NULL,
    thue            FLOAT        NOT NULL,
    mo_ta           NVARCHAR(255),
    mau_sac_id      TINYINT FOREIGN KEY REFERENCES mau_sac (id),
    hinh_anh_id     TINYINT FOREIGN KEY REFERENCES hinh_anh (id),
    thuoc_tinh_id   TINYINT FOREIGN KEY REFERENCES thuoc_tinh (id)
);
GO

CREATE TABLE chi_tiet_san_pham
(
    id             INT PRIMARY KEY IDENTITY,
    san_pham_id    NVARCHAR(20) FOREIGN KEY REFERENCES san_pham (id),
		serial NVARCHAR(20) not null,

    vi_xu_ly       VARCHAR(255) NOT NULL,
    ram            VARCHAR(50)  NOT NULL,
    luu_tru        VARCHAR(100) NOT NULL,
    card_do_hoa    VARCHAR(255),
    man_hinh       VARCHAR(50)  NOT NULL,
    do_phan_giai   VARCHAR(100),
    pin            VARCHAR(100),
    trong_luong    DECIMAL(5,2),
    he_dieu_hanh   VARCHAR(100),
    bao_hanh       INT DEFAULT 12
);
GO

CREATE TABLE ma_giam_gia
(
    id              NVARCHAR(20) PRIMARY KEY,
    loai_giam_gia   BIT       NOT NULL,
    gia_tri_giam    FLOAT     NOT NULL,
    don_hang_toi_thieu MONEY NOT NULL,
    giam_gia_toi_da MONEY,
    gioi_han_su_dung INT,
    ngay_bat_dau    DATETIME2 NOT NULL,
    ngay_ket_thuc   DATETIME2 NOT NULL
);
GO

CREATE TABLE chuong_trinh_khuyen_mai
(
    id              INT PRIMARY KEY IDENTITY,
    ten             NVARCHAR(50) NOT NULL,
    mo_ta           NVARCHAR(255),
    loai_giam_gia   BIT          NOT NULL,
    gia_tri_giam    FLOAT        NOT NULL,
    ngay_bat_dau    DATETIME2    NOT NULL,
    ngay_ket_thuc   DATETIME2    NOT NULL
);
GO

CREATE TABLE khuyen_mai_san_pham
(
    id                   INT PRIMARY KEY IDENTITY,
    san_pham_id          NVARCHAR(20) FOREIGN KEY REFERENCES san_pham (id),
    chuong_trinh_id      INT FOREIGN KEY REFERENCES chuong_trinh_khuyen_mai (id)
);
GO

CREATE TABLE danh_gia
(
    id              INT PRIMARY KEY IDENTITY,
    san_pham_id     NVARCHAR(20) FOREIGN KEY REFERENCES san_pham (id),
    khach_hang_id   NVARCHAR(20) FOREIGN KEY REFERENCES khach_hang (id),
    diem_danh_gia   TINYINT NOT NULL,
    binh_luan       NVARCHAR(255),
    ngay_tao        DATETIME2 NOT NULL
);
GO

CREATE TABLE phuong_thuc_thanh_toan
(
    id   TINYINT PRIMARY KEY IDENTITY,
    ten  NVARCHAR(50) NOT NULL UNIQUE
);
GO

CREATE TABLE don_vi_van_chuyen
(
    id      NVARCHAR(15) PRIMARY KEY,
    ten     NVARCHAR(50) NOT NULL,
    so_dien_thoai NVARCHAR(20),
    email   NVARCHAR(50),
    trang_thai BIT NOT NULL DEFAULT 1
);
GO

CREATE TABLE don_hang
(
    id                 NVARCHAR(40) PRIMARY KEY,
    khach_hang_id      NVARCHAR(20) FOREIGN KEY REFERENCES khach_hang (id),
    nhan_vien_id       NVARCHAR(20) FOREIGN KEY REFERENCES nhan_vien (id),
    phuong_thuc_tt_id  TINYINT FOREIGN KEY REFERENCES phuong_thuc_thanh_toan (id),
    don_vi_vc_id       NVARCHAR(15) FOREIGN KEY REFERENCES don_vi_van_chuyen (id),
    ma_giam_gia_id     NVARCHAR(20) FOREIGN KEY REFERENCES ma_giam_gia (id),
    dia_chi_giao_hang  NVARCHAR(255),
    trang_thai         TINYINT NOT NULL,
    ngay_tao           DATETIME2 NOT NULL,
    ngay_cap_nhat      DATETIME2 NOT NULL
);
GO

CREATE TABLE chi_tiet_don_hang
(
    id              INT PRIMARY KEY IDENTITY,
    don_hang_id     NVARCHAR(40) FOREIGN KEY REFERENCES don_hang (id),
    san_pham_id     NVARCHAR(20) FOREIGN KEY REFERENCES san_pham (id),
    mau_sac         NVARCHAR(50),
    gia             MONEY NOT NULL,
    so_luong        INT   NOT NULL
);
GO
CREATE TABLE gio_hang
(
    id              INT PRIMARY KEY IDENTITY,
    khach_hang_id   NVARCHAR(20) FOREIGN KEY REFERENCES khach_hang (id), -- Liên kết khách hàng
    san_pham_id     NVARCHAR(20) FOREIGN KEY REFERENCES san_pham (id),   -- Sản phẩm được chọn
    so_luong        INT NOT NULL,                                        -- Số lượng sản phẩm
    ngay_them       DATETIME2 NOT NULL DEFAULT GETDATE()                 -- Ngày thêm vào giỏ hàng
);


-- Bảng tai_khoan
INSERT INTO tai_khoan (email, mat_khau_hash, vai_tro, token_lam_moi, trang_thai)
VALUES
('user1@example.com', '123', 'user', NULL, 1),
('user2@example.com', '123', 'user', NULL, 1),
('admin@example.com', '123', 'ADMIN', NULL, 1);

-- Bảng khach_hang
INSERT INTO khach_hang (id, tai_khoan_id, ho_ten, so_dien_thoai, sdt_phu, tinh, huyen, xa, dia_chi, dia_chi_phu)
VALUES
('KH001', 1, 'Nguyen Van A', '0123456789', NULL, 'Hanoi', 'Dong Da', 'Lang Ha', '123 Nguyen Trai', NULL),
('KH002', 2, 'Tran Thi B', '0987654321', '0978123456', 'HCMC', 'Quan 1', 'Ben Nghe', '456 Tran Hung Dao', 'Phu Nhuan');

-- Bảng nhan_vien
INSERT INTO nhan_vien (id, tai_khoan_id, ho_ten, ngay_sinh, gioi_tinh, cmnd_cccd, so_dien_thoai, dia_chi)
VALUES
('NV001', 3, 'Le Thi C', '1985-05-15', 'Nu', '123456789', '0912345678', '789 Le Loi');

-- Bảng danh_muc_cha
-- Bảng danh_muc_cha
INSERT INTO danh_muc_cha (ten)
VALUES
('Điện tử'),
('Laptop'),
('Phụ kiện');

-- Bảng danh_muc (liên kết với danh_muc_cha)
INSERT INTO danh_muc (danh_muc_cha_id, ten)
VALUES
(1, 'Acer'),
(1, 'Asus'),
(1, 'Lenovo'),
(2, 'CPU'),
(2, 'RAM'),
(2, 'Mainboard'),
(3, 'Bàn phím cơ'),
(3, 'Chuột gaming');

-- Bảng mau_sac
INSERT INTO mau_sac (mau_json)
VALUES
(N'{"ten": "Đỏ"}'),
(N'{"ten": "Xanh"}');

-- Bảng hinh_anh
INSERT INTO hinh_anh (hinh_json)
VALUES
(N'{"url": "image1.jpg"}'),
(N'{"url": "image2.jpg"}');

-- Bảng thuoc_tinh
INSERT INTO thuoc_tinh (thuoc_tinh_json)
VALUES
(N'{"key": "RAM", "value": "8GB"}'),
(N'{"key": "Storage", "value": "256GB"}');

-- Bảng san_pham
INSERT INTO san_pham (id, danh_muc_id, ten, hinh_dai_dien, thuong_hieu, bao_hanh, gia_nhap, gia_ban, thue, mo_ta, mau_sac_id, hinh_anh_id, thuoc_tinh_id)
VALUES
('SP001', 1, 'Acer nitro 5', 'acer.jpg', 'Apple', 12, 20000000, 25000000, 0.1, 'acer mới nhất', 1, 1, 1),
('SP002', 2, 'MacBook Pro', 'macbookpro.jpg', 'Apple', 12, 30000000, 35000000, 0.1, 'Laptop cao cấp', 2, 2, 2),
('SP003', 2, 'Dell XPS 13', 'dellxps13.jpg', 'Dell', 12, 25000000, 28000000, 0.1, 'Laptop nhỏ gọn, mạnh mẽ', 1, 1, 1),
('SP004', 2, 'HP Spectre x360', 'hpspectrex360.jpg', 'HP', 12, 22000000, 27000000, 0.1, 'Laptop 2-in-1 cao cấp', 2, 2, 2);

-- Bảng chi_tiet_san_pham
INSERT INTO chi_tiet_san_pham (san_pham_id, serial, vi_xu_ly, ram, luu_tru, card_do_hoa, man_hinh, do_phan_giai, pin, trong_luong, he_dieu_hanh, bao_hanh)
VALUES
('SP001', 'SN001', 'A16 Bionic', '6GB', '128GB', NULL, '6.1 inch', '2532x1170', '3227 mAh', 0.80, 'iOS', 12),
('SP002', 'SN002', 'M2', '16GB', '512GB', 'Apple GPU', '14 inch', '3024x1964', '70 Wh', 1.60, 'macOS', 12),
('SP003', 'SN003', 'Intel Core i7', '16GB', '512GB SSD', 'Intel Iris Xe', '13.4 inch', '1920x1200', '52 Wh', 1.20, 'Windows 11', 12),
('SP004', 'SN004', 'Intel Core i7', '16GB', '1TB SSD', 'Intel Iris Xe', '13.3 inch', '1920x1080', '60 Wh', 1.30, 'Windows 11', 12);

-- Bảng ma_giam_gia
INSERT INTO ma_giam_gia (id, loai_giam_gia, gia_tri_giam, don_hang_toi_thieu, giam_gia_toi_da, gioi_han_su_dung, ngay_bat_dau, ngay_ket_thuc)
VALUES
('MGG001', 1, 0.1, 1000000, 500000, 100, '2025-01-01', '2025-12-31');

-- Bảng chuong_trinh_khuyen_mai
INSERT INTO chuong_trinh_khuyen_mai (ten, mo_ta, loai_giam_gia, gia_tri_giam, ngay_bat_dau, ngay_ket_thuc)
VALUES
('Tết 2025', 'Khuyến mãi nhân dịp Tết', 1, 0.2, '2025-01-20', '2025-02-20');

-- Bảng khuyen_mai_san_pham
INSERT INTO khuyen_mai_san_pham (san_pham_id, chuong_trinh_id)
VALUES
('SP001', 1);

-- Bảng danh_gia
INSERT INTO danh_gia (san_pham_id, khach_hang_id, diem_danh_gia, binh_luan, ngay_tao)
VALUES
('SP001', 'KH001', 5, 'Sản phẩm tuyệt vời!', '2025-01-15'),
('SP002', 'KH002', 4, 'Rất hài lòng', '2025-01-16');

-- Bảng phuong_thuc_thanh_toan
INSERT INTO phuong_thuc_thanh_toan (ten)
VALUES
('Tiền mặt'),
('momo');

-- Bảng don_vi_van_chuyen
INSERT INTO don_vi_van_chuyen (id, ten, so_dien_thoai, email, trang_thai)
VALUES
('VC001', 'Giao Hàng Nhanh', '19001000', 'ghn@example.com', 1);

-- Bảng don_hang
INSERT INTO don_hang (id, khach_hang_id, nhan_vien_id, phuong_thuc_tt_id, don_vi_vc_id, ma_giam_gia_id, dia_chi_giao_hang, trang_thai, ngay_tao, ngay_cap_nhat)
VALUES
('DH001', 'KH001', 'NV001', 1, 'VC001', 'MGG001', '123 Nguyen Trai, Hanoi', 1, '2025-01-20', '2025-01-20');

-- Bảng chi_tiet_don_hang
INSERT INTO chi_tiet_don_hang (don_hang_id, san_pham_id, mau_sac, gia, so_luong)
VALUES
('DH001', 'SP001', 'Đỏ', 25000000, 1);

-- Bảng gio_hang
INSERT INTO gio_hang (khach_hang_id, san_pham_id, so_luong, ngay_them)
VALUES
('KH001', 'SP002', 1, GETDATE());

-- Lấy tất cả tài khoản
SELECT * FROM tai_khoan;

-- Lấy tất cả khách hàng
SELECT * FROM khach_hang;

-- Lấy tất cả nhân viên
SELECT * FROM nhan_vien;

-- Lấy tất cả danh mục cha
SELECT * FROM danh_muc_cha;

-- Lấy tất cả danh mục
SELECT * FROM danh_muc;

-- Lấy tất cả màu sắc
SELECT * FROM mau_sac;

-- Lấy tất cả hình ảnh
SELECT * FROM hinh_anh;

-- Lấy tất cả thuộc tính
SELECT * FROM thuoc_tinh;

-- Lấy tất cả sản phẩm
SELECT * FROM san_pham;

-- Lấy tất cả chi tiết sản phẩm
SELECT * FROM chi_tiet_san_pham;

-- Lấy tất cả mã giảm giá
SELECT * FROM ma_giam_gia;

-- Lấy tất cả chương trình khuyến mãi
SELECT * FROM chuong_trinh_khuyen_mai;

-- Lấy tất cả khuyến mãi sản phẩm
SELECT * FROM khuyen_mai_san_pham;

-- Lấy tất cả đánh giá sản phẩm
SELECT * FROM danh_gia;

-- Lấy tất cả phương thức thanh toán
SELECT * FROM phuong_thuc_thanh_toan;

-- Lấy tất cả đơn vị vận chuyển
SELECT * FROM don_vi_van_chuyen;

-- Lấy tất cả đơn hàng
SELECT * FROM don_hang;

-- Lấy tất cả chi tiết đơn hàng
SELECT * FROM chi_tiet_don_hang;

-- Lấy tất cả giỏ hàng
SELECT * FROM gio_hang;
