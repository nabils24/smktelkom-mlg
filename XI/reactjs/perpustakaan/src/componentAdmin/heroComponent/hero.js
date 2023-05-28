import React, { Component } from "react";

class Hero extends Component {
    render() {
        return (
            <div class="px-4 py-5 my-5 text-center">
                <img class="d-block mx-auto mb-4" src="https://ppdb.smktelkom-mlg.sch.id/assets/home/img/logo_hitam.png" alt="" width="auto" height="100px" />
                <div class="col-lg-6 mx-auto">
                    <p class="lead mb-4">
                        Perpustakaan SMK Telkom Malang adalah perpustakaan yang menyediakan berbagai macam buku untuk membantu siswa dalam belajar.
                    </p>
                </div>
            </div>
        );
    }
}

export default Hero;
