# Write your MySQL query statement below
SELECT c1.name
FROM Customer c1
WHERE c1.referee_id != 2 OR c1.referee_id is null