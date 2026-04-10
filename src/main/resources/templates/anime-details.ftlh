<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/styles.css">
</head>
<body>

<nav>
    <a href="/anime">⬅ Back</a>
</nav>

<div class="container">

<h1>${anime.title}</h1>

<p><strong>Genre:</strong> ${anime.genre}</p>
<p><strong>Studio:</strong> ${anime.studio}</p>

<h2>Characters</h2>
<#if anime.characters??>
    <#list anime.characters as c>
        <div class="character-box">
            ${c.name!"No Name"} - ${c.role!"No Role"}
        </div>
    </#list>
</#if>

<h2>Add Character</h2>
<form action="/anime/${anime.id}/character/add" method="post">
    <input name="name" placeholder="Character Name">
    <input name="role" placeholder="Role">
    <button type="submit">Add Character</button>
</form>

<br>

<a href="/anime/update/${anime.id}" class="btn">Edit</a>
<a href="/anime/delete/${anime.id}" class="btn">Delete</a>

</div>

</body>
</html>