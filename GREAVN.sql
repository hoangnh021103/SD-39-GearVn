create database Gearvn
use Gearvn
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
    id            INT PRIMARY KEY IDENTITY,
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
    id            INT PRIMARY KEY IDENTITY,
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

CREATE TABLE thuong_hieu
(
    id            TINYINT PRIMARY KEY IDENTITY,
    thuong_hieu_json NVARCHAR(255) NOT NULL
);
GO

CREATE TABLE san_pham
(
    id              INT PRIMARY KEY IDENTITY,
    danh_muc_id     INT FOREIGN KEY REFERENCES danh_muc (id),
    ten             NVARCHAR(50) NOT NULL,
    hinh_dai_dien   NVARCHAR(255),
    thuong_hieu     NVARCHAR(50),
    bao_hanh        INT,
    gia_nhap        INT        NOT NULL,
    gia_ban         INT       NOT NULL,
    thue            FLOAT        NOT NULL,
    mo_ta           NVARCHAR(255),
    mau_sac_id      TINYINT FOREIGN KEY REFERENCES mau_sac (id),
    hinh_anh_id     TINYINT FOREIGN KEY REFERENCES hinh_anh (id),
    thuong_hieu_id   TINYINT FOREIGN KEY REFERENCES thuong_hieu (id)
);
GO

CREATE TABLE chi_tiet_san_pham
(
    id             INT PRIMARY KEY IDENTITY,
    san_pham_id    INT FOREIGN KEY REFERENCES san_pham (id),
    serial         NVARCHAR(20) NOT NULL,
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
    id              INT PRIMARY KEY IDENTITY,
    loai_giam_gia   BIT       NOT NULL,
    gia_tri_giam    FLOAT     NOT NULL,
    don_hang_toi_thieu INT NOT NULL,
    giam_gia_toi_da INT,
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
    san_pham_id          INT FOREIGN KEY REFERENCES san_pham (id),
    chuong_trinh_id      INT FOREIGN KEY REFERENCES chuong_trinh_khuyen_mai (id)
);
GO

CREATE TABLE danh_gia
(
    id              INT PRIMARY KEY IDENTITY,
    san_pham_id     INT FOREIGN KEY REFERENCES san_pham (id),
    khach_hang_id   INT FOREIGN KEY REFERENCES khach_hang (id),
    diem_danh_gia   TINYINT NOT NULL,
    binh_luan       NVARCHAR(255),
    ngay_tao        DATETIME2 NOT NULL
);
GO

CREATE TABLE phuong_thuc_thanh_toan
(
    id   INT PRIMARY KEY IDENTITY,
    ten  NVARCHAR(50) NOT NULL UNIQUE
);
GO

CREATE TABLE don_vi_van_chuyen
(
    id      INT PRIMARY KEY IDENTITY,
    ten     NVARCHAR(50) NOT NULL,
    so_dien_thoai NVARCHAR(20),
    email   NVARCHAR(50),
    trang_thai BIT NOT NULL DEFAULT 1
);
GO


CREATE TABLE don_hang
(
    id                 INT PRIMARY KEY IDENTITY,
    khach_hang_id      INT FOREIGN KEY REFERENCES khach_hang (id),
    nhan_vien_id       INT FOREIGN KEY REFERENCES nhan_vien (id),
    phuong_thuc_tt_id  INT FOREIGN KEY REFERENCES phuong_thuc_thanh_toan (id),
    don_vi_vc_id       INT FOREIGN KEY REFERENCES don_vi_van_chuyen (id),
    ma_giam_gia_id     INT FOREIGN KEY REFERENCES ma_giam_gia (id),
    dia_chi_giao_hang  NVARCHAR(255),
    trang_thai         TINYINT NOT NULL,
    ngay_tao           DATETIME2 NOT NULL,
    ngay_cap_nhat      DATETIME2 NOT NULL
);
GO
CREATE TABLE chi_tiet_don_hang
(
    id              INT PRIMARY KEY IDENTITY,
    don_hang_id     INT FOREIGN KEY REFERENCES don_hang (id),
    san_pham_id     INT FOREIGN KEY REFERENCES san_pham (id),
    so_luong        INT NOT NULL,
    gia             INT NOT NULL,
    thue            FLOAT NOT NULL,
    thanh_tien      INT NOT NULL,
);
GO
CREATE TABLE gio_hang
(
    id              INT PRIMARY KEY IDENTITY,
    khach_hang_id   INT FOREIGN KEY REFERENCES khach_hang (id),
    san_pham_id     INT FOREIGN KEY REFERENCES san_pham (id),
    so_luong        INT NOT NULL,
    gia             INT NOT NULL,
    thue            FLOAT NOT NULL,
    ngay_tao        DATETIME2 NOT NULL DEFAULT GETDATE()
);
GO

-- Bảng tai_khoan
INSERT INTO tai_khoan (email, mat_khau_hash, vai_tro, token_lam_moi, trang_thai)
VALUES
('user1@example.com', '123', 'user', NULL, 1),
('user2@example.com', '123', 'user', NULL, 1),
('admin@example.com', '123', 'ADMIN', NULL, 1);

-- Bảng khach_hang
INSERT INTO khach_hang (tai_khoan_id, ho_ten, so_dien_thoai, sdt_phu, tinh, huyen, xa, dia_chi, dia_chi_phu)
VALUES
(1, N'Nguyen Van A', '0123456789', '0911555666', N'Hanoi', N'Dong Da', N'Lang Ha', N'123 Nguyen Trai', '789 Ly Thuong Kiet'),
(2, N'Tran Thi B', '0987654321', '0978123456', N'HCMC', N'Quan 1', N'Ben Nghe', N'456 Tran Hung Dao', N'Phu Nhuan');

-- Bảng nhan_vien
INSERT INTO nhan_vien (tai_khoan_id, ho_ten, ngay_sinh, gioi_tinh, so_dien_thoai, dia_chi)
VALUES
(3, N'Le Thi C', '1985-05-15', N'Nu', '0912345678', N'789 Le Loi');

-- Bảng danh_muc_cha
INSERT INTO danh_muc_cha (ten)
VALUES
(N'Điện tử'),
(N'Laptop'),
(N'Phụ kiện');

-- Bảng danh_muc (liên kết với danh_muc_cha)
INSERT INTO danh_muc (danh_muc_cha_id, ten)
VALUES
(1, N'Acer'),
(1, N'Asus'),
(1, N'Lenovo'),
(2, N'CPU'),
(2, N'RAM'),
(2, N'Mainboard'),
(3, N'Bàn phím cơ'),
(3, N'Chuột gaming');

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
INSERT INTO thuong_hieu (thuong_hieu_json)
VALUES
(N'{"thuongHieu": N"Dell"}'),
(N'{"thuongHieu": N"ACE"}'),
(N'{"thuongHieu": N"MacBook"}');

-- Bảng san_pham
INSERT INTO san_pham (danh_muc_id, ten, hinh_dai_dien, thuong_hieu, bao_hanh, gia_nhap, gia_ban, thue, mo_ta, mau_sac_id, hinh_anh_id, thuong_hieu_id)
VALUES
(1, N'Acer Nitro 5', N'acer.jpg', N'Acer', 12, 20000000, 25000000, 0.1, N'Laptop chơi game mạnh mẽ', 1, 1, 1),
(2, N'MacBook Pro 14', N'macbookpro.jpg', N'Apple', 12, 30000000, 35000000, 0.1, N'Laptop cao cấp', 2, 2, 2),
(3, N'Dell XPS 13', N'dellxps13.jpg', N'Dell', 12, 25000000, 28000000, 0.1, N'Laptop mỏng nhẹ', 1, 1, 1),
(4, N'HP Spectre x360', N'hpspectrex360.jpg', N'HP', 12, 22000000, 27000000, 0.1, N'Laptop 2-in-1 cao cấp', 2, 2, 2);

-- Bảng chi_tiet_san_pham
INSERT INTO chi_tiet_san_pham (san_pham_id, serial, vi_xu_ly, ram, luu_tru, card_do_hoa, man_hinh, do_phan_giai, pin, trong_luong, he_dieu_hanh, bao_hanh)
VALUES
(1, 'SN001', N'A16 Bionic', N'6GB', N'128GB', NULL, N'6.1 inch', N'2532x1170', N'3227 mAh', 0.80, N'iOS', 12),
(2, 'SN002', N'M2', N'16GB', N'512GB', N'Apple GPU', N'14 inch', N'3024x1964', N'70 Wh', 1.60, N'macOS', 12),
(4, 'SN003', N'Intel Core i7', N'16GB', N'512GB SSD', N'Intel Iris Xe', N'13.4 inch', N'1920x1200', N'52 Wh', 1.20, N'Windows 11', 12),
(3, 'SN004', N'Intel Core i7', N'16GB', N'1TB SSD', N'Intel Iris Xe', N'13.3 inch', N'1920x1080',N'60 Wh', 1.30, N'Windows 11', 12);

-- Bảng ma_giam_gia
INSERT INTO ma_giam_gia (loai_giam_gia, gia_tri_giam, don_hang_toi_thieu, giam_gia_toi_da, gioi_han_su_dung, ngay_bat_dau, ngay_ket_thuc)
VALUES
(1, 0.1, 1000000, 500000, 100, '2025-01-01', '2025-12-31');

-- Bảng chuong_trinh_khuyen_mai
INSERT INTO chuong_trinh_khuyen_mai (ten, mo_ta, loai_giam_gia, gia_tri_giam, ngay_bat_dau, ngay_ket_thuc)
VALUES
(N'Tết 2026', N'Khuyến mãi nhân dịp Tết', 1, 0.2, '2025-01-01', '2025-01-01'),
(N'Tết 2024', N'Khuyến mãi nhân dịp Tết', 1, 0.2, '2025-01-01', '2025-01-01');
-- Bảng khuyen_mai_san_pham
INSERT INTO khuyen_mai_san_pham (san_pham_id, chuong_trinh_id)
VALUES
(1, 1);

-- Bảng danh_gia
INSERT INTO danh_gia (san_pham_id, khach_hang_id, diem_danh_gia, binh_luan, ngay_tao)
VALUES
(1,2, 5, N'Sản phẩm tuyệt vời!', '2025-01-15'),
(2,1, 4, N'Rất hài lòng', '2025-01-16');

-- Bảng phuong_thuc_thanh_toan
INSERT INTO phuong_thuc_thanh_toan (ten)
VALUES
(N'Tiền mặt'),
(N'momo');

-- Bảng don_vi_van_chuyen
INSERT INTO don_vi_van_chuyen (ten, so_dien_thoai, email, trang_thai)
VALUES
(N'Giao Hàng Nhanh', '19001000', 'ghn@example.com', 1);

-- Bảng don_hang
INSERT INTO don_hang ( khach_hang_id, nhan_vien_id, phuong_thuc_tt_id, don_vi_vc_id, ma_giam_gia_id, dia_chi_giao_hang, trang_thai, ngay_tao, ngay_cap_nhat)
VALUES
(1,1,1,1,1, N'123 Nguyen Trai, Hanoi', 1, '2025-01-20', '2025-01-20');
go
-- Bảng chi_tiet_don_hang
INSERT INTO chi_tiet_don_hang (don_hang_id, san_pham_id, so_luong, gia, thue, thanh_tien)
VALUES
    (1, 1, 2, 500000, 0.1, 1100000),
    (1, 2, 1, 300000, 0.1, 330000);
-- Bảng gio_hang
INSERT INTO gio_hang (khach_hang_id, san_pham_id, so_luong, gia, thue)
VALUES
    (1, 1, 2, 500000, 0.1), 
    (1, 2, 1, 300000, 0.1), 
    (2, 3, 3, 150000, 0.1);
GO

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
SELECT * FROM thuong_hieu;

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










-- Lấy thông tin tài khoản
SELECT tk.id AS tai_khoan_id, tk.email, tk.mat_khau_hash, tk.vai_tro, tk.trang_thai
FROM tai_khoan tk;

-- Lấy thông tin nhân viên kèm theo tài khoản
SELECT nv.id AS nhan_vien_id, nv.ho_ten, nv.ngay_sinh, nv.gioi_tinh, nv.so_dien_thoai, nv.dia_chi, tk.id AS tai_khoan_id
FROM nhan_vien nv
JOIN tai_khoan tk ON nv.tai_khoan_id = tk.id;

-- Lấy thông tin khách hàng kèm theo tài khoản
SELECT kh.id AS khach_hang_id, kh.ho_ten, kh.so_dien_thoai, kh.sdt_phu, kh.tinh, kh.huyen, kh.xa, kh.dia_chi, kh.dia_chi_phu, tk.id AS tai_khoan_id
FROM khach_hang kh
JOIN tai_khoan tk ON kh.tai_khoan_id = tk.id;

-- Lấy thông tin mã giảm giá
SELECT id AS ma_giam_gia_id, loai_giam_gia, gia_tri_giam, don_hang_toi_thieu, giam_gia_toi_da, gioi_han_su_dung, ngay_bat_dau, ngay_ket_thuc
FROM ma_giam_gia;

-- Lấy thông tin đơn hàng kèm theo thông tin khách hàng, nhân viên và mã giảm giá
SELECT dh.id AS don_hang_id, dh.dia_chi_giao_hang, dh.trang_thai, dh.ngay_tao, dh.ngay_cap_nhat,
       kh.id AS khach_hang_id, nv.id AS nhan_vien_id, mg.id AS ma_giam_gia_id
FROM don_hang dh
LEFT JOIN khach_hang kh ON dh.khach_hang_id = kh.id
LEFT JOIN nhan_vien nv ON dh.nhan_vien_id = nv.id
LEFT JOIN ma_giam_gia mg ON dh.ma_giam_gia_id = mg.id;

-- Lấy thông tin chi tiết đơn hàng kèm theo thông tin sản phẩm
SELECT dhct.id AS chi_tiet_don_hang_id, dhct.so_luong, dhct.gia, dhct.thue, dhct.thanh_tien,
       dh.id AS don_hang_id, sp.id AS san_pham_id
FROM chi_tiet_don_hang dhct
LEFT JOIN don_hang dh ON dhct.don_hang_id = dh.id
LEFT JOIN san_pham sp ON dhct.san_pham_id = sp.id;

-- Lấy thông tin sản phẩm kèm theo danh mục, màu sắc, hình ảnh, thương hiệu
SELECT sp.id AS san_pham_id, sp.ten, sp.hinh_dai_dien, sp.bao_hanh, sp.gia_nhap, sp.gia_ban, sp.thue, sp.mo_ta,
       dm.id AS danh_muc_id, dm.ten AS danh_muc_ten,
       ms.id AS mau_sac_id, ms.mau_json,
       ha.id AS hinh_anh_id, ha.hinh_json,
       th.id AS thuong_hieu_id, th.thuong_hieu_json,
       dm_cha.id AS danh_muc_cha_id, dm_cha.ten AS danh_muc_cha_ten
FROM san_pham sp
LEFT JOIN danh_muc dm ON sp.danh_muc_id = dm.id
LEFT JOIN danh_muc_cha dm_cha ON dm.danh_muc_cha_id = dm_cha.id
LEFT JOIN mau_sac ms ON sp.mau_sac_id = ms.id
LEFT JOIN hinh_anh ha ON sp.hinh_anh_id = ha.id
LEFT JOIN thuong_hieu th ON sp.thuong_hieu_id = th.id;

-- Lấy thông tin chi tiết sản phẩm kèm theo thông tin sản phẩm
SELECT ctsp.id AS chi_tiet_san_pham_id, ctsp.serial, ctsp.vi_xu_ly, ctsp.ram, ctsp.luu_tru, ctsp.card_do_hoa, 
       ctsp.man_hinh, ctsp.do_phan_giai, ctsp.pin, ctsp.trong_luong, ctsp.he_dieu_hanh, ctsp.bao_hanh,
       sp.id AS san_pham_id, sp.ten AS san_pham_ten
FROM chi_tiet_san_pham ctsp
LEFT JOIN san_pham sp ON ctsp.san_pham_id = sp.id;

