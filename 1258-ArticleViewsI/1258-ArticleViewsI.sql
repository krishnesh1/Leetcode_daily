-- Last updated: 21/07/2026, 23:11:25
# Write your MySQL query statement below
select DISTINCT author_id  as id
from Views
where author_id   = viewer_id  
order by id  asc