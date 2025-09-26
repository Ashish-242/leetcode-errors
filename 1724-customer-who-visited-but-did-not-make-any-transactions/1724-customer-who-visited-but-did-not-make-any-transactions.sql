# Write your MySQL query statement below
#Select v.customer_id,Count(*) as count_no_trans From Visits v inner join Transactions t
#where v.visit_id not in t.visit_id
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans 
from Visits v 
LEFT JOIN Transactions t 
ON v.visit_id = t.visit_id  
WHERE t.transaction_id IS NULL 
GROUP BY v.customer_id
Having Count(t.transaction_id)=0; 