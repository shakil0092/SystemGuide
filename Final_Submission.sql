-- CREATE DATABASE SGDB;
-- 
-- USE SGDB;
-- 
-- CREATE TABLE RAM(
-- RSerial CHAR(10) PRIMARY KEY NOT NULL,
-- Brand VARCHAR(20),
-- Memory CHAR(5),
-- MemoryType CHAR(5),
-- Speed CHAR(10),
-- Price INTEGER(10)
-- );
-- 
--  INSERT INTO RAM
--  (RSerial,Brand,Memory,MemoryType,Speed,Price)
--  VALUES
--  ('r001','Avexir Core','8GB','DDR4','2400 BUS','4600'),
--  ('r002','Avexir Asus','8GB','DDR4','2400 BUS','5100'),
--  ('r003','Avexir Core','4GB','DDR4','2400 BUS','2600'),
--  ('r004','Avexir Core','4GB','DDR3','1600 BUS','2800'),
--  ('r005','A DATA','8GB','DDR3','1600 BUS','11500'),
--  ('r006','A DATA','4GB','DDR4','2133 BUS','2500'),
--  ('r007','A DATA','2GB','DDR3','1600 BUS','1300'),
--  ('r008','A DATA','4GB','DDR3','1600 BUS','2600'),
-- ('r009','A DATA','8GB','DDR3','1600 BUS','3800'),
-- ('r010','A DATA','4GB','DDR4','3000 BUS','2900'),
-- ('r011','A DATA','8GB','DDR4','2400 BUS','4800'),
-- ('r012','CORSAIR','4GB','DDR4','2133 BUS','2700'),
-- ('r013','CORSAIR','4GB','DDR4','2400 BUS','3100'),
-- ('r014','CORSAIR','4GB','DDR3','1600 BUS','2500'),
-- ('r015','CORSAIR','8GB','DDR4','2400 BUS','5300'),
-- ('r016','CORSAIR','16GB','DDR4','3000 BUS','9000'),
-- ('r017','CORSAIR','16GB','DDR4','3200 BUS','10200'),
-- ('r018','CORSAIR','32GB','DDR4','3200 BUS','20500'),
-- ('r019','G.Skill','4GB','DDR3','2400 BUS','3300'),
-- ('r020','G.Skill','4GB','DDR4','2400 BUS','2900'),
-- ('r021','G.Skill','4GB','DDR4','3000 BUS','3800'),
-- ('r022','G.Skill','8GB','DDR3','1600 BUS','4300'),
-- ('r023','G.Skill','8GB','DDR4','2400 BUS','4600'),
-- ('r024','G.Skill','8GB','DDR4','3200 BUS','6000'),
-- ('r025','G.Skill','8GB','DDR4','3400 BUS','9600'),
-- ('r026','G.Skill','16GB','DDR4','2400 BUS','9500'),
-- ('r027','Transcend','8GB','DDR3','1600 BUS','8500'),
-- ('r028','Twinmos','2GB','DDR3','1333 BUS','1200'),
-- ('r029','Twinmos','2GB','DDR3','1600 BUS','1200'),
-- ('r030','Twinmos','4GB','DDR3','1333 BUS','2200'),
-- ('r031','Twinmos','4GB','DDR3','1600 BUS','2500'),
-- ('r032','Twinmos','8GB','DDR3','1333 BUS','11600'),
-- ('r033','Twinmos','8GB','DDR4','2400 BUS','4100');
-- --
-- CREATE TABLE HDD(
-- HDSerial CHAR(10) PRIMARY KEY NOT NULL,
-- Brand VARCHAR(16),
-- Memory CHAR(10),
-- HType CHAR(4),
-- Price Integer
-- );
-- 
-- INSERT INTO HDD										-- insert multiple rows at a time
-- (HDSerial,Brand,Memory,HType,Price)					-- (Column names)
-- VALUES												-- (Values according to Cloumns)
-- ('ssd001','A DATA','240GB','SSD','6400'),
-- ('ssd002','A DATA','256GB','SSD','6900'),
-- ('ssd003','Avexir','240GB','SSD','11000'),
-- ('ssd004','Corsair','120GB','SSD','4700'),
-- ('ssd005','Corsair','240GB','SSD','6900'),
-- ('ssd006','Corsair','240GB','SSD','22200'),
-- ('ssd007','Intel','128GB','SSD','5800'),
-- ('ssd008','Intel','180GB','SSD','6100'),
-- ('ssd009','Intel','240GB','SSD','7500'),
-- ('ssd010','Transcend','240GB','SSD','7100'),
-- ('ssd011','Transcend','256GB','SSD','8500'),
-- ('ssd012','Transcend','512GB','SSD','16700'),
-- ('ssd013','Transcend','1TB','SSD','32000'),
-- ('ssd014','WesternDigital','120GB','SSD','4800'),
-- ('ssd015','WesternDigital','240GB','SSD','6700'),
-- ('ssd016','Zotac','120GB','SSD','6000'),
-- ('hdd001','Seagete','2048GB','HDD','8300'),
-- ('hdd002','Seagate','4096GB','HDD','13600'),
-- ('hdd003','Toshiba','500GB','HDD','3500'),
-- ('hdd004','Toshiba','1024GB','HDD','4700'),
-- ('hdd005','Toshiba','2048GB','HDD','5600'),
-- ('hdd006','Toshiba','3072GB','HDD','7300'),
-- ('hdd007','Toshiba','4096GB','HDD','11200'),
-- ('hdd008','TOshiba','5120GB','HDD','16700'),
-- ('hdd009','WesternDigital','1024GB','HDD','4700'),
-- ('hdd010','WesternDigital','2048GB','HDD','6500'),
-- ('hdd011','WesternDigital','3072GB','HDD','8500'),
-- ('hdd012','WesternDigital','4096GB','HDD','12200'),
-- ('hdd013','WesternDigital','6144GB','HDD','21500');
-- 
-- CREATE TABLE Processor(
-- PSerial CHAR(10) PRIMARY KEY NOT NULL,
-- Model VARCHAR(20),
-- Generation CHAR(5),
-- ClockSpeed CHAR(15),
-- Price INTEGER
-- );
-- 
-- INSERT INTO Processor								-- insert multiple rows at a time
-- (PSerial,Model,Generation,ClockSpeed,Price)			-- (Column names)
-- VALUES												-- (Values according to Cloumns)
-- ('p001','Intel PDC G4400','4th','3.30 GHz','4900'),
-- ('p002','Intel Core i3 4170','4th','3.70 GHz','9200'),
-- ('p003','Intel Core i3 6100','6th','3.70 GHz','9200'),
-- ('p004','Intel Core i3 7100','7th','3.90 GHz','10100'),
-- ('p005','Intel Core i3 7350k','7th','4.20 GHz','15400'),
-- ('p006','Intel Core i5 4590','4th','3.30 GHz','15800'),
-- ('p007','Intel Core i5 4690k','4th','3.50 GHz','19500'),
-- ('p008','Intel Core i5 6400','6th','2.70 GHz','15000'),
-- ('p009','Intel Core i5 6500','6th','3.20 GHz','16500'),
-- ('p010','Intel Core i5 6600','6th','3.30 GHz','18600'),
-- ('p011','Intel Core i5 6600k','6th','3.50 GHz','20200'),
-- ('p012','Intel Core i5 7400','7th','3.00-3.50 GHz','15900'),
-- ('p013','Intel Core i5 7500','7th','3.40-3.80 GHz','17100'),
-- ('p014','Intel Core i5 7600','7th','3.50-4.10 GHz','19000'),
-- ('p015','Intel Core i5 7600k','7th','3.80-4.20 GHz','20700'),
-- ('p016','Intel Core i7 3820','3rd','3.60 GHz','23700'),
-- ('p017','Intel Core i7 4790','4th','3.60 GHz','24500'),
-- ('p018','Intel Core i7 5820k','5th','3.30 GHz','32800'),
-- ('p019','Intel Core i7 6700','6th','3.40 GHz','25200'),
-- ('p020','Intel Core i7 6700k','6th','4.00 GHz','28300'),
-- ('p021','Intel Core i7 7700','7th','3.60-4.20 GHz','26000'),
-- ('p022','Intel Core i7 7700k','7th','4.20-4.50 GHz','28800');


-- CREATE TABLE PSU(
-- PSerial CHAR(10) PRIMARY KEY NOT NULL,
-- Brand VARCHAR(30),
-- Power_WATT INTEGER,
-- Price INTEGER(10)
-- );

-- INSERT INTO PSU
-- (PSerial,Brand,Power_WATT,Price)
-- VALUES
-- ('ps001','Antec BP350S','350','2700'),
-- ('ps002','Antec NEO ECO II 450 HK','450','4000'),
-- ('ps003','Antec VP500PC EC','500','3700'),
-- ('ps004','Antec TruePower 550G','550','5000'),
-- ('ps005','Corsair VS-450','450','3400'),
-- ('ps006','Corsair VS-550','550','4600'),
-- ('ps007','Corsair VS-650','650','5900'),
-- ('ps008','Cooler Master RS500','500','4300'),
-- ('ps009','Cooler Master Thunder','500','3800'),
-- ('ps010','Cooler Master Elite','350','2500'),
-- ('ps011','Black Cat BC-PS01','500','800'),
-- ('ps012','Value Top TP-ATX15','200','900'),
-- ('ps013','Value Top TP-ATX23','200','950'),
-- ('ps014','Thermaltake W0422RE','350','2500'),
-- ('ps015','Thermaltake W0423RE','450','3500'),
-- ('ps016','Thermaltake W0146RE','450','4300'),
-- ('ps017','Thermaltake SPS-530MPCBEU','530','4900'),
-- ('ps018','Thermaltake SPS-630MPCBEU','630','6100'),
-- ('ps019','Thermaltake SPS-730MPCBEU','730','7300'),
-- ('ps020','Thermaltake ToughPower','850','13500'); 

-- CREATE TABLE OPD(
-- DSerial CHAR(10) PRIMARY KEY NOT NULL,
-- Brand VARCHAR(30),
-- Type CHAR(10),
-- Price INTEGER(10)
-- );

-- INSERT INTO OPD
-- (DSerial,Brand,Type,Price)
-- VALUES
-- ('d001','Asus DRW-24D3ST DVDRW','Internal','1300'),
-- ('d002','ASUS SDRW-08D2S-U','External','2300'),
-- ('d003','Dell DW316 USB','External','2200'),
-- ('d004','LITE ON 24X SATA','Internal','1100'),
-- ('d005','LITE ON 8X SLIM','Internal','1600'),
-- ('d006','SAMSUNG SH-224BB 24X','Internal','1400'),
-- ('d007','Samsung SE-208DB','External','1900'),
-- ('d008','HP DVD1260i DVD Burner','Internal','1600'),
-- ('d009','HP USB DVDRW','External','2400'),
-- ('d010','Transcend TS8XDVDRW-K','External','2700');

-- CREATE TABLE MOBO(
-- MSerial CHAR(10) PRIMARY KEY NOT NULL,
-- Brand VARCHAR(10),
-- Model VARCHAR(25),
-- Price INTEGER(10)
-- );

-- INSERT INTO MOBO
-- (MSerial,Brand,Model,Price)
-- VALUES
-- ('m001','ASUS','H81M-K/C/SI','4700'),
-- ('m002','ASUS','H81M-P','4800'),
-- ('m003','ASUS','H61M-A HDMI','5700'),
-- ('m004','ASUS','H110M-K','5900'),
-- ('m005','ASUS','H110M-A','6100'),
-- ('m006','ASUS','PRIME B250M-K','7600'),
-- ('m007','ASUS','B150M-A','7800'),
-- ('m008','ASUS','PRIME B250M-A','8500'),
-- ('m009','ASUS','B150M PRO GAMING','8400'),
-- ('m010','ASUS','B150 PRO GAMING','10300'),
-- ('m011','ASUS','ROG STRIX H270F GAMING','12600'),
-- ('m012','ASUS','Z170-P','13200'),
-- ('m013','ASUS','CROSSBLADE RANGER','15000'),
-- ('m014','ASUS','PRIME Z270-A','16400'),
-- ('m015','ASUS','Z170-PRO','19000'),
-- ('m016','ASUS','MAXIMUS VIII RANGER','19700'),
-- ('m017','ASUS','MAXIMUS	VI HERO Z87','20500'),
-- ('m018','ASUS','ROG MAXIMUS IX HERO','24700'),
-- ('m019','GIGABYTE','GA-H81M-S2PV','4800'),
-- ('m020','GIGABYTE','GA-H110M-S2PH','5700'),
-- ('m021','GIGABYTE','GA-B85M-HD3-A','5800'),
-- ('m022','GIGABYTE','GA-B150M-HD3','6300'),
-- ('m023','GIGABYTE','GA-B150M-D3H','6800'),
-- ('m024','GIGABYTE','GA-B150M-D3H','7200'),
-- ('m025','GIGABYTE','B150 G1.SNIPER M7','8300'),
-- ('m026','GIGABYTE','B150 G1.SNIPER B7','8900'),
-- ('m027','GIGABYTE','GA-H170M-D3H','9300'),
-- ('m028','GIGABYTE','GA-H170-HD3','10600'),
-- ('m029','GIGABYTE','GA-Z170M','10800'),
-- ('m030','GIGABYTE','GA-Z170','11500'),
-- ('m031','GIGABYTE','GA-X150-PRO','12500'),
-- ('m032','GIGABYTE','GA-Z170XP-SLI','14200'),
-- ('m033','GIGABYTE','GA-Z170X GAMING	3','15000'),
-- ('m034','GIGABYTE','GA-Z170X GAMING 6','17500'),
-- ('m035','GIGABYTE','GA-Z170X GAMING 5','18350'),
-- ('m036','GIGABYTE','GA-Z170X GAMING	7','20000'),
-- ('m037','GIGABYTE','GA-X99 GAMING 5P','28500'),
-- ('m038','GIGABYTE','GA-X99 ULTRA GAMING','29000'),
-- ('m039','MSI','H110M PRO','5600'),
-- ('m040','MSI','H110M A PRO','6100'), 
-- ('m041','MSI','B150M PRO','6300'),
-- ('m042','MSI','B250M PRO','7400'),
-- ('m043','MSI','B150M NIGHT ELF','8000'),
-- ('m044','MSIG','B250M BAZOOKA','8300'),
-- ('m045','MSI','B150M MORTAR','8700'),
-- ('m046','MSI','B150 GAMING M3','9500'),
-- ('m047','MSI','H170 GAMING M3','10100'),
-- ('m048','MSI','B250M MORTAR ARCTIC','10500'),
-- ('m049','MSI','Z170M MORTAR','11500'),
-- ('m050','MSI','H270 TOMAHAWK ARCTIC','11800'),
-- ('m051','MSI','Z270M MORTAR','12800'),
-- ('m052','MSI','Z270 TOMAHAWK','14400'),
-- ('m053','MSI','Z270 GAMING M3','16300'),
-- ('m054','MSI','Z170A GAMING M7','17300'),
-- ('m055','MSI','Z270 KRAIT','17700'),
-- ('m056','MSI','Z270 GAMING CARBON','18300'),
-- ('m057','MSI','Z270 GAMING M7','22800'),
-- ('m058','MSI','Z170A XPOWER TITANIUM','23300'),
-- ('m059','MSI','Z270 XPOWER TITANIUM','32500'),
-- ('m060','MSI','X99A GODLIKE GAMING','52000'); 

-- CREATE TABLE GPU(
-- GSerial CHAR(10) PRIMARY KEY NOT NULL,
-- Brand_Model VARCHAR(30),
-- DDR5_Memory CHAR(5),
-- Price INTEGER(10)
-- );

-- INSERT INTO GPU
-- (GSerial,Brand_Model,DDR5_Memory,Price)
-- VALUES
-- ('g001','ASUS GT730','2GB','6300'),
-- ('g002','ASUS GTX 1050','2GB','12700'),
-- ('g003','ASUS ROG STRIX RX460','4GB','15000'),
-- ('g004','ASUS GTX 1050Ti','4GB','15800'),
-- ('g005','ASUS GTX 1050Ti OC','4GB','17000'),
-- ('g006','ASUS ROG STRIX RX470','4GB','21000'),
-- ('g007','ASUS RADEON RX480','4GB','22500'),
-- ('g008','ASUS GTX 1060','6GB','29000'),
-- ('g009','ASUS ROG STRIX RX480','8GB','31000'),
-- ('g010','ASUS GTX 1070','8GB','44500'),
-- ('g011','ASUS TURBO GTX 1080','8GB','62500'),
-- ('g012','GIGABYTE RADEON RX460','4GB','13000'),
-- ('g013','GIGABYTE RX480 G1','4GB','22500'),
-- ('g014','GIGABYTE RX480 G1','8GB','26500'),
-- ('g015','GIGABYTE GTX 1050','2GB','12200'),
-- ('g016','GIGABYTE GTX 1050Ti','4GB','15000'),
-- ('g017','GIGABYTE GTX 1060 WIND','6GB','38500'),
-- ('g018','GIGABYTE GTX 1070 G1','8GB','43500'),
-- ('g019','GIGABYTE GTX 1080 G1','8GB','63000'),
-- ('g020','GIGABYTE AORUS GTX 1080','8GB','67000'),
-- ('g021','MSI GTX 1050 GAMING X','2GB','13000'),
-- ('g022','MSI GTX 1060 GAMING X','3GB','24300'),
-- ('g023','MSI GTX 1060 ARMOR','6GB','27500'),
-- ('g024','MSI GTX 1060 GAMING X','6GB','29500'),
-- ('g025','MSI GTX 1070 GAMING','8GB','45000'),
-- ('g026','MSI GTX 1070 GAMING X','8GB','46300'),
-- ('g027','MSI GTX 1080 GAMING X','8GB','70000'),
-- ('g028','SAPPHIRE NITRO+ RX460','4GB','12300'),
-- ('g029','SAPPHIRE NITRO+ RX470','4GB','18200'),
-- ('g030','SAPPHIRE NITRO+ RX480','4GB','19800'),
-- ('g031','SAPPHIRE NITRO+ RX470','8GB','21500'),
-- ('g032','SAPPHIRE NITRO+ RX480 OC','8GB','25300'),
-- ('g033','ZOTAC GTX 1060','6GB','23700'),
-- ('g034','ZOTAC GTX 1070','8GB','38500'),
-- ('g035','ZOTAC GTX 1070 AMP','8GB','44300'),
-- ('g036','ZOTAC GTX 1080 AMP','8GB','63500');


-- CREATE TABLE Admin(
-- Name VARCHAR(10),
-- Username VARCHAR(10),
-- Password CHAR(10)
-- );


-- INSERT INTO Admin
-- VALUES('CEO','admin1','ad12');

-- CREATE TABLE Category(
-- Cat_ID int,
-- Cat_name char(10)
-- );

-- INSERT INTO Category
-- (Cat_ID,Cat_Name)
-- VALUES
-- ('1','GPU'),
-- ('2','HDD'),
-- ('3','MOBO'),
-- ('4','OPD'),
-- ('5','Processor'),
-- ('6','PSU'),
-- ('7','RAM');

-- ALTER TABLE category
-- modify Cat_ID int PRIMARY KEY;

-- ALTER TABLE OPD
-- ADD ID int

-- alter table opd 
-- add foreign key(id) references category (cat_id)

-- update opd
-- set id = 4

-- alter table mobo
-- add mid int

-- alter table mobo
-- add foreign key(mid) references category(cat_id)

-- update mobo
-- set mid = 3

-- alter table gpu
-- add gid int

-- alter table gpu
-- add foreign key(gid) references category(cat_id)
-- 
-- update gpu
-- set gid = 1

-- alter table ram
-- add rid int

-- alter table ram
-- add foreign key(rid) references category(cat_id)
-- 
-- update ram
-- set rid = 7

-- alter table processor
-- add pid int;

-- alter table processor
-- add foreign key(pid) references category(cat_id);
-- 
-- update processor
-- set pid = 5;

-- alter table psu
-- add sid int

-- alter table psu
-- add foreign key(sid) references category(cat_id)

-- update psu
-- set sid = 6

-- alter table hdd
-- add hid int

-- alter table hdd
-- add foreign key(hid) references category(cat_id)

-- update hdd
-- set hid = 2


-- CREATE TABLE Brand(
-- 
-- Bname char(10) ,
-- Bcode int(100) primary KEY NOT NULL
-- );

-- INSERT INTO Brand
-- (Bname,Bcode)
-- VALUES
-- ('ACCER','001'),
-- ('APPLE','002'),
-- ('ASUS','003'),
-- ('DELL','004'),
-- ('HP','005'),
-- ('LENOVO','006'),
-- ('MSI','007'),
-- ('TOSHIBA','008')
-- ;

-- CREATE TABLE Product(
-- Pserial int(100) primary KEY NOT NULL,
-- Bcode int(100),
-- Model VARCHAR(250),
-- Processor VarCHAR(250),
-- Ram VarCHAR(250),
-- Hdd VarCHAR(250),
-- Display varchar(250),
-- Warranty_year int(3),
-- battery	VarCHAR(250),          
-- Price_BDT int (50),
-- FOREIGN KEY (BCode) REFERENCES Brand (Bcode)
-- );


-- INSERT INTO product
-- (Pserial,Bcode,             Model,             Processor,   Ram,        Hdd,  Display,Warranty_year,   battery,Price_BDT)
-- VALUES
-- 
-- 
-- ('001','005','HP Spectre-13-v114tu','Intel® Core™ i7-7500U',
-- '8 GB LPDDR3-1866 SDRAM','512 GB','13.3" (1920 x 1080)','02','4-cell 38 Wh Li-ion ','145000'),
--  
--   ('002','005','HP Spectre X360 Convertible 13-W007TU','Intel® Core™ i7-7500U  cores','8 GB LPDDR3-1866 SDRAM',
--   '256 GB PCIe® NVMe™ M.2 SSD','13.3"(1920 x 1080)','02','3-cell Li-ion polymer 12.5hbackup ','113000'),
-- 
-- ('003','005','HP ENVY 15-as107tu i7','Intel® Core™ i7-7500U','8 GB DDR4-2133 SDRAM (1 x 8 GB)',
-- '256 GB PCIe® NVMe™ M.2 SSD','15.6"(1920 x 1080)','02','3-cell 52 Wh Li-ion','89500'),
-- ('004','005','HP Probook 470 G3 i7 DDR4','Intel® 6th Gen Core™ i7-6500U',
-- '8GB 2133 DDR4 RAM','1TB Hard Drive','17.3"HD Antiglare LED Display','02',' 6 Cell Battery  4.5 H Backup ','72000'),
-- ('005','005','HP Pavilion 15-AU018TX i7',' Intel® Core™ i7-6500U',
-- '8 GB DDR4-2133 Bus RAM','1 TB 5400 rpm SATA','15.6"(1366 x 768)','02','4 Cell Battery with 4.5H Backup ','62500'),
-- 
-- ('006','005','HP 348 G4 7th Gen i7','Intel® Core™ i7-7500U ',
-- '4GB GB DDR4-2133 SDRAM','1TB 5400 rpm SATA','14.1"(1366 x 768)','02','4-cell(65 WHr)Li-ion upto 4.5H Backup','58500'),
-- 
-- ('007','005','HP 15-AY120TX','Intel® Core™ i5-7200U',
-- '4GB DDR4 2133 BUS RAM','1 TB 5400 rpm SATA','15.6"(1366 x 768)','02','4 cell Li-ion polymer upto Backup 4.5H','45500'),
-- 
-- ('008','005','HP 14-ac130TU i3','Intel 6th Gen Core i3-6100U',
-- '4 GB DDR3 RAM','1TB 5400 rpm SATA','14"(1366 x 768)','02','4-cell(41 WHr)Li-ion upto 4.5H Backup','33500'),
-- 
-- ('009','005','HP 250 G5','Intel 5th Gen Core i3-5005U',
-- '4 GB DDR3 RAM','1TB 5400 rpm SATA','15.6"Anti-Glare(1366 x 768)','02','4-cell(41 WHr)Li-ion upto4.5H Backup','31500'),
-- 
-- ('010','005','HP X360 11-ab002tu','Intel® Celeron® N3060',
-- '4 GB DDR3L-1600 SDRAM (1 x 4 GB)','500 GB 5400 rpm SATA',' 11.6-inch Multi touch ','02','3-cell(41Wh)Li-ion with 3.5H Backup','30500'),
-- 
-- ('011','001','Acer Aspire F5-572G ','Intel Core i7 6th Gen 6500U  ',
-- '8GB DDR4L','2 TB ','15.6','01','AC Power Adapter 4 Cell Battery up to 5 hours ','70300'),
-- 
-- ('012','001','Acer TravelMate P246MG ','4th gen Intel® Core™ i7 4712M',
-- '4 GB DDR3','1TB','14”','1','Up to 5.5 hours battery ','62300'),
-- 
-- ('013','001','Acer Aspire F5-573 ','Intel® Core™ i5-7200U ','8 GB DDR4 SDRAM','1TB','15.6" LCD ComfyView','02',
-- '4-cell Lithium Ion (Li-Ion) Battery ','46500'),
-- 
-- ('014','001','Acer TravelMate P248M i3 6100U','Intel® Core™ i3-6100U ',
-- '4GB DDR3L RAM','1TB','14" HD Acer CineCrystal™ ','03','4-cell Li-ion battery 4.5-hours battery','35000'),
-- 
-- ('015','001','Acer Aspire V3-574','5th Generation Intel Core i3-5005U ',
-- '4GB DDR3L RAM','1TB','15.6” HD Acer CineCrystal™ ','01','4 cell battery upto 5.5 hours backup','35000'),
-- 
-- ('016','001','Acer Aspire ES1-531','Intel® Pentium® Processor N3710 ',
-- '4GB DDR3L support upto8GB','1TB 5400 rpm','15.6”(1920 x 1080)','02','3-cell Li-ion Battery upto 4.5h','25000'),
-- 
-- ('017','001','Acer Aspire E5-473','5th Generation Intel Core i3-5005U',
-- '4GB DDR3L ','500 GB','14” HD ','01','5h bk up ','26000'),
-- 
-- ('018','001','Acer Aspire ES1-431','Intel® Celeron® Processor N3050 ',
-- '2 GB DDR3 SDRAM','500 GB','14" ','01','4-cell Battery upto5.5h ','24500'),
-- 
-- ('019','001','Acer Aspire ES1-533 ','Intel® Pentium® Processor N4200 ',
-- '4GB DDR3L support-upto8GB','1TB','15.6','02','3-cell Li-ion Battery upto4.5h','28800'),
-- 
-- ('020','001','Acer Predator G9-591-7173','Intel® Core™ i7-6700HQ Quad Core',
-- '16GB DDR4 Dual Channel ','128 GB SSD | 2TB 7200RPM SATA ','15.6" Full HD(1920 x 1080) ','01','	8-cell(Li-ion)6h Backup','160500'),
-- 
-- ('021','002','Apple 15 inch MacBook Pro Core i7 MLH42ZP ',
-- 'Intel quad-core 2.7GHz Core i7 ',
-- '16GB of 2133MHz LPDDR3 ',
-- '512GB PCIe-based SSD',
-- '15.4-inch Retina display ','01',
-- 'Upto 10 hours Backup',
-- '245000'),
-- 
-- ('022','002','Apple 15.4 inch MacBook Pro Core i7 MJLQ2LL/A ',
-- '2.2GHz quad-core Intel® Core™ i7 ',
-- '16GB of 1600MHz DDR3L ',
-- '256GB PCIe-based SSD',
-- '15.4-inch (diagonal)','1',
-- 'Up to 9 hours of Battery ',
-- '175000'),
-- 
-- ('023','002','Apple 13.3 inch Macbook Pro Core i5 MF841LL/A ',
-- '2.9 GHz Intel Core i5 ',
-- '8 GB 1866 MHz LPDDR3 ',
-- '	512GB PCIe-based SSD',
-- '13.3-inch IPS Retina ','01',
-- '	Upto 10 hours Backup ',
-- '160000'),
-- 
-- ('024','002','Apple 13.3 inch Macbook Pro 2016 Core i5 MLL42ZP/A ',
-- '2.0 GHz dual-core Intel Core i5 ',
-- '8 GB 1866 MHz LPDDR3 ',
-- '256GB PCIe-based SSD',
-- '13.3-inch IPS Retina Display','01',
-- 'Battery	Upto 10 hours Backup','135000'),
-- 
-- ('025','002','Apple 12 inch MacBook Pro MLH72LL/A ',
-- 'Intel Core M3 1.1 GHz Dual-Core Processor ',
-- '8 GB of 1866 MHz LPDDR3 ',
-- '256GB PCIe-based SSD',
-- 'Display	12-Inch IPS LED(2304X1440)™ ','01',
-- 'Upto 10 hours Backup','115000'),
-- 
-- ('026','002','Apple 13.3 inch Macbook Air MMGG2ZP/A ',
-- 'Intel Core i5 1.6 GHz dual-core ',
-- '8 GB of 1600 MHz LP DDR3 ',
-- '256GB PCIe-based SSD',
-- '13.3-inch (diagonal) ','01',
-- 'Up to 12 hours Backuph','103000'),
-- 
-- ('027','002','Apple 13.3 inch Macbook Air Core i5 MJVG2LL/A ',
-- 'Intel Core i5 1.6 GHz dual-core',
-- '4 GB of 1600 MHz LPDDR3  ',
-- '256GB PCIe-based SSD',
-- '13.3-inch (diagonal)','01',
-- 'Up to 12 hours Backup','93000'),
-- 
-- ('028','002','Apple 13.3-inch Macbook Pro',
-- 'Intel-Core-i5 Processor 2.5GhzTurbo Boost up to 3.1GHz ',
-- '4GB of 1600MHz DDR3L',
-- '500 GB HDD',
-- '13.3-inch (diagonal)  ','01',
-- 'Upto 10 hours Backup','90000'),
-- 
-- ('029','002','Apple 13.3 inch Macbook Air ',
-- 'Intel Core i5 1.6 GHz dual-core',
-- '8 GB of 1600 MHz LPDDR3 RAM',
-- '128GB PCIe-based SSD',
-- '13.3-inch (diagonal) ','01',
-- 'Up to 12 hours Backup','89000'),
-- 
-- ('030','002','Apple 13.3 inch Macbook Air Core',
-- 'Intel Core i5 Processor 1.6GHz Turbo Boost up to 2.7GHz',
-- '4GB of 1600MHz DDR3L',
-- '128GB PCIe-based SSD ',
-- 'Display	13.3-inch (diagonal) ','01',
-- 'Up to 12 hours Backup','85000'),
-- 
-- ('031','003','Asus ROG G701VO-6820HK ',
-- 'Intel Quad Core i7-6820HK 2.7GHz',
-- '64 GB DDR4 2133 MHz SDRAM',
-- '1 TB PCIE Gen 3 X 4, SSD ',
-- '17.3" 16:9 IPS FHD (1920x1080) ','02',
-- '93WHrs, 9-cell Li-ion Battery',
-- '290500'),
-- 
-- ('032','003','Asus UX390UA 7500U i7 7th Gen ',
-- 'Intel® Core™ i7-7500U Processor ',
-- '16 GB SDRAM DDR4 2133MHz SDRAM',
-- 'PCIEG3x4 512GB M.2 SSD',
-- '12.5"(16:9)(1920x1080) ','2',
-- '6 Cells 40 Whrs Polymer Battery',
-- '133500'),
-- 
-- ('033','003','Asus ROG GL552VW-6700HQ i7',
-- '6th Gen Intel Core i7 6700HQ Processor 2.60 GHz upto 3.50 GHz ',
-- '16GB DDR4 2133 MHz RAM',
-- '2TB SATA + 128 GB SSD',
-- '15.6" IPS Full HD anti glare led','02',
-- '6 Cells 4.5 Hours Backup',
-- '105500'),
-- 
-- ('034','003','Asus N552VW-6700HQ',
-- 'Intel Core i7 6th Gen 6700HQ, 2.60 GHz  ',
-- '16 GB, DDR4 2133(O.C.) MHz SDRAM',
-- '2 TB SATA + 128GB SSD',
-- '15.6" 16:9 UHD IPS LED Back-lit(3840 X 2160)','02',
-- '48WHrs 4S1P 4-cell Li-ion Battery','94000'),
-- 
-- ('035','003','Asus UX410UQ-7500U',
-- 'Intel Core i7 7th Gen 7500U 2.70 GHz up to 3.50 GHz ',
-- 'up to 8 GB SDRAM DDR4 2133MHz SDRAM ',
-- '512GB M.2 SSD',
-- '14.0" (16:9) FHD (1920 X 1080) LED™ ','02',
-- '3 Cells 48 Whrs Battery','85000'),
-- 
-- ('036','003','	Asus Zenbook UX303UB-6200U',
-- '6th Gen Intel Core i5 6200U Processor 2.30GHz upto 2.80GHz',
-- '8 GB DDR3L 1600 Bus RAM',
-- '1 TB SATA HDD',
-- '13.3" IPS 16:9 FHD LED (1920X 1080)','02',
-- '4 Cells 4.5 Hours Backup','71500'),
-- 
-- ('037','003','ASUS X556UQ-6500U Core i7 2TB',
-- 'Intel Core i7 6th Gen 6500U, 2.5 GHz upto 3.10 GHz ',
-- '8 GB DDR4L 2133 MHz SDRAM',
-- '2TB HDD 5400 RPM',
-- '13.3-inch (diagonal)','02',
-- '4 Cell Battery with 4.5 Hours Backup','60000'),
-- 
-- ('038','003','ASUS P2430UA-6500U 6th Gen i7',
-- 'Intel® Core™ i7-6500U 6th Gen Processor, 2.5GHz',
-- '8GB Up to 16 GB, 2 x SODIMM, DDR4 (2133 Hz',
-- '1 TB SATA HDD',
-- '14" 16:9 HD (1366x768) Anti-glare','03',
-- '6-cell Li-ion Battery Pack','55500'),
-- 
-- ('039','003','Asus VivoBook X456UQ-i5',
-- 'Intel Core i5 6th Gen 6200U, 2.30 GHz ',
-- '8 GB DDR4 RAM',
-- '1 TB SATA',
-- '14.0" 16:9 HD (1366x768)','02',
-- '2Cells 37 Whrs Polymer Battery','47000'),
-- 
-- ('040','003','Asus K455LA-5200U',
-- 'Intel Core i5 5th Gen 5200U 2.20 GHz ',
-- '4 GB DDR3',
-- '1TB SATA',
-- '14" 16:9 HD (1366 X 768)','02',
-- '4 Cell Battery with 4.5 Hours Backup','41000'),
-- 
-- 
-- ('041','004','Dell XPS 13-9350 Ultrabook i7',
-- 'Intel® Core™ i7-6500U Processor ',
-- '16GB LPDDR3-1866MHz',
-- '512GB PCIe Solid State Drive (SSD)',
-- '13.3(3200 x 1800) ','02',
-- ' 4-cell smart lithium-ion 56WHr (up to 11 hours)',
-- '185000'),
-- 
-- ('042','004','Dell XPS 13 Ultrabook i5 Touch Screen',
-- 'Intel® 6th Generation Core™ i5-6200U',
-- '8GB LPDDR3 1866MHz',
-- '256GB PCIe Solid State Drive (SSD)',
-- ' 13.3inch(3200 x 1800) ','02',
-- '52 WHr, 4-Cell Battery',
-- '14100'),
-- 
-- ('043','004','DELL Inspiron 15 N7559 Gaming Laptop ',
-- 'Intel® Core™ i7-6700HQ 6th Gen ',
-- '16GB DDR3 Ram',
-- '128GB SSD + 1TB HDD',
-- '15.6" UHD TOUCH LED  ','02',
-- '6 cell battery upto 11 hours backup. ',
-- '106000'),
-- 
-- ('044','004','DELL Vostro N5459 6th Gen i7 ',
-- '6th Gen Intel Core i7-6500U',
-- '1TB 54000rpm  ',
-- '256GB PCIe-based SSD',
-- '14” HD (1366x768) ','02',
-- ' 3 Cell Battery with 3.5 Hours Backup','68500'),
-- 
-- ('045','004','Dell Latitude N5470 6th Gen i5',
-- 'Intel® Core™ i5 6200U 6th Gen 2.3 GHz turbo upto 2.8 GHz',
-- ' 4GB DDR4 RAM ',
-- '500GB (7,200 Rpm)',
-- ' 14.1" HD LED Display','03',
-- ' 4 Cell Battery with 5 Hours Backup','63500'),
-- 
-- ('046','004','Dell Vostro N3468 7th Gen Core i5 14" ',
-- 'Intel® Core™ i5-7200U Processor',
-- '4GB Single Channel DDR4 2400MHz ',
-- ' 1TB 5400 rpm Hard Drive',
-- '14-inch HD (1366 x 768)','03',
-- '40 WHr 4-Cell Battery Up to 4.5 Hrs','47500'),
-- 
-- ('047','004','DELL Vostro 3568 7th Gen i3 15.6"  ',
-- 'Intel® Core™ i3-7100U ',
-- ' 4GB Single Channel DDR4 ',
-- '1TB 54000rpm ',
-- '15.6" HD LED','01',
-- '4 Cell Battery with 4 Hours Backup','37500'),
-- 
-- ('048','004','Dell Inspiron N5558 i3',
-- ' Intel® Core™ i3-4005U',
-- '4GB DDR3',
-- '500 GB SATA',
-- '15.6" HD LED ','01',
-- '4Cell Battery with 4 Hours Backup','34000'),
-- 
-- ('049','004','Dell Inspiron 15-3552',
-- 'Pentium Quad Core Processor 3700U 1.6GHz',
-- ' 4GB DDR3 ',
-- '500 GB HDD',
-- '15.6'' HD LED Display ','02',
-- '2Cell Battery with 3.5 Hours Backup','25000'),
-- 
-- 
-- 
-- ('050','004','Dell Inspiron 11 3162 11.6" Celeron Dual Core Notebook',
-- ' Intel® Celeron® Processor N3050',
-- '2GB DDR3',
-- ' 500 GB 5400 rpm SAT',
-- '11.6" HD LED ','02',
-- '2 Cell Battery with 5 Hours Backup','19500'),
-- 
-- ('051','006','Lenovo Yoga 260 ',
-- 'Intel® Core™ i7-6500U Processor  ',
-- '8GB DDR4 2133 MHz SoDIMM',
-- '511 GB SSD 2.5" SATA 3',
-- '12.5" FHD (1920 x 1080) IPS, 300 NT','03',
-- ' TP BT 6 Cell Lithium (47 wh)',
-- '144000'),
-- 
-- ('052','006','Lenovo Thinkpad X260 i7',
-- 'Intel® Core™ i7-6500U GPU Processor',
-- '8GB DDR4 2133 MHz SoDIMM RAM',
-- '512 GB Solid State Drive 2.5" SATA 3 Storage',
-- ' 12.5" FHD (1920 x 1080) IPS, 300 NT ','03',
-- 'TP BT 6 Cell Lithium (47 wh) Cylindrical Battery',
-- '122000'),
-- 
-- ('053','006','Lenovo Y700 i7-6700HQ',
-- 'Intel Core i7-6700HQ 6th Gen ',
-- ' 8GB DDR4 (Upgradable upto 16GB)',
-- ' 1TB HDD+8GB SSHD',
-- '15.6″ FULL HD LED Display','03',
-- '4Cell/60 Watt Hour Li-Cylindrical, Up to 4 hours Backup',
-- '95000'),
-- 
-- ('054','006','Lenovo Ideapad 710s i7 ',
-- 'Intel® Core™ i7-7500U',
-- '8GB DDR4 2133, 8GB Max RAM Support ',
-- '256GB SSD',
-- '13.3" Full HD(1920x1080) LED','01',
-- ' 4 Cell Li-Polymer, Up to 4.5 hours Backup ','90500'),
-- 
-- ('055','006','Lenovo V310 6th Gen i7 ',
-- 'Intel® Core™ i7-6500U',
-- '8GB DDR4 2133 MHz',
-- ' 1TB HDD 5400 RPM',
-- '  14.0" Full HD (1920 x 1080)','02',
-- ' TP BT 4 Cell Lithium','64000'),
-- 
-- ('056','006','Lenovo V310-14ISK 6th Gen-6200U i5 ',
-- 'Intel® Core™ i5-6200U',
-- '8GB 2133MHz DDR4',
-- ' 1TB SATA HDD',
-- '14.0" HD (1366 x 768)','02',
-- 'Up to 5 hours with 4-cell battery','51000'),
-- 
-- ('057','006','Lenovo Yoga 500 5th Gen i3  ',
-- '5th Gen Intel® Core™ i3-5010U',
-- ' 4GB DDR3 RAM',
-- '500GB+8G SSHD ',
-- '14.0" HD LED (1366x768)','01',
-- '3 Cell Lithium-Ion','48000'),
-- 
-- ('058','006','Lenovo V310-14ISK 6th Gen',
-- ' Intel® Core™ i5-6200U Processor',
-- '4GB DDR3',
-- ' 1TB SATA HDD',
-- '14.0" HD (1366 x 768) ','02',
-- 'Up to 5 hours with 4-cell battery','46500'),
-- 
-- ('059','006','Lenovo IP 110 6th gen i3 14"',
-- 'Intel® Core™ i3-6100U',
-- '4GB 2133MHZ DDR4',
-- '1TB GB HDD',
-- '14" HD LED (1366 x 768) ','01',
-- 'Up to 4 hours with 4-cell battery','31500'),
-- 
-- 
-- 
-- ('060','006','Lenovo IP110s Intel Celeron N3060 ',
-- 'Intel® Celeron® Processor N3060',
-- '2GB DDR3L',
-- ' 128GB SSD',
-- '11.6" HD LED(1366 X 768) ','01',
-- 'Up to 8 hours battery','23500'),
-- ('061','007','MSI S20 4M Slider 2 Notebook',
-- 'CPU 4th Generation Intel Core i5 Processor',
-- 'DDR3L8GB',
-- '128 SSD (Half-size)',
-- '11.6 LED Backlight','01',
-- ' 3cell cells Backup 8 hours',
-- '88000'),
-- 
-- ('062','007','MSI S20 4M Slider 2 Notebook',
-- 'CPU 4th Generation Intel Core i5 Processor',
-- 'DDR3L8GB',
-- '128 SSD (Half-size)',
-- '11.6 LED Backlight','01',
-- '3cell cells ',
-- '65000'),
-- 
-- ('063','007','MSI GS70 2PE Stealth Pro Notebook',
-- ' 4th generation Intel Core i7  ',
-- ' DDR3L 16GB',
-- ' 128GB SSD',
-- '17" 1920X1080','01',
-- '6cell cells 5400mAh 60Wh','172990'),
-- 
-- ('064','007','MSI GS70 2PE Notebook',
-- 'Intel Core i7-4700HQ ',
-- '8GB DDR4 2133 ',
-- '1TB 7200RPM  128GB SSD',
-- '17.3" (1920x1080)','01',
-- ' 6 Cell cells battery','170990'),
-- 
-- ('065','007','MSI GT70 2PE Dominator Pro Notebook',
-- 'Intel Core i7-4700HQ Processor Up To 3.40 GHz',
-- 'DDR3 (L) 16GB (8GB*2) ',
-- '1TB 7200RPM + 128GB SSD',
-- '  17.3" (1920x1080)','01',
-- ' Up to 9 hours 9Cell cells','170990'),
-- 
-- ('066','008','Toshiba Satellite C50-B202E 3rd Generation 3217U Notebook ',
-- 'Intel 3rd Generation Core i3 with 1.8 GHz',
-- ' 4 GB DDR3 (1600 MHz)',
-- ' 500 GB SATA (5400 rpm) ',
-- '15.6" (1366 x 768 pixels)','01',
-- '4 cells lithium-ion battery w 4 hours back up ','33700'),
-- 
-- ('067','008','Toshiba Satellite C40D Notebook ',
-- ' AMD E1 1200 APU 1.4 GHz',
-- ' 2 GB DDR3',
-- '500GB ',
-- '14"1,366 x 768','01',
-- 'Lithium Ion 48Wh 6-cell cells Backup3.5 Ho','26500'),
-- 
-- ('068','008','Toshiba Mini NB500-1000 Netbook',
-- 'Intel Atom N455 (512KB Cache) Intel Atom N455 1 ',
-- ' 1GB RAM',
-- '  250 GB SATA',
-- '10.1"','01',
-- '6cell cells battery back up 7 hours','24300'),
-- 
-- ('069','008','Toshiba Qosmio F750 Notebook"',
-- 'Intel Core i7-2630QM',
-- '4GB DDR3 1333MHz SDRAM ex',
-- '640GB High-Speed SATA ',
-- '15.6" (1366 x 768) ','01',
-- '6 Cell cells lithium ionwith 5 Hours bk up','31500'),
-- 
-- 
-- 
-- ('070','008','Toshiba TECRA R940 Notebook',
-- 'Intel Core i5-3230M processor 2.6GHz',
-- '4GB DDR3',
-- ' 640GB SATA',
-- '14"LED ','01',
-- 'Up to 8 hours 6 Cell cells lithium ion battery ','119000');
-- 
-- 
-- create view v_user 
-- AS(select  pserial,Brand.Bname,Model,Processor,Price_BDT from product,brand where brand.bcode=product.bcode );
-- 
-- create view v_detail 
-- AS(select   pserial,Brand.Bname, Model,Ram,Hdd,Display,Warranty_year,battery,Price_BDT  Price_BDT from product,brand where brand.bcode=product.bcode );
-- 
-- create view vgpu 
--  AS(select  Brand_Model,DDR5_Memory,Price from category,gpu where Cat_ID=gid);

-- create view vhdd 
-- AS(select  Brand,Memory,HType,Price from category,hdd where Cat_ID=hid);

-- create view vmobo 
-- AS(select  Brand,Model,Price from category,mobo where Cat_ID=mid);

-- create view vopd 
-- AS(select  Brand,Type,Price from category,opd where Cat_ID=ID);

-- create view vpow 
-- AS(select  Brand,Power_WATT,Price from category,psu where Cat_ID=sid);

-- create view vpro 
-- AS(select  Model,Generation,ClockSpeed,Price from category,processor where Cat_ID=pid);
-- 
-- create view vram 
-- AS(select  Brand,Memory,MemoryType,Speed,Price from category,ram where Cat_ID=rid);