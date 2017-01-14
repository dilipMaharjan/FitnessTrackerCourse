<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Goals  Report</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Minutes</th>
                <th>Activity</th>
                <th>Exercise Minutes</th>
            </tr>
            <c:forEach items="${goalReports}" var="goalReport">
                <tr>
                    <td>${goalReport.goalMinutes}</td>
                    <td>${goalReport.exerciseActivity}</td>
                    <td>${goalReport.exerciseMinutes}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
