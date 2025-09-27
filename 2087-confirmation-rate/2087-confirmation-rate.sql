# Write your MySQL query statement below
select u.user_id,round(avg(if(c.action="confirmed",1,0)),2) as confirmation_rate
from Signups u left join
 Confirmations c on
u.user_id=c.user_id 
group by u.user_id