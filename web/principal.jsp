<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Tienda Comics</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">

                    <li class="nav-item">
                        <a style="margin-left: 20px; border: none" class="btn btn-outline-light" href="Controlador?menu=clientes&accion=Listar" target="myFrame">Clientes</a>
                    </li>
                    <li class="nav-item">
                         <a style="margin-left: 20px; border: none" class="btn btn-outline-light" href="Controlador?menu=productos&accion=Listar" target="myFrame">videojuegos</a>
                  </li>
                  <li class="nav-item">
                         <a style="margin-left: 20px; border: none" class="btn btn-outline-light" href="Controlador?menu=alquiler&accion=default" target="myFrame">Alquiler</a>
                  </li>
                   <li class="nav-item">
                         <a style="margin-left: 20px; border: none" class="btn btn-outline-light" href="Controlador?menu=consultas" target="myFrame">Consultas</a>
                  </li>
                </ul>
            </div>
            <div style="margin-right: 150px" class="btn-group">
                <button type="button" class="btn btn-secondary">Administrador</button>
                <button type="button" class="btn btn-secondary dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                 <span class="sr-only">Toggle Dropdown</span>
                 </button>
            <div class="dropdown-menu text-center">

                <a class="dropdown-item" href="#">
                    ${usuario.getUsuario()}
                </a>
            <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Consultas de clientes</a>
            <form action="validar" method="POST">
                <button name="accion" value="Salir" class="dropdown-item">Salir</button>
            </form>
            </div>
            </div>
        </nav>
        <div class="m-4" style="height: 780px;">
                    <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe>     
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
