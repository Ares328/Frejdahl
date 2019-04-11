<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="assets/css/question.css"/>
    <title>Document</title>
</head>
<body class="container-fluid px-0">
    
    <nav class="navbar navbar-dark bg-transparent">
        <span class="navbar-brand mb-0 h1">What viking are you?</span>
    </nav>
    
    <main class="w-50 mx-auto text-light">
        <form method="POST" action="/VikingBeer">
            <h2 class="" id="question">Whats the answer to this question?</h2>
            <div class="pl-5">
                <div class="form-check mt-3">
                    <input type="radio" class="form-check-input radio-custom" name="Value" id="answer1" value="1"/>
                    <label for="answer1"><span></span>Answer 1</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input radio-custom" name="Value" id="answer2" value="2"/>
                    <label for="answer2"><span></span>Answer 2</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input radio-custom" name="Value" id="answer3" value="3"/>
                    <label for="answer3"><span></span>Answer 3</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input radio-custom" name="Value" id="answer4" value="4"/>
                    <label for="answer4"><span></span>Answer 4</label>
                </div>
                <div><input type="submit" value="Submit"></div>
            </div>
        </form>
    </main>
    <script src="assets/js/question.js"></script>
</body>
</html>