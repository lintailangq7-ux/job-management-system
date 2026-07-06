<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ログイン</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Login.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/dialog.css">
</head>
<body>

    <!-- 既存のコンテンツ -->

    <button onclick="showConfirm()">情報登録</button>

    <!-- 確認ダイアログ -->
    <div id="confirmModal" class="confirm-modal">
        <div class="confirm-content">
            <div class="confirm-header">
                情報登録
            </div>
            <div class="confirm-body">
                <span class="warning-icon">⚠️</span>
                <p style="margin: 0; font-size: 15.5px;">情報を登録しますか？</p>
            </div>
            <div class="confirm-footer">
                <button class="btn-yes" onclick="handleYes()">Yes</button>
                <button class="btn-no" onclick="handleNo()">No</button>
            </div>
        </div>
    </div>

    <script>
        function showConfirm() {
            document.getElementById("confirmModal").style.display = "flex";
        }

        function handleYes() {
            // ここに登録処理（Servletへ送信など）を書く
            alert("登録しました！");
            closeModal();
        }

        function handleNo() {
            alert("キャンセルしました");
            closeModal();
        }

        function closeModal() {
            document.getElementById("confirmModal").style.display = "none";
        }
    </script>

</body>
</html>