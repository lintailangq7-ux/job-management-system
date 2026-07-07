<%@ page language="java" contentType="text/html; charset=UTF-8" 
         pageEncoding="UTF-8" 
         import="java.util.List, model.ModelStudent,model.ModelCompany;" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生情報</title>
    <style>
        table { border-collapse: collapse; width: 100%; }
        th, td { border: 1px solid #ccc; padding: 8px; text-align: left; }
        th { background-color: #f0f0f0; }
    </style>
</head>
<body>
    <h1>学生一覧</h1>

    <%
        // セッション/リクエストから学生リストを受け取る 
        List<ModelStudent> Cstudents = (List<ModelStudent>) request.getAttribute("Cstudents");
   		List<ModelCompany> Companys = (List<ModelCompany>) request.getAttribute("Companys");
    %>

    <% if (Cstudents != null && !Cstudents.isEmpty()) { %>
        <table>
            <tr>
                <th>学籍番号</th>
                <th>クラス</th>
                <th>出席番号</th>
                <th>氏名</th>
                <th>第1希望職種</th>
                <th>性別</th>
                <th>備考</th>
            </tr>

            <%
                for (Student s : Cstudents) {
            %>
                <tr>
                    <td><%= s.getGakusekiBango() %></td>
                    <td><%= s.getKurasu() %></td>
                    <td><%= s.getShussekiBango() %></td>
                    <td><%= s.getShimei() %></td>
                    <td><%= s.getDai1KibouShokushu() %></td>
                    <td><%= s.getSeibetsu() %></td>
                    <td><%= s.getBiko() != null ? s.getBiko() : "" %></td>
                </tr>
            <%
                }
            %>
        </table>

        <p>全 <%=Cstudents.size() %> 件</p>

    <% } else { %>
        <p>学生データがありません。</p>
    <% } %>

</body>
</html>