-- SQL(구조화 질의 언어)
-- MySQL DBMS(RDBMS:관계형데이터베이스) -> TABLE단위로 관리
create database bigdata; 

create table student(
   nprofessordepartment_codedepartment_codeum int not null primary key auto_increment,
   name varchar(50),
   tel varchar(50),deptdeptnamenum
   age int,
   email varchar(50)dept
);
-- 번개 누르고 schemas스키마 새로고침 하면studentstudentdept 스튜던트table 생김
-- 고유번호 부여 primary key


-- CRUD
insert into student(name,tel,age,email) 
values('홍길동','010-1111-1111',20,'aaa@naver.com');
-- 문자열 '로 , 정수는 그냥
insert into student(name,tel,age,email) 
values('엄희수','010-3840-9566',28,'aaa@naver.com');
-- 번개

select * from student;deptdeptdept
-- 셀렉트 드래그하고 번개 누르면 테이블 완성
studentstudentdepartmentdepartment
-- num가 2인 학생의 나이를 99로 수정하세요
update student set age=99 where num=2;
-- set이 수정
-- where 조건

-- 전화번호, 이메일 수정
update student 
set tel='010-8888-8888',email='1004@naver.com'
where num=2;

-- 2번 학생을 삭제하시오
delete from student 
where num=2;

-- 테이블 삭제(drop)
drop table student;
