-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost:3306
-- Üretim Zamanı: 10 May 2021, 02:29:28
-- Sunucu sürümü: 10.3.25-MariaDB
-- PHP Sürümü: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `dkamod_personel`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `id` int(11) NOT NULL,
  `kullanici` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `parola` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `gizlisoru` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `gizlicevap` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`id`, `kullanici`, `parola`, `gizlisoru`, `gizlicevap`) VALUES
(4, 'test', '1', '1', '1'),
(17, 'mucahit', '1', '1', '1'),
(18, '1', '1', '1', '1'),
(19, 'uzaktest', 'uzaktest', 'uzaktes', 'uzaktest'),
(20, 'yusuf', '1', '1', '1'),
(21, 'muberra', '1', '1', '1'),
(22, 'denemem', '1', '1', '1');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personel`
--

CREATE TABLE `personel` (
  `personelid` int(11) NOT NULL,
  `tckn` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ad` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `soyad` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `telefon` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `dogumtarihi` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `baslamatarihi` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `adlisicilkaydi` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `askerlikdurumu` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `kangrubu` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `terfiid` int(11) DEFAULT NULL,
  `adres` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Tablo döküm verisi `personel`
--

INSERT INTO `personel` (`personelid`, `tckn`, `ad`, `soyad`, `telefon`, `email`, `dogumtarihi`, `baslamatarihi`, `adlisicilkaydi`, `askerlikdurumu`, `kangrubu`, `terfiid`, `adres`) VALUES
(5, 'tt', 'tt', 'tt', 'tt', 'tt', 'tt', 'tt', 'Sabıkasız', 'Belirsiz', 'B+', 0, 'tt'),
(7, 'A', 'B', 'C', 'D', 'F', 'G', 'H', 'Sabıkalı', 'Muaf', 'A+', 8, 'J'),
(8, 'A', 'B', 'C', 'D', 'F', 'G', 'H', 'Sab?kas?z', 'Tecilli', 'A+', 8, 'J'),
(9, 'A', 'B', 'C', 'D', 'F', 'G', 'H', 'Sabıkalı', 'Muaf', 'A+', 8, 'J');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `terfi`
--

CREATE TABLE `terfi` (
  `terfiid` int(11) NOT NULL,
  `terfitipi` varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Tablo döküm verisi `terfi`
--

INSERT INTO `terfi` (`terfiid`, `terfitipi`) VALUES
(7, 'Yönetici'),
(8, 'Asistan');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `personel`
--
ALTER TABLE `personel`
  ADD PRIMARY KEY (`personelid`);

--
-- Tablo için indeksler `terfi`
--
ALTER TABLE `terfi`
  ADD PRIMARY KEY (`terfiid`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Tablo için AUTO_INCREMENT değeri `personel`
--
ALTER TABLE `personel`
  MODIFY `personelid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Tablo için AUTO_INCREMENT değeri `terfi`
--
ALTER TABLE `terfi`
  MODIFY `terfiid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
