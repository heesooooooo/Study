SELECT * FROM bigdata.student;
-- CRUD 
-- 이름을 기준으로 오름차순 정렬(Sort)하여 출력하세요
select * from student order by name asc; -- asc(오름)
select * from student order by name desc; -- desc(내림)

-- count() : 내장함수. 개수 계산
-- 나이가 30세 이상인 학생을 출력하시오
select count(*) from student where age>=30;

