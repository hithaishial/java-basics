
<!DOCTYPE html>
<html>
<head>
    <title>Add New Song</title>
</head>
<body>
    <h2>Add New Song</h2>
    <form action="AddSongServlet" method="post">
        <label for="title">Song Title:</label><br>
        <input type="text" id="title" name="title" required><br><br>

        <label for="artist">Artist / Singer:</label><br>
        <input type="text" id="artist" name="artist" required><br><br>

        <label for="album">Album Name:</label><br>
        <input type="text" id="album" name="album" required><br><br>

        <label for="duration">Duration (e.g., 3:45):</label><br>
        <input type="text" id="duration" name="duration" placeholder="MM:SS" required><br><br>

        <label for="releaseYear">Release Year:</label><br>
        <input type="number" id="releaseYear" name="releaseYear" min="1900" max="2026" required><br><br>

        <input type="submit" value="Save Song">
    </form>
</body>
</html>