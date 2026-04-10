<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/styles.css">
</head>
<body>

<div class="container">

<h1>Add Anime</h1>

<form action="/anime/create" method="post">
    <input name="title" placeholder="Title">
    <input name="genre" placeholder="Genre">
    <input name="studio" placeholder="Studio">
    <input name="imageUrl" placeholder="Image URL (https://...)">

    <button type="submit">Create</button>
</form>

<br>
<a href="/anime">Back</a>

</div>

</body>
</html>