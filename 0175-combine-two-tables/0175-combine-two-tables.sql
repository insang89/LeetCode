/* Write your PL/SQL query statement below */
SELECT a.firstName firstName
     , a.lastName lastName
     , b.city city
     , b.state state
  FROM Person a, Address b
 WHERE a.personId = b.personId(+)

