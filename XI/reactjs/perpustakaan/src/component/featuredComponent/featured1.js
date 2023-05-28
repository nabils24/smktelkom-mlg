import React, { Component } from "react";


class Featured1 extends Component {
    render() {
        return (
            <div class="container px-4 py-5 ">
                <h2 class="pb-2 border-bottom">Fitur Perpustakaan SMK Telkom Malang</h2>
                <div class="row g-4 py-5 row-cols-1 row-cols-lg-3">
                    <div class="col d-flex align-items-start">

                        <div>
                            <h3 class="fs-2">Mudah</h3>
                            <p>Perpustakaan Disini mudah, karena dibuat dengan sepenuh hati</p>

                        </div>
                    </div>
                    <div class="col d-flex align-items-start">
                        <div>
                            <h3 class="fs-2">Tampilan Lebih Menarik</h3>
                            <p>Tampilan Perpustakaan Dibuat Dengan Framework css Bootstrap Dan React, dengan itu tampilan lebih elegan dan kece</p>

                        </div>
                    </div>
                    <div class="col d-flex align-items-start">

                        <div>
                            <h3 class="fs-2">Simple</h3>
                            <p>Perpustakaan SMK Telkom Malang Dibuat Simple Dan Mudah</p>

                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Featured1;