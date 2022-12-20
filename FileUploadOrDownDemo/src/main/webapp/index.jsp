<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        button {
            width: 100px;
            height: 50px;
            margin-top: 50px;
            border: 0;
            color: white;
            background: #ccc;
            cursor: pointer;
        }

        button:active {
            background: black;
            color: #cccccc;
        }

        .container {
            display: flex;
            justify-content: flex-start;
        }

        .container .block {
            width: 200px;
            height: 200px;
            text-align: center;
        }

        .container img {
            width: 100%;
        }
    </style>
</head>
<body>
<h4>上传文件区域：</h4>
<hr />
<input id="file" type="file" />
<br />
<button id="btn">上传图片</button>
<h4>展示列表</h4>
<hr />
<div class="container">

</div>

<script>
    const file = document.getElementById("file");
    const btn = document.getElementById("btn");
    const container = document.querySelector('.container')
    let body = null

    file.addEventListener('change', function (e) {
        body = e.target.files[0];
    })

    function addEl(data) {
        const path = data.path;
        const filename = data.filename;
        const fileType = data.type;

        const src = path + filename;
        const url = "/FileUploadOrDownDemo_war_exploded/files/downloadFile?filename=" + filename + "&fileType=" + fileType;

        const img = document.createElement("img")
        img.src = src;
        const a = document.createElement("a");
        a.href = url;
        a.text = "下载";

        const div = document.createElement("div");
        div.className = "block";
        div.appendChild(img);
        div.appendChild(a);

        container.appendChild(div);
    }

    btn.addEventListener("click", () => {
        if (body === null) {
            alert("请选择文件");
            return
        }

        const params = new FormData();
        params.append("file", body)
        fetch("/FileUploadOrDownDemo_war_exploded/files/uploadFile", {
            method: "post",
            body: params
        }).then(async (result) => {
            if (result.ok) {
                const res = await result.json();
                alert("上传成功");
                file.value = "";
                body = null;

                if (res.code === "200") addEl(res.data)
            }
        })
    })
</script>
</body>
</html>
