/* Write your PL/SQL query statement below */

SELECT a.name AS Employee
FROM employee a,employee b
WHERE b.id=a.managerid
AND b.salary <a.salary