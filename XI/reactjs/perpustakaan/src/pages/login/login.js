import React, { useState, useEffect } from "react";
import localStorage from 'localStorage';
import axios from "axios";

function Loginpage() {

    //Inputan Username dan Password
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [logged, setLogged] = useState(null);


    const Auth = (username, password) => {
        axios
            .post('http://localhost:8080/api/auth', {
                username: username,
                password: password

            })
            .then(responseData => {
                // menyimpan data di local storage
                localStorage.setItem('datas', JSON.stringify(responseData));
                localStorage.setItem('id', responseData.data.data.id);
                localStorage.setItem('token', responseData.data.token);
                localStorage.setItem('username', responseData.data.data.username);
                localStorage.setItem('password', responseData.data.data.password);
                localStorage.setItem('logged', responseData.data.logged);
                setLogged(responseData.data.logged);
                if (responseData.data.logged == true) {
                    window.location.href = "/dashboard-admin";
                    setLogged(false);
                } else {
                    setLogged(false);
                }

            })

    };

    //Fungsi untuk menambahkan user
    const HandleAdd = (event) => {
        event.preventDefault();
        if (username && password) {
            setUsername(username);
            setPassword(password);
            Auth(username, password)
            setUsername("");
            setPassword("");
        }
    };

    return (
        <form class="form-signin" onSubmit={HandleAdd}>
            <div class="text-center mt-5 mb-4">
                {/* <img class="mb-4" src="https://alexharkness.com/wp-content/uploads/2020/06/logo-2.png" alt="" width="auto" height="72" /> */}
                <h1 class="h3 mb-3 font-weight-normal">Login</h1>
            </div>
            <div class="container">
                <div class="form-label-group pb-3">
                    <label for="inputEmail">Username</label>
                    <input type="text" id="inputEmail" class="form-control" placeholder="Username" required value={username} onChange={(e) => setUsername(e.target.value)} />
                </div>

                <div class="form-label-group pb-3">
                    <label for="inputPassword">Password</label>
                    <input type="password" id="inputPassword" class="form-control" placeholder="Password" required value={password} onChange={(e) => setPassword(e.target.value)} />
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit" >Sign in</button>
                {
                    logged == false ? <div class="alert alert-danger mt-3" role="alert"> Username atau Password Salah </div> : null
                }{
                    logged == true ? <div class="alert alert-success mt-3" role="alert"> Login Berhasil </div> : null
                }

            </div>
            <p class="mt-5 mb-3 text-muted text-center">Perpustakaan SMK Telkom-Mlg© 2017-2018</p>
        </form>
    );
}


export default Loginpage;