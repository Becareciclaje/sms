<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<header>
	<table style="width:100%;" class="azul">
		<tr>
			<td align="center" style="width:20%;">
				<a href="/sms" title="Home">
				<div class="header"></div>
				</a>
				 <br> <label class="labelSmall">cj:</label>
				<label class="labelMedium">S</label><label class="labelBig">M</label><label
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
						<div class="labelMediumWhite">Bienvenido ${usuario.login}</div>
						<br>
						<a href="logon" title="Salir">Salir</a>
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
					<li><span>Aministraci�n</span>
						<ul>
<<<<<<< HEAD

							<li><a href="#">Mantenimiento Cuenta</a></li>
							<li><a href="#">Destinatarios</a></li>
							<li><a href="compras" title="Compra SMS">Compra SMS</a>
							<li><a href="listaCompras" title="Compra SMS">Listado de Compras</a>
							</li>
=======
							<li><a href="#">Autorizar Cliente</a></li>							
							<li><a href="#">Precios SMS</a></li>
							<li><a href="#">Horarios Env�o SMS</a></li>							
>>>>>>> branch 'HEAD' of https://github.com/Becareciclaje/sms.git
						</ul>
<<<<<<< HEAD
				
=======
					</li>

				</c:if>
				<c:if test="${rol.rol eq rolUser}">
					<li><span>Cuenta</span>
						<ul>
							<li><a href="#">Mantenimiento Cuenta</a></li>
							<li><a href="#">Destinatarios</a></li>
							<li><a href="compras" title="Compra SMS">Compra SMS</a></li>
						</ul>
>>>>>>> branch 'HEAD' of https://github.com/Becareciclaje/sms.git
					</li>				
					<li><span>Env�os</span>
						<ul>
							<li><a href="#">Directos</a></li>
							<li><a href="#">Clientes</a></li>
							<li><a href="envios" title="Env�os SMS">Env�os SMS</a></li>
						</ul>					
					</li>					
				</c:if>

			</c:forEach>
		</ul>
	</div>
	<div class="rojo" style="height: 50px;"></div>

	
</header>