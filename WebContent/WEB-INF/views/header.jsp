<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<header>
	<table style="width:100%;" class="azul">
		<tr>
			<td align="center" style="width:20%;">
				<div class="header"></div> <br> <label class="labelSmall">cj:</label>
				<label class="labelMedium">S</label> <label class="labelBig">M</label><label
				class="labelMedium">S</label>
			</td>
			<td width="55%" align="center" class="labelSmallWhite">Enviamos
				SMS personalizados, masivos e individuales </td>
			<td width="25%" align="left">
			<c:choose>
					<c:when test="${empty sessionScope.usuario}">
						<a href="login" title="Login">Login</a>
						<br>
						<a href="registro" title="registro">Registrarse</a>
					</c:when>
					<c:otherwise>
						<div class="labelSmallWhite">Bienvenido ${usuario.login}</div>
					</c:otherwise>
				</c:choose></td>
		</tr>
	</table>

	<div id="menu">
		<ul id="nav">
			<c:set var="rolAdmin" value="ADMIN" />
			<c:set var="rolUser" value="USER" />
			<c:forEach items="${sessionScope.usuario.roles}" var="rol">
				<c:if test="${rol.rol eq rolAdmin}">
					<li><span>Cuenta</span>
						<ul>
							<li><a href="#">Autorizar Cliente</a></li>							
							<li><a href="#">Precios SMS</a></li>
							<li><a href="#">Horarios Envío SMS</a></li>							
						</ul>
					</li>
				</c:if>
				<c:if test="${rol.rol eq rolUser}">
					<li><span>Cuenta</span>
						<ul>
							<li><a href="#">Mantenimiento Cuenta</a></li>
							<li><a href="#">Destinatarios</a></li>
							<li><a href="compras" title="Compra SMS">Compra SMS</a></li>
						</ul>
					</li>				
					<li><span>Envíos</span>
						<ul>
							<li><a href="#">Directos</a></li>
							<li><a href="#">Clientes</a></li>
							<li><a href="envios" title="Envíos SMS">Envíos SMS</a></li>
						</ul>					
					</li>					
				</c:if>

			</c:forEach>
		</ul>
	</div>
	<div class="azul" style="height: 75px;"></div>

	<div style="height: 25px;"></div>
</header>