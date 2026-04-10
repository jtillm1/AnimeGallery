<!DOCTYPE html>
<html>
<body>

<h1>Update Anime</h1>

<form action="/anime/update/${anime.id}" method="post">
    <input type="hidden" name="id" value="${anime.id}">

    <input name="title" value="${anime.title}">
    <input name="genre" value="${anime.genre}">
    <input name="studio" value="${anime.studio}">
    <input name="imageUrl" value="${anime.imageUrl}">

    <button type="submit">Update</button>
</form>

<a href="/anime/${anime.id}">Back</a>

</body>
</html>