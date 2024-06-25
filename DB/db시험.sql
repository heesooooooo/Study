INSERT INTO t_cus (customer_code, customer_name, address)
VALUES
('001', '가길동', '수원시'),
('002', '나길동', '안산시'),
('003', '조길동', '서울시'),
('004', '홍길동', '안양시');

select * from t_cus;

INSERT INTO t_order (order_number, product_name, quantity, price, customer_code)
VALUES
('101', '사과', '2', '300', '001'),
('102', '우유', '3', '200', '001'),
('103', '시금치', '4', '100', '002'),
('104', '콜라', '7', '200', '002'),
('105', '두부', '5', '300', '003'),
('106', '햄버거', '2', '200', '003'),
('107', '빵', '3', '100', '003'),
('108', '감자', '1', '200', '003'),
('109', '오이', '5', '200', '004');

select * from t_order;


select customer_name, address, product_name, quantity, price
from t_cus c
inner join t_order o
on c.customer_code=o.customer_code
where c.customer_code='003';


select sum(price) as TOTAL
from t_order
where customer_code='002';


select customer_code, sum(price) as price
from t_order
group by customer_code;


select customer_code, customer_name, address
from t_cus
order by customer_name desc;

update t_cus
set customer_name='홍길순', address='인천시'
where customer_code='004';

select * from t_cus;


select order_number, product_name
from t_order
where char_length(product_name)>=3;