DROP TABLE IF EXISTS CUSTOMER;
  
CREATE TABLE CUSTOMER (
  ID INT PRIMARY KEY,
  NAME VARCHAR(150) NOT NULL
  );

DROP TABLE IF EXISTS CUSTOMER_TRANSACTION;
  
CREATE TABLE CUSTOMER_TRANSACTION (
  ID BIGINT PRIMARY KEY,
  CUSTOMER_ID INT,
  TRANSACTION_AMOUNT DOUBLE,
  TRANSACTION_DATE DATE  
);