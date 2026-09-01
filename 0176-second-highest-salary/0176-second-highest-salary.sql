# Write your MySQL query statement below
SELECT IFNULL(MAX(salary), null) AS SecondHighestSalary
FROM Employee
WHERE (salary) < (
    SELECT MAX(salary) 
    FROM Employee
);