SELECT *
FROM car
where model NOT LIKE '%a%'
  AND quantity- booked_quantity BETWEEN 5 AND 500
