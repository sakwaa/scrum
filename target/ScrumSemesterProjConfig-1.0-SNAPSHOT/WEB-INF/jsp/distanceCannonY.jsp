
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />

<!DOCTYPE html>
<html>
    <head>
        <%@ include file="includeFiles.jsp" %>
    </head>

    <%@ include file="navigation.jsp" %>

    <body>
        <div class="calc-container">
        <h1 class="text-center">Distance Cannon - y-axis</h1>


            <form:form class="form-horizontal" method="POST" action="${cp}/distanceCannonY" modelAttribute="distanceCannonY">
                <div class="form-group">
                    <label for="angle" class="col-sm-2 control-label">Angle</label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="angle" path="angle" />
                    </div>
                </div>

                <div class="form-group">
                    <label for="v" class="col-sm-2 control-label">V</label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="v" path="v" />
                    </div>
                </div>

                <div class="form-group">
                    <label for="result" class="col-sm-2 control-label">Result</label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="result" path="result" />
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <form:button type="submit" class="btn btn-primary" value="Submit">Calculate</form:button>
                    </div>
                </div>

            </form:form>

        </div>
<%@ include file="footer.jsp" %>
    </body>
</html>

