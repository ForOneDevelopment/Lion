<%--
  Created by IntelliJ IDEA.
  User: 文惠东
  Date: 2022/2/9
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>

<tr>
    <h2 style="color:green">上传业务资料</h2>
    <form method="post" action="upload/document_add" >
            <td align="center"><p>
                <label for="document_Name">文件名称：</label>
                <input name="documentName" id="document_Name" type="text" required="required" maxlength="128" />
            </p>
            </td>
           <td align="center"><p>
               <label for="document_Secret_Level">文件密等：</label>
               <input name="documentSecretLevel" id="document_Secret_Level" type="text" required="required" maxlength="128" />
           </p>
           </td>
            <td align="center"><p>
                <label for="document_Release_Number">文件编号：</label>
                <input name="documentReleaseNumber" id="document_Release_Number" type="text" required="required" maxlength="128" />
            </p>
            <td align="center"><p>
                <label for="document_Release_Time">发布时间：</label>
                <input name="documentReleaseTime" id="document_Release_Time" type="text" required="required" maxlength="128" />
            </p>
            </td>
            <td align="center"><p>
                <label for="operator_Name">用户姓名：</label>
                <input name="operatorName" id="operator_Name" type="text" required="required" maxlength="128" />
            </p>
            </td>
            <td align="center"><p>
                <label for="operate_Remarks">操作说明：</label>
                <input name="operateRemarks" id="operate_Remarks" type="text" required="required" maxlength="128" />
            </p>
            </td>
            <td align="center"><p>
                <label for="document_Text">文件正文：</label>
                <input name="documentText" id="document_Text" type="text" required="required" maxlength="128" />
            </p>
            </td>
            <td align="center"><p>
                <label for="document_Text">关联历史文件：</label>
                <input name="historyDocumentId" id="history_Document_Id" type="text" required="required" maxlength="128" />
            </p>
            </td>
            <td align="center">
                <p>
                    <button>提交</button>
                </p>
            </td>
    </form>
</tr>

</center>
</body>
</html>
