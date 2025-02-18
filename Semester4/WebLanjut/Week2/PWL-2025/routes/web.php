<?php

use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return "Selamat Datang";
});

Route::get('/hello', function () {
    return 'Hello World';
});

Route::get('/world', function () {
    return 'World';
});

Route::get('/about', function () {
    return '2341720112 ';
});

Route::get('/user/{name}', function ($name) {
    return 'Nama Saya ' . $name;
});

Route::get('/posts/{post}/comments/{comment}', function ($postId, $commentId) {
    return 'Pos ke - : ' . $postId . ' Komentar ke - : ' . $commentId;
});

Route::get('/user/profile', function() {
    //
    })->name('profile');

Route::middleware(['first', 'second'])->group(function () {
    Route::get('/', function () {
        // Uses first & second middleware...
    });
    Route::get('/user/profile', function () {
        // Uses first & second middleware...
    });
});
Route::domain('{account}.example.com')->group(function () {
    Route::get('user/{id}', function ($account, $id) {
        //
    });
});


Route::middleware('auth')->group(function () {
    Route::get('/user', ['UserController'::class, 'index']);
    Route::get('/post', ['PostController'::class, 'index']);
    Route::get('/event', ['EventController'::class, 'index']);
});

Route::prefix('admin')->group(function () {
    Route::get('/user', ['UserController'::class, 'index']);
    Route::get('/post', ['PostController'::class, 'index']);
    Route::get('/event', ['EventController'::class, 'index']);
});

Route::redirect('/here', '/there');

Route::view('/welcome', 'welcome');
Route::view('/welcome', 'welcome', ['name' => 'Taylor']);

Route::get('/hello', ['WelcomeController'::class,'hello']);