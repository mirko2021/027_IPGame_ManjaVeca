<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<jsp:useBean id='bootstrapBean' class='yatospace_ip.game.manja_veca.bean.BootstrapBean' scope='session'></jsp:useBean>

<c:if test='${bootstrapBean.isBootstrapLuxTemplate()}'>
	<jsp:include page="/WEB-INF/bootstrap/lux-template.jsp"></jsp:include>
	<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/CSS/LUX/logout.css'/>
</c:if>