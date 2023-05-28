import React, { Component } from "react";
import axios from "axios";
import Card from "./card";

class CardGrid extends Component {
    state = {
        data: []
    };

    componentDidMount() {
        axios.get('http://localhost:8080/api/buku/findall')
            .then((response) => {
                console.log(response.data.data);
                this.setState({ data: response.data.data });
            })
            .catch((error) => {
                console.log(error);
            });
    }


    render() {
        return (
            <div class="container">
                <h2 class="pb-2 border-bottom">Lihat Buku Terbaru diperpustakaan kita</h2>
                <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                    {this.state.data.map((item, index) => (
                        <div class="col" key={index}>
                            <Card img={"http://localhost:8080/api/buku/image/" + item.cover} title={item.title} category={item.category} author={item.author} />
                        </div>
                    ))}
                </div>
            </div>
        );
    }
}

export default CardGrid;