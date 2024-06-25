 -- Q : 모든 고객의 정보(이름, 전화번호)를 출력하세요
 select customer_name, phone from t_customer;
 -- 전체 출력
 select * from t_customer; 
 
 insert into t_customer(customer_name, phone, email, address, region_code)
values('손흥민','010-1234-7894','son@gmail.com','서울특별시 강남구 삼성동','02');

insert into t_customer(customer_name, phone, email, address, region_code)
values('박태환','010-1234-5555','park@gmail.com','제주특별자치도 제주시 일도','064');

-- Q : 손흥민 고객의 주소를 수정하세요 (서울특별시 강남구 일동)
update t_customer 
set address= '서울특별시 강남구 일동'
where id=7;

-- Q : 홍길동 고객을 삭제하세요.
delete from t_customer where id=1;
-- 구매정보 있어서 삭제안됨

-- Q : 서울에 거주하는 고객을 출력하세요
select * from t_customer where region_code = '02';

select * from t_product;

-- 박태환 고객이 키보드 두개 구매시, 구매 테이블에 입력 
 insert into t_sales(customer_id, product_code, qty)
 values(8,'P003',2);
 
 select * from t_sales;
 
 
 -- Q : 특정 지역(예: '서울특별시')에 사는 고객의 이름과 전화번호를 가져오는 질의
 select customer_name, phone 
 from t_customer 
 where region_code = '02';
 
 -- Q 모든 고객의 정보를 출력하시오(단 고객번호, 이름, 지역명을 출력할 것)
 select tc.id, tc.customer_name, tr.region_name
 from t_customer tc
 -- as tc .. 줄여서 쓰기... as 생략가능
 inner join t_region tr 
 on  tc.region_code=tr.region_code;
 -- on 조건
 
select tc.id, tc.customer_name, tr.region_name
 from t_customer tc
 -- as tc .. 줄여서 쓰기... as 생략가능
 right join t_region tr 
 -- 회원이 없는 지역도 다 보기.. 오른쪽?
 on  tc.region_code=tr.region_code;
 
 select tc.id, tc.customer_name, tr.region_name
 from t_customer tc
 -- as tc .. 줄여서 쓰기... as 생략가능
 left join t_region tr 
 on  tc.region_code=tr.region_code;
 