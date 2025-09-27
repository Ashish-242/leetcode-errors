# Write your MySQL query statement below
-- Select e.name from Employee e where id = (Select managerId from Employee group by managerId 
-- having count(managerId) >= 5)

select e.name from Employee e join Employee f on e.id=f.managerId group by f.managerId having 
count(f.managerId) >=5