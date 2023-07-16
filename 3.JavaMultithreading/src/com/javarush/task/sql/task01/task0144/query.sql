SELECT description
FROM parts
ORDER BY required DESC, identifier DESC, description DESC
LIMIT 3 OFFSET 23
