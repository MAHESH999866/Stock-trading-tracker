WITH ConsecutiveNums AS (
    SELECT 
        num,
        LAG(num, 1) OVER (ORDER BY id) AS prev_num1,
        LEAD(num, 1) OVER (ORDER BY id) AS prev_num2
    FROM Logs
)
SELECT DISTINCT num AS ConsecutiveNums
FROM ConsecutiveNums
WHERE num = prev_num1 
  AND num = prev_num2;