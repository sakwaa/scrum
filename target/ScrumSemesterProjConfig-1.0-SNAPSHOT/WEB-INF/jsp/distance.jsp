
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
        <h1 class="text-center">Distance</h1>

        

            <form:form class="form-horizontal" method="POST" action="${cp}/distance" modelAttribute="distance">
                <div class="form-group">
                    <label for="time" class="col-sm-2 control-label">Time</label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="time" path="time" />
                    </div>
                </div>

                <div class="form-group">
                    <label for="acc" class="col-sm-2 control-label">Acc</label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="acc" path="acc" />
                    </div>
                </div>

                <div class="form-group">
                    <label for="vel" class="col-sm-2 control-label">Vel</label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="vel" path="vel" />
                    </div>
                </div>
                    
                <div class="form-group">
                    <label for="offset" class="col-sm-2 control-label">Offset</label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="offset" path="offset" />
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

