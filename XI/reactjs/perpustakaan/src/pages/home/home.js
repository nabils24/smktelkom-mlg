import React, { Component } from 'react';

//component
import Header from './../../component/headerComponent/header';
import Hero from './../../component/heroComponent/hero';
import Footer from './../../component/footerComponent/footer';

// Featured
import Featured1 from './../../component/featuredComponent/featured1';

// Card
import CardGrid from './../../component/bukuCard/cardGrid';

class Home extends Component {
    state = {}
    render() {
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
}

export default Home;







