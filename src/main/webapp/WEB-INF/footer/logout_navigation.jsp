<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<jsp:useBean id='loginBean' class='yatospace_ip.game.manja_veca.bean.LoginBean' scope='session'></jsp:useBean>
<jsp:useBean id='navigationBean' class='yatospace_ip.game.manja_veca.bean.NavigationBean' scope='session'></jsp:useBean>

<c:if test='${not loginBean.logon()}'>
	<c:out value="${navigationBean.setLoginDestination(pageContext.request)}"></c:out>
</c:if>