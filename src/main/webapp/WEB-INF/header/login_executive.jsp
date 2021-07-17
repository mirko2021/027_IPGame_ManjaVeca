<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<jsp:useBean id='loginBean' class='yatospace_ip.game.manja_veca.bean.LoginBean' scope='session'></jsp:useBean>

<c:if test="${param['login_form_submit'] ne null}">
	<c:out value="${loginBean.login(pageContext.request)}"></c:out>
</c:if>
