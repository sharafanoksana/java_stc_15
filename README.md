# java_stc_15
Домашка по java

####Дамп базы:
```
pg_dump -h localhost -p 5432 -U postgres -O -F p -b -v -f "D:\mydb.dump" oksana
```

####Разворачивание дампа:
```
 psql -d test123 -h localhost -U postgres --set ON_ERROR_STOP=on -f "D:\mydb.dump"
```