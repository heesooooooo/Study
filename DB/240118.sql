-- 데이터베이스 생성
CREATE DATABASE JDBCTEST;

-- BIGDATAMEMBER 테이블 생성
-- COLUMN
-- ID 문자(50) PRIMARY KEY
-- PW 문자(100) NOT NULL
-- B_NAME 문자(50) NOT NULL
-- AGE 숫자
-- SCORE 숫자

CREATE table JDBCTEST.BIGDATAMEMBER (
ID VARCHAR(50) primary key not null,
PW VARCHAR(100) not null,
B_NAME VARCHAR(50) not null,
AGE int,
SCORE int);
COMMIT;  
-- **만들고 커밋 해줘야 됨

select * from JDBCTEST.BIGDATAMEMBER; 


INSERT INTO JDBCTEST.BIGDATAMEMBER VALUES ('smhrd','12345','이도연',20,0);

select * from JDBCTEST.BIGDATAMEMBER where id='smhrd'and pw='12345';