CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
 DECLARE m INT;
 SET m=N-1;
  RETURN (
      
      SELECT Distinct(salary) from Employee order by  salary desc limit m,1
      
      
  );
END