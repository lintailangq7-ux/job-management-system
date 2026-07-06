<%@ page language="java" contentType="text/html; charset=UTF-8" 
         pageEncoding="UTF-8" import="java.util.List, model.Employment" %>

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
    <h1>指導一覧</h1>

    <%
        // セッションから学生リストを受け取る
        List<Employment> employments = (List<Employment>) request.getAttribute("employments");
    %>

<% if (employments != null && !employments.isEmpty()) { %>
        <table>
            <tr>
                <th>就職情報ID</th>
                <th>学籍番号</th>
                <th>企業ID</th>
                <th>氏名</th> <!-- 必要に応じてStudentと結合して表示 -->
                <th>選考状況1</th>
                <th>選考状況2</th>
                <th>選考状況3</th>
                <th>勤務地</th>
                <th>提出状況</th>
                <th>備考</th>
            </tr>

            <%
                for (Employment s : employments) {
            %>
                <tr>
                    <td><%= s.getShushokuJohoId() %></td>
                    <td><%= s.getGakusekiBango() %></td>
                    <td><%= s.getKigyouId() %></td>
                    <td><!-- 氏名（StudentとJOINしている場合に表示可能） --></td>
                    <td><%= s.getSenkoJokyo1() != null ? s.getSenkoJokyo1() : "" %></td>
                    <td><%= s.getSenkoJokyo2() != null ? s.getSenkoJokyo2() : "" %></td>
                    <td><%= s.getSenkoJokyo3() != null ? s.getSenkoJokyo3() : "" %></td>
                    <td><%= s.getKinmuChi() != null ? s.getKinmuChi() : "" %></td>
                    <td><%= s.getTeishutsuJokyo() == 1 ? "提出済" : "未提出" %></td>
                    <td><%= s.getBiko() != null ? s.getBiko() : "" %></td>
                </tr>
            <%
                }
            %>
        </table>

        <p>全 <%= employments.size() %> 件</p>

    <% } else { %>
        <p>指導情報データがありません。</p>
    <% } %>

</body>
</html>
