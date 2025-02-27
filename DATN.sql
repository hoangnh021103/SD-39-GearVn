create database Gearvn
use Gearvn
CREATE TABLE tai_khoan
(
    id            INT PRIMARY KEY IDENTITY,
    email         NVARCHAR(50) UNIQUE NOT NULL,
    mat_khau_hash NVARCHAR(255),
    vai_tro       NVARCHAR(40)        NOT NULL,
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
    so_dien_thoai NVARCHAR(20),
    dia_chi       NVARCHAR(255)
);
GO

CREATE TABLE danh_muc
(
    id              TINYINT PRIMARY KEY IDENTITY,
    ten_json        NVARCHAR(50) NOT NULL
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
    thuong_hieu_json NVARCHAR(100) NOT NULL
);
GO

CREATE TABLE san_pham
(
    id              INT PRIMARY KEY IDENTITY,
    danh_muc_id     TINYINT FOREIGN KEY REFERENCES danh_muc (id),
	thuong_hieu_id  TINYINT FOREIGN KEY REFERENCES thuong_hieu (id),
	mau_sac_id      TINYINT FOREIGN KEY REFERENCES mau_sac (id),
    hinh_anh_id     TINYINT FOREIGN KEY REFERENCES hinh_anh (id),
    ten             NVARCHAR(50) NOT NULL,
    hinh_dai_dien   NVARCHAR(255),
    bao_hanh        INT,
    gia_nhap        INT        NOT NULL,
    gia_ban         INT       NOT NULL,
    thue            FLOAT        NOT NULL,
    mo_ta           NVARCHAR(255),
);
GO

CREATE TABLE chi_tiet_san_pham
(
    id             INT PRIMARY KEY IDENTITY,
    san_pham_id    INT FOREIGN KEY REFERENCES san_pham (id),
	so_luong	   INT NOT NULL,
    serial         NVARCHAR(20) NOT NULL,
    vi_xu_ly       NVARCHAR(255) NOT NULL,
    ram            NVARCHAR(50)  NOT NULL,
    luu_tru        NVARCHAR(100) NOT NULL,
    card_do_hoa    NVARCHAR(255),
    man_hinh       NVARCHAR(50)  NOT NULL,
    do_phan_giai   NVARCHAR(100),
    pin            NVARCHAR(100),
    trong_luong    DECIMAL(5,2),
    he_dieu_hanh   VARCHAR(100),
);
GO

CREATE TABLE ma_giam_gia
(
    id					INT PRIMARY KEY IDENTITY,
	ten_giam_gia		NVARCHAR(255) NOT NULL,
    loai_giam_gia		BIT       NOT NULL,
    gia_tri_giam		FLOAT     NOT NULL,
    don_hang_toi_thieu  INT NOT NULL,
    giam_gia_toi_da		INT,
    gioi_han_su_dung	INT,
	mo_ta				NVARCHAR(255),
    ngay_bat_dau		DATETIME2 NOT NULL,
    ngay_ket_thuc		DATETIME2 NOT NULL
);
GO

//*CREATE TABLE danh_gia
(
    id              INT PRIMARY KEY IDENTITY,
    san_pham_id     INT FOREIGN KEY REFERENCES san_pham (id),
    khach_hang_id   INT FOREIGN KEY REFERENCES khach_hang (id),
    diem_danh_gia   TINYINT NOT NULL,
    binh_luan       NVARCHAR(255),
    ngay_tao        DATETIME2 NOT NULL
);
GO
*//

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
CREATE TABLE hoa_don
(
    id              INT PRIMARY KEY IDENTITY,
	don_hang_id     INT FOREIGN KEY REFERENCES don_hang (id),
    khach_hang_id   INT FOREIGN KEY REFERENCES khach_hang (id),
    tong_tien       INT NOT NULL,
    ghi_chu         NVARCHAR(255) NOT NULL,
    ngay_xuat       DATETIME2 NOT NULL
);
GO
-- Bảng tai_khoan
INSERT INTO tai_khoan (email, mat_khau_hash, vai_tro, trang_thai)
VALUES
('user1@example.com', '123', 'user', 1),
('user2@example.com', '123', 'user', 1),
('admin@example.com', '123', 'ADMIN', 1);

-- Bảng khach_hang
INSERT INTO khach_hang (tai_khoan_id, ho_ten, so_dien_thoai, sdt_phu, tinh, huyen, xa, dia_chi, dia_chi_phu)
VALUES
(1, N'Nguyen Van A', '0123456789', '0911555666', N'Hanoi', N'Dong Da', N'Lang Ha', N'123 Nguyen Trai', '789 Ly Thuong Kiet'),
(2, N'Tran Thi B', '0987654321', '0978123456', N'HCMC', N'Quan 1', N'Ben Nghe', N'456 Tran Hung Dao', N'Phu Nhuan');

-- Bảng nhan_vien
INSERT INTO nhan_vien (tai_khoan_id, ho_ten, ngay_sinh, gioi_tinh, so_dien_thoai, dia_chi)
VALUES
(1, N'Le Thi C', '1985-05-15', N'Nu', '0912345678', N'789 Le Loi');

-- Bảng danh_muc
INSERT INTO danh_muc (ten_json)
VALUES
(N'Điện tử'),
(N'Asus'),
(N'Lenovo'),
(N'CPU'),
(N'RAM'),
(N'Mainboard'),
(N'Bàn phím cơ'),
(N'Chuột gaming');

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
INSERT INTO san_pham (danh_muc_id, ten, hinh_dai_dien, bao_hanh, gia_nhap, gia_ban, thue, mo_ta, mau_sac_id, hinh_anh_id, thuong_hieu_id)
VALUES
(1, N'Acer Nitro 5', N'acer.jpg', 12, 20000000, 25000000, 0.1, N'Laptop chơi game mạnh mẽ', 1, 1, 1),
(2, N'MacBook Pro 14', N'macbookpro.jpg', 12, 30000000, 35000000, 0.1, N'Laptop cao cấp', 2, 2, 2),
(3, N'Dell XPS 13', N'dellxps13.jpg', 12, 25000000, 28000000, 0.1, N'Laptop mỏng nhẹ', 1, 1, 1),
(4, N'HP Spectre x360', N'hpspectrex360.jpg', 12, 22000000, 27000000, 0.1, N'Laptop 2-in-1 cao cấp', 2, 2, 2);


-- Bảng chi_tiet_san_pham
INSERT INTO chi_tiet_san_pham (san_pham_id,so_luong,serial,vi_xu_ly, ram, luu_tru, card_do_hoa, man_hinh, do_phan_giai, pin, trong_luong, he_dieu_hanh)
VALUES
(1,100, 'SNFVG5680247', N'A16 Bionic', N'6GB', N'128GB', NULL, N'6.1 inch', N'2532x1170', N'3227 mAh', 0.80, N'iOS'),
(2,100, 'SNFVG0743782', N'M2', N'16GB', N'512GB', N'Apple GPU', N'14 inch', N'3024x1964', N'70 Wh', 1.60, N'macOS'),
(4,100, 'SNFVG4829047', N'Intel Core i7', N'16GB', N'512GB SSD', N'Intel Iris Xe', N'13.4 inch', N'1920x1200', N'52 Wh', 1.20, N'Windows 11'),
(3,100, 'SNFVG1580385', N'Intel Core i7', N'16GB', N'1TB SSD', N'Intel Iris Xe', N'13.3 inch', N'1920x1080',N'60 Wh', 1.30, N'Windows 11');

-- Bảng ma_giam_gia
INSERT INTO ma_giam_gia (ten_giam_gia,loai_giam_gia, gia_tri_giam, don_hang_toi_thieu, giam_gia_toi_da, gioi_han_su_dung,mo_ta, ngay_bat_dau, ngay_ket_thuc)
VALUES
(N'Khuyến mại đặc biệt',1, 0.1, 1000000, 500000, 100,N'Áp dụng cho sản phẩm trên 500000 nghìn', '2025-01-01', '2025-12-31');


-- Bảng danh_gia
/*INSERT INTO danh_gia (san_pham_id, khach_hang_id, diem_danh_gia, binh_luan, ngay_tao)
VALUES
(1,2, 5, N'Sản phẩm tuyệt vời!', '2025-01-15'),
(2,1, 4, N'Rất hài lòng', '2025-01-16');
*/
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
INSERT INTO hoa_don (don_hang_id, khach_hang_id, tong_tien, ghi_chu, ngay_xuat)
VALUES
    (1, 1, 15000000, N'Đã thanh toán, giao hàng trong 3 ngày', '2024-02-26 10:30:00');
GO
SELECT * FROM hoa_don;

-- Lấy tất cả tài khoản
SELECT * FROM tai_khoan;

-- Lấy tất cả khách hàng
SELECT * FROM khach_hang;

-- Lấy tất cả nhân viên
SELECT * FROM nhan_vien;

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

-- Lấy tất cả hoá đơn
SELECT * FROM hoa_don;








