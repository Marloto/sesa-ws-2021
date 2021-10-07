# JDBC Example

## Requires

- MySQL DB on localhost (Using docker: `docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=master -e MYSQL_USER=example -e MYSQL_PASSWORD=example -e MYSQL_DATABASE=example -d -p 3306:3306 mysql:8`)
- Database User (add to DatabaseConnection or use root:root, Docker-Snippet contains User `example`with Password `example`)
- Database (add to DatabaseConnection or use `example`)
- Table: `create table employees(id int(10), name varchar(20));` 

