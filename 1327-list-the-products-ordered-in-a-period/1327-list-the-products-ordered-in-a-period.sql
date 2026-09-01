# Write your MySQL query statement below
SELECT product_name, SUM(unit) AS unit
FROM Products p1
INNER JOIN Orders o1
ON p1.product_id = o1.product_id
WHERE MONTH(o1.order_date) = 2 AND YEAR(o1.order_date) = 2020
GROUP BY p1.product_id
HAVING unit>=100