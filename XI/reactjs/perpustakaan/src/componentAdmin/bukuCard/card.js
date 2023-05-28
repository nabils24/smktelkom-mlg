import React, { Component } from "react";

class Card extends Component {
    render() {
        return (
            <div class="card shadow-sm">
                <img src={this.props.img} alt={this.props.title} width="auto" height="375px">
                </img>
                <div class="card-body">
                    <h3>
                        {this.props.title}
                    </h3>
                    <p class="card-text">{this.props.category}</p>
                    <div class="d-flex justify-content-between align-items-center">
                        <div class="btn-group">
                            <button type="button" class="btn btn-sm btn-outline-secondary">Lihat</button>
                            <button type="button" class="btn btn-sm btn-outline-secondary">Pinjam</button>
                        </div>
                        <small class="text-muted">{this.props.author}</small>
                    </div>
                </div>
            </div >
        );
    }
}


export default Card;