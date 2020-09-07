
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Alquiler</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="col-sm-5">
                <div class="card">
                    <form action="" method="POST">
                    <div class="card-body">
                        <div class="form-group">
                            <label>Datos del cliente</label>
                        </div>
                        <div class="form-group d-flex">
                            <div class="col-sm-6 d-flex">
                                <input type="text" name="codigocliente" value="${c.getCedula()}" class="form-control" placeholder="documento"> 
                                <input type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-info">
                            </div>
                            <div class="col-sm-6">
                                <input type="text" name="nombrecliente" value="${c.getNombre()}" class="form-control col-sm-6">
                            </div>
                               
                        </div>
                        <div class="form-group">
                            <label>Datos del producto</label>
                        </div>
                        <div class="form-group d-flex">
                            <div class="col-sm-4 d-flex">
                                <input type="text" name="codigoproducto" value="${pro.getId()}" class="form-control" placeholder="Tiulo juego"> 
                                <button type="submit" name="accion" value="BuscarProducto" class="btn btn-outline-info">Buscar</button>
                            </div>
                            <div class="col-sm-8">
                                <input type="text" name="nombreproducto" value="${pro.getTitulo()}" class="form-control col-sm-6">
                            </div>
                        </div>
                        <div class="form-group d-flex">
                            <div class="col-sm-3 d-flex">
                                <input type="text" name="precio" value="${pro.getPrecio()}" class="form-control" placeholder="$/0.00"> 
                            </div>
                            <div class="col-sm-3 d-flex">
                                <input type="text" name="consola" value="${pro.getConsola()}" class="form-control" placeholder="tipo consola"> 
                            </div>
                            <div class="col-sm-4 d-flex">
                                <input type="number" value="1" name="cantidad" class="form-control col-sm-3">
                                <input type="text" name="stock" value="${pro.getCantidad()}" class="form-control col-sm-4"  placeholder="stock">
                            </div>
                            <div class="col-sm-6">
                                
                            </div>
                        </div>
                        <div>
                            <input type="submit" name="accion" value="Agregar" class="btn btn-outline-info">
                        </div>
                    </div>
                   </form>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <div>
                            <input type="text" name="nserie" class="form-control">
                        </div>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Codigo cliente</th>
                                    <th>Codigo juego</th>
                                    <th>Cliente</th>
                                    <th>Tipo consola</th>
                                    <th>Juego</th>
                                    <th>Precio</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="list" items="${lista}">
                                <tr>
                                    <td></td>
                                    <td>${list.getCodJuego()}</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="card-footer">
                        <div>
                            <input type="submit" name="accion" value="Generar alquiler" class="btn btn-success"> 
                            <input type="submit" name="accion" value="Cancelar" class="btn btn-danger"> 
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
     <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
