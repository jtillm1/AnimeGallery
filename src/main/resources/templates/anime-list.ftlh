<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/styles.css">
</head>
<body>

<nav>
    <div>Anime Gallery</div>
    <div>
        <a href="/anime">Home</a>
        <a href="/anime/create">Add Anime</a>
        <a href="/about">About</a>
    </div>
</nav>

<div class="container">

<h1>Anime Gallery</h1>

<div class="grid">
<#list animeList as anime>
    <div class="card">
        <h2>${anime.title!"No Title"}</h2>
        <img src="${anime.imageUrl!'https://via.placeholder.com/250'}" alt="Anime Image" style="width:100%; border-radius:10px;">
        <p>${anime.genre!"Unknown Genre"}</p>
        <p>${anime.studio!"Unknown Studio"}</p>

        <a href="/anime/${anime.id}" class="btn">View Details</a>
    </div>
</#list>
</div>

</div>

</body>
</html>