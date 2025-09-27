# Write your MySQL query statement below
select r.contest_id,round(COUNT(distinct user_id) * 100.0 / (SELECT COUNT(user_id) FROM Users),2)
 as percentage 
from Register r
group by r.contest_id order by percentage desc,r.contest_id asc
