/* Write your PL/SQL query statement below */
SELECT b.product_name, a.year, a.price
  FROM Sales a, Product b
 WHERE a.product_id = b.product_id
  