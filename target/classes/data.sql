ALTER TABLE CUSTOMER_TRANSACTION ADD FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER (ID);

INSERT INTO CUSTOMER(ID, NAME) VALUES(1,'Vishnu');
INSERT INTO CUSTOMER(ID, NAME) VALUES(2,'John');
INSERT INTO CUSTOMER(ID, NAME) VALUES(3,'Nikhil');
INSERT INTO CUSTOMER(ID, NAME) VALUES(4,'Sara');
INSERT INTO CUSTOMER(ID, NAME) VALUES(5,'Mike');
INSERT INTO CUSTOMER(ID, NAME) VALUES(6,'Ashok');
INSERT INTO CUSTOMER(ID, NAME) VALUES(7,'Jangir');
INSERT INTO CUSTOMER(ID, NAME) VALUES(8,'Josh');
INSERT INTO CUSTOMER(ID, NAME) VALUES(9,'Jyoti');
INSERT INTO CUSTOMER(ID, NAME) VALUES(10,'Von');
INSERT INTO CUSTOMER(ID, NAME) VALUES(11,'Paul');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1001,1,50.70,'2021-12-04');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1002,1,68.30,'2021-12-24');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1003,1,100.80,'2022-01-07');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1004,1,134.20,'2022-01-14');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1005,1,150.64,'2022-02-05');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1006,1,168,'2022-02-20');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1007,1,96,'2022-03-09');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1008,1,60.10,'2022-03-22');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1009,1,129.50,'2022-04-04');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1010,1,136.20,'2022-04-13');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1011,2,56.70,'2021-12-05');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1012,2,60.30,'2021-12-22');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1013,2,106.80,'2022-01-07');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1014,2,155.20,'2022-01-16');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1015,2,10.64,'2022-02-07');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1016,2,118,'2022-02-10');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1017,2,86.90,'2022-03-08');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1018,2,120,'2022-03-21');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1019,2,149.50,'2022-04-09');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1020,2,116.20,'2022-04-16');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1021,3,56.70,'2021-12-05');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1022,3,60.30,'2022-01-08');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1023,3,106,'2022-04-07');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1024,3,155.20,'2022-03-09');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1025,3,10.64,'2022-03-07');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1026,3,134,'2022-04-16');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1027,4,186.90,'2021-12-22');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1028,4,120.10,'2022-04-21');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1029,4,149.50,'2022-03-16');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1030,4,116.20,'2022-04-16');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1031,5,56.70,'2021-12-15');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1032,5,60.30,'2021-12-22');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1033,5,106.80,'2022-01-17');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1034,5,153,'2022-04-26');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1035,5,40.64,'2022-03-17');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1036,5,86.90,'2022-04-18');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1037,5,112.30,'2022-03-21');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1038,6,132.67,'2022-03-02');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1039,6,145,'2022-04-12');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1040,6,181,'2022-03-23');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1041,6,96.2,'2022-03-21');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1042,6,58.2,'2022-04-15');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1043,6,111,'2022-04-12');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1044,7,28.2,'2022-03-22');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1045,7,45.78,'2022-03-25');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1046,7,39.99,'2022-04-11');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1047,7,50,'2022-05-02');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1048,8,82.34,'2022-03-16');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1049,8,67.4,'2022-03-21');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1050,8,98,'2022-04-12');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1051,9,100,'2022-05-01');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1052,10,58.2,'2021-12-04');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1053,10,111,'2021-11-22');
INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1054,10,28.2,'2021-09-12');

INSERT INTO CUSTOMER_TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE)  VALUES(1055,11,114.2,'2022-03-12');