// Router
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';

//Landing Page
import Landingpage from './pages/home/home';

// Login
import Loginpage from './pages/login/login';

// 404
import NotFound from './pages/404/404';


// Dashboard Admin
import Dashboard from './pages/admin/dashboard/dashboard';
import Member from './pages/admin/member/member';


function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Loginpage />} />
        <Route path="/home" element={<Landingpage />} />
        <Route path="/login" element={<Loginpage />} />
        <Route path="/dashboard-admin" element={<Dashboard />} />
        <Route path="/admin/member" element={<Member />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </Router>
  );
}

function isAuthenticated() {
  if (localStorage.getItem('logged') === true) {
    return true;
  } else {
    return false;
  }
}

export default App;
