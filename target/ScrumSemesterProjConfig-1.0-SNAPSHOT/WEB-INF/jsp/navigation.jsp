
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#main-nav">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${cp}/">Physics Calculator</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Calculations <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                    <li class="active"><a href="${cp}/distance">Distance</a></li>
                    <li class="active"><a href="${cp}/distanceCannonT">Distance Cannon - Time</a></li>
                    <li class="active"><a href="${cp}/distanceCannonX">Distance Cannon - X</a></li>
                    <li class="active"><a href="${cp}/distanceCannonY">Distance Cannon - Y</a></li>
                    <li class="active"><a href="${cp}/force">Force</a></li>
                    <li class="active"><a href="${cp}/gravForce">Gravitational Force</a></li>
                    <li class="active"><a href="${cp}/kineticEnergy">Kinetic Energy</a></li>
                    <li class="active"><a href="${cp}/potentialEnergy">Potential Energy</a></li>
                    <li class="active"><a href="${cp}/power">Power</a></li>
                    <li class="active"><a href="${cp}/powerNoWork">Power (W/ No Work)</a></li>
                    <li class="active"><a href="${cp}/straightEarthFallDistance">Straight Earth Fall Distance</a></li>
                    <li class="active"><a href="${cp}/straightEarthFallTime">Straight Earth Fall Time</a></li>
                    <li class="active"><a href="${cp}/universalGravity">Universal Gravity</a></li>
                    <li class="active"><a href="${cp}/work">Work</a></li>
                </ul>
              </li>
            </ul>
        </div>
    </div>
</nav>