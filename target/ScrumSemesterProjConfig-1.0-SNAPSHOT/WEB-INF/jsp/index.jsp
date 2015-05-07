
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />

<!DOCTYPE html>
<html>
    <head>
        <%@ include file="includeFiles.jsp" %>

    </head>

    <%@ include file="navigation.jsp" %>

    <body>
        <h1 class="text-center">Spring 2015 Semester Scrum Project</h1>

        <div id="intro">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-12">
                                <p>The purpose of this site is to demonstrate web-based application development
                                    utilizing modern technologies. This physics calculator is actually a web-based java application
                                    deployed on Heroku. It leverages the MVC design pattern; all routes are handled through a java controller class;
                                    all calculations are carried out in an object-oriented way, with each java model representing a different calculation; and all 
                                    views are handled through <code>GET</code> and <code>POST</code> routes configured within the application.

                                </p>
                            </div>
                            <div class="col-sm-12">
                                <p>The diagram to the right illustrates the layout of the java classes. Each calculation has its own route and is extended off of a base calculation class.
                                    This makes the code highly configurable and flexible for adding or removing routes, models, and views. 
                                    
                                    As far as deployment goes, the code is hosted on a Heroku server and is compiled into a WAR file format. WAR stands for Web Application Archive and is essential for
                                    being able to deploy java code on the web. This project also heavily relies on XML technology, Maven technology, and Java servlets.
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="clt">
                                    <h3 class="text-center">Data Structure Layout</h3>
                                    <ul>
                                        <li>
                                            Models
                                            <ul>
                                                <li>
                                                    distance.java
                                                </li>
                                                <li>
                                                    distanceCannonT.java
                                                </li>
                                                <li>
                                                    force.java
                                                </li>
                                                <li>
                                                    kineticForce.java
                                                </li>
                                                <li>
                                                    ...
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            Views
                                            <ul>
                                                <li>distance.jsp</li>
                                                <li>distanceCannonT.jsp</li>
                                                <li>...</li>
                                            </ul>
                                        </li>
                                        <li>
                                            Controller
                                            <ul>
                                                <li>
                                                    defaultController.java
                                                    <ul>
                                                        <li>/distance <code>GET</code></li>
                                                        <li>/distance <code>POST</code></li>
                                                        <li>/distanceCannonT <code>GET</code></li>
                                                        <li>/distanceCannonT <code>POST</code></li>
                                                        <li>/... <code>GET</code></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <%@ include file="footer.jsp" %>
</body>

</html>
