import React, { Component } from 'react';

//component
import Header from './../../../componentAdmin/headerComponent/header';
import Hero from './../../../componentAdmin/heroComponent/hero';
import Footer from './../../../componentAdmin/footerComponent/footer';

// Featured
import Featured1 from './../../../componentAdmin/featuredComponent/featured1';

// Card
import CardGrid from './../../../componentAdmin/bukuCard/cardGrid';

// Auth
import requireAuth from './../../../Function/auth/auth';

function dashboard() {
    return (
        <div>
            <Header />
            <Hero />
            <Featured1 />
            <CardGrid />
            <Footer />
        </div>
    );
}

export default dashboard;