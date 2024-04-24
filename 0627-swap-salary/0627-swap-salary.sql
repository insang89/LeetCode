/* Write your PL/SQL query statement below */
UPDATE SALARY
   SET SEX = CASE WHEN SEX = 'f' THEN 'm' ELSE 'f' END;