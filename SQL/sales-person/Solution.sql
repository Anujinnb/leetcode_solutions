SELECT s.name
FROM SalesPerson s
WHERE s.name 
NOT IN (
    SELECT s.name
    FROM Orders o
    LEFT JOIN SalesPerson s ON s.sales_id = o.sales_id
    LEFT JOIN Company c ON c.com_id = o.com_id
    WHERE c.name = "RED"
)