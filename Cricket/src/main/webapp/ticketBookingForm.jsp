<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cricket Ticket Booking</title>
</head>
<body>

    <h2>Cricket Match Ticket Booking</h2>

    <form action="book" method="post">
        Name: <input type="text" name="userName"><br><br>

        Email: <input type="email" name="email"><br><br>

        Phone Number: <input type="number" name="phoneNumber"><br><br>

        Seat Number: <input type="text" name="seatNumber"><br><br>

        Match Date: <input type="date" name="matchDate"><br><br>

        Match Timings:
        <select name="matchTimings">
            <option value="3:30 PM">3:30 PM (Day/Night)</option>
            <option value="7:30 PM">7:30 PM (Night)</option>
        </select><br><br>

        <input type="submit" value="Book">
    </form>

</body>
</html>