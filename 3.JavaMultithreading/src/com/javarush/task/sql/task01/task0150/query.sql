SELECT *
FROM parts
where id BETWEEN 7 AND 23
  AND identifier IS NULL
LIMIT 2;
