<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name" />
    <form:errors path="name" />
    <br><br>
    Surname <form:input path="surname" />
    <br><br>
    Salary <form:input path="salary" />
    <br><br>
<%--    Department <form:select path="department">--%>
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
<%--    </form:select>--%>
<%--    <br><br>--%>
    Department2 <form:select path="department">
    <form:options items="${employee.departments}" />
    </form:select>
    <br><br>
    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}" />

    <input type="submit" value="OK">

</form:form>

</body>
</html>
