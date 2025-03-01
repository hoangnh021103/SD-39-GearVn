create database Gearvn1
use Gearvn1

CREATE TABLE tai_khoan
(
    id            INT PRIMARY KEY IDENTITY,
    vai_tro       NVARCHAR(40)        NOT NULL,
	mo_ta		  NVARCHAR(255),
    trang_thai    BIT                 NOT NULL DEFAULT 1,
	nguoi_tao	  DATETIME2 NOT NULL,
	ngay_tao	  DATETIME2 NOT NULL,
	nguoi_sua	  DATETIME2 NOT NULL,
	ngay_sua	  DATETIME2 NOT NULL
);
GO

CREATE TABLE khach_hang (
    id				INT PRIMARY KEY IDENTITY,
    ho				NVARCHAR(50) NOT NULL,
    ten				VARCHAR(50) NOT NULL,
    email			NVARCHAR(100) NOT NULL,
    sdt				NVARCHAR(15) NOT NULL,
    ngay_sinh		DATE NOT NULL,
    gioi_tinh		TINYINT NOT NULL, -- 0: Nam, 1: Nữ, 2: Khác
    tinh			NVARCHAR(100) NOT NULL,
    huyen			NVARCHAR(100) NOT NULL,
    xa				NVARCHAR(100) NOT NULL,
    dia_chi_chinh	NVARCHAR(255) NOT NULL,
    dia_chi_phu		NVARCHAR(255) NULL,
    mat_khau		NVARCHAR(255) NOT NULL,
    trang_thai		TINYINT NOT NULL DEFAULT 0 -- 0: Hoạt động, 1: Khóa, 2: Tạm dừng
);
GO
CREATE TABLE nhan_vien (
    id				INT PRIMARY KEY IDENTITY,
	tai_khoan_id	INT FOREIGN KEY REFERENCES tai_khoan (id),
    ho				NVARCHAR(50) NOT NULL,
    ten				NVARCHAR(50) NOT NULL,
    email 			NVARCHAR(100) NOT NULL,
    mat_khau		NVARCHAR(255) NOT NULL,
    sdt				NVARCHAR(15)  NOT NULL,
    ngay_sinh		DATE NOT NULL,
    gioi_tinh		TINYINT NOT NULL, -- 0: Nam, 1: Nữ, 2: Khác
    trang_thai		TINYINT NOT NULL DEFAULT 0, -- 0: Hoạt động, 1: Khóa, 2: Nghỉ việc
    ngay_bat_dau	DATETIME2 NOT NULL,
    ngay_ket_thuc	DATETIME2 NULL
);
GO
CREATE TABLE thuong_hieu
(
    id      INT PRIMARY KEY IDENTITY,
    ten     NVARCHAR(50) NOT NULL,
    mo_ta   NVARCHAR(255),
    trang_thai TINYINT NOT NULL DEFAULT 0,
);
GO
CREATE TABLE san_pham
(
    id              INT PRIMARY KEY IDENTITY,
	thuong_hieu_id  INT FOREIGN KEY REFERENCES thuong_hieu (id),
    ten             NVARCHAR(50) NOT NULL,
    bao_hanh        NVARCHAR(50),
    gia_nhap        DECIMAL(10,2) NOT NULL,
    gia_ban         DECIMAL(10,2) NOT NULL,
    thue            DECIMAL(10,2) NOT NULL,
    mo_ta           NVARCHAR(255),
	trang_thai TINYINT NOT NULL DEFAULT 0,
);
GO
CREATE TABLE mau_sac
(
    id         TINYINT PRIMARY KEY IDENTITY,
    ten_mau   NVARCHAR(255) NOT NULL,
	trang_thai TINYINT NOT NULL DEFAULT 0
);
GO

CREATE TABLE hinh_anh
(
    id         TINYINT PRIMARY KEY IDENTITY,
    hinh_anh  NVARCHAR(1000) NOT NULL
);
GO
CREATE TABLE chi_tiet_san_pham
(
    id             INT PRIMARY KEY IDENTITY,
    san_pham_id    INT FOREIGN KEY REFERENCES san_pham (id),
	mau_sac_id     TINYINT FOREIGN KEY REFERENCES mau_sac (id),
	hinh_anh_id    TINYINT FOREIGN KEY REFERENCES hinh_anh (id),
    ram            NVARCHAR(50)  NOT NULL,
	cpu            NVARCHAR(50)  NOT NULL,
	o_cung         NVARCHAR(50)  NOT NULL,
    card_do_hoa    NVARCHAR(255),
    man_hinh       NVARCHAR(50)  NOT NULL,
    do_phan_giai   NVARCHAR(100),
	ban_phim       NVARCHAR(100)  NOT NULL,
    pin            NVARCHAR(100),
    trong_luong    DECIMAL(5,2),
    he_dieu_hanh   VARCHAR(100),
);
GO

CREATE TABLE serial
(
    id      INT PRIMARY KEY IDENTITY,
	chi_tiet_san_pham_id    INT FOREIGN KEY REFERENCES chi_tiet_san_pham (id),
    ten     NVARCHAR(50) NOT NULL,
    xuat_xu   NVARCHAR(100),
    trang_thai TINYINT NOT NULL DEFAULT 0, -- 0: còn hàng, 2: hết hàng
);
GO
CREATE TABLE phuong_thuc_thanh_toan
(
    id   INT PRIMARY KEY IDENTITY,
    ten  NVARCHAR(50) NOT NULL,
	trang_thai		TINYINT NOT NULL DEFAULT 0, -- 0: Hoạt động, 1: Khóa,
	mo_ta NVARCHAR(255),
	nguoi_tao	  DATETIME2 NOT NULL,
	ngay_tao	  DATETIME2 NOT NULL,
	nguoi_sua	  DATETIME2 NOT NULL,
	ngay_sua	  DATETIME2 NOT NULL
);
GO
CREATE TABLE don_vi_van_chuyen
(
    id      INT PRIMARY KEY IDENTITY,
    ten     NVARCHAR(50) NOT NULL,
    so_dien_thoai NVARCHAR(20),
    email   NVARCHAR(50),
    trang_thai TINYINT NOT NULL DEFAULT 0, -- 0: Hoạt động, 2: Nghỉ việc
);
GO
CREATE TABLE hoa_don
(
    id                 INT PRIMARY KEY IDENTITY,
    khach_hang_id      INT FOREIGN KEY REFERENCES khach_hang (id),
    nhan_vien_id       INT FOREIGN KEY REFERENCES nhan_vien (id),
    phuong_thuc_tt_id  INT FOREIGN KEY REFERENCES phuong_thuc_thanh_toan (id),
    don_vi_vc_id       INT FOREIGN KEY REFERENCES don_vi_van_chuyen (id),
    dia_chi_giao_hang  NVARCHAR(255),
	tong_tien		   DECIMAL(10,2) NOT NULL,
    trang_thai         TINYINT NOT NULL DEFAULT 0,  --(Chờ xác nhận, Đang giao, Đã hủy, Hoàn thành)
	ghi_chu			   NVARCHAR(255),
    ngay_tao           DATETIME2 NOT NULL,
    ngay_cap_nhat      DATETIME2 NOT NULL
);
GO
CREATE TABLE chi_tiet_hoa_don
(
    id              INT PRIMARY KEY IDENTITY,
    hoa_don_id      INT FOREIGN KEY REFERENCES hoa_don (id),
    san_pham_id     INT FOREIGN KEY REFERENCES san_pham (id),
    so_luong        INT NOT NULL,
    gia_ban         DECIMAL(10,2) NOT NULL,
    thue            DECIMAL(10,2) NOT NULL,
    thanh_tien      DECIMAL(10,2) NOT NULL
);
GO
CREATE TABLE gio_hang
(
    id              INT PRIMARY KEY IDENTITY,
    khach_hang_id   INT FOREIGN KEY REFERENCES khach_hang (id),
	ten			   NVARCHAR(255),
);
GO
CREATE TABLE gio_hang_spct
(
    id						INT PRIMARY KEY IDENTITY,
    gio_hang_id				INT FOREIGN KEY REFERENCES gio_hang (id),
    san_pham_chi_tiet_id    INT FOREIGN KEY REFERENCES chi_tiet_san_pham (id),
    so_luong				INT NOT NULL,
	trang_thai				TINYINT NOT NULL DEFAULT 0,
);
GO


-- Thêm dữ liệu vào bảng tai_khoan
INSERT INTO tai_khoan (vai_tro, mo_ta, trang_thai, nguoi_tao, ngay_tao, nguoi_sua, ngay_sua)
VALUES 
(N'Admin', N'Quản trị hệ thống', 1, GETDATE(), GETDATE(), GETDATE(), GETDATE()),
(N'Nhân viên', N'Nhân viên bán hàng', 1, GETDATE(), GETDATE(), GETDATE(), GETDATE());

-- Thêm dữ liệu vào bảng khach_hang
INSERT INTO khach_hang (ho, ten, email, sdt, ngay_sinh, gioi_tinh, tinh, huyen, xa, dia_chi_chinh, dia_chi_phu, mat_khau, trang_thai)
VALUES 
(N'Nguyen', N'An', N'an.nguyen@example.com', N'0987654321', '1995-06-15', 0, N'Hà Nội', N'Ba Đình', N'Điện Biên', N'123 Đường A', NULL, N'hashed_password', 0),
(N'Tran', N'Binh', N'binh.tran@example.com', N'0912345678', '1998-03-22', 1, N'Hồ Chí Minh', N'Quận 1', N'Bến Nghé', N'456 Đường B', NULL, N'hashed_password', 0);

-- Thêm dữ liệu vào bảng nhan_vien
INSERT INTO nhan_vien (tai_khoan_id, ho, ten, email, mat_khau, sdt, ngay_sinh, gioi_tinh, trang_thai, ngay_bat_dau, ngay_ket_thuc)
VALUES 
(1, N'Le', N'Minh', N'minh.le@example.com', N'hashed_password', N'0977888999', '1990-05-10', 0, 0, GETDATE(), NULL);

-- Thêm dữ liệu vào bảng thuong_hieu
INSERT INTO thuong_hieu (ten, mo_ta, trang_thai)
VALUES (N'Apple', N'Thương hiệu Apple', 0), (N'Dell', N'Thương hiệu Dell', 0);

-- Thêm dữ liệu vào bảng san_pham
INSERT INTO san_pham (thuong_hieu_id, ten, bao_hanh, gia_nhap, gia_ban, thue, mo_ta, trang_thai)
VALUES 
(1, N'MacBook Air M2', N'12 tháng', 20000000, 25000000, 10, N'Laptop siêu nhẹ', 0),
(2, N'Dell XPS 15', N'24 tháng', 30000000, 35000000, 10, N'Laptop mạnh mẽ', 0);

-- Thêm dữ liệu vào bảng mau_sac
INSERT INTO mau_sac (ten_mau, trang_thai)
VALUES (N'Bạc', 0), (N'Đen', 0);

-- Thêm dữ liệu vào bảng hinh_anh
INSERT INTO hinh_anh (hinh_anh)
VALUES (N'macbook_air_m2.jpg'), (N'dell_xps_15.jpg');

-- Thêm dữ liệu vào bảng chi_tiet_san_pham
INSERT INTO chi_tiet_san_pham (san_pham_id, mau_sac_id, hinh_anh_id, ram, cpu, o_cung, card_do_hoa, man_hinh, do_phan_giai, ban_phim, pin, trong_luong, he_dieu_hanh)
VALUES 
(1, 1, 1, N'8GB', N'Apple M2', N'256GB SSD', N'Apple GPU', N'13.6 inch', N'2560x1664', N'Có đèn nền', N'18 giờ', 1.24, N'macOS'),
(2, 2, 2, N'16GB', N'Intel i7', N'512GB SSD', N'NVIDIA RTX 3050', N'15.6 inch', N'3840x2160', N'Có đèn nền', N'12 giờ', 2.0, N'Windows 11');

-- Thêm dữ liệu vào bảng serial
INSERT INTO serial (chi_tiet_san_pham_id, ten, xuat_xu, trang_thai)
VALUES 
(1, N'Serial12345', N'Mỹ', 0),
(2, N'Serial67890', N'Trung Quốc', 0);

-- Thêm dữ liệu vào bảng phuong_thuc_thanh_toan
INSERT INTO phuong_thuc_thanh_toan (ten, trang_thai, mo_ta, nguoi_tao, ngay_tao, nguoi_sua, ngay_sua)
VALUES (N'Chuyển khoản', 0, N'Thanh toán qua ngân hàng', GETDATE(), GETDATE(), GETDATE(), GETDATE());

-- Thêm dữ liệu vào bảng don_vi_van_chuyen
INSERT INTO don_vi_van_chuyen (ten, so_dien_thoai, email, trang_thai)
VALUES (N'Giao hàng nhanh', N'0911223344', N'ghn@example.com', 0);

-- Thêm dữ liệu vào bảng hoa_don
INSERT INTO hoa_don (khach_hang_id, nhan_vien_id, phuong_thuc_tt_id, don_vi_vc_id, dia_chi_giao_hang, tong_tien, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
VALUES (1, 1, 1, 1, N'123 Đường A, Hà Nội', 25000000, 0, N'Giao hàng trong ngày', GETDATE(), GETDATE());

-- Thêm dữ liệu vào bảng chi_tiet_hoa_don
INSERT INTO chi_tiet_hoa_don (hoa_don_id, san_pham_id, so_luong, gia_ban, thue, thanh_tien)
VALUES (1, 1, 1, 25000000, 10, 27500000);

-- Thêm dữ liệu vào bảng gio_hang
INSERT INTO gio_hang (khach_hang_id, ten)
VALUES (1, N'Giỏ hàng của An');

-- Thêm dữ liệu vào bảng gio_hang_spct
INSERT INTO gio_hang_spct (gio_hang_id, san_pham_chi_tiet_id, so_luong, trang_thai)
VALUES (1, 1, 1, 0);

-- Lấy toàn bộ dữ liệu từ các bảng
SELECT * FROM tai_khoan;
SELECT * FROM khach_hang;
SELECT * FROM nhan_vien;
SELECT * FROM thuong_hieu;
SELECT * FROM san_pham;
SELECT * FROM mau_sac;
SELECT * FROM hinh_anh;
SELECT * FROM chi_tiet_san_pham;
SELECT * FROM serial;
SELECT * FROM phuong_thuc_thanh_toan;
SELECT * FROM don_vi_van_chuyen;
SELECT * FROM hoa_don;
SELECT * FROM chi_tiet_hoa_don;
SELECT * FROM gio_hang;
SELECT * FROM gio_hang_spct;
