<%--
  Created by IntelliJ IDEA.
  User: Vasyl
  Date: 22/04/2016
  Time: 01:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Vasyl Malik">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Task info</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container{
            margin: 20px;
        }
    </style>
</head>
<body class=".container-fluid">
    <div class="container myrow-container">
        <div class="panel panel-success">
            <div class="panel-heading">
                <h3 class="panel-title">
                    Task description
                </h3>
            </div>
            <div class="panel-body">
                <form:form id="taskAddForm" cssClass="form-horizontal" modelAttribute="task" method="post" action="saveTask">
    
                    <div class="form-group">
                        <div class="control-label col-xs-3"> <form:label path="description" >Description</form:label> </div>
                        <div class="col-xs-6">
                            <form:hidden path="id" value="${taskObject.id}"/>
                            <form:input cssClass="form-control" path="description" value="${taskObject.description}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <form:label path="isDone" cssClass="control-label col-xs-3">Done(1) or Not done(0)</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="isDone" value="${taskObject.isDone}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <div class="row">
                            <div class="col-xs-4">
                            </div>
                            <div class="col-xs-4">
                                <input type="submit" id="saveTask" class="btn btn-primary" value="Save" onclick="return submitTaskForm();"/>
                            </div>
                            <div class="col-xs-4">
                            </div>
                        </div>
                    </div>
    
                </form:form>
            </div>
        </div>
    </div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
		function submitTaskForm() {
		    var description = $('#description').val().trim();
		    var isDone = $('#isDone').val();
		    if(description.length == 0) {
		        alert('Please enter valid description');
		        $('#description').focus();
		        return false;
		    }
            if(isDone == 0 || isDone == 1) {
                return true;
            } else {
                alert('Please enter valid isDone (0 or 1)');
                $('#isDone').focus();
                return false;
            }
		    return true;
		};	
	</script>

</body>
</html>