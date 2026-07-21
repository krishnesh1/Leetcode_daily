-- Last updated: 21/07/2026, 23:11:28
# Write your MySQL query statement below
select s.year,s.price,p.product_name
from Product p
right join Sales s
on s.product_id = p.product_id