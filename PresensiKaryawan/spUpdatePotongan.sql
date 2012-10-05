DELIMITER $$

USE `presensinew`$$

DROP PROCEDURE IF EXISTS `updatePotongan`$$

CREATE DEFINER=`presensi`@`%` PROCEDURE `updatePotongan`(IN nipin VARCHAR(10), IN bulanin VARCHAR(10), IN potongan DOUBLE, IN prestasi DOUBLE)
BEGIN
	
    SELECT total INTO @total FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    SELECT pokok INTO @pokok FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    SELECT makan INTO @makan FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    SELECT hadir INTO @hadir FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    SELECT lembur INTO @lembur FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    SELECT potongan_telat INTO @telat FROM temptransaksidepartment WHERE nip = nipin AND bulan = bulanin;
    UPDATE temptransaksidepartment SET potongan_lain = potongan, lain_lain = prestasi, total = @pokok+@makan+@hadir+@lembur+prestasi-@telat-potongan WHERE nip = nipin AND bulan = bulanin;
    END$$

DELIMITER ;