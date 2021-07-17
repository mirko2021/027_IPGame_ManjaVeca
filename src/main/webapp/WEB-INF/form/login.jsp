<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id='login_form_div' class='login_div'>
	<h3>Пријава</h3>
	<form name='login_form' id='login_form' method='POST'>
		<table>
			<tr>
				<td>Корисничко име: </td>
				<td><input type='text' name='username' id='login_form_username' required autofocus/></td>
			</tr>
			<tr>
				<td>Лозинка: </td>
				<td><input type='password' name='password' id='login_form_password'/></td>
			</tr>
		</table>
		<br>
		<input type='submit' name='login_form_submit' value='Пријава'/>
	</form>
</div>