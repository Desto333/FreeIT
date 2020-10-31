function movieSearchFunction() {
    var movieName = document.getElementById("searchInput").value;
    var apiKey = '2cad20825acb0a179906cad152c7f06a';
    $.ajax({
        type: 'GET',
        data: {'query': movieName, 'language': 'RU', 'api_key': apiKey, 'include_adult': true},
        url: 'https://api.themoviedb.org/3/search/movie?',
        success: function (result) {
            var trHTML = '<tr><th>№</th><th>Название фильма</th><th>Дата выхода</th><th>Рейтинг</th></tr>';
            $.each(result.results, function (key, value) {
                trHTML += '<tr> + <td>' + (key + 1) + '</td><td>' + value.original_title +  '</td><td>' + value.release_date +  '</td><td>' + value.vote_average + '</td></tr>';
                console.log('№: ' + (key + 1) + ', фильм: ' + value.original_title)
            });
            $('#records_table').append(trHTML);
        },
        error: function (error) {
            console.log(error)
        }
    });
}