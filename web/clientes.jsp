

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>cliente</title>
    </head>
    <body>
        <div class="d-flex">
           <div class="card col-sm-4">
            <div class="card-body">
                <form action="Controlador?menu=clientes" method="POST">
                    <div class="form-group">
                        <label>CC/IT</label>
                        <input type="number" value="${clientes.getCedula()}" name="txtced" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Nombre</label>
                        <input type="text" value="${clientes.getNombre()}"  name="txtnom" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Contacto</label>
                        <input type="number" value="${clientes.getTelefono()}"  name="txttel" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Correo</label>
                        <input type="text" value="${clientes.getCorreo()}"  name="txtcor" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Edad</label>
                        <input type="number" value="${clientes.getEdad()}"  name="txtedad" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Direccion</label>
                        <input type="text" value="${clientes.getDireccion()}"  name="txtdir" class="form-control">
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
                        <th>Documento</th>
                        <th>Nombre</th>
                        <th>Contacto</th>
                        <th>Correo</th>
                        <th>Edad</th>
                        <th>Direccion</th>
                        <th>Acciones</th>
                    </tr>  
                </thead>
                <tbody>
                    <c:forEach var="cl" items="${cliente}">
                    <tr>
                        <td>${cl.getId()}</td>
                        <td>${cl.getCedula()}</td>
                        <td>${cl.getNombre()}</td>
                        <td>${cl.getTelefono()}</td>
                        <td>${cl.getCorreo()}</td>
                        <td>${cl.getEdad()}</td>
                        <td>${cl.getDireccion()}</td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?menu=clientes&accion=Editar&id=${cl.getId()}">Editar</a>
                            <a class="btn btn-danger" href="Controlador?menu=clientes&accion=Delete&id=${cl.getId()}">Eliminar</a>
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
