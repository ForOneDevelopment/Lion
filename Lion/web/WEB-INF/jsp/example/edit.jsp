<%--
  Created by IntelliJ IDEA.
  User: luojiao
  Date: 2022/2/14
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
            <h2 style="color:green">编辑业务资料</h2>
            <form method="post" id="editForm" action="edit/document_update" >
                    <td align="center"><p>
                        <label for="document_Name">文件名称：</label>
                        <input name="documentName" id="document_Name" value="${d.documentName}"  type="text" required="required" maxlength="128" />
                    </p>
                    </td>

                    <td align="center"><p>
                        <label for="document_Secret_Level">文件密等：</label>
                        <input name="documentSecretLevel" id="document_Secret_Level" value="${d.documentSecretLevel}"  type="text" required="required" maxlength="128" />
                    </p>
                    </td>

                    <td align="center"><p>
                        <label for="document_Release_Number">文件编号：</label>
                        <input name="documentReleaseNumber" id="document_Release_Number" value="${d.documentReleaseNumber}"  type="text" required="required" maxlength="128" />
                    </p>
                    </td>

                    <td align="center"><p>
                        <label for="document_Release_Time">发布时间：</label>
                        <input name="documentReleaseTime" id="document_Release_Time" value="${d.documentReleaseTime}"  type="text" required="required" maxlength="128" />
                    </p>
                    </td>

                    <td align="center"><p>
                        <label for="operator_Name">用户姓名：</label>
                        <input name="operatorName" id="operator_Name" value="${d.operatorName}"  type="text" required="required" maxlength="128" />
                    </p>
                    </td>

                    <td align="center"><p>
                        <label for="operate_Remarks">操作说明：</label>
                        <input name="operateRemarks" id="operate_Remarks" value="${d.operateRemarks}"  type="text" required="required" maxlength="128" />
                    </p>
                    </td>

                    <td align="center"><p>
                        <label for="document_Text">文件正文：</label>
                        <input name="documentText" id="document_Text" value="${d.documentText}" type="text" required="required" maxlength="128" />
                    </p>
                    </td>
                    <td align="center"><p>
                        <label for="document_Text">关联历史文件：</label>
                        <input name="historyDocumentId" id="history_Document_Id" value="${d.historyDocumentId}" type="text" required="required" maxlength="128" />
                    </p>
                    </td>

                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${d.id}">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
            </form>
    </center>

</body>
</html>
