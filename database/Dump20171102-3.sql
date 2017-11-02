-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: qlns
-- ------------------------------------------------------
-- Server version	5.7.9-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `baocaocongno`
--

DROP TABLE IF EXISTS `baocaocongno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baocaocongno` (
  `MaBaoCaoCongNo` varchar(8) NOT NULL,
  `ThoiGian` date DEFAULT NULL,
  PRIMARY KEY (`MaBaoCaoCongNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baocaocongno`
--

LOCK TABLES `baocaocongno` WRITE;
/*!40000 ALTER TABLE `baocaocongno` DISABLE KEYS */;
INSERT INTO `baocaocongno` VALUES ('01LK01','2017-05-30'),('01TG21','2010-10-21'),('01TH11','2016-01-30');
/*!40000 ALTER TABLE `baocaocongno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `baocaoton`
--

DROP TABLE IF EXISTS `baocaoton`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baocaoton` (
  `MaBaoCaoTon` varchar(8) NOT NULL,
  `ThoiGian` date DEFAULT NULL,
  PRIMARY KEY (`MaBaoCaoTon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baocaoton`
--

LOCK TABLES `baocaoton` WRITE;
/*!40000 ALTER TABLE `baocaoton` DISABLE KEYS */;
INSERT INTO `baocaoton` VALUES ('01BC21','2017-02-01'),('01TF31','2016-12-25'),('01TG42','2016-12-22');
/*!40000 ALTER TABLE `baocaoton` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietbaocaocongno`
--

DROP TABLE IF EXISTS `chitietbaocaocongno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chitietbaocaocongno` (
  `MaChiTietBaoCaoCongNo` int(11) NOT NULL AUTO_INCREMENT,
  `NoDau` mediumint(9) DEFAULT NULL,
  `NoCuoi` mediumint(9) DEFAULT NULL,
  `NoPhatSinh` mediumint(9) DEFAULT NULL,
  `MaBaoCaoCongNo` varchar(8) NOT NULL,
  `MaKhachHang` varchar(8) NOT NULL,
  PRIMARY KEY (`MaChiTietBaoCaoCongNo`,`MaBaoCaoCongNo`,`MaKhachHang`),
  KEY `fk_chitietbaocaocongno_baocaocongno1_idx` (`MaBaoCaoCongNo`),
  KEY `fk_chitietbaocaocongno_khachhang1_idx` (`MaKhachHang`),
  CONSTRAINT `fk_chitietbaocaocongno_baocaocongno1` FOREIGN KEY (`MaBaoCaoCongNo`) REFERENCES `baocaocongno` (`MaBaoCaoCongNo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_chitietbaocaocongno_khachhang1` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`MaKhachHang`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietbaocaocongno`
--

LOCK TABLES `chitietbaocaocongno` WRITE;
/*!40000 ALTER TABLE `chitietbaocaocongno` DISABLE KEYS */;
INSERT INTO `chitietbaocaocongno` VALUES (1,1000000,12000,-988000,'01ST21','SH1001'),(2,100000,18000,-82000,'01TH01','LO0001'),(3,10000,1000000,990000,'01LK01','ST2001');
/*!40000 ALTER TABLE `chitietbaocaocongno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietbaocaoton`
--

DROP TABLE IF EXISTS `chitietbaocaoton`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chitietbaocaoton` (
  `MaChiTietBaoCaoTon` int(11) NOT NULL AUTO_INCREMENT,
  `TonPhatSinh` mediumint(9) DEFAULT NULL,
  `TonDau` mediumint(9) DEFAULT NULL,
  `TonCuoi` mediumint(9) DEFAULT NULL,
  `MaBaoCaoTon` varchar(8) NOT NULL,
  `MaSach` varchar(8) NOT NULL,
  PRIMARY KEY (`MaChiTietBaoCaoTon`,`MaBaoCaoTon`,`MaSach`),
  KEY `fk_chitietbaocaoton_baocaoton1_idx` (`MaBaoCaoTon`),
  KEY `fk_chitietbaocaoton_sach1_idx` (`MaSach`),
  CONSTRAINT `fk_chitietbaocaoton_baocaoton1` FOREIGN KEY (`MaBaoCaoTon`) REFERENCES `baocaoton` (`MaBaoCaoTon`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_chitietbaocaoton_sach1` FOREIGN KEY (`MaSach`) REFERENCES `sach` (`MaSach`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietbaocaoton`
--

LOCK TABLES `chitietbaocaoton` WRITE;
/*!40000 ALTER TABLE `chitietbaocaoton` DISABLE KEYS */;
INSERT INTO `chitietbaocaoton` VALUES (1,-50,350,300,'01BC21','VĂN'),(2,10,80,90,'01TF31','TIN'),(3,-100,200,100,'01TG42','TOÁN');
/*!40000 ALTER TABLE `chitietbaocaoton` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitiethoadonbansach`
--

DROP TABLE IF EXISTS `chitiethoadonbansach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chitiethoadonbansach` (
  `MaChiTietHoaDonBanSach` int(11) NOT NULL AUTO_INCREMENT,
  `SoLuongBan` tinyint(4) DEFAULT NULL,
  `DonGiaBan` int(11) DEFAULT NULL,
  `ThanhTien` int(11) DEFAULT NULL,
  `MaHoaDonBanSach` varchar(8) NOT NULL,
  `MaSach` varchar(8) NOT NULL,
  PRIMARY KEY (`MaChiTietHoaDonBanSach`,`MaHoaDonBanSach`,`MaSach`),
  KEY `fk_CHITIETHOADONBANSACH_HOADONBANSACH1_idx` (`MaHoaDonBanSach`),
  KEY `fk_chitiethoadonbansach_sach1_idx` (`MaSach`),
  CONSTRAINT `fk_CHITIETHOADONBANSACH_HOADONBANSACH1` FOREIGN KEY (`MaHoaDonBanSach`) REFERENCES `hoadonbansach` (`MaHoaDonBanSach`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_chitiethoadonbansach_sach1` FOREIGN KEY (`MaSach`) REFERENCES `sach` (`MaSach`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitiethoadonbansach`
--

LOCK TABLES `chitiethoadonbansach` WRITE;
/*!40000 ALTER TABLE `chitiethoadonbansach` DISABLE KEYS */;
/*!40000 ALTER TABLE `chitiethoadonbansach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietphieunhap`
--

DROP TABLE IF EXISTS `chitietphieunhap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chitietphieunhap` (
  `MaChiTietPhieuNhap` int(11) NOT NULL AUTO_INCREMENT,
  `SoLuongNhap` mediumint(9) DEFAULT NULL,
  `MaPhieuNhap` varchar(8) NOT NULL,
  `MaSach` varchar(8) NOT NULL,
  PRIMARY KEY (`MaChiTietPhieuNhap`,`MaPhieuNhap`,`MaSach`),
  KEY `fk_CHITIETPHIEUNHAP_PHIEUNHAP1_idx` (`MaPhieuNhap`),
  KEY `fk_chitietphieunhap_sach1_idx` (`MaSach`),
  CONSTRAINT `fk_CHITIETPHIEUNHAP_PHIEUNHAP1` FOREIGN KEY (`MaPhieuNhap`) REFERENCES `phieunhap` (`MaPhieuNhap`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_chitietphieunhap_sach1` FOREIGN KEY (`MaSach`) REFERENCES `sach` (`MaSach`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietphieunhap`
--

LOCK TABLES `chitietphieunhap` WRITE;
/*!40000 ALTER TABLE `chitietphieunhap` DISABLE KEYS */;
/*!40000 ALTER TABLE `chitietphieunhap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadonbansach`
--

DROP TABLE IF EXISTS `hoadonbansach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hoadonbansach` (
  `MaHoaDonBanSach` varchar(8) NOT NULL,
  `NgayLapHoaDon` date DEFAULT NULL,
  `TongHoaDon` int(11) DEFAULT NULL,
  `MaKhachHang` varchar(8) NOT NULL,
  PRIMARY KEY (`MaHoaDonBanSach`,`MaKhachHang`),
  KEY `fk_HOADONBANSACH_KHACHHANG1_idx` (`MaKhachHang`),
  CONSTRAINT `fk_HOADONBANSACH_KHACHHANG1` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`MaKhachHang`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadonbansach`
--

LOCK TABLES `hoadonbansach` WRITE;
/*!40000 ALTER TABLE `hoadonbansach` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoadonbansach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `khachhang` (
  `MaKhachHang` varchar(8) NOT NULL,
  `HoTenKhachHang` tinytext,
  `DienThoai` tinytext,
  `DiaChi` tinytext,
  `Email` tinytext,
  `SoTienNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaKhachHang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES ('LO0001','KHƯƠNG','25669562','tp hcm','xyz@gmail.com',200000),('SH1001','TRẦN ĐÌNH VĂN','265656','FFFF','ABC@gmail.com',0),('ST2001','HÙNG','0122596653','TÂY NINH','hung_babycute@gmail.com',200000);
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieunhap`
--

DROP TABLE IF EXISTS `phieunhap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `phieunhap` (
  `MaPhieuNhap` varchar(8) NOT NULL,
  `NgayNhap` date DEFAULT NULL,
  PRIMARY KEY (`MaPhieuNhap`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieunhap`
--

LOCK TABLES `phieunhap` WRITE;
/*!40000 ALTER TABLE `phieunhap` DISABLE KEYS */;
/*!40000 ALTER TABLE `phieunhap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieuthutien`
--

DROP TABLE IF EXISTS `phieuthutien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `phieuthutien` (
  `MaPhieuThuTien` varchar(8) NOT NULL,
  `NgayThu` date DEFAULT NULL,
  `SoTienThu` int(11) DEFAULT NULL,
  `MaKhachHang` varchar(8) NOT NULL,
  PRIMARY KEY (`MaPhieuThuTien`,`MaKhachHang`),
  KEY `fk_PhieuThuTien_KHACHHANG1_idx` (`MaKhachHang`),
  CONSTRAINT `fk_PhieuThuTien_KHACHHANG1` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`MaKhachHang`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieuthutien`
--

LOCK TABLES `phieuthutien` WRITE;
/*!40000 ALTER TABLE `phieuthutien` DISABLE KEYS */;
/*!40000 ALTER TABLE `phieuthutien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sach`
--

DROP TABLE IF EXISTS `sach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sach` (
  `MaSach` varchar(8) NOT NULL,
  `TenSach` mediumtext,
  `TheLoai` tinytext,
  `TacGia` tinytext,
  `DonGia` int(11) DEFAULT NULL,
  `SoLuongTon` mediumint(9) DEFAULT NULL,
  PRIMARY KEY (`MaSach`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sach`
--

LOCK TABLES `sach` WRITE;
/*!40000 ALTER TABLE `sach` DISABLE KEYS */;
INSERT INTO `sach` VALUES ('TIN325','TIN HỌC ','GIÁO DỤC','HAHA',60000,90),('TOAN11','TOÁN','GIÁO DỤC','NXB',50000,100),('VAN212','VĂN','GIÁO DỤC','NXB',20000,300);
/*!40000 ALTER TABLE `sach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sinhvien` (
  `MaSV` int(11) NOT NULL,
  `HoVaTen` varchar(45) DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MaSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvien`
--

LOCK TABLES `sinhvien` WRITE;
/*!40000 ALTER TABLE `sinhvien` DISABLE KEYS */;
INSERT INTO `sinhvien` VALUES (1,'Nguyễn Thị Khánh Ngọc','biên hòa'),(2,'Nguyễn maika','NULL'),(3,'Nguyễn maika','NULL'),(4,'hùng chó','NULL'),(8,'Nguyễn Thị Khánh Ngọc','NULL'),(34,'Nguyễn maika','Nguyễn m'),(59,'Nguyễn maika','Nguyễn maika'),(263565,'nguyễn thị a','hà nội');
/*!40000 ALTER TABLE `sinhvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thamso`
--

DROP TABLE IF EXISTS `thamso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `thamso` (
  `MaThamSo` int(11) NOT NULL AUTO_INCREMENT,
  `SoLuongNhapItNhat` mediumint(9) DEFAULT NULL,
  `SoLuongTonToiDaTruocKhiNhap` mediumint(9) DEFAULT NULL,
  `SoTienNoToiDa` int(11) DEFAULT NULL,
  `SoLuongTonToiThieuSauKhiBan` mediumint(9) DEFAULT NULL,
  `ApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`MaThamSo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thamso`
--

LOCK TABLES `thamso` WRITE;
/*!40000 ALTER TABLE `thamso` DISABLE KEYS */;
/*!40000 ALTER TABLE `thamso` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-02 20:08:56
