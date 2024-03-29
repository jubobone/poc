-- Create TABLESPACE
CREATE TABLESPACE LOCAL_PLANNINGTOOL_POC
  DATAFILE 'LOCAL_POC_PPT.dat' 
    SIZE 100M
    REUSE
    AUTOEXTEND ON NEXT 10M MAXSIZE 200M;
CREATE TEMPORARY TABLESPACE LOCAL_PLANNINGTOOL_POC_TEMP
  TEMPFILE 'LOCAL_PLANNINGTOOL_POC_TEMP.dbf'
    SIZE 5M
    AUTOEXTEND ON;
CREATE USER local_dev
  IDENTIFIED BY password
  DEFAULT TABLESPACE LOCAL_PLANNINGTOOL_POC
  TEMPORARY TABLESPACE LOCAL_PLANNINGTOOL_POC_TEMP
  QUOTA 200M on LOCAL_PLANNINGTOOL_POC;


GRANT create session TO local_dev;
GRANT create table TO local_dev;
GRANT create view TO local_dev;
GRANT create any trigger TO local_dev;
GRANT create any procedure TO local_dev;
GRANT create sequence TO local_dev;
GRANT create synonym TO local_dev;

-- Create Table

