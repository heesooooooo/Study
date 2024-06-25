INSERT INTO customer (customer_id, password, customer_name, age, rating, occupation, reserves)
VALUES
('CUST001', 'CUST001', '홍길동', 30, 'Gold', '엔지니어', 100),
('CUST002', 'CUST002', '이영희', 25, 'Silver', '교사', 50),
('CUST003', 'CUST003', '김철수', 40, 'VIP', '의사', 75),
('CUST004', 'CUST004', '박영훈', 35, 'Silver', '변호사', 25),
('CUST005', 'CUST005', '최미영', 28, 'Gold', '예술가', 150);

INSERT INTO product (product_name, inventory, price, manufacturer)
VALUES
('제품 A', 50, 20000, 'ABC 주식회사'),
('제품 B', 30, 35000, 'XYZ 기업'),
('제품 C', 80, 15000, 'LMN 산업'),
('제품 D', 40, 25000, 'PQR 주식회사'),
('제품 E', 20, 30000, 'JKL 기업');

select * from product;

INSERT INTO customer_product (customer_id, product_number, quantity)
VALUES
('CUST001', 1, 2),
('CUST002', 3, 1),
('CUST003', 2, 3),
('CUST004', 4, 2),
('CUST005', 5, 1),
('CUST001', 2, 1),
('CUST002', 4, 2),
('CUST003', 1, 3),
('CUST004', 5, 1),
('CUST005', 3, 2);

ALTER TABLE product
ADD CONSTRAINT check_inventory CHECK (inventory> 0 AND inventory<= 10000);

-- Q. 주문테이블에서 CUST005고객이 주문한 제품의 이름을 출력하세요.

select p.product_name
from customer_product cp
inner join product p
on cp.product_number=p.product_number
where customer_id='CUST005';

-- Q. 주문테이블에서 나이가 30세 이상인 고객이 주문한 제품의 번호와 주문일자를 출력하세요. 
-- (제품번호, 주문일자)

	select cp.product_number, cp.order_date
	from customer c
	inner join customer_product cp
	on cp.customer_id=c.customer_id
	where c.age >= 30;

    
-- Q. 고객테이블에서 적립금 평균이 80원 이상인 등급에 대해 
--    등급별 고객수와 적립금 평균을 출력하세요.

select rating, count(*) cnt, avg(reserves) average
from customer
group by rating  
having avg(reserves) >=80; -- = average >= 80; 

-- Q. 고객테이블에서 적립금이 가장 많은 고객의 고객이름과 적립금을 출력하세요.
select customer_name, reserves
from customer
where reserves=(
	select max(reserves) from customer
);


-- Q. 주문테이블에서 CUST005고객이 주문한 제품의 이름과 제조업체를 출력하세요.
select p.product_name, p.manufacturer 
from product p
where p.product_number IN (
select cp.product_number
from customer_product cp
where cp.customer_id = 'CUST005');



-- 구매이력이 있는 customer_id 출력 (중복 없이)
select distinct customer_id
from customer_product;


-- 제조회사 글자길이
select manufacturer, char_length(manufacturer) from product;

select manufacturer 
from product
where char_length(manufacturer)>=8;

-- 나이 NULL인 고객을 출력하시오. 
select *
from customer
where age is null;

-- 업데이트 안될때...
SET SQL_SAFE_UPDATES=0;
UPDATE customer SET customer_name ='엄희수', age = NULL, rating = 'VIP', occupation = '강사', reserves =100 WHERE customer_id = 'CUST005'; 


-- 제품을 2개 이상 제조한 제조업체별로 제품의 개수와 
-- 제품중 가장 비싼 가격을 출력하세요.

select manufacturer, count(*) cnt, max(price) maxprice
from product
group by manufacturer
having count(*) >=2; -- 필터링


-- 제품 C를 생산한 제조업체가 만든 제품들의 제품명과 가격을 출력

select product_name, price
from product
where manufacturer IN (
	select manufacturer
	from product
	where product_name='제품 C'
);


-- CUS005고객이 주문한 제품의 제품명과 제조업체를 출력하시오.

select product_name, manufacturer
from product
where product_number IN(
	select product_number
	from customer_product
	where customer_id='CUST005'
);

select p.product_name, p.manufacturer
from customer_product cs
inner join product p
on cs.product_number=p.product_number
where customer_id='CUST005';


-- 6번 제품의 가격을 10% 인상해보자
update product
set price = price*1.1
where product_number=6;


select *
from product;


