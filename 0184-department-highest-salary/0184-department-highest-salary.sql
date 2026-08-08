# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary
from Employee e 
Join Department d on e.departmentId = d.id
where (e.departmentId, e.salary)in(
    select departmentId, Max(salary)
    from Employee
    Group by departmentId
);