## Part 1: Test it with SQL
SELECT * FROM techjobs.job;
id int(20) PK, employer varchar(255), name varchar(255), skills varchar(255)
## Part 2: Test it with SQL
SELECT * FROM employer
WHERE location='St. Louis City';
## Part 3: Test it with SQL
Drop Table job;
## Part 4: Test it with SQL
SELECT name, description
From skill
INNER JOIN job ON skill.id = job.skills WHERE job is not_null
ORDER BY name ASC;