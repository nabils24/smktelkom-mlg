import React, { Component } from "react";

// Router
import { Routes, Route, useNavigate } from 'react-router-dom';

function Header() {
  const navigate = useNavigate();

  const navigateToLogout = () => {
    // 👇️ navigate to /contacts
    localStorage.clear();
    navigate('/login');
  };

  const navigateToRegister = () => {
    // 👇️ navigate to /contacts
    navigate('/register');
  };

  return (
    <div class="container">
      <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
        <a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none">
        </a>

        <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
          <li><a href="/dashboard-admin" class="nav-link px-2 link-secondary">Home</a></li>
          <li><a href="/admin/member" class="nav-link px-2 link-dark">Member</a></li>
          <li><a href="/admin/buku" class="nav-link px-2 link-dark">Buku</a></li>
          <li><a href="/admin/peminjaman" class="nav-link px-2 link-dark">Peminjaman</a></li>
          <li><a href="/admin/history" class="nav-link px-2 link-dark">History</a></li>
        </ul>

        <div class="col-md-3 text-end">
          <button onClick={navigateToLogout} type="button" class="btn btn-outline-primary me-2">Log-out</button>
        </div>
      </header>
    </div>
  );
}


export default Header;