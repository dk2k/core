package org.jboss.webbeans.test.unit.implementation.proxy;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
class Foo implements Serializable
{
   
   public String getMsg()
   {
      return "Hi";
   }
   
}