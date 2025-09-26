# Write your MySQL query statement below
Select empl.unique_id , emp.name from Employees emp LEFT JOIN EmployeeUNI empl on emp.id=empl.id 