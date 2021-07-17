<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<jsp:useBean id='gameBean' class='yatospace_ip.game.manja_veca.bean.GameBean' scope='session'></jsp:useBean>

<c:if test="${param['game_form_submit'] ne null}">
	<c:set var='tmp' value="${gameBean.pick(pageContext.request)}"></c:set>
</c:if>
