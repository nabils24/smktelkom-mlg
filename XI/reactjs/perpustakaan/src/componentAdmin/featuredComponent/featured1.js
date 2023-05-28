import React, { useEffect, useState } from "react";
import axios from "axios";


function Featured1() {
    const [buku, setBuku] = useState([])
    const [member, setMember] = useState([])
    const [pinjam, setPinjam] = useState([])

    const getBuku = () => {
        axios.get('http://localhost:8080/api/buku/findall')
            .then((response) => {
                console.log(response.data.data);
                setBuku(response.data.data);
            })
            .catch((error) => {
                console.log(error);
            });
    }

    const getMember = () => {
        axios.get('http://localhost:8080/api/member/findall', {
            headers: {
                'Authorization': 'Bearer ' + localStorage.getItem('token')
            }
        })
            .then((response) => {
                console.log(response.data.data);
                setMember(response.data.data);
            })
            .catch((error) => {
                console.log(error);
            });
    }

    const getPinjam = () => {
        axios.get('http://localhost:8080/api/borrow/findall', {
            headers: {
                'Authorization': 'Bearer ' + localStorage.getItem('token')
            }
        })
            .then((response) => {
                console.log(response.data.data);
                setPinjam(response.data.data);
            })
            .catch((error) => {
                console.log(error);
            });
    }

    useEffect(() => {
        getBuku();
        getMember();
        getPinjam();
    }, [])

    return (
        <div class="container px-4 py-5 ">
            <h2 class="pb-2 border-bottom">Perpustakaan SMK Telkom Malang</h2>
            <div class="row g-4 py-5 row-cols-1 row-cols-lg-3">
                <div class="col d-flex align-items-start">

                    <div>
                        <h3 class="fs-2">Jumlah Buku - {buku.length}</h3>
                        <p>Jumlah Buku Di Perpustakaan SMK TELKOM Malang</p>

                    </div>
                </div>
                <div class="col d-flex align-items-start">
                    <div>
                        <h3 class="fs-2">Jumlah Member - {member.length}</h3>
                        <p>Jumlah Member DI Perpustakaan SMK TELKOM MALANG</p>

                    </div>
                </div>
                <div class="col d-flex align-items-start">

                    <div>
                        <h3 class="fs-2">Jumlah Peminjaman - {pinjam.length}</h3>
                        <p>Jumlah Peminjaman DI Perpustakaan SMK TELKOM MALANG</p>

                    </div>
                </div>
            </div>
        </div>
    );

}
export default Featured1;