<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>


<div id='user_form_div' class='user_form'>
	<h3>Корисник</h3>
	<div id='user_div'><c:out value='${loginBean.username}'></c:out></div>
	<br>
</div>

<div id='game_form_div' class='game_div'>
	<h3>Игра</h3>

	<jsp:include page='/WEB-INF/report/game.jsp'></jsp:include>

	<form id='game_form' name='game_form'>
		<label for='try_number'>Број за покушај погађања (1-100) : </label>
		<input type='number' min=1 max=100 required placeholder='num' name='try_number'/>
		<input type='submit' name='game_form_submit' value='покушај погодка'/>
	</form>
</div>