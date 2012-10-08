/*
SQLyog Ultimate v8.55 
MySQL - 5.0.41-community-nt : Database - presensinew
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`presensinew` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `presensinew`;

/*Table structure for table `department_setting` */

DROP TABLE IF EXISTS `department_setting`;

CREATE TABLE `department_setting` (
  `kode_department` varchar(5) NOT NULL,
  `nama_department` varchar(50) default NULL,
  `deskripsi` varchar(100) default NULL,
  `kode_group_shift` varchar(5) default NULL,
  PRIMARY KEY  (`kode_department`),
  KEY `kodeGroup_fk` (`kode_group_shift`),
  CONSTRAINT `kodeGroup_fk` FOREIGN KEY (`kode_group_shift`) REFERENCES `group_shift` (`kode_group_shift`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `department_setting` */

insert  into `department_setting`(`kode_department`,`nama_department`,`deskripsi`,`kode_group_shift`) values ('001','KEUANGAN','MENGURUSI MASALAH UANG','01'),('002','ASDF','ASF','01');

/*Table structure for table `detail_presensi` */

DROP TABLE IF EXISTS `detail_presensi`;

CREATE TABLE `detail_presensi` (
  `nip` varchar(70) NOT NULL default '',
  `tanggal` date NOT NULL,
  `keterangan` varchar(2) default NULL,
  PRIMARY KEY  (`nip`,`tanggal`),
  KEY `nip_FK` (`nip`),
  CONSTRAINT `nip_FK` FOREIGN KEY (`nip`) REFERENCES `karyawan` (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detail_presensi` */

insert  into `detail_presensi`(`nip`,`tanggal`,`keterangan`) values ('01','2012-04-01','K'),('01','2012-04-02','K'),('01','2012-04-03','K'),('01','2012-04-04','K'),('01','2012-04-05','K'),('01','2012-04-06','K'),('01','2012-04-07','K'),('01','2012-04-08','K'),('01','2012-04-09','K'),('01','2012-04-10','K'),('01','2012-04-11','K'),('01','2012-04-12','K'),('01','2012-04-13','K'),('01','2012-04-14','K'),('01','2012-04-15','K'),('01','2012-04-16','K'),('01','2012-04-17','K'),('01','2012-04-18','K'),('01','2012-04-19','K'),('01','2012-04-20','K'),('01','2012-04-21','K'),('01','2012-04-22','K'),('01','2012-04-23','K'),('01','2012-04-24','K'),('01','2012-04-25','K'),('01','2012-04-26','K'),('01','2012-04-27','K'),('01','2012-04-28','K'),('01','2012-04-29','K'),('01','2012-04-30','K'),('01','2012-05-01','K'),('01','2012-05-02','K'),('01','2012-05-03','K'),('01','2012-05-04','K'),('01','2012-05-05','K'),('01','2012-05-06','K'),('01','2012-05-07','K'),('01','2012-05-08','K'),('01','2012-05-09','K'),('01','2012-05-10','K'),('01','2012-05-11','K'),('01','2012-05-12','K'),('01','2012-05-13','K'),('01','2012-05-14','K'),('01','2012-05-15','K'),('01','2012-05-16','K'),('01','2012-05-17','K'),('01','2012-05-18','K'),('01','2012-05-19','K'),('01','2012-05-20','K'),('01','2012-05-21','K'),('01','2012-05-22','K'),('01','2012-05-23','K'),('01','2012-05-24','K'),('01','2012-05-25','K'),('01','2012-05-26','K'),('01','2012-05-27','K'),('01','2012-05-28','K'),('01','2012-05-29','K'),('01','2012-05-30','K'),('01','2012-05-31','K'),('01','2012-06-01','K'),('01','2012-06-02','K'),('01','2012-06-03','K'),('01','2012-06-04','K'),('01','2012-06-05','K'),('01','2012-06-06','K'),('01','2012-06-07','K'),('01','2012-06-08','K'),('01','2012-06-09','K'),('01','2012-06-10','K'),('01','2012-06-11','K'),('01','2012-06-12','K'),('01','2012-06-13','K'),('01','2012-06-14','K'),('01','2012-06-15','K'),('01','2012-06-16','K'),('01','2012-06-17','K'),('01','2012-06-18','K'),('01','2012-06-19','K'),('01','2012-06-20','K'),('01','2012-06-21','K'),('01','2012-06-22','K'),('01','2012-06-23','K'),('01','2012-06-24','K'),('01','2012-06-25','K'),('01','2012-06-26','K'),('01','2012-06-27','K'),('01','2012-06-28','K'),('01','2012-06-29','K'),('01','2012-06-30','K'),('01','2012-07-01','K'),('01','2012-07-02','K'),('01','2012-07-03','K'),('01','2012-07-04','K'),('01','2012-07-05','K'),('01','2012-07-06','K'),('01','2012-07-07','K'),('01','2012-07-08','K'),('01','2012-07-09','K'),('01','2012-07-10','K'),('01','2012-07-11','K'),('01','2012-07-12','K'),('01','2012-07-13','K'),('01','2012-07-14','K'),('01','2012-07-15','K'),('01','2012-07-16','K'),('01','2012-07-17','K'),('01','2012-07-18','K'),('01','2012-07-19','K'),('01','2012-07-20','K'),('01','2012-07-21','K'),('01','2012-07-22','K'),('01','2012-07-23','K'),('01','2012-07-24','K'),('01','2012-07-25','K'),('01','2012-07-26','K'),('01','2012-07-27','K'),('01','2012-07-28','K'),('01','2012-07-29','K'),('01','2012-07-30','K'),('01','2012-07-31','K'),('01','2012-08-01','K'),('01','2012-08-02','K'),('01','2012-08-03','K'),('01','2012-08-04','K'),('01','2012-08-05','K'),('01','2012-08-06','K'),('01','2012-08-07','K'),('01','2012-08-08','K'),('01','2012-08-09','K'),('01','2012-08-10','K'),('01','2012-08-11','K'),('01','2012-08-12','K'),('01','2012-08-13','K'),('01','2012-08-14','K'),('01','2012-08-15','K'),('01','2012-08-16','K'),('01','2012-08-17','K'),('01','2012-08-18','K'),('01','2012-08-19','K'),('01','2012-08-20','K'),('01','2012-08-21','K'),('01','2012-08-22','K'),('01','2012-08-23','K'),('01','2012-08-24','K'),('01','2012-08-25','K'),('01','2012-08-26','K'),('01','2012-08-27','K'),('01','2012-08-28','K'),('01','2012-08-29','K'),('01','2012-08-30','K'),('01','2012-08-31','K'),('01','2012-09-01','T'),('01','2012-09-02','M'),('01','2012-09-03','T'),('01','2012-09-04','M'),('01','2012-09-05','M'),('01','2012-09-06','T'),('01','2012-09-07','T'),('01','2012-09-08','M'),('01','2012-09-09','M'),('01','2012-09-10','S'),('01','2012-09-11','S'),('01','2012-09-12','I'),('01','2012-09-13','A'),('01','2012-09-14','M'),('01','2012-09-15','M'),('01','2012-09-16','M'),('01','2012-09-17','K'),('01','2012-09-18','K'),('01','2012-09-19','K'),('01','2012-09-20','K'),('01','2012-09-21','K'),('01','2012-09-22','K'),('01','2012-09-23','K'),('01','2012-09-24','K'),('01','2012-09-25','K'),('01','2012-09-26','K'),('01','2012-09-27','K'),('01','2012-09-28','K'),('01','2012-09-29','Li'),('01','2012-09-30','Li'),('01','2012-11-01','K'),('01','2012-11-02','K'),('01','2012-11-03','K'),('01','2012-11-04','K'),('01','2012-11-05','K'),('01','2012-11-06','K'),('01','2012-11-07','K'),('01','2012-11-08','K'),('01','2012-11-09','K'),('01','2012-11-10','K'),('01','2012-11-11','K'),('01','2012-11-12','K'),('01','2012-11-13','K'),('01','2012-11-14','K'),('01','2012-11-15','K'),('01','2012-11-16','K'),('01','2012-11-17','K'),('01','2012-11-18','K'),('01','2012-11-19','K'),('01','2012-11-20','K'),('01','2012-11-21','K'),('01','2012-11-22','K'),('01','2012-11-23','K'),('01','2012-11-24','K'),('01','2012-11-25','K'),('01','2012-11-26','K'),('01','2012-11-27','K'),('01','2012-11-28','K'),('01','2012-11-29','K'),('01','2012-11-30','K'),('01','2012-12-01','K'),('01','2012-12-02','K'),('01','2012-12-03','K'),('01','2012-12-04','K'),('01','2012-12-05','K'),('01','2012-12-06','K'),('01','2012-12-07','K'),('01','2012-12-08','K'),('01','2012-12-09','K'),('01','2012-12-10','K'),('01','2012-12-11','K'),('01','2012-12-12','K'),('01','2012-12-13','K'),('01','2012-12-14','K'),('01','2012-12-15','K'),('01','2012-12-16','K'),('01','2012-12-17','K'),('01','2012-12-18','K'),('01','2012-12-19','K'),('01','2012-12-20','K'),('01','2012-12-21','K'),('01','2012-12-22','K'),('01','2012-12-23','K'),('01','2012-12-24','K'),('01','2012-12-25','K'),('01','2012-12-26','K'),('01','2012-12-27','K'),('01','2012-12-28','K'),('01','2012-12-29','K'),('01','2012-12-30','K'),('01','2012-12-31','K'),('03','2012-04-01','K'),('03','2012-04-02','K'),('03','2012-04-03','K'),('03','2012-04-04','K'),('03','2012-04-05','K'),('03','2012-04-06','K'),('03','2012-04-07','K'),('03','2012-04-08','K'),('03','2012-04-09','K'),('03','2012-04-10','K'),('03','2012-04-11','K'),('03','2012-04-12','K'),('03','2012-04-13','K'),('03','2012-04-14','K'),('03','2012-04-15','K'),('03','2012-04-16','K'),('03','2012-04-17','K'),('03','2012-04-18','K'),('03','2012-04-19','K'),('03','2012-04-20','K'),('03','2012-04-21','K'),('03','2012-04-22','K'),('03','2012-04-23','K'),('03','2012-04-24','K'),('03','2012-04-25','K'),('03','2012-04-26','K'),('03','2012-04-27','K'),('03','2012-04-28','K'),('03','2012-04-29','K'),('03','2012-04-30','K'),('03','2012-05-01','K'),('03','2012-05-02','K'),('03','2012-05-03','K'),('03','2012-05-04','K'),('03','2012-05-05','K'),('03','2012-05-06','K'),('03','2012-05-07','K'),('03','2012-05-08','K'),('03','2012-05-09','K'),('03','2012-05-10','K'),('03','2012-05-11','K'),('03','2012-05-12','K'),('03','2012-05-13','K'),('03','2012-05-14','K'),('03','2012-05-15','K'),('03','2012-05-16','K'),('03','2012-05-17','K'),('03','2012-05-18','K'),('03','2012-05-19','K'),('03','2012-05-20','K'),('03','2012-05-21','K'),('03','2012-05-22','K'),('03','2012-05-23','K'),('03','2012-05-24','K'),('03','2012-05-25','K'),('03','2012-05-26','K'),('03','2012-05-27','K'),('03','2012-05-28','K'),('03','2012-05-29','K'),('03','2012-05-30','K'),('03','2012-05-31','K'),('03','2012-06-01','K'),('03','2012-06-02','K'),('03','2012-06-03','K'),('03','2012-06-04','K'),('03','2012-06-05','K'),('03','2012-06-06','K'),('03','2012-06-07','K'),('03','2012-06-08','K'),('03','2012-06-09','K'),('03','2012-06-10','K'),('03','2012-06-11','K'),('03','2012-06-12','K'),('03','2012-06-13','K'),('03','2012-06-14','K'),('03','2012-06-15','K'),('03','2012-06-16','K'),('03','2012-06-17','K'),('03','2012-06-18','K'),('03','2012-06-19','K'),('03','2012-06-20','K'),('03','2012-06-21','K'),('03','2012-06-22','K'),('03','2012-06-23','K'),('03','2012-06-24','K'),('03','2012-06-25','K'),('03','2012-06-26','K'),('03','2012-06-27','K'),('03','2012-06-28','K'),('03','2012-06-29','K'),('03','2012-06-30','K'),('03','2012-07-01','K'),('03','2012-07-02','K'),('03','2012-07-03','K'),('03','2012-07-04','K'),('03','2012-07-05','K'),('03','2012-07-06','K'),('03','2012-07-07','K'),('03','2012-07-08','K'),('03','2012-07-09','K'),('03','2012-07-10','K'),('03','2012-07-11','K'),('03','2012-07-12','K'),('03','2012-07-13','K'),('03','2012-07-14','K'),('03','2012-07-15','K'),('03','2012-07-16','K'),('03','2012-07-17','K'),('03','2012-07-18','K'),('03','2012-07-19','K'),('03','2012-07-20','K'),('03','2012-07-21','K'),('03','2012-07-22','K'),('03','2012-07-23','K'),('03','2012-07-24','K'),('03','2012-07-25','K'),('03','2012-07-26','K'),('03','2012-07-27','K'),('03','2012-07-28','K'),('03','2012-07-29','K'),('03','2012-07-30','K'),('03','2012-07-31','K'),('03','2012-08-01','K'),('03','2012-08-02','K'),('03','2012-08-03','K'),('03','2012-08-04','K'),('03','2012-08-05','K'),('03','2012-08-06','K'),('03','2012-08-07','K'),('03','2012-08-08','K'),('03','2012-08-09','K'),('03','2012-08-10','K'),('03','2012-08-11','K'),('03','2012-08-12','K'),('03','2012-08-13','K'),('03','2012-08-14','K'),('03','2012-08-15','K'),('03','2012-08-16','K'),('03','2012-08-17','K'),('03','2012-08-18','K'),('03','2012-08-19','K'),('03','2012-08-20','K'),('03','2012-08-21','K'),('03','2012-08-22','K'),('03','2012-08-23','K'),('03','2012-08-24','K'),('03','2012-08-25','K'),('03','2012-08-26','K'),('03','2012-08-27','K'),('03','2012-08-28','K'),('03','2012-08-29','K'),('03','2012-08-30','K'),('03','2012-08-31','K'),('03','2012-09-01','M'),('03','2012-09-02','K'),('03','2012-09-03','K'),('03','2012-09-04','K'),('03','2012-09-05','K'),('03','2012-09-06','K'),('03','2012-09-07','K'),('03','2012-09-08','K'),('03','2012-09-09','K'),('03','2012-09-10','K'),('03','2012-09-11','K'),('03','2012-09-12','K'),('03','2012-09-13','K'),('03','2012-09-14','K'),('03','2012-09-15','K'),('03','2012-09-16','K'),('03','2012-09-17','K'),('03','2012-09-18','K'),('03','2012-09-19','K'),('03','2012-09-20','K'),('03','2012-09-21','K'),('03','2012-09-22','K'),('03','2012-09-23','K'),('03','2012-09-24','K'),('03','2012-09-25','K'),('03','2012-09-26','K'),('03','2012-09-27','K'),('03','2012-09-28','K'),('03','2012-09-29','Li'),('03','2012-09-30','Li'),('03','2012-11-01','K'),('03','2012-11-02','K'),('03','2012-11-03','K'),('03','2012-11-04','K'),('03','2012-11-05','K'),('03','2012-11-06','K'),('03','2012-11-07','K'),('03','2012-11-08','K'),('03','2012-11-09','K'),('03','2012-11-10','K'),('03','2012-11-11','K'),('03','2012-11-12','K'),('03','2012-11-13','K'),('03','2012-11-14','K'),('03','2012-11-15','K'),('03','2012-11-16','K'),('03','2012-11-17','K'),('03','2012-11-18','K'),('03','2012-11-19','K'),('03','2012-11-20','K'),('03','2012-11-21','K'),('03','2012-11-22','K'),('03','2012-11-23','K'),('03','2012-11-24','K'),('03','2012-11-25','K'),('03','2012-11-26','K'),('03','2012-11-27','K'),('03','2012-11-28','K'),('03','2012-11-29','K'),('03','2012-11-30','K'),('03','2012-12-01','K'),('03','2012-12-02','K'),('03','2012-12-03','K'),('03','2012-12-04','K'),('03','2012-12-05','K'),('03','2012-12-06','K'),('03','2012-12-07','K'),('03','2012-12-08','K'),('03','2012-12-09','K'),('03','2012-12-10','K'),('03','2012-12-11','K'),('03','2012-12-12','K'),('03','2012-12-13','K'),('03','2012-12-14','K'),('03','2012-12-15','K'),('03','2012-12-16','K'),('03','2012-12-17','K'),('03','2012-12-18','K'),('03','2012-12-19','K'),('03','2012-12-20','K'),('03','2012-12-21','K'),('03','2012-12-22','K'),('03','2012-12-23','K'),('03','2012-12-24','K'),('03','2012-12-25','K'),('03','2012-12-26','K'),('03','2012-12-27','K'),('03','2012-12-28','K'),('03','2012-12-29','K'),('03','2012-12-30','K'),('03','2012-12-31','K'),('98','2012-06-01','K'),('98','2012-06-02','K'),('98','2012-06-03','K'),('98','2012-06-04','K'),('98','2012-06-05','K'),('98','2012-06-06','K'),('98','2012-06-07','K'),('98','2012-06-08','K'),('98','2012-06-09','K'),('98','2012-06-10','K'),('98','2012-06-11','K'),('98','2012-06-12','K'),('98','2012-06-13','K'),('98','2012-06-14','K'),('98','2012-06-15','K'),('98','2012-06-16','K'),('98','2012-06-17','K'),('98','2012-06-18','K'),('98','2012-06-19','K'),('98','2012-06-20','K'),('98','2012-06-21','K'),('98','2012-06-22','K'),('98','2012-06-23','K'),('98','2012-06-24','K'),('98','2012-06-25','K'),('98','2012-06-26','K'),('98','2012-06-27','K'),('98','2012-06-28','K'),('98','2012-06-29','K'),('98','2012-06-30','K'),('98','2012-07-01','K'),('98','2012-07-02','K'),('98','2012-07-03','K'),('98','2012-07-04','K'),('98','2012-07-05','K'),('98','2012-07-06','K'),('98','2012-07-07','K'),('98','2012-07-08','K'),('98','2012-07-09','K'),('98','2012-07-10','K'),('98','2012-07-11','K'),('98','2012-07-12','K'),('98','2012-07-13','K'),('98','2012-07-14','K'),('98','2012-07-15','K'),('98','2012-07-16','K'),('98','2012-07-17','K'),('98','2012-07-18','K'),('98','2012-07-19','K'),('98','2012-07-20','K'),('98','2012-07-21','K'),('98','2012-07-22','K'),('98','2012-07-23','K'),('98','2012-07-24','K'),('98','2012-07-25','K'),('98','2012-07-26','K'),('98','2012-07-27','K'),('98','2012-07-28','K'),('98','2012-07-29','K'),('98','2012-07-30','K'),('98','2012-07-31','K'),('98','2012-08-01','K'),('98','2012-08-02','K'),('98','2012-08-03','K'),('98','2012-08-04','K'),('98','2012-08-05','K'),('98','2012-08-06','K'),('98','2012-08-07','K'),('98','2012-08-08','K'),('98','2012-08-09','K'),('98','2012-08-10','K'),('98','2012-08-11','K'),('98','2012-08-12','K'),('98','2012-08-13','K'),('98','2012-08-14','K'),('98','2012-08-15','K'),('98','2012-08-16','K'),('98','2012-08-17','K'),('98','2012-08-18','K'),('98','2012-08-19','K'),('98','2012-08-20','K'),('98','2012-08-21','K'),('98','2012-08-22','K'),('98','2012-08-23','K'),('98','2012-08-24','K'),('98','2012-08-25','K'),('98','2012-08-26','K'),('98','2012-08-27','K'),('98','2012-08-28','K'),('98','2012-08-29','K'),('98','2012-08-30','K'),('98','2012-08-31','K'),('98','2012-09-01','K'),('98','2012-09-02','K'),('98','2012-09-03','K'),('98','2012-09-04','K'),('98','2012-09-05','K'),('98','2012-09-06','K'),('98','2012-09-07','K'),('98','2012-09-08','K'),('98','2012-09-09','K'),('98','2012-09-10','K'),('98','2012-09-11','K'),('98','2012-09-12','K'),('98','2012-09-13','K'),('98','2012-09-14','K'),('98','2012-09-15','K'),('98','2012-09-16','K'),('98','2012-09-17','K'),('98','2012-09-18','K'),('98','2012-09-19','K'),('98','2012-09-20','K'),('98','2012-09-21','K'),('98','2012-09-22','K'),('98','2012-09-23','K'),('98','2012-09-24','K'),('98','2012-09-25','K'),('98','2012-09-26','K'),('98','2012-09-27','K'),('98','2012-09-28','K'),('98','2012-09-29','Li'),('98','2012-09-30','Li'),('98','2012-11-01','K'),('98','2012-11-02','K'),('98','2012-11-03','K'),('98','2012-11-04','K'),('98','2012-11-05','K'),('98','2012-11-06','K'),('98','2012-11-07','K'),('98','2012-11-08','K'),('98','2012-11-09','K'),('98','2012-11-10','K'),('98','2012-11-11','K'),('98','2012-11-12','K'),('98','2012-11-13','K'),('98','2012-11-14','K'),('98','2012-11-15','K'),('98','2012-11-16','K'),('98','2012-11-17','K'),('98','2012-11-18','K'),('98','2012-11-19','K'),('98','2012-11-20','K'),('98','2012-11-21','K'),('98','2012-11-22','K'),('98','2012-11-23','K'),('98','2012-11-24','K'),('98','2012-11-25','K'),('98','2012-11-26','K'),('98','2012-11-27','K'),('98','2012-11-28','K'),('98','2012-11-29','K'),('98','2012-11-30','K'),('98','2012-12-01','K'),('98','2012-12-02','K'),('98','2012-12-03','K'),('98','2012-12-04','K'),('98','2012-12-05','K'),('98','2012-12-06','K'),('98','2012-12-07','K'),('98','2012-12-08','K'),('98','2012-12-09','K'),('98','2012-12-10','K'),('98','2012-12-11','K'),('98','2012-12-12','K'),('98','2012-12-13','K'),('98','2012-12-14','K'),('98','2012-12-15','K'),('98','2012-12-16','K'),('98','2012-12-17','K'),('98','2012-12-18','K'),('98','2012-12-19','K'),('98','2012-12-20','K'),('98','2012-12-21','K'),('98','2012-12-22','K'),('98','2012-12-23','K'),('98','2012-12-24','K'),('98','2012-12-25','K'),('98','2012-12-26','K'),('98','2012-12-27','K'),('98','2012-12-28','K'),('98','2012-12-29','K'),('98','2012-12-30','K'),('98','2012-12-31','K');

/*Table structure for table `eventlog` */

DROP TABLE IF EXISTS `eventlog`;

CREATE TABLE `eventlog` (
  `DeviceId` decimal(3,0) NOT NULL,
  `UserId` varchar(10) default NULL,
  `CardNum` decimal(10,0) default NULL,
  `DateLog` date default NULL,
  `TimeLog` varchar(5) default NULL,
  `Verify` int(2) default NULL,
  `FKMode` int(2) default NULL,
  `sequence` bigint(20) NOT NULL auto_increment,
  PRIMARY KEY  (`sequence`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `eventlog` */

insert  into `eventlog`(`DeviceId`,`UserId`,`CardNum`,`DateLog`,`TimeLog`,`Verify`,`FKMode`,`sequence`) values ('1','01','0','2012-09-01','09:00',1,0,1),('1','01','0','2012-09-02','12:50',1,0,2),('1','01','0','2012-09-03','01:01',1,0,3),('1','01','0','2012-09-04','07:00',1,0,4),('1','01','0','2012-09-05','11:59',1,0,5),('1','01','0','2012-09-06','12:03',1,0,6),('1','01','0','2012-09-07','12:55',1,0,7),('1','01','0','2012-09-01','10:00',1,1,8),('1','01','0','2012-09-02','21:50',1,1,9),('1','01','0','2012-09-03','08:01',1,1,10),('1','01','0','2012-09-04','16:00',1,1,11),('1','01','0','2012-09-05','20:31',1,1,12),('1','01','0','2012-09-06','20:03',1,1,13),('1','01','0','2012-09-07','17:55',1,1,14);

/*Table structure for table `golongan` */

DROP TABLE IF EXISTS `golongan`;

CREATE TABLE `golongan` (
  `kode_golongan` varchar(5) NOT NULL,
  `nama_golongan` varchar(100) default NULL,
  `gaji_pokok` double default NULL,
  `uang_makan` double default NULL,
  `uang_lembur` double default NULL,
  `uang_hadir` double default NULL,
  `potongan_telat` double default NULL,
  PRIMARY KEY  (`kode_golongan`),
  KEY `FK_gaji_2` (`kode_golongan`),
  KEY `FK_golongan` (`kode_golongan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `golongan` */

insert  into `golongan`(`kode_golongan`,`nama_golongan`,`gaji_pokok`,`uang_makan`,`uang_lembur`,`uang_hadir`,`potongan_telat`) values ('01','GOLONGAN TERPELAJAR',100000,5000,10000,5000,3000),('02','GOLONGAN BIASA',100000,5000,10000,5000,3000);

/*Table structure for table `group_shift` */

DROP TABLE IF EXISTS `group_shift`;

CREATE TABLE `group_shift` (
  `kode_group_shift` varchar(5) NOT NULL,
  `nama_group_shift` varchar(25) default NULL,
  `deskripsi` varchar(100) default NULL,
  `senin_code` varchar(5) default NULL,
  `selasa_code` varchar(5) default NULL,
  `rabu_code` varchar(5) default NULL,
  `kamis_code` varchar(5) default NULL,
  `jumat_code` varchar(5) default NULL,
  `sabtu_code` varchar(5) default NULL,
  `minggu_code` varchar(5) default NULL,
  PRIMARY KEY  (`kode_group_shift`),
  UNIQUE KEY `hari_shift_code` (`senin_code`,`selasa_code`,`rabu_code`,`kamis_code`,`jumat_code`,`sabtu_code`,`minggu_code`),
  KEY `senin_fk` (`senin_code`),
  KEY `selasa_fk` (`selasa_code`),
  KEY `rabu_fk` (`rabu_code`),
  KEY `kamis_fk` (`kamis_code`),
  KEY `jumat_fk` (`jumat_code`),
  KEY `sabtu_sk` (`sabtu_code`),
  KEY `minggu_fk` (`minggu_code`),
  KEY `kodeGroup_fk` (`kode_group_shift`),
  CONSTRAINT `jumat_fk` FOREIGN KEY (`jumat_code`) REFERENCES `shift_setting` (`kode_shift`),
  CONSTRAINT `kamis_fk` FOREIGN KEY (`kamis_code`) REFERENCES `shift_setting` (`kode_shift`),
  CONSTRAINT `minggu_fk` FOREIGN KEY (`minggu_code`) REFERENCES `shift_setting` (`kode_shift`),
  CONSTRAINT `rabu_fk` FOREIGN KEY (`rabu_code`) REFERENCES `shift_setting` (`kode_shift`),
  CONSTRAINT `sabtu_fk` FOREIGN KEY (`sabtu_code`) REFERENCES `shift_setting` (`kode_shift`),
  CONSTRAINT `selasa_fk` FOREIGN KEY (`selasa_code`) REFERENCES `shift_setting` (`kode_shift`),
  CONSTRAINT `senin_fk` FOREIGN KEY (`senin_code`) REFERENCES `shift_setting` (`kode_shift`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `group_shift` */

insert  into `group_shift`(`kode_group_shift`,`nama_group_shift`,`deskripsi`,`senin_code`,`selasa_code`,`rabu_code`,`kamis_code`,`jumat_code`,`sabtu_code`,`minggu_code`) values ('01','DEPARTMENT','DEPT','01','02','03','03','02','01','04'),('02','DEPARTNET 2','MASUK','02','03','04','01','02','01','04');

/*Table structure for table `karyawan` */

DROP TABLE IF EXISTS `karyawan`;

CREATE TABLE `karyawan` (
  `nip` varchar(10) NOT NULL,
  `nama` varchar(60) default NULL,
  `alamat` varchar(100) default NULL,
  `tanggal_masuk` date default NULL,
  `kode_golongan` varchar(5) default NULL,
  `kode_shift` varchar(5) default NULL,
  `kode_posisi` varchar(5) default NULL,
  `kode_outlet` varchar(5) default NULL,
  `kode_department` varchar(5) default NULL,
  `no_rekening` varchar(20) default NULL,
  `bank` varchar(20) default NULL,
  PRIMARY KEY  (`nip`),
  KEY `FK_gaji_3` (`nama`),
  KEY `FK_golongan` (`kode_golongan`),
  KEY `FK_gaji_4` (`nama`),
  KEY `nip_FK` (`nip`),
  KEY `FK_nip` (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `karyawan` */

insert  into `karyawan`(`nip`,`nama`,`alamat`,`tanggal_masuk`,`kode_golongan`,`kode_shift`,`kode_posisi`,`kode_outlet`,`kode_department`,`no_rekening`,`bank`) values ('01','TINUS','DUKUH','2012-04-10','01','01','01','01','001','112233',NULL),('03','EKI','KLATEN','2012-04-10','02',NULL,'MAN','02','001','223344',NULL),('98','MR.','YOGYA','2012-01-01','01','01','01','01','002','334455',NULL);

/*Table structure for table `libur_nasional` */

DROP TABLE IF EXISTS `libur_nasional`;

CREATE TABLE `libur_nasional` (
  `tanggal` date default NULL,
  `keterangan` varchar(100) default NULL,
  `no` int(11) NOT NULL auto_increment,
  PRIMARY KEY  (`no`),
  UNIQUE KEY `tanggal` (`tanggal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `libur_nasional` */

insert  into `libur_nasional`(`tanggal`,`keterangan`,`no`) values ('2012-10-02','CUTI BERSAMA',1);

/*Table structure for table `libur_perusahaan` */

DROP TABLE IF EXISTS `libur_perusahaan`;

CREATE TABLE `libur_perusahaan` (
  `tanggal` date default NULL,
  `keterangan` varchar(100) default NULL,
  `no` int(11) NOT NULL auto_increment,
  PRIMARY KEY  (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `libur_perusahaan` */

insert  into `libur_perusahaan`(`tanggal`,`keterangan`,`no`) values ('2012-09-30','LIBUR AKHIR BULAN',1),('2012-09-29','LIBUR SEBELUM AKHIR BULAN',2);

/*Table structure for table `outlet_setting` */

DROP TABLE IF EXISTS `outlet_setting`;

CREATE TABLE `outlet_setting` (
  `kode_outlet` varchar(5) NOT NULL,
  `nama_outlet` varchar(50) default NULL,
  `alamat_outlet` varchar(50) default NULL,
  PRIMARY KEY  (`kode_outlet`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `outlet_setting` */

insert  into `outlet_setting`(`kode_outlet`,`nama_outlet`,`alamat_outlet`) values ('01','Outlet_1','Yogyakarta'),('02','Outlet_2','Jakarta'),('03','Outlet_3','Surabaya'),('04','Outlet_4','Yogyakarta');

/*Table structure for table `penggajian` */

DROP TABLE IF EXISTS `penggajian`;

CREATE TABLE `penggajian` (
  `NIP` varchar(10) default NULL,
  `bulan` varchar(15) default NULL,
  `tahun` year(4) default NULL,
  `S` int(11) default NULL,
  `I` int(11) default NULL,
  `A` int(11) default NULL,
  `T` int(11) default NULL,
  `M` int(11) default NULL,
  `lembur` int(11) default NULL,
  `uang_lembur` double default NULL,
  `uang_hadir` double default NULL,
  `potongan_terlambat` double default NULL,
  `potongan_lain` double default NULL,
  `lain` double default NULL,
  `total` double default NULL,
  KEY `nip_FK` (`NIP`),
  CONSTRAINT `FK_nip` FOREIGN KEY (`NIP`) REFERENCES `karyawan` (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `penggajian` */

/*Table structure for table `posisi` */

DROP TABLE IF EXISTS `posisi`;

CREATE TABLE `posisi` (
  `kode_posisi` varchar(5) default NULL,
  `nama_posisi` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `posisi` */

insert  into `posisi`(`kode_posisi`,`nama_posisi`) values ('MAN','MANAGER');

/*Table structure for table `shift_setting` */

DROP TABLE IF EXISTS `shift_setting`;

CREATE TABLE `shift_setting` (
  `kode_shift` varchar(5) NOT NULL,
  `nama_shift` varchar(50) default NULL,
  `waktu_mulai` varchar(5) default NULL,
  `waktu_selesai` varchar(5) default NULL,
  PRIMARY KEY  (`kode_shift`),
  KEY `senin_fk` (`kode_shift`),
  KEY `selasa_fk` (`kode_shift`),
  KEY `rabu_fk` (`kode_shift`),
  KEY `kamis_fk` (`kode_shift`),
  KEY `jumat_fk` (`kode_shift`),
  KEY `sabtu_fk` (`kode_shift`),
  KEY `minggu_fk` (`kode_shift`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `shift_setting` */

insert  into `shift_setting`(`kode_shift`,`nama_shift`,`waktu_mulai`,`waktu_selesai`) values ('01','PAGI II','01:00','08:00'),('02','PAGI I','07:00','16:00'),('03','SIANG I','12:00','20:00'),('04','SIANG II','13:00','21:00');

/*Table structure for table `status_setting` */

DROP TABLE IF EXISTS `status_setting`;

CREATE TABLE `status_setting` (
  `kode` int(11) NOT NULL,
  `keterangan` varchar(10) default NULL,
  PRIMARY KEY  (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `status_setting` */

insert  into `status_setting`(`kode`,`keterangan`) values (0,'CHECK IN'),(1,'CHECK OUT'),(4,'BREAK OUT'),(5,'BREAK IN');

/*Table structure for table `templembur` */

DROP TABLE IF EXISTS `templembur`;

CREATE TABLE `templembur` (
  `nip` varchar(10) default NULL,
  `tanggal` varchar(7) default NULL,
  `lembur` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `templembur` */

insert  into `templembur`(`nip`,`tanggal`,`lembur`) values ('01','2012-09',6),('03','2012-09',0),('01','2012-07',0),('03','2012-07',0),('01','2012-05',0),('03','2012-05',0),('01','2012-04',0),('03','2012-04',0);

/*Table structure for table `temptelat` */

DROP TABLE IF EXISTS `temptelat`;

CREATE TABLE `temptelat` (
  `nip` varchar(10) default NULL,
  `bulan` varchar(10) default NULL,
  `telat` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `temptelat` */

insert  into `temptelat`(`nip`,`bulan`,`telat`) values ('01','2012-09',839),('03','2012-09',0),('01','2012-07',0),('03','2012-07',0),('01','2012-05',0),('03','2012-05',0),('01','2012-04',0),('03','2012-04',0);

/*Table structure for table `temptransaksidepartment` */

DROP TABLE IF EXISTS `temptransaksidepartment`;

CREATE TABLE `temptransaksidepartment` (
  `nip` varchar(10) NOT NULL,
  `nama` varchar(40) default NULL,
  `M` int(11) default NULL,
  `S` int(11) default NULL,
  `I` int(11) default NULL,
  `A` int(11) default NULL,
  `T` int(11) default NULL,
  `L` int(11) default NULL,
  `pokok` double default NULL,
  `makan` double default NULL,
  `hadir` double default NULL,
  `lembur` double default NULL,
  `lain_lain` double default NULL,
  `potongan_telat` double default NULL,
  `potongan_lain` double default NULL,
  `total` double default NULL,
  `bulan` varchar(10) NOT NULL,
  `department` varchar(10) default NULL,
  PRIMARY KEY  (`nip`,`bulan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `temptransaksidepartment` */

insert  into `temptransaksidepartment`(`nip`,`nama`,`M`,`S`,`I`,`A`,`T`,`L`,`pokok`,`makan`,`hadir`,`lembur`,`lain_lain`,`potongan_telat`,`potongan_lain`,`total`,`bulan`,`department`) values ('01','TINUS',0,0,0,0,0,0,0,0,0,0,0,0,0,0,'2012-08','001'),('01','TINUS',8,2,1,1,4,6,100000,40000,40000,60000,0,2517000,0,-2277000,'2012-09','001'),('03','EKI',0,0,0,0,0,0,0,0,0,0,0,0,0,0,'2012-08','001'),('03','EKI',0,0,0,28,0,0,0,0,0,0,0,0,0,0,'2012-09','001'),('98','MR.',0,0,0,0,0,0,0,0,0,0,0,0,0,0,'2012-08','002'),('98','MR.',0,0,0,28,0,0,0,0,0,0,0,0,0,0,'2012-09','002');

/* Trigger structure for table `eventlog` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `insert` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'presensi'@'%' */ /*!50003 TRIGGER `insert` AFTER INSERT ON `eventlog` FOR EACH ROW BEGIN
	SET @hari = (SELECT DAYNAME(new.datelog));
	IF(@hari = 'Sunday' AND new.fkmode = '0')
	THEN
		CALL getWaktuMulaiMinggu(new.userid, @waktu);
		IF(CONCAT(LEFT(new.timelog, 2)) < CONCAT(LEFT(@waktu, 2))
			OR (CONCAT(LEFT(new.timelog, 2)) = CONCAT(LEFT(@waktu, 2)) 
			AND CONCAT(RIGHT(new.timelog, 2)) <= CONCAT(RIGHT(@waktu, 2)) )) THEN
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'M');
		ELSE
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'T');
		END IF;
	ELSE
	 	
	IF(@hari = 'Monday' AND new.fkmode = '0')
	THEN
		CALL getWaktuMulaiSenin(new.userid, @waktu);
		IF(CONCAT(LEFT(new.timelog, 2)) < CONCAT(LEFT(@waktu, 2))
			OR (CONCAT(LEFT(new.timelog, 2)) = CONCAT(LEFT(@waktu, 2)) 
			AND CONCAT(RIGHT(new.timelog, 2)) <= CONCAT(RIGHT(@waktu, 2)) )) THEN
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'M');
		ELSE
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'T');
		END IF;
	ELSE
	 
	IF(@hari = 'Tuesday' AND new.fkmode = '0')
	THEN
		CALL getWaktuMulaiSelasa(new.userid, @waktu);
		IF(CONCAT(LEFT(new.timelog, 2)) < CONCAT(LEFT(@waktu, 2))
			OR (CONCAT(LEFT(new.timelog, 2)) = CONCAT(LEFT(@waktu, 2)) 
			AND CONCAT(RIGHT(new.timelog, 2)) <= CONCAT(RIGHT(@waktu, 2)) )) THEN
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'M');
		ELSE
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'T');
		END IF;
	ELSE
	 
	IF(@hari = 'Wednesday' AND new.fkmode = '0')
	THEN
		CALL getWaktuMulaiRabu(new.userid, @waktu);
		IF(CONCAT(LEFT(new.timelog, 2)) < CONCAT(LEFT(@waktu, 2))
			OR (CONCAT(LEFT(new.timelog, 2)) = CONCAT(LEFT(@waktu, 2)) 
			AND CONCAT(RIGHT(new.timelog, 2)) <= CONCAT(RIGHT(@waktu, 2)) )) THEN
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'M');
		ELSE
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'T');
		END IF;
	ELSE
	
	IF(@hari = 'Thursday' AND new.fkmode = '0')
	THEN
		CALL getWaktuMulaiKamis(new.userid, @waktu);
		IF(CONCAT(LEFT(new.timelog, 2)) < CONCAT(LEFT(@waktu, 2))
			OR (CONCAT(LEFT(new.timelog, 2)) = CONCAT(LEFT(@waktu, 2)) 
			AND CONCAT(RIGHT(new.timelog, 2)) <= CONCAT(RIGHT(@waktu, 2)) )) THEN
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'M');
		ELSE
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'T');
		END IF;
	ELSE
	
	IF(@hari = 'Friday' AND new.fkmode = '0')
	THEN
		CALL getWaktuMulaiJumat(new.userid, @waktu);
		IF(CONCAT(LEFT(new.timelog, 2)) < CONCAT(LEFT(@waktu, 2))
			OR (CONCAT(LEFT(new.timelog, 2)) = CONCAT(LEFT(@waktu, 2)) 
			AND CONCAT(RIGHT(new.timelog, 2)) <= CONCAT(RIGHT(@waktu, 2)) )) THEN
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'M');
		ELSE
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'T');
		END IF;
	ELSE
	
	IF(@hari = 'Saturday' AND new.fkmode = '0')
	THEN
		CALL getWaktuMulaiSabtu(new.userid, @waktu);
		IF(CONCAT(LEFT(new.timelog, 2)) < CONCAT(LEFT(@waktu, 2))
			OR (CONCAT(LEFT(new.timelog, 2)) = CONCAT(LEFT(@waktu, 2)) 
			AND CONCAT(RIGHT(new.timelog, 2)) <= CONCAT(RIGHT(@waktu, 2)) )) THEN
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'M');
		ELSE
			INSERT INTO detail_presensi VALUES(new.userid, new.datelog, 'T');
		END IF;
	END IF;
	END IF;
	END IF;
	END IF;
	END IF;
	END IF;
	END IF;
    END */$$


DELIMITER ;

/* Procedure structure for procedure `getGaji` */

/*!50003 DROP PROCEDURE IF EXISTS  `getGaji` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getGaji`(IN bulan VARCHAR(2), IN tahun VARCHAR(4), IN dept VARCHAR(10))
BEGIN
DECLARE bulantahun VARCHAR(10);
SET bulantahun = CONCAT(tahun,'-',bulan,'%');
	SELECT k.nip, k.nama, 
	COUNT(DISTINCT a.tanggal)S, COUNT(DISTINCT b.tanggal)I, 
	COUNT(DISTINCT c.tanggal)A, COUNT(DISTINCT d.tanggal)T, 
	COUNT(DISTINCT e.tanggal)M, g.*
	FROM golongan g, karyawan k 
	LEFT JOIN detail_presensi a ON a.nip = k.nip AND a.keterangan='S'  AND a.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi b ON b.nip = k.nip AND b.keterangan='I'  AND b.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi c ON c.nip = k.nip AND c.keterangan='A'  AND c.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi d ON d.nip = k.nip AND d.keterangan='T'  AND d.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi e ON e.nip = k.nip AND e.keterangan='M'  AND e.tanggal LIKE bulantahun
	WHERE k.kode_department = dept AND k.kode_golongan = g.kode_golongan
	GROUP BY k.nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getGaji2` */

/*!50003 DROP PROCEDURE IF EXISTS  `getGaji2` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getGaji2`(IN maxtanggal VARCHAR(10), IN dept VARCHAR(10))
BEGIN
DECLARE bulantahun VARCHAR(10);
SET bulantahun = CONCAT(LEFT(maxtanggal, 7),'%');
	SELECT k.nip, k.nama, 
	COUNT(DISTINCT a.tanggal)S, COUNT(DISTINCT b.tanggal)I, 
	COUNT(DISTINCT c.tanggal)A, /*COUNT(DISTINCT d.tanggal)T,  >>*/  (tl.telat)T,
	COUNT(DISTINCT e.tanggal)M, (t.lembur)L, g.*
	FROM golongan g, karyawan k 
	LEFT JOIN templembur t ON k.nip = t.nip AND t.tanggal LIKE bulantahun
	/*baru>>*/LEFT JOIN temptelat tl ON k.nip = tl.nip AND tl.bulan LIKE bulantahun
	LEFT JOIN detail_presensi a ON a.nip = k.nip AND a.keterangan='S'  AND a.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi b ON b.nip = k.nip AND b.keterangan='I'  AND b.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi c ON c.nip = k.nip AND c.keterangan='A'  AND c.tanggal LIKE bulantahun
	/*LEFT JOIN detail_presensi d ON d.nip = k.nip AND d.keterangan='T'  AND d.tanggal LIKE bulantahun*/
	LEFT JOIN detail_presensi e ON e.nip = k.nip AND e.keterangan='M'  AND e.tanggal LIKE bulantahun
	WHERE k.kode_department = dept AND k.kode_golongan = g.kode_golongan
	GROUP BY k.nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getKaryawanMasuk` */

/*!50003 DROP PROCEDURE IF EXISTS  `getKaryawanMasuk` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getKaryawanMasuk`(IN nip VARCHAR(10), IN tanggal DATE, IN waktu VARCHAR(5), OUT jml INT)
BEGIN
SELECT COUNT(nip) INTO jml
FROM eventlog 
WHERE UserId = nip 
AND DateLog = tanggal
AND FKMode = '0' 
AND (CONCAT(LEFT(TimeLog, 2)) < CONCAT(LEFT(waktu, 2))
OR (CONCAT(LEFT(TimeLog, 2)) = CONCAT(LEFT(waktu, 2)) 
AND CONCAT(RIGHT(TimeLog, 2)) <= CONCAT(RIGHT(waktu, 2)) ));
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getLembur` */

/*!50003 DROP PROCEDURE IF EXISTS  `getLembur` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getLembur`(IN maxtanggal DATE, IN nipin VARCHAR(10), out total int)
BEGIN
    DECLARE a INT;
    DECLARE tgl VARCHAR(10);
    DECLARE hari varchar(10);
    declare waktu varchar(5);
    DECLARE waktulog VARCHAR(5);
    declare menit int;
	SET a = 1;
	set total = 0;
		WHILE a  <= CONCAT(RIGHT(maxtanggal, 2)) DO
			IF (a < 10) THEN 
				SET tgl = (SELECT CONCAT(CONCAT(LEFT(maxtanggal, 8)),'0',a));
			ELSE
				SET tgl = (SELECT CONCAT(CONCAT(LEFT(maxtanggal, 8)),a));
                        END IF;
				
			set hari=(SELECT DAYNAME(tgl));
				
			IF(hari = 'Sunday')
			THEN
				CALL getWaktuSelesaiMinggu(nipin, waktu);
				set waktulog = (select timelog from eventlog where userid = nipin and datelog like tgl and fkmode = '1');
				
				IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
				then
					set menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(Right(waktulog, 2)) - CONCAT(right(waktu, 2)));
					set total = total + (menit/60);
				end if;
			else
				if(hari = 'Monday')
				then
					CALL getWaktuSelesaiSenin(nipin, waktu);
					SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '1');
				
					IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
					THEN
						SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
						SET total = total + (menit/60);
					END IF;
				else
					IF(hari = 'Tuesday')
					THEN
						CALL getWaktuSelesaiSelasa(nipin, waktu);
						SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '1');
					
						IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
						THEN
							SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
							SET total = total + (menit/60);
						END IF;
					ELSE
						IF(hari = 'Wednesday')
						THEN
							CALL getWaktuSelesaiRabu(nipin, waktu);
							SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '1');
						
							IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
							THEN
								SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
								SET total = total + (menit/60);
							END IF;
						ELSE
							IF(hari = 'Thursday')
							THEN
								CALL getWaktuSelesaiKamis(nipin, waktu);
								SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '1');
							
								IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
								THEN
									SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
									SET total = total + (menit/60);
								END IF;
							ELSE
								IF(hari = 'Friday')
								THEN
									CALL getWaktuSelesaiJumat(nipin, waktu);
									SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '1');
								
									IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
									THEN
										SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
										SET total = total + (menit/60);
									END IF;
								ELSE
									IF(hari = 'Saturday')
									THEN
										CALL getWaktuSelesaiSabtu(nipin, waktu);
										SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '1');
									
										IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
										THEN
											SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
											SET total = total + (menit/60);
										END IF;
									
									END IF;
								END IF;
							END IF;
						END IF;
					END IF;
				end if;
			END IF;
			
		SET a = a + 1;  
                        
                       
		END WHILE;
/*		select total;
*/
		insert into tempLembur values(nipin, CONCAT(LEFT(maxtanggal, 7)), total);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getPresensi` */

/*!50003 DROP PROCEDURE IF EXISTS  `getPresensi` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getPresensi`(IN bulan VARCHAR(2), IN tahun VARCHAR(4), IN dept VARCHAR(10))
BEGIN
DECLARE bulantahun VARCHAR(10);
SET bulantahun = CONCAT(tahun,'-',bulan,'%');
	SELECT k.nip, k.nama, 
	COUNT(DISTINCT a.tanggal)S, COUNT(DISTINCT b.tanggal)I, 
	COUNT(DISTINCT c.tanggal)A, COUNT(DISTINCT d.tanggal)T, 
	COUNT(DISTINCT e.tanggal)M
	FROM karyawan k 
	LEFT JOIN detail_presensi a ON a.nip = k.nip AND a.keterangan='S'  AND a.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi b ON b.nip = k.nip AND b.keterangan='I'  AND b.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi c ON c.nip = k.nip AND c.keterangan='A'  AND c.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi d ON d.nip = k.nip AND d.keterangan='T'  AND d.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi e ON e.nip = k.nip AND e.keterangan='M'  AND e.tanggal LIKE bulantahun
	WHERE k.kode_department = dept
	GROUP BY k.nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getPresensi2` */

/*!50003 DROP PROCEDURE IF EXISTS  `getPresensi2` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getPresensi2`(IN maxtanggal VARCHAR(10), IN dept VARCHAR(10))
BEGIN
DECLARE bulantahun VARCHAR(10);
SET bulantahun = CONCAT(LEFT(maxtanggal, 7),'%');
	call insertTempLembur(maxtanggal, dept);
	SELECT k.nip, k.nama, 
	COUNT(DISTINCT a.tanggal)S, COUNT(DISTINCT b.tanggal)I, 
	COUNT(DISTINCT c.tanggal)A, COUNT(DISTINCT d.tanggal)T, 
	COUNT(DISTINCT e.tanggal)M, t.lembur
	FROM karyawan k
	LEFT JOIN templembur t ON k.nip = t.nip AND t.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi a ON a.nip = k.nip AND a.keterangan='S'  AND a.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi b ON b.nip = k.nip AND b.keterangan='I'  AND b.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi c ON c.nip = k.nip AND c.keterangan='A'  AND c.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi d ON d.nip = k.nip AND d.keterangan='T'  AND d.tanggal LIKE bulantahun
	LEFT JOIN detail_presensi e ON e.nip = k.nip AND e.keterangan='M'  AND e.tanggal LIKE bulantahun
	WHERE k.kode_department = dept
	GROUP BY k.nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getTelat` */

/*!50003 DROP PROCEDURE IF EXISTS  `getTelat` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getTelat`(IN maxtanggal DATE, IN nipin VARCHAR(10), OUT total INT)
BEGIN
    DECLARE a INT;
    DECLARE tgl VARCHAR(10);
    DECLARE hari VARCHAR(10);
    DECLARE waktu VARCHAR(5);
    DECLARE waktulog VARCHAR(5);
    DECLARE menit INT;
	SET a = 1;
	SET total = 0;
		WHILE a  <= CONCAT(RIGHT(maxtanggal, 2)) DO
			IF (a < 10) THEN 
				SET tgl = (SELECT CONCAT(CONCAT(LEFT(maxtanggal, 8)),'0',a));
			ELSE
				SET tgl = (SELECT CONCAT(CONCAT(LEFT(maxtanggal, 8)),a));
                        END IF;
				
			SET hari=(SELECT DAYNAME(tgl));
				
			IF(hari = 'Sunday')
			THEN
				CALL getWaktuMulaiMinggu(nipin, waktu);
				SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '0');
				
				IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
				THEN
					SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
					SET total = total + (menit);
				END IF;
			ELSE
				IF(hari = 'Monday')
				THEN
					CALL getWaktuMulaiSenin(nipin, waktu);
					SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '0');
				
					IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
					THEN
						SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
						SET total = total + (menit);
					END IF;
				ELSE
					IF(hari = 'Tuesday')
					THEN
						CALL getWaktuMulaiSelasa(nipin, waktu);
						SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '0');
					
						IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
						THEN
							SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
							SET total = total + (menit);
						END IF;
					ELSE
						IF(hari = 'Wednesday')
						THEN
							CALL getWaktuMulaiRabu(nipin, waktu);
							SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '0');
						
							IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
							THEN
								SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
								SET total = total + (menit);
							END IF;
						ELSE
							IF(hari = 'Thursday')
							THEN
								CALL getWaktuMulaiKamis(nipin, waktu);
								SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '0');
							
								IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
								THEN
									SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
									SET total = total + (menit);
								END IF;
							ELSE
								IF(hari = 'Friday')
								THEN
									CALL getWaktuMulaiJumat(nipin, waktu);
									SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '0');
								
									IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
									THEN
										SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
										SET total = total + (menit);
									END IF;
								ELSE
									IF(hari = 'Saturday')
									THEN
										CALL getWaktuMulaiSabtu(nipin, waktu);
										SET waktulog = (SELECT timelog FROM eventlog WHERE userid = nipin AND datelog LIKE tgl AND fkmode = '0');
									
										IF(CONCAT(LEFT(waktulog, 2)) >= CONCAT(LEFT(waktu, 2))) 
										THEN
											SET menit = ((CONCAT(LEFT(waktulog, 2)) - CONCAT(LEFT(waktu, 2)))*60)+(CONCAT(RIGHT(waktulog, 2)) - CONCAT(RIGHT(waktu, 2)));
											SET total = total + (menit);
										END IF;
									
									END IF;
								END IF;
							END IF;
						END IF;
					END IF;
				END IF;
			END IF;
			
		SET a = a + 1;  
                        
                       
		END WHILE;
/*		select total;
*/
		INSERT INTO temptelat VALUES(nipin, CONCAT(LEFT(maxtanggal, 7)), total);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuMulaiJumat` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuMulaiJumat` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuMulaiJumat`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
	SELECT s.waktu_mulai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.jumat_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuMulaiKamis` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuMulaiKamis` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuMulaiKamis`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_mulai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.kamis_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuMulaiMinggu` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuMulaiMinggu` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuMulaiMinggu`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_mulai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.minggu_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuMulaiRabu` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuMulaiRabu` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuMulaiRabu`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_mulai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.rabu_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuMulaiSabtu` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuMulaiSabtu` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuMulaiSabtu`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_mulai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.sabtu_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuMulaiSelasa` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuMulaiSelasa` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuMulaiSelasa`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_mulai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.selasa_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuMulaiSenin` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuMulaiSenin` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuMulaiSenin`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_mulai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.senin_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuSelesaiJumat` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuSelesaiJumat` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuSelesaiJumat`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_selesai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.jumat_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuSelesaiKamis` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuSelesaiKamis` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuSelesaiKamis`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_selesai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.kamis_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuSelesaiMinggu` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuSelesaiMinggu` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuSelesaiMinggu`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_selesai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.minggu_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuSelesaiRabu` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuSelesaiRabu` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuSelesaiRabu`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_selesai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.rabu_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuSelesaiSabtu` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuSelesaiSabtu` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuSelesaiSabtu`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_selesai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.sabtu_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuSelesaiSelasa` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuSelesaiSelasa` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuSelesaiSelasa`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_selesai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.selasa_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `getWaktuSelesaiSenin` */

/*!50003 DROP PROCEDURE IF EXISTS  `getWaktuSelesaiSenin` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `getWaktuSelesaiSenin`(IN nip VARCHAR(10), OUT waktu VARCHAR(5))
BEGIN
SELECT s.waktu_selesai INTO waktu 
FROM shift_setting s, group_shift g, department_setting d, karyawan k 
WHERE s.kode_shift = g.senin_code 
AND g.kode_group_shift = d.kode_group_shift
AND d.kode_department = k.kode_department 
AND k.nip = nip;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `insertAlfa` */

/*!50003 DROP PROCEDURE IF EXISTS  `insertAlfa` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `insertAlfa`(IN maxtanggal DATE, IN nipin VARCHAR(10))
BEGIN
DECLARE a INT;
	DECLARE tgl VARCHAR(10);
	DECLARE hasil INT;
 
              SET a = 1;
              WHILE a  <= CONCAT(RIGHT(maxtanggal, 2)) DO
                          IF (a < 10) THEN 
				SET tgl = (SELECT CONCAT(CONCAT(LEFT(maxtanggal, 8)),'0',a));
			ELSE
				SET tgl = (SELECT CONCAT(CONCAT(LEFT(maxtanggal, 8)),a));
                          END IF;
				SELECT COUNT(nip) INTO hasil FROM detail_presensi WHERE tanggal = tgl AND nip = nipin;
				IF (hasil = 0) THEN
					SELECT COUNT(tanggal) INTO hasil FROM libur_nasional WHERE tanggal = tgl; 
					IF(hasil = 1) THEN
						INSERT INTO detail_presensi VALUES(nipin, tgl, 'Libur N');
					ELSE
						SELECT COUNT(tanggal) INTO hasil FROM libur_perusahaan WHERE tanggal = tgl; 
						IF(hasil = 1) THEN
							INSERT INTO detail_presensi VALUES(nipin, tgl, 'Libur P');
						ELSE
							INSERT INTO detail_presensi VALUES(nipin, tgl, 'K');
						END IF;
					END IF;
				END IF;
                       SET a = a + 1;   
              END WHILE;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `insertTempLembur` */

/*!50003 DROP PROCEDURE IF EXISTS  `insertTempLembur` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `insertTempLembur`(in maxtanggal date, in kode varchar(10))
BEGIN
DECLARE done INT DEFAULT 0;
DECLARE id varchar(10);
DECLARE cur1 CURSOR FOR SELECT nip FROM karyawan where kode_department = kode;
#agar tidak keluar error “No data – zero rows fetched, selected, or processe”
DECLARE  CONTINUE HANDLER FOR NOT FOUND SET done = 1;
OPEN cur1;
REPEAT
FETCH cur1 INTO id;
IF NOT done THEN
	if(select count(nip) from templembur where nip = id and tanggal like CONCAT(LEFT(maxtanggal, 7))) = 0 then
	call getLembur(maxtanggal, id, @total);
	end if;
	IF(SELECT COUNT(nip) FROM temptelat WHERE nip = id AND bulan LIKE CONCAT(LEFT(maxtanggal, 7))) = 0 THEN
	CALL getTelat(maxtanggal, id, @total);
	END IF;
END IF;
UNTIL done END REPEAT;
CLOSE cur1;
END */$$
DELIMITER ;

/* Procedure structure for procedure `insertTempTransaksi` */

/*!50003 DROP PROCEDURE IF EXISTS  `insertTempTransaksi` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `insertTempTransaksi`(in nipin varchar(10),IN namain VARCHAR(40),IN M int,IN S INT,IN I INT,IN A INT,IN T INT,IN L INT,
IN pokok double,IN makan DOUBLE,IN hadir DOUBLE,IN lembur DOUBLE,IN lain DOUBLE,IN potongtelat DOUBLE,IN potonglain DOUBLE,IN total DOUBLE, in bln varchar(10), in dep varchar(10))
BEGIN
    if (select count(nip) from temptransaksidepartment where nip = nipin and bulan like bln) = 0
    then
	insert into temptransaksidepartment values(nipin,namain,M,S,I,A,T,L,pokok,makan,hadir,lembur,lain,potongtelat,potonglain,total,bln,dep);
    end if;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `updatePotongan` */

/*!50003 DROP PROCEDURE IF EXISTS  `updatePotongan` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `updatePotongan`(in nipin varchar(10), in bulanin varchar(10), in potongan double, in prestasi Double)
BEGIN
	
    SELECT total INTO @total FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    SELECT pokok INTO @pokok FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    SELECT makan INTO @makan FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    SELECT hadir INTO @hadir FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    SELECT lembur INTO @lembur FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    SELECT potongan_telat INTO @telat FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    UPDATE temptransaksidepartment SET potongan_lain = potongan, lain_lain = prestasi, total = @pokok+@makan+@hadir+@lembur+prestasi-@telat-potongan WHERE nip = nipin AND bulan = bulanin;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `updateTempTransaksi` */

/*!50003 DROP PROCEDURE IF EXISTS  `updateTempTransaksi` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`presensi`@`%` PROCEDURE `updateTempTransaksi`(in nipin varchar(10), in bulanin varchar(8))
BEGIN
	SELECT COUNT(keterangan) INTO @masuk FROM detail_presensi WHERE keterangan = 'M' AND nip = nipin AND tanggal LIKE bulanin;
	SELECT COUNT(keterangan) into @sakit FROM detail_presensi WHERE keterangan = 'S' AND nip = nipin AND tanggal LIKE bulanin;
	SELECT COUNT(keterangan) INTO @ijin FROM detail_presensi WHERE keterangan = 'I' AND nip = nipin AND tanggal LIKE bulanin;
	SELECT COUNT(keterangan) INTO @alfa FROM detail_presensi WHERE keterangan = 'A' AND nip = nipin AND tanggal LIKE bulanin;
	SELECT COUNT(keterangan) INTO @telat FROM detail_presensi WHERE keterangan = 'T' AND nip = nipin AND tanggal LIKE bulanin;
	SELECT uang_hadir into @hadir FROM golongan WHERE kode_golongan = (SELECT kode_golongan FROM karyawan WHERE nip = nipin);
	SELECT uang_makan into @makan FROM golongan WHERE kode_golongan = (SELECT kode_golongan FROM karyawan WHERE nip = nipin);
	SELECT pokok+lembur+lain_lain-potongan_telat-potongan_lain INTO @temp FROM temptransaksidepartment WHERE nip=nipin AND bulan LIKE bulanin;
	
	UPDATE temptransaksidepartment SET m=@masuk, 
	s=@sakit, 
	i=@ijin, 
	a=@alfa, 
	t=@telat, 
	makan=@masuk*@makan, 
	hadir=@masuk*@hadir, 
	total=@temp+(@masuk*@makan)+(@masuk*@hadir) where nip = nipin and bulan like bulanin;
    END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
