package com.huo.example;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class SimpleRouteFilter extends ZuulFilter {

  private static Logger log = LoggerFactory.getLogger(SimpleRouteFilter.class);

  @Override
  public String filterType() {
    return "route";
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    String str1 = (String) RequestContext.getCurrentContext().get("serviceId");
    URL path = ctx.getRouteHost();//(String) RequestContext.getCurrentContext().get("forward.to");
    HttpServletRequest request = ctx.getRequest();

    System.out.println(String.format("##############route"+"%s request to %s", request.getMethod(), request.getRequestURL().toString())+ path);

    return null;
  }

}