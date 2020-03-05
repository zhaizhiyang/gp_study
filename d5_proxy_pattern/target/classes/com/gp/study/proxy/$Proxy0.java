package com.gp.study.proxy;
import com.gp.study.client.IPerson;
import java.lang.reflect.*;
public class $Proxy0 implements com.gp.study.client.IPerson{
GPInvocationHandler h;
public $Proxy0(GPInvocationHandler h) { 
this.h = h;}
public void buyInsure() {
try{
Method m = com.gp.study.client.IPerson.class.getMethod("buyInsure",new Class[]{});
this.h.invoke(this,m,new Object[]{});
}catch(Error _ex) { }catch(Throwable e){
throw new UndeclaredThrowableException(e);
}}public void findLove(java.lang.String string0) {
try{
Method m = com.gp.study.client.IPerson.class.getMethod("findLove",new Class[]{java.lang.String.class});
this.h.invoke(this,m,new Object[]{string0});
}catch(Error _ex) { }catch(Throwable e){
throw new UndeclaredThrowableException(e);
}}}
