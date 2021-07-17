<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<jsp:useBean id='loginBean' class='yatospace_ip.game.manja_veca.bean.LoginBean' scope='session'></jsp:useBean>
<jsp:useBean id='gameBean' class='yatospace_ip.game.manja_veca.bean.GameBean' scope='session'></jsp:useBean>

<c:if test="${param['logout_form_submit'] eq null}">
	<jsp:include page='/WEB-INF/header/game_executive.jsp'></jsp:include>
</c:if>

<c:if test="${param['logout_form_submit'] ne null}">
	<c:out value="${loginBean.logout()}"></c:out>
	<c:out value="${gameBean.refresh()}"></c:out>
</c:if>
 