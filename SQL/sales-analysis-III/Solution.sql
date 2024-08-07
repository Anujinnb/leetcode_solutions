SELECT p.product_id, p.product_name
FROM Product p
LEFT JOIN Sales s
ON p.product_id = s.product_id
GROUP BY s.product_id
HAVING MIN(sale_date) >= "2019-01-01" AND MAX(sale_date) <= "2019-03-31"