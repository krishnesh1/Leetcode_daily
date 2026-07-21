-- Last updated: 21/07/2026, 23:11:21
# Write your MySQL query statement below
select eUNI.unique_id,e.name
from Employees e
left join EmployeeUNI eUNI
on eUNI.id = e.id;