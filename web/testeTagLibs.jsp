<%-- 
    Document   : testeTagLibs
    Created on : 25/07/2018, 11:36:08
    Author     : mauricio.maletta
--%>
<%@ page import="java.util.*,
         br.com.caelum.dao.*,
         br.com.caelum.modelo.*" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <c:import url="cabecalho.jsp"/>
        
        <jsp:useBean id="variavel" class="br.com.caelum.modelo.Contato"></jsp:useBean>
        <jsp:useBean id="dao" class="br.com.caelum.dao.ContatoDAO"></jsp:useBean>
            <div class="container">
                <table class="table table-striped text-center">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Nome</th>
                            <th scope="col">E-mail</th>
                            <th scope="col">Endereço</th>
                            <th scope="col">Data de nascimento</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="contato" items="${dao.lista}" varStatus="contador">
                        <tr bgcolor="#${contador.count % 2 == 0 ? 'aaee88' : 'ffffff'}">
                            <td>${contato.id}</td>
                            <td>${testando}</td>
                            <c:if test="${not empty contato.email}">
                                <td><a href="mailto:${contato.email}">${contato.email}</a></td>
                                </c:if>
                                <c:if test="${empty contato.email}">
                                <td>Email não informado</td>
                            </c:if>
                            <td>
                                <c:choose>
                                    <c:when test="${not empty contato.endereco}">
                                        ${contato.endereco}
                                    </c:when>
                                    <c:otherwise>
                                        Endereço não informado
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td>
                                <fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" />                                
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
            
        <c:import url="rodape.jsp"/>
    </body>
</html>
