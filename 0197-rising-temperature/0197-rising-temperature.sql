# Write your MySQL query statement below

SELECT today.id as Id
FROM weather yesterday
CROSS JOIN weather today
WHERE DATEDIFF(today.recordDate, yesterday.recordDate) = 1
AND today.temperature>yesterday.temperature;