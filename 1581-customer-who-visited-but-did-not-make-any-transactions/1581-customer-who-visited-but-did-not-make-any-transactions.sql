# Write your MySQL query statement below
SELECT Visits.customer_id, COUNT(Visits.customer_id) AS count_no_trans
FROM Visits
LEFT JOIN Transactions
ON Visits.visit_id=Transactions.visit_id
WHERE Transactions.transaction_id is NULL
GROUP BY Visits.customer_id
ORDER BY count_no_trans DESC;