<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create Playlist</title>
</head>
<body>
    <h2>Create New Playlist</h2>
    <form action="PlaylistServlet" method="post">
        <label for="playlistName">Playlist Name:</label><br>
        <input type="text" id="playlistName" name="playlistName" required><br><br>

        <label for="creatorName">Created By (User):</label><br>
        <input type="text" id="creatorName" name="creatorName" required><br><br>

        <label for="genre">Primary Genre:</label><br>
        <input type="text" id="genre" name="genre" placeholder="e.g., Pop, Rock, Classical" required><br><br>

        <label for="privacy">Privacy Setting:</label><br>
        <select id="privacy" name="privacy" required>
            <option value="public">Public</option>
            <option value="private">Private</option>
        </select><br><br>

        <label for="description">Description:</label><br>
        <textarea id="description" name="description" rows="3" cols="30" required></textarea><br><br>

        <input type="submit" value="Create Playlist">
    </form>
</body>
</html>
