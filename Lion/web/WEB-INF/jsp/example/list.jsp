
<%--
  Created by IntelliJ IDEA.
  User: xiaod
  Date: 2019/4/25
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<body>
<center>
    <div>

        <table border="1">
            <thead>
            <tr>
                <th>ID</th>
                <th>文件ID</th>
                <th>版本ID</th>
                <th>关联历史文件ID</th>
                <th>名称</th>
                <th>密</th>
                <th>文号</th>
                <th>发布时间</th>
                <th>正文</th>
                <th>属性1</th>
                <th>操作说明</th>
                <th>操作人</th>
                <th>操作类型</th>
                <th>操作时间</th>
                <th>编辑</th>
                <th>删除</th>


            </tr>
            </thead>

            <tbody>
            <c:forEach items="${ds}" var="d">
                <tr>
                    <td>${d.id}</td>
                    <td>${d.documentId}</td>
                    <td>${d.versionId}</td>
                    <td>${d.historyDocumentId}</td>
                        <%--                    <td><img height="40px" src="img/category/${c.id}.jpg"></td>--%>
                    <td>${d.documentName}</td>
                    <td>${d.documentSecretLevel}</td>
                    <td>${d.documentReleaseNumber}</td>
                    <td>${d.documentReleaseTime}</td>
                    <td>${d.documentText}</td>
                    <td>${d.categoryValue1}</td>
                    <td>${d.operateRemarks}</td>
                    <td>${d.operatorName}</td>
                    <td>${d.operateType}</td>
                    <td>${d.operateTime}</td>
                        <%--                    <td><a href="admin_property_list?cid=${c.id}"><span class="glyphicon glyphicon-th-list"></span></a></td>--%>
                        <%--                    <td><a href="admin_product_list?cid=${c.id}"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>--%>
                    <td><a href="list/edit?id=${d.id}"><span class="   glyphicon glyphicon-trash"></span>edit</a></td>
                    <td><a deleteLink="true" href="list/document_delete?id=${d.id}">delete</a></td>

                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>


</center>
</body>
</html>

