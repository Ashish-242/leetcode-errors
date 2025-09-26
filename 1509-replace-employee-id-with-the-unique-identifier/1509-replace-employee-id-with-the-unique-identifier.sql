# Write your MySQL query statement below
Select unique_id , name from Employees emp LEFT JOIN EmployeeUNI empl on emp.id=empl.id 