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
        <form method="post" action="upload/add" >
                <td align="center"><p>
                    <label for="document_name">文件名称：</label>
                    <input name="documentName" id="document_name" type="text" required="required" maxlength="128" />
                </p>
                </td>
               <td align="center"><p>
                   <label for="document_secret_level">文件密等：</label>
                   <input name="document_secret_level" id="document_secret_level" type="text" required="required" maxlength="128" />
               </p>
               </td>
            <td align="center"><p>
                <label for="document_release_number">文件编号：</label>
                <input name="document_release_number" id="document_release_number" type="text" required="required" maxlength="128" />
            </p>
            <td align="center"><p>
                <label for="document_release_time">发布时间：</label>
                <input name="document_release_time" id="document_release_time" type="text" required="required" maxlength="128" />
            </p>
            </td>
            <td align="center"><p>
                <label for="operator_name">用户姓名：</label>
                <input name="operator_name" id="operator_name" type="text" required="required" maxlength="128" />
            </p>
            </td>
            <td align="center"><p>
                <label for="operate_remarks">操作说明：</label>
                <input name="operate_remarks" id="operate_remarks" type="text" required="required" maxlength="128" />
            </p>
            </td>
            <td align="center"><p>
                <label for="document_text">文件正文：</label>
                <input name="document_text" id="document_text" type="text" required="required" maxlength="128" />
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
