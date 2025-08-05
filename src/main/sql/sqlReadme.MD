```sql
use amazon;
```
-- Basic Clause Practice Questions
```sql
select * from products;
```
--  Q1. Show the name and price of all products.
```sql
select name, price from products;
```
--  Q2. Show all products where the category is 'Electronics'.
```sql
select * from products where  category='Electronics';
```

--  Q3. Group products by category. Show each category once.
```sql
SELECT category FROM products GROUP BY category;
```

--  Q4. Show categories that have more than 1 product.
```sql
SELECT category, COUNT(*) FROM products
GROUP BY category
HAVING COUNT(*) > 1;
```

--  Q5. Show all products sorted by price in ascending order.
```sql
SELECT * FROM products ORDER BY price ASC;
```
--  Q6. Show only the first 3 products from the table.
```sql
SELECT * FROM products LIMIT 3;
```

--  Q7. Show product name as "Item\_Name" and price as "Item\_Price".
```sql
SELECT name AS Item_Name, price AS Item_Price FROM products;
```

--  Q8. Show all the unique categories from the products table.
```sql
SELECT DISTINCT category FROM products;
```






