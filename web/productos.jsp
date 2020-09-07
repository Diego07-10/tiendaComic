
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Producto</title>
    </head>
    <body>
        <div class="d-flex">
           <div class="card col-sm-4">
            <div class="card-body">
                <form action="Controlador?menu=productos" method="POST">
                    <div class="form-group">
                        <label>Codigo</label>
                        <input type="number" value="${productos.getCodigo()}" name="txtcod" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Titulo</label>
                        <input type="text" value="${productos.getTitulo()}"  name="txttit" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Personaje</label>
                        <input type="text" value="${productos.getProtagonista()}"  name="txtpro" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Director</label>
                        <input type="text" value="${productos.getDirector()}"  name="txtdir" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Productora</label>
                        <input type="tex" value="${productos.getMarca()}"  name="txtmar" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Tipo consola</label>
                        <input type="text" value="${productos.getConsola()}"  name="txtcon" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Cantidad</label>
                        <input type="text" value="${productos.getCantidad()}"  name="txtcan" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Precio</label>
                        <input type="text" value="${productos.getPrecio()}"  name="txtpre" class="form-control">
                    </div>
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                    <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                </form>
            </div>
            
        </div>
                <div class="col-sm-8">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Lista</th>
                        <th>Codigo</th>
                        <th>Titulo</th>
                        <th>Personaje</th>
                        <th>Director</th>
                        <th>Marca</th>
                        <th>Tipo consola</th>
                        <th>Cantidad</th>
                        <th>Precio</th>
                        <th>Acciones</th>

                    </tr>  
                </thead>
                <tbody>
                    <c:forEach var="pr" items="${producto}">
                    <tr>
                        <td>${pr.getId()}</td>
                        <td>${pr.getCodigo()}</td>
                        <td>${pr.getTitulo()}</td>
                        <td>${pr.getProtagonista()}</td>
                        <td>${pr.getDirector()}</td>
                        <td>${pr.getMarca()}</td>
                        <td>${pr.getConsola()}</td>
                        <td>${pr.getCantidad()}</td>
                        <td>${pr.getPrecio()}</td>

                        <td>
                            <a class="btn btn-warning" href="Controlador?menu=productos&accion=Editar&id=${pr.getId()}">Editar</a>
                            <a class="btn btn-danger" href="Controlador?menu=productos&accion=Delete&id=${pr.getId()}">Eliminar</a>
                        </td>
                    </tr> 
                   </c:forEach>
                </tbody>
            </table> 
        </div>   
            
        </div>
     <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
