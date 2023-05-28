import React from 'react';
import { useNavigate } from 'react-router-dom';

const requireAuth = (Component, isLoggedIn) => {
  const AuthenticatedComponent = (props) => {
    const navigate = useNavigate();
    if (!isLoggedIn) {
      navigate('/login');
      return null;
    } else {
      return <Component {...props} />;
    }
  }
  return AuthenticatedComponent;
};

export default requireAuth;
