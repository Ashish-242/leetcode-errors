# Write your MySQL query statement below
select Date_format(trans_date,"%Y-%m") as month,country,count(*) as trans_count,sum(state='approved') as approved_count,sum(amount) as trans_total_amount,SUM((state='approved')*amount)
as approved_total_amount FROM transactions group by month,country; 