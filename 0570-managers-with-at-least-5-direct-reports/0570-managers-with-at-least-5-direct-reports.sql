# Write your MySQL query statement below
SELECT e1.name
FROM Employee as e1
LEFT JOIN Employee as e2
ON e1.id = e2.managerId
GROUP BY e1.id
HAVING COUNT(e2.managerId) >= 5;