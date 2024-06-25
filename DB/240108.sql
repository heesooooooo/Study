create database haksa;


INSERT INTO department (department_name) VALUES
('컴퓨터공학과'),
('국어국문과'),
('정보통신과'),
('전자공학과');

INSERT INTO Student (student_name, student_height, department_code) VALUES
('가길동', 170.5, 1),
('나길동', 165.2, 1),
('다길동', 180.0, 2),
('라길동', 175.8, 3),
('마길동', 160.7, 4),
('바길동', 168.3, 1),
('사길동', 172.1, 2),
('아길동', 175.0, 1);

select * from Student;

-- 학생의 학과 정보를 출력하세요. (학생이름, 학과명)

select s.student_name, d.department_name
from department d
inner join student s
on d.department_code=s.department_code;

-- 이너조인 다른 방법
select s.student_name, d.department_name
from student s, department d
where s.department_code=d.department_code;

-- 학과별 학생수를 구하여 출력하시오(학과명, 학생수), 학생수가 2명이상인 학과를 출력하시오.
-- group by 한 걸 select
select department_name, count(*) as cnt
from student s, department d
where s.department_code=d.department_code
group by department_name
having cnt>=2;


-- SQL. 국어국문과에 다니는 학생을 출력하세요. (학과명, 학생이름)
select d.department_name, s.student_name
from student s
inner join department d
on s.department_code=d.department_code
where d.department_name='국어국문과'; -- where 조건절


-- SQL. 학생이름이 '바'로 시작하는 학생이름만 출력하세요.
select *from student
where student_name like '바%'; -- like 검색

-- SQL. 학생의 키가 170이상인 학생만 출력하세요. (관계연산자)
select * from student
where 170 <= student_height

-- SQL. 학생의 키가 170이상 180이하인 학생만 출력하세요. (논리연산자)
select *  from student
where student_height between 170 and 180;

-- SQL. 키가 가장 큰 사람을 출력하세요
select * from student
order by student_height desc
limit 1;

DELETE FROM student WHERE student_id>=17;

select * from department;

INSERT INTO Professor (professor_code, professor_name, department_code) VALUES
(1,'가 교수', 1),
(2,'나 교수', 1),
(3,'다 교수', 2),
(4,'빌 게이츠', 3),
(5,'스티브 잡스', 4);

select * from professor;



-- Q. 컴퓨터공학과에 소속된 교수 이름을 출력하세요. (학과명, 교수이름)
select d.department_name, p.professor_name
from professor p
inner join department d
on p.department_code = d.department_code
where d.department_name='컴퓨터공학과';


-- Q. 학과별 교수의 수를 출력하세요. (학과, 교수의 수)
select d.department_name, count(*) as 'total'
from professor p
inner join department d
on p.department_code = d.department_code
group by d.department_name;


-- Q. 교수의 수가 2명 이상인 학과를 출력하세요
 select d.department_name, count(*) as 'total'
from professor p
inner join department d
on p.department_code = d.department_code
group by d.department_name
having total>=2; 


-- Q. 가장 많은 학생이 있는 학과명과 학생수를 출력하세요.
select d.department_name, count(s.department_code) as total
from student s
inner join department d
on s.department_code=d.department_code
group by department_name 
order by total desc
limit 1;


-- 서브쿼리 (괄호 안에 또 select)
select department_name
from department
where department_code=(
select department_code from student
group by department_code
having count(department_code)=(
	select count(department_code) cnt from student group by department_code 
	order by cnt desc limit 1
    )
);


-- Q. 학생중 성이 아인 학생이 속한 학과명과 학생명을 출력하세요.
select d.department_name, s.student_name
from department d
inner join student s
on d.department_code=s.department_code
where s.student_name like '아%';

-- Q. 키가  175~180사이에 속한 학생수를 출력하세요.
select count(*) as total
from student
where student_height between 175 and 180;

-- Q. 다길동 학생과 같은 학과에 속한 학생의 이름을 출력하세요.
-- 서브쿼리 이용

select student_name from student st
where st.department_code=(
	select department_code from student s
	where s.student_name = '다길동'
    );
    

-- Q. 학과별 키의 최고값과, 평균값을 출력하세요.
select d.department_name, max(s.student_height) as max, avg(s.student_height) as avg
from student s 
inner join department d
on s.department_code= d.department_code
group by d.department_name;

-- 개설과목
INSERT INTO Course (course_name, professor_code, start_date, 
end_date) VALUES
('교양 영어', 1, '2023-07-01', '2023-08-15'),
('데이터베이스 입문', 2, '2023-07-01', '2023-08-31'),
('회로이론', 3, '2023-07-15', '2023-09-15'),
('공학수학', 4, '2023-07-15', '2023-09-30'),
('객체지향 프로그래밍', 5, '2023-07-01', '2023-08-31');

select * from course;

-- Q. 빌 게이츠 교수가 가르치는 과목이름을 출력하세요.
select p.professor_name, c.course_name
from professor p
inner join course c
on p.professor_code=c.professor_code
where p.professor_name = '빌 게이츠';

select ifnull(max(id), 0)+1 from Student_Course; -- 0+1
-- 수강
INSERT INTO Student_Course (id, student_id, course_code) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 2),
(4, 4, 3),
(5, 5, 4),
(6, 6, 5),
(7, 7, 5);


-- Q. 과목별 수강자 수를 출력하시오.
select c.course_name, count(*) cnt
from course c
inner join student_course sc
on c.course_code=sc.course_code
group by c.course_name;
-- having cnt>=2
-- order by c.course_name asc;


DELETE FROM course WHERE course_code >=6;

-- Q. 빌게이츠 교수의 과목을 수강신청한 학생을 출력하세요.
select student_name
from student s
where s.student_id IN (
select sc.student_id
from student_course sc
where sc.course_code=( 
	select c.course_code
	from course c
	where c.professor_code=(
		select p.professor_code
		from professor p
		where p.professor_name='빌 게이츠'
        )
        )
);


-- 서브쿼리
-- Q. 스티브 잡스 교수의 / 과목을 / 수강신청한 학생이름을 출력하세요.


select c.course_code
from professor p
inner join course c
on p.professor_code=c.professor_code
where p.professor_name='스티브 잡스';


select d.department_name, A.student_name
from department d
inner join 
(select s.student_name, s.department_code
from student s
where s.student_id IN(
	select sc.student_id
	from student_course sc
	where sc.course_code =(
		select c.course_code
		from course c
		where c.professor_code= (
			select p.professor_code
			from professor p 
			where p.professor_name='스티브 잡스'
			)
			)
	)
    ) as A 
    on A.department_code = d.department_code;



-- Q. 사길동 학생과 같은 과목을 수강신청한 학생이름을 출력하세요.

select student_name
from student s
where s.student_id IN (
	select sc.student_id
	from student_course sc
	where sc.course_code=(
		select sc.course_code
		from student_course sc
		where sc.student_id =(
			select s.student_id
			from student s
			where s.student_name='사길동')
			)
        );