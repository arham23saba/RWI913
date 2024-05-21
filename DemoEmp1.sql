DECLARE 
 v_empno EMP.EMPNO%TYPE;
 r EMP%ROWTYPE;
 

BEGIN
 v_empno:= &empno;
 Select * INTO r
 From emp WHERE empno=v_empno;


 dbms_output.put_line(r.ename||'  '||r.job||'   '||r.sal||'  '||r.hiredate);

END;
/