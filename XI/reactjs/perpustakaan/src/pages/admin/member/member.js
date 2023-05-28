import React, { useState, useEffect } from 'react';
import axios from 'axios';

//component
import Header from './../../../componentAdmin/headerComponent/header';
import Footer from './../../../componentAdmin/footerComponent/footer';

import { Button, Modal, Form } from 'react-bootstrap';


function Member() {
    //Modal Add Member
    const token = localStorage.getItem('token');
    const [show, setShow] = useState(false);
    const [showEdit, setShowEdit] = useState(false);
    const [formData, setFormData] = useState({
        // inisialisasi state untuk form data
        id: '',
        name: '',
        gender: '',
        contact: '',
        address: '',
        photo: null
    });

    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    const handleCloseEdit = () => setShowEdit(false);
    const handleShowEdit = () => setShowEdit(true);

    const handleFormChange = (e) => {
        const { name, value } = e.target;
        setFormData({ ...formData, [name]: value });
    };

    const handleFileChange = (e) => {
        const file = e.target.files[0];
        setFormData({ ...formData, photo: file });
    };



    const handleSubmit = (e) => {
        e.preventDefault();
        const formDataToSend = new FormData();
        formDataToSend.append('name', formData.name);
        formDataToSend.append('gender', formData.gender);
        formDataToSend.append('contact', formData.contact);
        formDataToSend.append('address', formData.address);
        formDataToSend.append('photo', formData.photo);
        // kirim data ke server atau lakukan operasi lainnya
        axios.post('http://localhost:8080/api/member/create', formDataToSend, {
            headers: {
                Authorization: 'Bearer ' + localStorage.getItem('token')
            }
        })
            .then(response => {
                // lakukan sesuatu jika berhasil
                console.log(response.data);
                handleClose();
                getMember();
            })
            .catch(error => {
                // lakukan sesuatu jika gagal
                console.error(error);
            });

        handleClose();
    };

    //Delete Member
    const handleDelete = (id) => {
        axios.delete(`http://localhost:8080/api/member/delete?id=${id}`, {
            headers: {
                Authorization: 'Bearer ' + localStorage.getItem('token')
            }
        })
            .then(response => {
                // lakukan sesuatu jika berhasil
                console.log(response.data);
                getMember();
            })
            .catch(error => {
                // lakukan sesuatu jika gagal
                console.error(error);
            });
    }


    //Edit Member

    const [formEditData, setFormEditData] = useState({
        // inisialisasi state untuk form data
        id: '',
        name: '',
        gender: '',
        contact: '',
        address: '',
        photo: null
    });

    const handleEditFormChange = (e) => {
        const { name, value } = e.target;
        setFormEditData({ ...formEditData, [name]: value });
    };

    const handleEditFileChange = (e) => {
        const file = e.target.files[0];
        setFormEditData({ ...formEditData, photo: file });
    };

    const handleShowEdits = (id) => {
        axios.get(`http://localhost:8080/api/member/findby?id=${id}`, {
            headers: {
                Authorization: 'Bearer ' + localStorage.getItem('token')
            }
        }
        )
            .then(response => {
                // lakukan sesuatu jika berhasil
                console.log(response.data);
                const datas = {
                    id: response.data.data.id,
                    name: response.data.data.name,
                    gender: response.data.data.gender,
                    contact: response.data.data.contact,
                    address: response.data.data.address,
                    photo: response.data.data.photo
                }

                setFormEditData(datas);
                handleShowEdit();
            }
            )
            .catch(error => {
                // lakukan sesuatu jika gagal
                console.error(error);
            });
    }
    const handleSubmitEdit = (e) => {
        e.preventDefault();
        // lakukan sesuatu jika berhasil
        const formDataToSend = new FormData();
        formDataToSend.append('id', formEditData.id);
        formDataToSend.append('name', formEditData.name);
        formDataToSend.append('gender', formEditData.gender);
        formDataToSend.append('contact', formEditData.contact);
        formDataToSend.append('address', formEditData.address);
        formDataToSend.append('photo', formEditData.photo);
        // kirim data ke server atau lakukan operasi lainnya
        axios.put(`http://localhost:8080/api/member/update`, formDataToSend, {
            headers: {
                Authorization: 'Bearer ' + localStorage.getItem('token')
            }
                .then(response => {
                    // lakukan sesuatu jika berhasil
                    console.log(response.data);
                    handleCloseEdit();
                    getMember();
                })
                .catch(error => {
                    // lakukan sesuatu jika gagal
                    console.error(error);
                })

        })

    }
    //Get Member Data
    const [member, setMember] = useState([])
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

    //useEffect or onDidMount
    useEffect(() => {
        getMember();
    }, [])

    return (
        <div>
            <Header />
            <div class="container text-center">
                <div class="row justify-content-center">
                    <div class="col-4">

                    </div>
                    <div class="col-4">

                    </div>
                    <div class="col-4">
                        <Button variant="primary" onClick={handleShow}>
                            Tambah Data
                        </Button>

                    </div>

                </div>
            </div>
            {/* Modal */}
            <Modal show={show} onHide={handleClose}>
                <Modal.Header closeButton>
                    <Modal.Title>Tambah Member</Modal.Title>
                </Modal.Header>
                <Modal.Body>
                    <Form onSubmit={handleSubmit}>
                        <Form.Group controlId="formGroupName">
                            <Form.Label>Name</Form.Label>
                            <Form.Control
                                type="text"
                                name="name"
                                placeholder="Masukkan Name Member"
                                value={formData.name}
                                onChange={handleFormChange}
                            />
                        </Form.Group>
                        <Form.Group controlId="formGroupGender">
                            <Form.Label>Gender</Form.Label>
                            <Form.Control
                                type="text"
                                name="gender"
                                placeholder="Masukkan Gender Member"
                                value={formData.gender}
                                onChange={handleFormChange}
                            />
                        </Form.Group>
                        <Form.Group controlId="formGroupContact">
                            <Form.Label>Contact</Form.Label>
                            <Form.Control
                                type="text"
                                name="contact"
                                placeholder="Masukkan Contact Member"
                                value={formData.contact}
                                onChange={handleFormChange}
                            />
                        </Form.Group>
                        <Form.Group controlId="formGroupAddress">
                            <Form.Label>Address</Form.Label>
                            <Form.Control
                                type="text"
                                name="address"
                                placeholder="Masukkan Address Member"
                                value={formData.address}
                                onChange={handleFormChange}
                            />
                        </Form.Group>
                        <Form.Group controlId="formGroupPhoto">
                            <Form.Label>Photo</Form.Label>
                            <Form.Control
                                type="file"
                                accept=".jpg,.jpeg,.png"
                                name="photo"
                                onChange={handleFileChange}
                            />
                        </Form.Group>

                        {/* tambahkan Form.Group lainnya sesuai kebutuhan */}
                    </Form>
                </Modal.Body>

                <Modal.Footer>
                    <Button variant="secondary" onClick={handleClose}>
                        Batal
                    </Button>
                    <Button variant="primary" onClick={handleSubmit}>
                        Simpan
                    </Button>
                </Modal.Footer>
            </Modal>
            {/* Modal Edit*/}
            <Modal show={showEdit} onHide={handleCloseEdit}>
                <Modal.Header closeButton>
                    <Modal.Title>Edit Member</Modal.Title>
                </Modal.Header>
                <Modal.Body>
                    <Form onSubmit={handleSubmitEdit}>
                        <Form.Group controlId="formGroupName">
                            <Form.Control
                                hidden
                                type="text"
                                name="id"
                                placeholder="Masukkan Name Member"
                                value={formEditData.id}
                                onChange={handleEditFormChange}
                            />
                        </Form.Group>
                        <Form.Group controlId="formGroupName">
                            <Form.Label>Name</Form.Label>
                            <Form.Control
                                type="text"
                                name="name"
                                placeholder="Masukkan Name Member"
                                value={formEditData.name}
                                onChange={handleEditFormChange}
                            />
                        </Form.Group>
                        <Form.Group controlId="formGroupGender">
                            <Form.Label>Gender</Form.Label>
                            <Form.Control
                                type="text"
                                name="gender"
                                placeholder="Masukkan Gender Member"
                                value={formEditData.gender}
                                onChange={handleEditFormChange}
                            />
                        </Form.Group>
                        <Form.Group controlId="formGroupContact">
                            <Form.Label>Contact</Form.Label>
                            <Form.Control
                                type="text"
                                name="contact"
                                placeholder="Masukkan Contact Member"
                                value={formEditData.contact}
                                onChange={handleEditFormChange}
                            />
                        </Form.Group>
                        <Form.Group controlId="formGroupAddress">
                            <Form.Label>Address</Form.Label>
                            <Form.Control
                                type="text"
                                name="address"
                                placeholder="Masukkan Address Member"
                                value={formEditData.address}
                                onChange={handleEditFormChange}
                            />
                        </Form.Group>
                        <Form.Group controlId="formGroupPhoto">
                            <Form.Label>Photo</Form.Label>
                            <Form.Control
                                type="file"
                                accept=".jpg,.jpeg,.png"
                                name="photo"
                                onChange={handleEditFileChange}
                            />
                        </Form.Group>

                        {/* tambahkan Form.Group lainnya sesuai kebutuhan */}
                    </Form>
                </Modal.Body>

                <Modal.Footer>
                    <Button variant="secondary" onClick={handleCloseEdit}>
                        Batal
                    </Button>
                    <Button variant="primary" onClick={handleSubmitEditb    }>
                        Simpan
                    </Button>
                </Modal.Footer>
            </Modal>
            <div class="row justify-content-center">
                <div class="col-10">
                    <table class="table mt-4 mb-4 text-center">
                        <thead>
                            <tr>
                                {/* Table Header */}
                                <th scope="col">No.</th>
                                <th scope="col">Name</th>
                                <th scope="col">Gender</th>
                                <th scope="col">Contact</th>
                                <th scope="col">Address</th>
                                <th scope="col">Image</th>
                                <th scope="col">Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            {/* Maping array agar bisa dibuat menjadi table */}
                            {/* Item adalah variable yang menampung array yang sudah dimapping agar bisa ditampilkan didalam table row */}
                            {member.map((item, index) => (
                                <tr>
                                    <th scope="row">{item.id}</th>
                                    <td>{item.name}</td>
                                    <td>{item.gender}</td>
                                    <td>{item.contact}</td>
                                    <td>{item.address}</td>
                                    <td><a href={"http://localhost:8080/api/member/image/" + item.photo}>{item.photo}</a></td>
                                    <td>
                                        <button type="submit" class="btn btn-success ms-1" onClick={() => handleShowEdits(item.id)}>Edit</button>
                                        <button onClick={() => handleDelete(item.id)} type="submit" class="mx-3 btn btn-danger">Hapus</button>
                                    </td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
                </div>
            </div>
            <Footer />
        </div>
    );
}

export default Member;