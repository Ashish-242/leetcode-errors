# Write your MySQL query statement below
# SELECT employee_id, if(employee_id%2!=0 AND name NOT LIKE 'M%',salary,0) AS bonus FROM Employees ORDER BY employee_id
Select employee_id,
Case
 when employee_id%2!=0 And name  not like 'M%' then salary
else 0
end
as bonus from Employees order by employee_id